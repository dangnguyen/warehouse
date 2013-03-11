class SessionsController < ApplicationController
  def new
  end

  def create
    # redirect_to root_path
    redirect_to new_session_path
  end

  def destroy 

  end
end
