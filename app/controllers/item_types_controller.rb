class ItemTypesController < ApplicationController
  before_filter :signed_in_user
  java_import "java_code.Warehouse.ItemType"
  def index
    @warehouseClient = WarehouseClient.new(WareHouse::Application.config.api_host, WareHouse::Application.config.api_port)

    apiMessageListHolder = APIMessageListHolder.new
    @item_type_list = @warehouseClient.getItemTypeList(params[:warehouse_id].to_i, cookies[:remember_token], apiMessageListHolder)

    @warehouse_id = params[:warehouse_id].to_i
  end

  def new
  end

  def edit
    @warehouse_id = params[:warehouse_id].to_i
    @warehouseClient = WarehouseClient.new(WareHouse::Application.config.api_host, WareHouse::Application.config.api_port)
    apiMessageListHolder = APIMessageListHolder.new
    @itemType = @warehouseClient.getItemType(params[:warehouse_id].to_i, params[:id].to_i, cookies[:remember_token], apiMessageListHolder)
  end

  def create
    @warehouseClient = WarehouseClient.new(WareHouse::Application.config.api_host, WareHouse::Application.config.api_port)
    apiMessageListHolder = APIMessageListHolder.new
    @itemType = ItemType.new
    @itemType.description = params[:description]
    @itemType.cost = params[:cost].to_i
    @itemType = @warehouseClient.addItemType(params[:warehouse_id].to_i, @itemType, cookies[:remember_token], apiMessageListHolder)
    redirect_to warehouse_item_types_path(params[:warehouse_id].to_i)
  end

  def update

    @warehouseClient = WarehouseClient.new(WareHouse::Application.config.api_host, WareHouse::Application.config.api_port)
    apiMessageListHolder = APIMessageListHolder.new
    @itemType = ItemType.new
    @itemType.id = params[:item_type_id].to_i
    @itemType.description = params[:description]
    @itemType.cost = params[:cost].to_i
    @itemType = @warehouseClient.updateItemType(params[:warehouse_id].to_i, @itemType, cookies[:remember_token], apiMessageListHolder)
    flash[:success] = "Update successfully!"
    redirect_to warehouse_item_types_path(params[:warehouse_id].to_i)
  end

  def destroy
    @warehouseClient = WarehouseClient.new(WareHouse::Application.config.api_host, WareHouse::Application.config.api_port)
    apiMessageListHolder = APIMessageListHolder.new
    @warehouseClient.removeItemType(params[:warehouse_id].to_i, params[:id].to_i, cookies[:remember_token], apiMessageListHolder)
    redirect_to warehouse_item_types_path(params[:warehouse_id].to_i)
  end
end
