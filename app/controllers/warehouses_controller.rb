class WarehousesController < ApplicationController
  before_filter :signed_in_user
  java_import "java_code.Warehouse.WarehouseInfo"
  def index
    # w1 = WarehouseInfo.new
    # w1.id = 1
    # w1.name = "abc"
    # @warehouses = []
    # @warehouses<<w1

    @warehouseClient = WarehouseClient.new(WareHouse::Application.config.api_host, WareHouse::Application.config.api_port)

    apiMessageListHolder = APIMessageListHolder.new
    @warehouses = @warehouseClient.getWarehouseListByUserId(current_user.id, cookies[:remember_token], apiMessageListHolder)

  end
end
