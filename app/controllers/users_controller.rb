class UsersController < ApplicationController
  before_filter :signed_in_user
  before_filter :admin_user
  java_import "java_code.Warehouse.User"
  java_import "java_code.Warehouse.Role"
  def index
    @warehouseClient = WarehouseClient.new(WareHouse::Application.config.api_host, WareHouse::Application.config.api_port)
    apiMessageListHolder = APIMessageListHolder.new
    @users =  @warehouseClient.getUserList(cookies[:remember_token], apiMessageListHolder)
  end

  def new
    @warehouseClient = WarehouseClient.new(WareHouse::Application.config.api_host, WareHouse::Application.config.api_port)
    apiMessageListHolder = APIMessageListHolder.new
    @roles =  @warehouseClient.getRoleList(cookies[:remember_token], apiMessageListHolder)

    @role_arr = @roles.map do |r|
      [r.role_name, r.id]
    end

  end

  def create
    @warehouseClient = WarehouseClient.new(WareHouse::Application.config.api_host, WareHouse::Application.config.api_port)
    apiMessageListHolder = APIMessageListHolder.new
    @warehouseClient.addUser(params[:username], params[:password], params[:role_id].to_i, cookies[:remember_token], apiMessageListHolder)
    flash[:success] = "Save successfully!"
    redirect_to users_path
  end

  def edit
    @warehouseClient = WarehouseClient.new(WareHouse::Application.config.api_host, WareHouse::Application.config.api_port)
    apiMessageListHolder = APIMessageListHolder.new
    @roles =  @warehouseClient.getRoleList(cookies[:remember_token], apiMessageListHolder)

    @role_arr = @roles.map do |r|
      [r.role_name, r.id]
    end

    apiMessageListHolder = APIMessageListHolder.new
    @user = @warehouseClient.getUser(params[:id].to_i, cookies[:remember_token], apiMessageListHolder)



    apiMessageListHolder = APIMessageListHolder.new
    @warehouses = @warehouseClient.getWarehouseList(cookies[:remember_token], apiMessageListHolder)
    @warehouse_arr = @warehouses.map do |w|
      [w.name, w.id]
    end

    apiMessageListHolder = APIMessageListHolder.new
    @selected_warehouses = @warehouseClient.getWarehouseListByUserId(params[:id].to_i, cookies[:remember_token], apiMessageListHolder)

    @selected_warehouse_ids = @selected_warehouses.map do |w|
      w.id
    end
  end

  def update
    @warehouseClient = WarehouseClient.new(WareHouse::Application.config.api_host, WareHouse::Application.config.api_port)
    apiMessageListHolder = APIMessageListHolder.new
    @user = User.new
    @user.id = params[:user_id].to_i
    @user.username = params[:username]
    @user.password = params[:password]
    @user.role_id = params[:role_id].to_i
    @user.role_name = ""
    @warehouseClient.updateUser(@user, cookies[:remember_token], apiMessageListHolder)

    warehouse_ids = params[:warehouse_ids]. map {|w| w.to_i}

    @warehouseClient.updateWarehousePermissionForUser(@user.id, warehouse_ids, cookies[:remember_token], apiMessageListHolder)

    flash[:success] = "Update successfully!"
    redirect_to users_path
  end

  def destroy
    @warehouseClient = WarehouseClient.new(WareHouse::Application.config.api_host, WareHouse::Application.config.api_port)
    apiMessageListHolder = APIMessageListHolder.new
    @warehouseClient.removeUser(params[:id].to_i, cookies[:remember_token], apiMessageListHolder)
    flash[:success] = "Delete successfully!"
    redirect_to users_path
  end
  private

    def admin_user
      redirect_to(root_path) unless current_user.role_id == 1
    end

end
