require 'java'
#include_class "java.lang.System"

#include_class "HelloApp.*";
class HomeController < ApplicationController
  java_import "java_code.WarehouseClient"
  java_import "java.lang.System"
  def index
  	System.out.println("hoho")
  	@test = WarehouseClient.hoho
  end
end
