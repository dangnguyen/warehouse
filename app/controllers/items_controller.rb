class ItemsController < ApplicationController
  java_import "java_code.Warehouse.WarehouseInfo"
  java_import "java_code.Warehouse.Item"
  java_import "java_code.Warehouse.APIMessageListHolder"
  java_import "java.util.Date"
  java_import "java.util.Calendar"
  def index

    @warehouseClient = WarehouseClient.new(WareHouse::Application.config.api_host, WareHouse::Application.config.api_port)
    apiMessageListHolder = APIMessageListHolder.new
    warehouse_id = params[:warehouse_id].to_i
    @items =  @warehouseClient.getItemList(warehouse_id, cookies[:remember_token], apiMessageListHolder)

  end

  def search


    @warehouse_arr = get_warehouses.map do |w|
      [w.name, w.id]
    end


  end

  def search_results



    @warehouse_arr = get_warehouses.map do |w|
      [w.name, w.id]
    end

    @warehouseClient = WarehouseClient.new(WareHouse::Application.config.api_host, WareHouse::Application.config.api_port)
    apiMessageListHolder = APIMessageListHolder.new

    @items = []
    warehouse_ids =  params[:warehouse_ids]

    if warehouse_ids = []
      warehouse_ids = @warehouse_arr.map do |w|
        w[1]
      end
    end

    warehouse_ids.each do |w_id|
      w_items =  @warehouseClient.getItem(w_id.to_i, params[:item_code].to_i, cookies[:remember_token], apiMessageListHolder)
      if w_items != nil
        @items<<w_items
      end
    end
    # puts "*"*80
    # puts @items.inspect
    # puts "+"*80
  end

  def import
    @warehouseClient = WarehouseClient.new(WareHouse::Application.config.api_host, WareHouse::Application.config.api_port)

    apiMessageListHolder = APIMessageListHolder.new
    @item_type_list = @warehouseClient.getItemTypeList(params[:warehouse_id].to_i, cookies[:remember_token], apiMessageListHolder)
    
    @item_arr = @item_type_list.map do |item|
      [item.description, item.id]
    end
  end

  def do_import

    warehouse_id = params[:warehouse_id].to_i
    item_code = params[:item_code].to_i
    @warehouseClient = WarehouseClient.new(WareHouse::Application.config.api_host, WareHouse::Application.config.api_port)

    apiMessageListHolder = APIMessageListHolder.new
    @warehouseClient.addItem(warehouse_id, item_code, params[:quantity].to_i, cookies[:remember_token], apiMessageListHolder)
    flash[:success] = "Imported successfully!"
    redirect_to import_warehouse_items_path
  end

  def export
    @warehouseClient = WarehouseClient.new(WareHouse::Application.config.api_host, WareHouse::Application.config.api_port)

    apiMessageListHolder = APIMessageListHolder.new
    @item_type_list = @warehouseClient.getItemTypeList(params[:warehouse_id].to_i, cookies[:remember_token], apiMessageListHolder)
    
    @item_arr = @item_type_list.map do |item|
      [item.description, item.id]
    end
  end

  def do_export
    warehouse_id = params[:warehouse_id].to_i
    item_code = params[:item_code].to_i
    @warehouseClient = WarehouseClient.new(WareHouse::Application.config.api_host, WareHouse::Application.config.api_port)

    apiMessageListHolder = APIMessageListHolder.new
    @warehouseClient.removeItem(warehouse_id, item_code, params[:quantity].to_i, cookies[:remember_token], apiMessageListHolder)
    flash[:success] = "Exported successfully!"
    redirect_to import_warehouse_items_path
  end

  private
    def get_warehouses
      # w1 = WarehouseInfo.new
      # w1.id = 1
      # w1.name = "Warehouse 1"
      # warehouses = []
      # warehouses<<w1
      @warehouseClient = WarehouseClient.new(WareHouse::Application.config.api_host, WareHouse::Application.config.api_port)

      apiMessageListHolder = APIMessageListHolder.new
      @warehouses = @warehouseClient.getWarehouseListByUserId(current_user.id, cookies[:remember_token], apiMessageListHolder)
    end
end
