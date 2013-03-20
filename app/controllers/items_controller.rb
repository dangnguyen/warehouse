class ItemsController < ApplicationController
  java_import "java_code.Warehouse.WarehouseInfo"
  java_import "java_code.Warehouse.Item"
  java_import "java_code.Warehouse.APIMessageListHolder"
  def index

    @warehouseClient = WarehouseClient.new(WareHouse::Application.config.api_host, WareHouse::Application.config.api_port)
    apiMessageListHolder = APIMessageListHolder.new
    warehouse_id = params[:warehouse_id].to_i
    @items =  @warehouseClient.getItemList(1, cookies[:remember_token], apiMessageListHolder)

    puts "*"*80
    puts apiMessageListHolder.value.inspect
    puts "-+"*80
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
    puts "*"*80
    puts @items.inspect
    puts "+"*80
  end

  private
    def get_warehouses
      w1 = WarehouseInfo.new
      w1.id = 1
      w1.name = "Warehouse 1"
      warehouses = []
      warehouses<<w1
      return warehouses
    end
end
