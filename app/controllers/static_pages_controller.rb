class StaticPagesController < ApplicationController
  java_import "java_code.WarehouseClient"
  java_import "java.lang.System"
  java_import "java_code.Warehouse.APIMessageListHolder"
  def home
    warehouseClient = WarehouseClient.new(WareHouse::Application.config.api_host, WareHouse::Application.config.api_port)
    @test = warehouseClient.hoho

    @apiMessageListHolder = APIMessageListHolder.new
    @test =  warehouseClient.login("admin", "1", @apiMessageListHolder)

    @apiMessageListHolder = APIMessageListHolder.new
    @user =  warehouseClient.getLoggedUser(@test, @apiMessageListHolder)
    if signed_in?
      @test = "abc"
    end
  end

  def help
  end

  def about
  end

  def contact
  end

end
