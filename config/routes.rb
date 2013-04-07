WareHouse::Application.routes.draw do

  get "item_types/index"

  get "item_types/new"

  get "item_types/edit"

  get "item_types/create"

  get "item_types/update"

  #get "static_pages/home"

  #root :to => "home#index"

  resources :users
  resources :sessions, only: [:new, :create, :destroy]

  root to: 'warehouses#index'

  match '/signin',  to: 'sessions#new'
  match '/signout', to: 'sessions#destroy', via: :delete

  match '/help', to: 'static_pages#help'

  match '/about', to: 'static_pages#about'

  match '/contact', to: 'static_pages#contact'

  get :search_items, action: 'search', controller: 'items'

  post :search_items_results, action: 'search_results', controller: 'items'

  # match '/warehouses', to: 'warehouses#index'
  resources :warehouses, only: [:index] do
    resources :items, only: [:index] do
      collection do
        get :import, action: 'import', controller: 'items'
        post :import, action: 'do_import', controller: 'items'
        get :export, action: 'export', controller: 'items'
        post :export, action: 'do_export', controller: 'items'
      end
      get "delivery_note/:time_code", action: 'delivery_note', controller: 'items', :as => "delivery_note"
    end
    resources :item_types do
    end
  end



  # The priority is based upon order of creation:
  # first created -> highest priority.

  # Sample of regular route:
  #   match 'products/:id' => 'catalog#view'
  # Keep in mind you can assign values other than :controller and :action

  # Sample of named route:
  #   match 'products/:id/purchase' => 'catalog#purchase', :as => :purchase
  # This route can be invoked with purchase_url(:id => product.id)

  # Sample resource route (maps HTTP verbs to controller actions automatically):
  #   resources :products

  # Sample resource route with options:
  #   resources :products do
  #     member do
  #       get 'short'
  #       post 'toggle'
  #     end
  #
  #     collection do
  #       get 'sold'
  #     end
  #   end

  # Sample resource route with sub-resources:
  #   resources :products do
  #     resources :comments, :sales
  #     resource :seller
  #   end

  # Sample resource route with more complex sub-resources
  #   resources :products do
  #     resources :comments
  #     resources :sales do
  #       get 'recent', :on => :collection
  #     end
  #   end

  # Sample resource route within a namespace:
  #   namespace :admin do
  #     # Directs /admin/products/* to Admin::ProductsController
  #     # (app/controllers/admin/products_controller.rb)
  #     resources :products
  #   end

  # You can have the root of your site routed with "root"
  # just remember to delete public/index.html.
  # root :to => 'welcome#index'

  # See how all your routes lay out with "rake routes"

  # This is a legacy wild controller route that's not recommended for RESTful applications.
  # Note: This route will make all actions in every controller accessible via GET requests.
  # match ':controller(/:action(/:id))(.:format)'
end
