class StaticPagesController < ApplicationController
  java_import "java_code.WarehouseClient"
  java_import "java.lang.System"
  java_import "java_code.Warehouse.APIMessageListHolder"
  def home
    @test = WarehouseClient.hoho

    # thing = YAML::load( File.read('config/api_server.yml') )  
    a = WareHouse::Application.config.api_host
    # a = YAML.load_file(Rails.root.join('config', 'api_server.yml'))[Rails.env]
    puts "="*80
    puts a.inspect
    
    @apiMessageListHolder = APIMessageListHolder.new 
    @test =  WarehouseClient.login("admin", "1", @apiMessageListHolder)
    if signed_in?
    end
  end

  def help
  end

  def about
  end

  def contact
  end

end
