class SessionsController < ApplicationController
  java_import "java_code.Warehouse.User"
  def new
  end

  def create
    user = User.new
    user.username = params[:session][:username]
    user.password = params[:session][:password]
    current_user = sign_in user
    if current_user != nil
        redirect_to root_path
    else
      flash.now[:error] = 'Invalid email/password combination' # Not quite right!
      render 'new'
    end
    # redirect_to root_path
    # redirect_to new_session_path
  end

  def destroy 
    sign_out
    redirect_to root_path
  end
end
