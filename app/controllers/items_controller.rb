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
    w1 = WarehouseInfo.new
    w1.id = 1
    w1.name = "abc"
    w2 = WarehouseInfo.new
    w2.id = 2
    w2.name = "abc 2"
    @warehouses = []
    @warehouses<<w1
    @warehouses<<w2


  end

  def search_results
  end
end
