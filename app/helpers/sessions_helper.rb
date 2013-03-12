module SessionsHelper

  java_import "java_code.WarehouseClient"
  java_import "java.lang.System"
  java_import "java_code.Warehouse.APIMessageListHolder"
  java_import "java_code.Warehouse.User"



  def signed_in?
    !current_user.nil?
  end
  def sign_in(user)
    @warehouseClient = WarehouseClient.new(WareHouse::Application.config.api_host, WareHouse::Application.config.api_port)
    apiMessageListHolder = APIMessageListHolder.new 
    token =  @warehouseClient.login(user.username, user.password, apiMessageListHolder)
    if token != nil
      cookies.permanent[:remember_token] = token

      apiMessageListHolder = APIMessageListHolder.new 
      user =  @warehouseClient.getLoggedUser(token, apiMessageListHolder)

      self.current_user = user
    else
      return nil
    end
  end
  
  def current_user=(user)
    @current_user = user
  end

  def current_user
    @warehouseClient = WarehouseClient.new(WareHouse::Application.config.api_host, WareHouse::Application.config.api_port)
    apiMessageListHolder = APIMessageListHolder.new 
    user =  @warehouseClient.getLoggedUser(cookies[:remember_token], apiMessageListHolder)

    if user == nil
      @current_user = nil
    else 
       @current_user = user
    end
  end

  def current_user?(user)
    user == current_user
  end

  # def signed_in_user
  #     unless signed_in?
  #       store_location
  #       redirect_to signin_path, notice: "Please sign in."
  #     end
  # end

  def sign_out
    self.current_user = nil
    cookies.delete(:remember_token)
  end

  # def redirect_back_or(default)
  #   redirect_to(session[:return_to] || default)
  #   session.delete(:return_to)
  # end
  # def store_location
  #   session[:return_to] = request.fullpath
  # end
end
