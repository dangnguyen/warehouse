class ItemsController < ApplicationController
  java_import "java_code.Warehouse.WarehouseInfo"
  java_import "java_code.Warehouse.Item"
  java_import "java_code.Warehouse.APIMessageListHolder"
  def index
    
    @warehouseClient = WarehouseClient.new(WareHouse::Application.config.api_host, WareHouse::Application.config.api_port)
    apiMessageListHolder = APIMessageListHolder.new
    warehouse_id = params[:warehouse_id].to_i
    @items =  @warehouseClient.getItemList(1, cookies[:remember_token], apiMessageListHolder)

  end

  def search


    @warehouse_arr = get_warehouses.map do |w|
      [w.name, w.id]
    end


  end

  def search_results

    warehouse_ids =  params[:warehouse_ids]

    @warehouse_arr = get_warehouses.map do |w|
      [w.name, w.id]
    end

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
