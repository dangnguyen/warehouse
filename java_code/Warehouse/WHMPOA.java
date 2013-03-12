package java_code.Warehouse;


/**
* java_code/Warehouse/WHMPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Hello.idl
* 23:35:39 ICT Th? b?y, ng�y 09 th�ng ba n�m 2013
*/

public abstract class WHMPOA extends org.omg.PortableServer.Servant
 implements java_code.Warehouse.WHMOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("login", new java.lang.Integer (0));
    _methods.put ("logout", new java.lang.Integer (1));
    _methods.put ("addUser", new java.lang.Integer (2));
    _methods.put ("removeUser", new java.lang.Integer (3));
    _methods.put ("getLoggedUser", new java.lang.Integer (4));
    _methods.put ("updateUser", new java.lang.Integer (5));
    _methods.put ("getRole", new java.lang.Integer (6));
    _methods.put ("getItemList", new java.lang.Integer (7));
    _methods.put ("getItem", new java.lang.Integer (8));
    _methods.put ("getItemInAllWareHouses", new java.lang.Integer (9));
    _methods.put ("addItem", new java.lang.Integer (10));
    _methods.put ("removeItem", new java.lang.Integer (11));
    _methods.put ("getItemTypeList", new java.lang.Integer (12));
    _methods.put ("getItemType", new java.lang.Integer (13));
    _methods.put ("addItemType", new java.lang.Integer (14));
    _methods.put ("removeItemType", new java.lang.Integer (15));
    _methods.put ("updateItemType", new java.lang.Integer (16));
    _methods.put ("sayHello", new java.lang.Integer (17));
    _methods.put ("shutdown", new java.lang.Integer (18));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // Warehouse/WHM/login
       {
         String username = in.read_string ();
         String password = in.read_string ();
         java_code.Warehouse.APIMessageListHolder apiMessageList = new java_code.Warehouse.APIMessageListHolder ();
         String $result = null;
         $result = this.login (username, password, apiMessageList);
         out = $rh.createReply();
         out.write_string ($result);
         java_code.Warehouse.APIMessageListHelper.write (out, apiMessageList.value);
         break;
       }

       case 1:  // Warehouse/WHM/logout
       {
         String token = in.read_string ();
         java_code.Warehouse.APIMessageListHolder apiMessageList = new java_code.Warehouse.APIMessageListHolder ();
         this.logout (token, apiMessageList);
         out = $rh.createReply();
         java_code.Warehouse.APIMessageListHelper.write (out, apiMessageList.value);
         break;
       }

       case 2:  // Warehouse/WHM/addUser
       {
         String username = in.read_string ();
         String password = in.read_string ();
         short role_id = in.read_short ();
         String token = in.read_string ();
         java_code.Warehouse.APIMessageListHolder apiMessageList = new java_code.Warehouse.APIMessageListHolder ();
         this.addUser (username, password, role_id, token, apiMessageList);
         out = $rh.createReply();
         java_code.Warehouse.APIMessageListHelper.write (out, apiMessageList.value);
         break;
       }

       case 3:  // Warehouse/WHM/removeUser
       {
         short user_id = in.read_short ();
         String token = in.read_string ();
         java_code.Warehouse.APIMessageListHolder apiMessageList = new java_code.Warehouse.APIMessageListHolder ();
         this.removeUser (user_id, token, apiMessageList);
         out = $rh.createReply();
         java_code.Warehouse.APIMessageListHelper.write (out, apiMessageList.value);
         break;
       }

       case 4:  // Warehouse/WHM/getLoggedUser
       {
         String token = in.read_string ();
         java_code.Warehouse.APIMessageListHolder apiMessageList = new java_code.Warehouse.APIMessageListHolder ();
         java_code.Warehouse.User $result = null;
         $result = this.getLoggedUser (token, apiMessageList);
         out = $rh.createReply();
         java_code.Warehouse.UserHelper.write (out, $result);
         java_code.Warehouse.APIMessageListHelper.write (out, apiMessageList.value);
         break;
       }

       case 5:  // Warehouse/WHM/updateUser
       {
         java_code.Warehouse.User user = java_code.Warehouse.UserHelper.read (in);
         String token = in.read_string ();
         java_code.Warehouse.APIMessageListHolder apiMessageList = new java_code.Warehouse.APIMessageListHolder ();
         this.updateUser (user, token, apiMessageList);
         out = $rh.createReply();
         java_code.Warehouse.APIMessageListHelper.write (out, apiMessageList.value);
         break;
       }

       case 6:  // Warehouse/WHM/getRole
       {
         short role_id = in.read_short ();
         String token = in.read_string ();
         java_code.Warehouse.APIMessageListHolder apiMessageList = new java_code.Warehouse.APIMessageListHolder ();
         java_code.Warehouse.Role $result = null;
         $result = this.getRole (role_id, token, apiMessageList);
         out = $rh.createReply();
         java_code.Warehouse.RoleHelper.write (out, $result);
         java_code.Warehouse.APIMessageListHelper.write (out, apiMessageList.value);
         break;
       }


  //Lich su nhap kho
       case 7:  // Warehouse/WHM/getItemList
       {
         short warehouse_id = in.read_short ();
         String token = in.read_string ();
         java_code.Warehouse.APIMessageListHolder apiMessageList = new java_code.Warehouse.APIMessageListHolder ();
         java_code.Warehouse.Item $result[] = null;
         $result = this.getItemList (warehouse_id, token, apiMessageList);
         out = $rh.createReply();
         java_code.Warehouse.ItemListHelper.write (out, $result);
         java_code.Warehouse.APIMessageListHelper.write (out, apiMessageList.value);
         break;
       }


  //Tim san pham tren 1 kho
       case 8:  // Warehouse/WHM/getItem
       {
         short warehouse_id = in.read_short ();
         short itemCode = in.read_short ();
         String token = in.read_string ();
         java_code.Warehouse.APIMessageListHolder apiMessageList = new java_code.Warehouse.APIMessageListHolder ();
         java_code.Warehouse.Item $result = null;
         $result = this.getItem (warehouse_id, itemCode, token, apiMessageList);
         out = $rh.createReply();
         java_code.Warehouse.ItemHelper.write (out, $result);
         java_code.Warehouse.APIMessageListHelper.write (out, apiMessageList.value);
         break;
       }


  //Tim san pham tren tat ca kho
       case 9:  // Warehouse/WHM/getItemInAllWareHouses
       {
         short itemCode = in.read_short ();
         String token = in.read_string ();
         java_code.Warehouse.APIMessageListHolder apiMessageList = new java_code.Warehouse.APIMessageListHolder ();
         java_code.Warehouse.Item $result = null;
         $result = this.getItemInAllWareHouses (itemCode, token, apiMessageList);
         out = $rh.createReply();
         java_code.Warehouse.ItemHelper.write (out, $result);
         java_code.Warehouse.APIMessageListHelper.write (out, apiMessageList.value);
         break;
       }


  //Nhap kho
       case 10:  // Warehouse/WHM/addItem
       {
         short warehouse_id = in.read_short ();
         short itemCode = in.read_short ();
         short qty = in.read_short ();
         String token = in.read_string ();
         java_code.Warehouse.APIMessageListHolder apiMessageList = new java_code.Warehouse.APIMessageListHolder ();
         this.addItem (warehouse_id, itemCode, qty, token, apiMessageList);
         out = $rh.createReply();
         java_code.Warehouse.APIMessageListHelper.write (out, apiMessageList.value);
         break;
       }

       case 11:  // Warehouse/WHM/removeItem
       {
         short warehouse_id = in.read_short ();
         short itemCode = in.read_short ();
         short qty = in.read_short ();
         String token = in.read_string ();
         java_code.Warehouse.APIMessageListHolder apiMessageList = new java_code.Warehouse.APIMessageListHolder ();
         this.removeItem (warehouse_id, itemCode, qty, token, apiMessageList);
         out = $rh.createReply();
         java_code.Warehouse.APIMessageListHelper.write (out, apiMessageList.value);
         break;
       }


  //Xuat kho
       case 12:  // Warehouse/WHM/getItemTypeList
       {
         short warehouse_id = in.read_short ();
         String token = in.read_string ();
         java_code.Warehouse.APIMessageListHolder apiMessageList = new java_code.Warehouse.APIMessageListHolder ();
         java_code.Warehouse.ItemType $result[] = null;
         $result = this.getItemTypeList (warehouse_id, token, apiMessageList);
         out = $rh.createReply();
         java_code.Warehouse.ItemTypeListHelper.write (out, $result);
         java_code.Warehouse.APIMessageListHelper.write (out, apiMessageList.value);
         break;
       }

       case 13:  // Warehouse/WHM/getItemType
       {
         short warehouse_id = in.read_short ();
         String token = in.read_string ();
         java_code.Warehouse.APIMessageListHolder apiMessageList = new java_code.Warehouse.APIMessageListHolder ();
         java_code.Warehouse.ItemType $result = null;
         $result = this.getItemType (warehouse_id, token, apiMessageList);
         out = $rh.createReply();
         java_code.Warehouse.ItemTypeHelper.write (out, $result);
         java_code.Warehouse.APIMessageListHelper.write (out, apiMessageList.value);
         break;
       }

       case 14:  // Warehouse/WHM/addItemType
       {
         short warehouse_id = in.read_short ();
         java_code.Warehouse.ItemType item_type = java_code.Warehouse.ItemTypeHelper.read (in);
         String token = in.read_string ();
         java_code.Warehouse.APIMessageListHolder apiMessageList = new java_code.Warehouse.APIMessageListHolder ();
         java_code.Warehouse.ItemType $result = null;
         $result = this.addItemType (warehouse_id, item_type, token, apiMessageList);
         out = $rh.createReply();
         java_code.Warehouse.ItemTypeHelper.write (out, $result);
         java_code.Warehouse.APIMessageListHelper.write (out, apiMessageList.value);
         break;
       }

       case 15:  // Warehouse/WHM/removeItemType
       {
         short warehouse_id = in.read_short ();
         short item_type_id = in.read_short ();
         String token = in.read_string ();
         java_code.Warehouse.APIMessageListHolder apiMessageList = new java_code.Warehouse.APIMessageListHolder ();
         this.removeItemType (warehouse_id, item_type_id, token, apiMessageList);
         out = $rh.createReply();
         java_code.Warehouse.APIMessageListHelper.write (out, apiMessageList.value);
         break;
       }

       case 16:  // Warehouse/WHM/updateItemType
       {
         short warehouse_id = in.read_short ();
         java_code.Warehouse.ItemType item_type = java_code.Warehouse.ItemTypeHelper.read (in);
         String token = in.read_string ();
         java_code.Warehouse.APIMessageListHolder apiMessageList = new java_code.Warehouse.APIMessageListHolder ();
         java_code.Warehouse.ItemType $result = null;
         $result = this.updateItemType (warehouse_id, item_type, token, apiMessageList);
         out = $rh.createReply();
         java_code.Warehouse.ItemTypeHelper.write (out, $result);
         java_code.Warehouse.APIMessageListHelper.write (out, apiMessageList.value);
         break;
       }

       case 17:  // Warehouse/WHM/sayHello
       {
         String $result = null;
         $result = this.sayHello ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 18:  // Warehouse/WHM/shutdown
       {
         this.shutdown ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Warehouse/WHM:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public WHM _this() 
  {
    return WHMHelper.narrow(
    super._this_object());
  }

  public WHM _this(org.omg.CORBA.ORB orb) 
  {
    return WHMHelper.narrow(
    super._this_object(orb));
  }


} // class WHMPOA
