class WarehousesController < ApplicationController
  java_import "java_code.Warehouse.WarehouseInfo"
  def index
    w1 = WarehouseInfo.new
    w1.id = 1
    w1.name = "abc"
    @warehouses = []
    @warehouses<<w1

  end
end
