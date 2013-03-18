class ItemsController < ApplicationController
  java_import "java_code.Warehouse.WarehouseInfo"
  java_import "java_code.Warehouse.Item"
  def index
    params[:warehouse_id]
    item1 = Item.new
    item1.itemCode = 1
    item1.description = "abc"
    @items = []
    @items<<item1

  end
end
