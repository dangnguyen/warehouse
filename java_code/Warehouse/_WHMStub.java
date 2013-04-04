package java_code.Warehouse;


/**
* java_code/Warehouse/_WHMStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Hello.idl
* 23:51:05 ICT Th? n�m, ng�y 04 th�ng t� n�m 2013
*/

public class _WHMStub extends org.omg.CORBA.portable.ObjectImpl implements java_code.Warehouse.WHM
{

  public String login (String username, String password, java_code.Warehouse.APIMessageListHolder apiMessageList)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("login", true);
                $out.write_string (username);
                $out.write_string (password);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                apiMessageList.value = java_code.Warehouse.APIMessageListHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return login (username, password, apiMessageList        );
            } finally {
                _releaseReply ($in);
            }
  } // login

  public void logout (String token, java_code.Warehouse.APIMessageListHolder apiMessageList)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("logout", true);
                $out.write_string (token);
                $in = _invoke ($out);
                apiMessageList.value = java_code.Warehouse.APIMessageListHelper.read ($in);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                logout (token, apiMessageList        );
            } finally {
                _releaseReply ($in);
            }
  } // logout

  public void addUser (String username, String password, short role_id, String token, java_code.Warehouse.APIMessageListHolder apiMessageList)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("addUser", true);
                $out.write_string (username);
                $out.write_string (password);
                $out.write_short (role_id);
                $out.write_string (token);
                $in = _invoke ($out);
                apiMessageList.value = java_code.Warehouse.APIMessageListHelper.read ($in);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                addUser (username, password, role_id, token, apiMessageList        );
            } finally {
                _releaseReply ($in);
            }
  } // addUser

  public void removeUser (short user_id, String token, java_code.Warehouse.APIMessageListHolder apiMessageList)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("removeUser", true);
                $out.write_short (user_id);
                $out.write_string (token);
                $in = _invoke ($out);
                apiMessageList.value = java_code.Warehouse.APIMessageListHelper.read ($in);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                removeUser (user_id, token, apiMessageList        );
            } finally {
                _releaseReply ($in);
            }
  } // removeUser

  public java_code.Warehouse.User getLoggedUser (String token, java_code.Warehouse.APIMessageListHolder apiMessageList)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getLoggedUser", true);
                $out.write_string (token);
                $in = _invoke ($out);
                java_code.Warehouse.User $result = java_code.Warehouse.UserHelper.read ($in);
                apiMessageList.value = java_code.Warehouse.APIMessageListHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getLoggedUser (token, apiMessageList        );
            } finally {
                _releaseReply ($in);
            }
  } // getLoggedUser

  public void updateUser (java_code.Warehouse.User user, String token, java_code.Warehouse.APIMessageListHolder apiMessageList)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("updateUser", true);
                java_code.Warehouse.UserHelper.write ($out, user);
                $out.write_string (token);
                $in = _invoke ($out);
                apiMessageList.value = java_code.Warehouse.APIMessageListHelper.read ($in);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                updateUser (user, token, apiMessageList        );
            } finally {
                _releaseReply ($in);
            }
  } // updateUser

  public java_code.Warehouse.Role getRole (short role_id, String token, java_code.Warehouse.APIMessageListHolder apiMessageList)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getRole", true);
                $out.write_short (role_id);
                $out.write_string (token);
                $in = _invoke ($out);
                java_code.Warehouse.Role $result = java_code.Warehouse.RoleHelper.read ($in);
                apiMessageList.value = java_code.Warehouse.APIMessageListHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getRole (role_id, token, apiMessageList        );
            } finally {
                _releaseReply ($in);
            }
  } // getRole


  //Lich su nhap kho
  public java_code.Warehouse.Item[] getItemList (short warehouse_id, String token, java_code.Warehouse.APIMessageListHolder apiMessageList)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getItemList", true);
                $out.write_short (warehouse_id);
                $out.write_string (token);
                $in = _invoke ($out);
                java_code.Warehouse.Item $result[] = java_code.Warehouse.ItemListHelper.read ($in);
                apiMessageList.value = java_code.Warehouse.APIMessageListHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getItemList (warehouse_id, token, apiMessageList        );
            } finally {
                _releaseReply ($in);
            }
  } // getItemList


  //Tim san pham tren 1 kho
  public java_code.Warehouse.Item getItem (short warehouse_id, short itemCode, String token, java_code.Warehouse.APIMessageListHolder apiMessageList)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getItem", true);
                $out.write_short (warehouse_id);
                $out.write_short (itemCode);
                $out.write_string (token);
                $in = _invoke ($out);
                java_code.Warehouse.Item $result = java_code.Warehouse.ItemHelper.read ($in);
                apiMessageList.value = java_code.Warehouse.APIMessageListHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getItem (warehouse_id, itemCode, token, apiMessageList        );
            } finally {
                _releaseReply ($in);
            }
  } // getItem


  //Tim san pham tren tat ca kho
  public java_code.Warehouse.Item getItemInAllWareHouses (short itemCode, String token, java_code.Warehouse.APIMessageListHolder apiMessageList)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getItemInAllWareHouses", true);
                $out.write_short (itemCode);
                $out.write_string (token);
                $in = _invoke ($out);
                java_code.Warehouse.Item $result = java_code.Warehouse.ItemHelper.read ($in);
                apiMessageList.value = java_code.Warehouse.APIMessageListHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getItemInAllWareHouses (itemCode, token, apiMessageList        );
            } finally {
                _releaseReply ($in);
            }
  } // getItemInAllWareHouses


  //Nhap kho
  public void addItem (short warehouse_id, short itemCode, short qty, String token, java_code.Warehouse.APIMessageListHolder apiMessageList)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("addItem", true);
                $out.write_short (warehouse_id);
                $out.write_short (itemCode);
                $out.write_short (qty);
                $out.write_string (token);
                $in = _invoke ($out);
                apiMessageList.value = java_code.Warehouse.APIMessageListHelper.read ($in);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                addItem (warehouse_id, itemCode, qty, token, apiMessageList        );
            } finally {
                _releaseReply ($in);
            }
  } // addItem

  public void removeItem (short warehouse_id, short itemCode, short qty, String token, java_code.Warehouse.APIMessageListHolder apiMessageList)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("removeItem", true);
                $out.write_short (warehouse_id);
                $out.write_short (itemCode);
                $out.write_short (qty);
                $out.write_string (token);
                $in = _invoke ($out);
                apiMessageList.value = java_code.Warehouse.APIMessageListHelper.read ($in);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                removeItem (warehouse_id, itemCode, qty, token, apiMessageList        );
            } finally {
                _releaseReply ($in);
            }
  } // removeItem


  //Xuat kho
  public java_code.Warehouse.ItemType[] getItemTypeList (short warehouse_id, String token, java_code.Warehouse.APIMessageListHolder apiMessageList)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getItemTypeList", true);
                $out.write_short (warehouse_id);
                $out.write_string (token);
                $in = _invoke ($out);
                java_code.Warehouse.ItemType $result[] = java_code.Warehouse.ItemTypeListHelper.read ($in);
                apiMessageList.value = java_code.Warehouse.APIMessageListHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getItemTypeList (warehouse_id, token, apiMessageList        );
            } finally {
                _releaseReply ($in);
            }
  } // getItemTypeList

  public java_code.Warehouse.ItemType getItemType (short warehouse_id, short item_type_id, String token, java_code.Warehouse.APIMessageListHolder apiMessageList)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getItemType", true);
                $out.write_short (warehouse_id);
                $out.write_short (item_type_id);
                $out.write_string (token);
                $in = _invoke ($out);
                java_code.Warehouse.ItemType $result = java_code.Warehouse.ItemTypeHelper.read ($in);
                apiMessageList.value = java_code.Warehouse.APIMessageListHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getItemType (warehouse_id, item_type_id, token, apiMessageList        );
            } finally {
                _releaseReply ($in);
            }
  } // getItemType

  public java_code.Warehouse.ItemType addItemType (short warehouse_id, java_code.Warehouse.ItemType item_type, String token, java_code.Warehouse.APIMessageListHolder apiMessageList)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("addItemType", true);
                $out.write_short (warehouse_id);
                java_code.Warehouse.ItemTypeHelper.write ($out, item_type);
                $out.write_string (token);
                $in = _invoke ($out);
                java_code.Warehouse.ItemType $result = java_code.Warehouse.ItemTypeHelper.read ($in);
                apiMessageList.value = java_code.Warehouse.APIMessageListHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return addItemType (warehouse_id, item_type, token, apiMessageList        );
            } finally {
                _releaseReply ($in);
            }
  } // addItemType

  public void removeItemType (short warehouse_id, short item_type_id, String token, java_code.Warehouse.APIMessageListHolder apiMessageList)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("removeItemType", true);
                $out.write_short (warehouse_id);
                $out.write_short (item_type_id);
                $out.write_string (token);
                $in = _invoke ($out);
                apiMessageList.value = java_code.Warehouse.APIMessageListHelper.read ($in);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                removeItemType (warehouse_id, item_type_id, token, apiMessageList        );
            } finally {
                _releaseReply ($in);
            }
  } // removeItemType

  public java_code.Warehouse.ItemType updateItemType (short warehouse_id, java_code.Warehouse.ItemType item_type, String token, java_code.Warehouse.APIMessageListHolder apiMessageList)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("updateItemType", true);
                $out.write_short (warehouse_id);
                java_code.Warehouse.ItemTypeHelper.write ($out, item_type);
                $out.write_string (token);
                $in = _invoke ($out);
                java_code.Warehouse.ItemType $result = java_code.Warehouse.ItemTypeHelper.read ($in);
                apiMessageList.value = java_code.Warehouse.APIMessageListHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return updateItemType (warehouse_id, item_type, token, apiMessageList        );
            } finally {
                _releaseReply ($in);
            }
  } // updateItemType

  public java_code.Warehouse.User[] getUserListByWarehouseId (short warehouse_id, String token, java_code.Warehouse.APIMessageListHolder apiMessageList)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getUserListByWarehouseId", true);
                $out.write_short (warehouse_id);
                $out.write_string (token);
                $in = _invoke ($out);
                java_code.Warehouse.User $result[] = java_code.Warehouse.UserListHelper.read ($in);
                apiMessageList.value = java_code.Warehouse.APIMessageListHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getUserListByWarehouseId (warehouse_id, token, apiMessageList        );
            } finally {
                _releaseReply ($in);
            }
  } // getUserListByWarehouseId

  public java_code.Warehouse.WarehouseInfo[] getWarehouseListByUserId (short user_id, String token, java_code.Warehouse.APIMessageListHolder apiMessageList)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getWarehouseListByUserId", true);
                $out.write_short (user_id);
                $out.write_string (token);
                $in = _invoke ($out);
                java_code.Warehouse.WarehouseInfo $result[] = java_code.Warehouse.WarehouseListHelper.read ($in);
                apiMessageList.value = java_code.Warehouse.APIMessageListHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getWarehouseListByUserId (user_id, token, apiMessageList        );
            } finally {
                _releaseReply ($in);
            }
  } // getWarehouseListByUserId

  public String sayHello ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("sayHello", true);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return sayHello (        );
            } finally {
                _releaseReply ($in);
            }
  } // sayHello

  public void shutdown ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("shutdown", false);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                shutdown (        );
            } finally {
                _releaseReply ($in);
            }
  } // shutdown

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Warehouse/WHM:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.Object obj = org.omg.CORBA.ORB.init (args, props).string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     String str = org.omg.CORBA.ORB.init (args, props).object_to_string (this);
     s.writeUTF (str);
  }
} // class _WHMStub
