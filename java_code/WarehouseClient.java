package java_code;
import	java_code.Warehouse.*;
import	org.omg.CosNaming.*;
import	org.omg.CosNaming.NamingContextPackage.*;
import	org.omg.CORBA.*;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.ScriptContext;
import org.jruby.RubyHash;

public class WarehouseClient {
	private	WHM	warehouseImpl;
	private String host;
	private Long port;
	public WarehouseClient(String host, Long port)  {
		this.host = host;
		this.port = port;
	}
	public void hehe() {
		System.out.println("ha ha ha");
	}
	public String hoho() {
		String result = "";

		try{
			String[] params = new String[4];
			params[0] = "-ORBInitialPort";
			params[1] = port.toString();
			params[2] = "-ORBInitialHost";
			params[3] = host;
			//	create	and	initialize	the	ORB
			ORB	orb	=	ORB.init(params,	null);
			//	get	the	root	naming	context
			org.omg.CORBA.Object	objRef	=
			orb.resolve_initial_references("NameService");
			//	Use	NamingContextExt	instead	of	NamingContext.	This	is
			//	part	of	the	Interoperable	naming	Service.
			NamingContextExt	ncRef	=	NamingContextExtHelper.narrow(objRef);
			//	resolve	the	Object	Reference	in	Naming
			String	name	=	"WHM";
			warehouseImpl	=	WHMHelper.narrow(ncRef.resolve_str(name));
			System.out.println("Obtained	a	handle	on	server	object:	"	+	warehouseImpl);

			result = warehouseImpl.sayHello();

		}	catch	(Exception	e)	{
			System.out.println("ERROR	:	"	+	e)	;
			e.printStackTrace(System.out);
		}
		return result;
	}
	public String login (String username, String password, java_code.Warehouse.APIMessageListHolder apiMessageList) {
		// try{
		// 	//get jruby engine
  //   	ScriptEngine jruby = new ScriptEngineManager().getEngineByName("jruby");
  //   	//process a ruby file
  //   	// RubyHash yaml = (RubyHash)jruby.eval("YAML.load_file(Rails.root.join('config', 'api_server.yml'))[Rails.env]");
  //   	// RubyHash yaml = (RubyHash)jruby.eval("WareHouse::Application.config.api_host");
  //   	host = (String) jruby.eval("WareHouse::Application.config.api_host");
  //   	port = (Long) jruby.eval("WareHouse::Application.config.api_port");
  // 	}
  // 	catch (ScriptException e) {
  // 		System.out.println(e);
  // 	}

		String result = "";
		try{
			String[] params = new String[4];
			params[0] = "-ORBInitialPort";
			params[1] = port.toString();
			params[2] = "-ORBInitialHost";
			params[3] = host;
			//	create	and	initialize	the	ORB
			ORB	orb	=	ORB.init(params,	null);
			//	get	the	root	naming	context
			org.omg.CORBA.Object	objRef	=
			orb.resolve_initial_references("NameService");
			//	Use	NamingContextExt	instead	of	NamingContext.	This	is
			//	part	of	the	Interoperable	naming	Service.
			NamingContextExt	ncRef	=	NamingContextExtHelper.narrow(objRef);
			//	resolve	the	Object	Reference	in	Naming
			String	name	=	"WHM";
			warehouseImpl	=	WHMHelper.narrow(ncRef.resolve_str(name));
			System.out.println("Obtained	a	handle	on	server	object:	"	+	warehouseImpl);

			result = warehouseImpl.login(username, password, apiMessageList);

		}	catch	(Exception	e)	{
			System.out.println("ERROR	:	"	+	e)	;
			e.printStackTrace(System.out);
		}
		return result;
	}

	public void logout (String token, java_code.Warehouse.APIMessageListHolder apiMessageList) {
		try{
			String[] params = new String[4];
			params[0] = "-ORBInitialPort";
			params[1] = port.toString();
			params[2] = "-ORBInitialHost";
			params[3] = host;
			//	create	and	initialize	the	ORB
			ORB	orb	=	ORB.init(params,	null);
			//	get	the	root	naming	context
			org.omg.CORBA.Object	objRef	=
			orb.resolve_initial_references("NameService");
			//	Use	NamingContextExt	instead	of	NamingContext.	This	is
			//	part	of	the	Interoperable	naming	Service.
			NamingContextExt	ncRef	=	NamingContextExtHelper.narrow(objRef);
			//	resolve	the	Object	Reference	in	Naming
			String	name	=	"WHM";
			warehouseImpl	=	WHMHelper.narrow(ncRef.resolve_str(name));
			System.out.println("Obtained	a	handle	on	server	object:	"	+	warehouseImpl);

			warehouseImpl.logout(token, apiMessageList);

		}	catch	(Exception	e)	{
			System.out.println("ERROR	:	"	+	e)	;
			e.printStackTrace(System.out);
		}
	}

	public void addUser (String username, String password, short role_id, String token, java_code.Warehouse.APIMessageListHolder apiMessageList) {
		try{
			String[] params = new String[4];
			params[0] = "-ORBInitialPort";
			params[1] = port.toString();
			params[2] = "-ORBInitialHost";
			params[3] = host;
			//	create	and	initialize	the	ORB
			ORB	orb	=	ORB.init(params,	null);
			//	get	the	root	naming	context
			org.omg.CORBA.Object	objRef	=
			orb.resolve_initial_references("NameService");
			//	Use	NamingContextExt	instead	of	NamingContext.	This	is
			//	part	of	the	Interoperable	naming	Service.
			NamingContextExt	ncRef	=	NamingContextExtHelper.narrow(objRef);
			//	resolve	the	Object	Reference	in	Naming
			String	name	=	"WHM";
			warehouseImpl	=	WHMHelper.narrow(ncRef.resolve_str(name));
			System.out.println("Obtained	a	handle	on	server	object:	"	+	warehouseImpl);

			warehouseImpl.addUser(username, password, role_id, token, apiMessageList);

		}	catch	(Exception	e)	{
			System.out.println("ERROR	:	"	+	e)	;
			e.printStackTrace(System.out);
		}
	}
  public void removeUser (short user_id, String token, java_code.Warehouse.APIMessageListHolder apiMessageList) {
  	try{
			String[] params = new String[4];
			params[0] = "-ORBInitialPort";
			params[1] = port.toString();
			params[2] = "-ORBInitialHost";
			params[3] = host;
			//	create	and	initialize	the	ORB
			ORB	orb	=	ORB.init(params,	null);
			//	get	the	root	naming	context
			org.omg.CORBA.Object	objRef	=
			orb.resolve_initial_references("NameService");
			//	Use	NamingContextExt	instead	of	NamingContext.	This	is
			//	part	of	the	Interoperable	naming	Service.
			NamingContextExt	ncRef	=	NamingContextExtHelper.narrow(objRef);
			//	resolve	the	Object	Reference	in	Naming
			String	name	=	"WHM";
			warehouseImpl	=	WHMHelper.narrow(ncRef.resolve_str(name));
			System.out.println("Obtained	a	handle	on	server	object:	"	+	warehouseImpl);

			warehouseImpl.removeUser(user_id, token, apiMessageList);

		}	catch	(Exception	e)	{
			System.out.println("ERROR	:	"	+	e)	;
			e.printStackTrace(System.out);
		}
  }

	public java_code.Warehouse.User getLoggedUser (String token, java_code.Warehouse.APIMessageListHolder apiMessageList) {
		java_code.Warehouse.User result = null;
		try{
			String[] params = new String[4];
			params[0] = "-ORBInitialPort";
			params[1] = port.toString();
			params[2] = "-ORBInitialHost";
			params[3] = host;
			//	create	and	initialize	the	ORB
			ORB	orb	=	ORB.init(params,	null);
			//	get	the	root	naming	context
			org.omg.CORBA.Object	objRef	=
			orb.resolve_initial_references("NameService");
			//	Use	NamingContextExt	instead	of	NamingContext.	This	is
			//	part	of	the	Interoperable	naming	Service.
			NamingContextExt	ncRef	=	NamingContextExtHelper.narrow(objRef);
			//	resolve	the	Object	Reference	in	Naming
			String	name	=	"WHM";
			warehouseImpl	=	WHMHelper.narrow(ncRef.resolve_str(name));
			System.out.println("Obtained	a	handle	on	server	object:	"	+	warehouseImpl);

			result = warehouseImpl.getLoggedUser(token, apiMessageList);

		}	catch	(Exception	e)	{
			System.out.println("ERROR	:	"	+	e)	;
			e.printStackTrace(System.out);
		}
		return result;
	}
	public void updateUser (java_code.Warehouse.User user, String token, java_code.Warehouse.APIMessageListHolder apiMessageList) {
		try{
			String[] params = new String[4];
			params[0] = "-ORBInitialPort";
			params[1] = port.toString();
			params[2] = "-ORBInitialHost";
			params[3] = host;
			//	create	and	initialize	the	ORB
			ORB	orb	=	ORB.init(params,	null);
			//	get	the	root	naming	context
			org.omg.CORBA.Object	objRef	=
			orb.resolve_initial_references("NameService");
			//	Use	NamingContextExt	instead	of	NamingContext.	This	is
			//	part	of	the	Interoperable	naming	Service.
			NamingContextExt	ncRef	=	NamingContextExtHelper.narrow(objRef);
			//	resolve	the	Object	Reference	in	Naming
			String	name	=	"WHM";
			warehouseImpl	=	WHMHelper.narrow(ncRef.resolve_str(name));
			System.out.println("Obtained	a	handle	on	server	object:	"	+	warehouseImpl);

			warehouseImpl.updateUser(user, token, apiMessageList);

		}	catch	(Exception	e)	{
			System.out.println("ERROR	:	"	+	e)	;
			e.printStackTrace(System.out);
		}
	}
  public java_code.Warehouse.Role getRole (short role_id, String token, java_code.Warehouse.APIMessageListHolder apiMessageList) {
  	java_code.Warehouse.Role result = null;
		try{
			String[] params = new String[4];
			params[0] = "-ORBInitialPort";
			params[1] = port.toString();
			params[2] = "-ORBInitialHost";
			params[3] = host;
			//	create	and	initialize	the	ORB
			ORB	orb	=	ORB.init(params,	null);
			//	get	the	root	naming	context
			org.omg.CORBA.Object	objRef	=
			orb.resolve_initial_references("NameService");
			//	Use	NamingContextExt	instead	of	NamingContext.	This	is
			//	part	of	the	Interoperable	naming	Service.
			NamingContextExt	ncRef	=	NamingContextExtHelper.narrow(objRef);
			//	resolve	the	Object	Reference	in	Naming
			String	name	=	"WHM";
			warehouseImpl	=	WHMHelper.narrow(ncRef.resolve_str(name));
			System.out.println("Obtained	a	handle	on	server	object:	"	+	warehouseImpl);

			result = warehouseImpl.getRole(role_id, token, apiMessageList);

		}	catch	(Exception	e)	{
			System.out.println("ERROR	:	"	+	e)	;
			e.printStackTrace(System.out);
		}
		return result;
  }

  public void addItem (short warehouse_id, short itemCode, short qty, String token, java_code.Warehouse.APIMessageListHolder apiMessageList) {
  	try{
			String[] params = new String[4];
			params[0] = "-ORBInitialPort";
			params[1] = port.toString();
			params[2] = "-ORBInitialHost";
			params[3] = host;
			//	create	and	initialize	the	ORB
			ORB	orb	=	ORB.init(params,	null);
			//	get	the	root	naming	context
			org.omg.CORBA.Object	objRef	=
			orb.resolve_initial_references("NameService");
			//	Use	NamingContextExt	instead	of	NamingContext.	This	is
			//	part	of	the	Interoperable	naming	Service.
			NamingContextExt	ncRef	=	NamingContextExtHelper.narrow(objRef);
			//	resolve	the	Object	Reference	in	Naming
			String	name	=	"WHM";
			warehouseImpl	=	WHMHelper.narrow(ncRef.resolve_str(name));
			System.out.println("Obtained	a	handle	on	server	object:	"	+	warehouseImpl);

			warehouseImpl.addItem(warehouse_id, itemCode, qty, token, apiMessageList);

		}	catch	(Exception	e)	{
			System.out.println("ERROR	:	"	+	e)	;
			e.printStackTrace(System.out);
		}
  }

  public void removeItem (short warehouse_id, short itemCode, short qty, String token, java_code.Warehouse.APIMessageListHolder apiMessageList) {
  	try{
			String[] params = new String[4];
			params[0] = "-ORBInitialPort";
			params[1] = port.toString();
			params[2] = "-ORBInitialHost";
			params[3] = host;
			//	create	and	initialize	the	ORB
			ORB	orb	=	ORB.init(params,	null);
			//	get	the	root	naming	context
			org.omg.CORBA.Object	objRef	=
			orb.resolve_initial_references("NameService");
			//	Use	NamingContextExt	instead	of	NamingContext.	This	is
			//	part	of	the	Interoperable	naming	Service.
			NamingContextExt	ncRef	=	NamingContextExtHelper.narrow(objRef);
			//	resolve	the	Object	Reference	in	Naming
			String	name	=	"WHM";
			warehouseImpl	=	WHMHelper.narrow(ncRef.resolve_str(name));
			System.out.println("Obtained	a	handle	on	server	object:	"	+	warehouseImpl);

			warehouseImpl.removeItem(warehouse_id, itemCode, qty, token, apiMessageList);

		}	catch	(Exception	e)	{
			System.out.println("ERROR	:	"	+	e)	;
			e.printStackTrace(System.out);
		}
  }


  public java_code.Warehouse.Item[] getItemList(short warehouse_id, String token, java_code.Warehouse.APIMessageListHolder apiMessageList) {
  	java_code.Warehouse.Item[] result = null;
		try{
			String[] params = new String[4];
			params[0] = "-ORBInitialPort";
			params[1] = port.toString();
			params[2] = "-ORBInitialHost";
			params[3] = host;
			//	create	and	initialize	the	ORB
			ORB	orb	=	ORB.init(params,	null);
			//	get	the	root	naming	context
			org.omg.CORBA.Object	objRef	=
			orb.resolve_initial_references("NameService");
			//	Use	NamingContextExt	instead	of	NamingContext.	This	is
			//	part	of	the	Interoperable	naming	Service.
			NamingContextExt	ncRef	=	NamingContextExtHelper.narrow(objRef);
			//	resolve	the	Object	Reference	in	Naming
			String	name	=	"WHM";
			warehouseImpl	=	WHMHelper.narrow(ncRef.resolve_str(name));
			System.out.println("Obtained	a	handle	on	server	object:	"	+	warehouseImpl);

			result = warehouseImpl.getItemList(warehouse_id, token, apiMessageList);

		}	catch	(Exception	e)	{
			System.out.println("ERROR	:	"	+	e)	;
			e.printStackTrace(System.out);
		}
		return result;
  }

  public java_code.Warehouse.Item getItem (short warehouse_id, short itemCode, String token, java_code.Warehouse.APIMessageListHolder apiMessageList) {
  	java_code.Warehouse.Item result = null;
		try{
			String[] params = new String[4];
			params[0] = "-ORBInitialPort";
			params[1] = port.toString();
			params[2] = "-ORBInitialHost";
			params[3] = host;
			//	create	and	initialize	the	ORB
			ORB	orb	=	ORB.init(params,	null);
			//	get	the	root	naming	context
			org.omg.CORBA.Object	objRef	=
			orb.resolve_initial_references("NameService");
			//	Use	NamingContextExt	instead	of	NamingContext.	This	is
			//	part	of	the	Interoperable	naming	Service.
			NamingContextExt	ncRef	=	NamingContextExtHelper.narrow(objRef);
			//	resolve	the	Object	Reference	in	Naming
			String	name	=	"WHM";
			warehouseImpl	=	WHMHelper.narrow(ncRef.resolve_str(name));
			System.out.println("Obtained	a	handle	on	server	object:	"	+	warehouseImpl);

			result = warehouseImpl.getItem(warehouse_id, itemCode, token, apiMessageList);

		}	catch	(Exception	e)	{
			System.out.println("ERROR	:	"	+	e)	;
			e.printStackTrace(System.out);
		}
		return result;
  }

  public java_code.Warehouse.ItemType[] getItemTypeList (short warehouse_id, String token, java_code.Warehouse.APIMessageListHolder apiMessageList) {
  	java_code.Warehouse.ItemType[] result = null;
		try{
			String[] params = new String[4];
			params[0] = "-ORBInitialPort";
			params[1] = port.toString();
			params[2] = "-ORBInitialHost";
			params[3] = host;
			//	create	and	initialize	the	ORB
			ORB	orb	=	ORB.init(params,	null);
			//	get	the	root	naming	context
			org.omg.CORBA.Object	objRef	=
			orb.resolve_initial_references("NameService");
			//	Use	NamingContextExt	instead	of	NamingContext.	This	is
			//	part	of	the	Interoperable	naming	Service.
			NamingContextExt	ncRef	=	NamingContextExtHelper.narrow(objRef);
			//	resolve	the	Object	Reference	in	Naming
			String	name	=	"WHM";
			warehouseImpl	=	WHMHelper.narrow(ncRef.resolve_str(name));
			System.out.println("Obtained	a	handle	on	server	object:	"	+	warehouseImpl);

			result = warehouseImpl.getItemTypeList(warehouse_id, token, apiMessageList);

		}	catch	(Exception	e)	{
			System.out.println("ERROR	:	"	+	e)	;
			e.printStackTrace(System.out);
		}
		return result;
  }

  public java_code.Warehouse.ItemType getItemType (short warehouse_id, short item_type_id, String token, java_code.Warehouse.APIMessageListHolder apiMessageList) {
  	java_code.Warehouse.ItemType result = null;
		try{
			String[] params = new String[4];
			params[0] = "-ORBInitialPort";
			params[1] = port.toString();
			params[2] = "-ORBInitialHost";
			params[3] = host;
			//	create	and	initialize	the	ORB
			ORB	orb	=	ORB.init(params,	null);
			//	get	the	root	naming	context
			org.omg.CORBA.Object	objRef	=
			orb.resolve_initial_references("NameService");
			//	Use	NamingContextExt	instead	of	NamingContext.	This	is
			//	part	of	the	Interoperable	naming	Service.
			NamingContextExt	ncRef	=	NamingContextExtHelper.narrow(objRef);
			//	resolve	the	Object	Reference	in	Naming
			String	name	=	"WHM";
			warehouseImpl	=	WHMHelper.narrow(ncRef.resolve_str(name));
			System.out.println("Obtained	a	handle	on	server	object:	"	+	warehouseImpl);

			result = warehouseImpl.getItemType(warehouse_id, item_type_id, token, apiMessageList);

		}	catch	(Exception	e)	{
			System.out.println("ERROR	:	"	+	e)	;
			e.printStackTrace(System.out);
		}
		return result;
  }

  public java_code.Warehouse.ItemType addItemType (short warehouse_id, java_code.Warehouse.ItemType item_type, String token, java_code.Warehouse.APIMessageListHolder apiMessageList) {
  	java_code.Warehouse.ItemType result = null;
		try{
			String[] params = new String[4];
			params[0] = "-ORBInitialPort";
			params[1] = port.toString();
			params[2] = "-ORBInitialHost";
			params[3] = host;
			//	create	and	initialize	the	ORB
			ORB	orb	=	ORB.init(params,	null);
			//	get	the	root	naming	context
			org.omg.CORBA.Object	objRef	=
			orb.resolve_initial_references("NameService");
			//	Use	NamingContextExt	instead	of	NamingContext.	This	is
			//	part	of	the	Interoperable	naming	Service.
			NamingContextExt	ncRef	=	NamingContextExtHelper.narrow(objRef);
			//	resolve	the	Object	Reference	in	Naming
			String	name	=	"WHM";
			warehouseImpl	=	WHMHelper.narrow(ncRef.resolve_str(name));
			System.out.println("Obtained	a	handle	on	server	object:	"	+	warehouseImpl);

			result = warehouseImpl.addItemType(warehouse_id, item_type, token, apiMessageList);

		}	catch	(Exception	e)	{
			System.out.println("ERROR	:	"	+	e)	;
			e.printStackTrace(System.out);
		}
		return result;
  }
  public void removeItemType (short warehouse_id, short item_type_id, String token, java_code.Warehouse.APIMessageListHolder apiMessageList) {
 		try{
			String[] params = new String[4];
			params[0] = "-ORBInitialPort";
			params[1] = port.toString();
			params[2] = "-ORBInitialHost";
			params[3] = host;
			//	create	and	initialize	the	ORB
			ORB	orb	=	ORB.init(params,	null);
			//	get	the	root	naming	context
			org.omg.CORBA.Object	objRef	=
			orb.resolve_initial_references("NameService");
			//	Use	NamingContextExt	instead	of	NamingContext.	This	is
			//	part	of	the	Interoperable	naming	Service.
			NamingContextExt	ncRef	=	NamingContextExtHelper.narrow(objRef);
			//	resolve	the	Object	Reference	in	Naming
			String	name	=	"WHM";
			warehouseImpl	=	WHMHelper.narrow(ncRef.resolve_str(name));
			System.out.println("Obtained	a	handle	on	server	object:	"	+	warehouseImpl);

			warehouseImpl.removeItemType(warehouse_id, item_type_id, token, apiMessageList);

		}	catch	(Exception	e)	{
			System.out.println("ERROR	:	"	+	e)	;
			e.printStackTrace(System.out);
		}
  }
  public java_code.Warehouse.ItemType updateItemType (short warehouse_id, java_code.Warehouse.ItemType item_type, String token, java_code.Warehouse.APIMessageListHolder apiMessageList) {
  	java_code.Warehouse.ItemType result = null;
		try{
			String[] params = new String[4];
			params[0] = "-ORBInitialPort";
			params[1] = port.toString();
			params[2] = "-ORBInitialHost";
			params[3] = host;
			//	create	and	initialize	the	ORB
			ORB	orb	=	ORB.init(params,	null);
			//	get	the	root	naming	context
			org.omg.CORBA.Object	objRef	=
			orb.resolve_initial_references("NameService");
			//	Use	NamingContextExt	instead	of	NamingContext.	This	is
			//	part	of	the	Interoperable	naming	Service.
			NamingContextExt	ncRef	=	NamingContextExtHelper.narrow(objRef);
			//	resolve	the	Object	Reference	in	Naming
			String	name	=	"WHM";
			warehouseImpl	=	WHMHelper.narrow(ncRef.resolve_str(name));
			System.out.println("Obtained	a	handle	on	server	object:	"	+	warehouseImpl);

			result = warehouseImpl.updateItemType(warehouse_id, item_type, token, apiMessageList);

		}	catch	(Exception	e)	{
			System.out.println("ERROR	:	"	+	e)	;
			e.printStackTrace(System.out);
		}
		return result;
  }


  public java_code.Warehouse.User[] getUserListByWarehouseId (short warehouse_id, String token, java_code.Warehouse.APIMessageListHolder apiMessageList) {
  	java_code.Warehouse.User[] result = null;
		try{
			String[] params = new String[4];
			params[0] = "-ORBInitialPort";
			params[1] = port.toString();
			params[2] = "-ORBInitialHost";
			params[3] = host;
			//	create	and	initialize	the	ORB
			ORB	orb	=	ORB.init(params,	null);
			//	get	the	root	naming	context
			org.omg.CORBA.Object	objRef	=
			orb.resolve_initial_references("NameService");
			//	Use	NamingContextExt	instead	of	NamingContext.	This	is
			//	part	of	the	Interoperable	naming	Service.
			NamingContextExt	ncRef	=	NamingContextExtHelper.narrow(objRef);
			//	resolve	the	Object	Reference	in	Naming
			String	name	=	"WHM";
			warehouseImpl	=	WHMHelper.narrow(ncRef.resolve_str(name));
			System.out.println("Obtained	a	handle	on	server	object:	"	+	warehouseImpl);

			result = warehouseImpl.getUserListByWarehouseId(warehouse_id, token, apiMessageList);

		}	catch	(Exception	e)	{
			System.out.println("ERROR	:	"	+	e)	;
			e.printStackTrace(System.out);
		}
		return result;
  }

  public java_code.Warehouse.WarehouseInfo[] getWarehouseListByUserId (short user_id, String token, java_code.Warehouse.APIMessageListHolder apiMessageList) {
  	java_code.Warehouse.WarehouseInfo[] result = null;
		try{
			String[] params = new String[4];
			params[0] = "-ORBInitialPort";
			params[1] = port.toString();
			params[2] = "-ORBInitialHost";
			params[3] = host;
			//	create	and	initialize	the	ORB
			ORB	orb	=	ORB.init(params,	null);
			//	get	the	root	naming	context
			org.omg.CORBA.Object	objRef	=
			orb.resolve_initial_references("NameService");
			//	Use	NamingContextExt	instead	of	NamingContext.	This	is
			//	part	of	the	Interoperable	naming	Service.
			NamingContextExt	ncRef	=	NamingContextExtHelper.narrow(objRef);
			//	resolve	the	Object	Reference	in	Naming
			String	name	=	"WHM";
			warehouseImpl	=	WHMHelper.narrow(ncRef.resolve_str(name));
			System.out.println("Obtained	a	handle	on	server	object:	"	+	warehouseImpl);

			result = warehouseImpl.getWarehouseListByUserId(user_id, token, apiMessageList);

		}	catch	(Exception	e)	{
			System.out.println("ERROR	:	"	+	e)	;
			e.printStackTrace(System.out);
		}
		return result;
  }

  public java_code.Warehouse.User[] getUserList(String token, java_code.Warehouse.APIMessageListHolder apiMessageList) {
  	java_code.Warehouse.User[] result = null;
		try{
			String[] params = new String[4];
			params[0] = "-ORBInitialPort";
			params[1] = port.toString();
			params[2] = "-ORBInitialHost";
			params[3] = host;
			//	create	and	initialize	the	ORB
			ORB	orb	=	ORB.init(params,	null);
			//	get	the	root	naming	context
			org.omg.CORBA.Object	objRef	=
			orb.resolve_initial_references("NameService");
			//	Use	NamingContextExt	instead	of	NamingContext.	This	is
			//	part	of	the	Interoperable	naming	Service.
			NamingContextExt	ncRef	=	NamingContextExtHelper.narrow(objRef);
			//	resolve	the	Object	Reference	in	Naming
			String	name	=	"WHM";
			warehouseImpl	=	WHMHelper.narrow(ncRef.resolve_str(name));
			System.out.println("Obtained	a	handle	on	server	object:	"	+	warehouseImpl);

			result = warehouseImpl.getUserList(token, apiMessageList);

		}	catch	(Exception	e)	{
			System.out.println("ERROR	:	"	+	e)	;
			e.printStackTrace(System.out);
		}
		return result;
  }

  java_code.Warehouse.Role[] getRoleList (String token, java_code.Warehouse.APIMessageListHolder apiMessageList) {
		java_code.Warehouse.Role[] result = null;
		try{
			String[] params = new String[4];
			params[0] = "-ORBInitialPort";
			params[1] = port.toString();
			params[2] = "-ORBInitialHost";
			params[3] = host;
			//	create	and	initialize	the	ORB
			ORB	orb	=	ORB.init(params,	null);
			//	get	the	root	naming	context
			org.omg.CORBA.Object	objRef	=
			orb.resolve_initial_references("NameService");
			//	Use	NamingContextExt	instead	of	NamingContext.	This	is
			//	part	of	the	Interoperable	naming	Service.
			NamingContextExt	ncRef	=	NamingContextExtHelper.narrow(objRef);
			//	resolve	the	Object	Reference	in	Naming
			String	name	=	"WHM";
			warehouseImpl	=	WHMHelper.narrow(ncRef.resolve_str(name));
			System.out.println("Obtained	a	handle	on	server	object:	"	+	warehouseImpl);

			result = warehouseImpl.getRoleList(token, apiMessageList);

		}	catch	(Exception	e)	{
			System.out.println("ERROR	:	"	+	e)	;
			e.printStackTrace(System.out);
		}
		return result;
  }

  java_code.Warehouse.User getUser (short user_id, String token, java_code.Warehouse.APIMessageListHolder apiMessageList) {
  	java_code.Warehouse.User result = null;
		try{
			String[] params = new String[4];
			params[0] = "-ORBInitialPort";
			params[1] = port.toString();
			params[2] = "-ORBInitialHost";
			params[3] = host;
			//	create	and	initialize	the	ORB
			ORB	orb	=	ORB.init(params,	null);
			//	get	the	root	naming	context
			org.omg.CORBA.Object	objRef	=
			orb.resolve_initial_references("NameService");
			//	Use	NamingContextExt	instead	of	NamingContext.	This	is
			//	part	of	the	Interoperable	naming	Service.
			NamingContextExt	ncRef	=	NamingContextExtHelper.narrow(objRef);
			//	resolve	the	Object	Reference	in	Naming
			String	name	=	"WHM";
			warehouseImpl	=	WHMHelper.narrow(ncRef.resolve_str(name));
			System.out.println("Obtained	a	handle	on	server	object:	"	+	warehouseImpl);

			result = warehouseImpl.getUser(user_id, token, apiMessageList);

		}	catch	(Exception	e)	{
			System.out.println("ERROR	:	"	+	e)	;
			e.printStackTrace(System.out);
		}
		return result;
  }

  java_code.Warehouse.WarehouseInfo[] getWarehouseList (String token, java_code.Warehouse.APIMessageListHolder apiMessageList) {
  	java_code.Warehouse.WarehouseInfo[] result = null;
		try{
			String[] params = new String[4];
			params[0] = "-ORBInitialPort";
			params[1] = port.toString();
			params[2] = "-ORBInitialHost";
			params[3] = host;
			//	create	and	initialize	the	ORB
			ORB	orb	=	ORB.init(params,	null);
			//	get	the	root	naming	context
			org.omg.CORBA.Object	objRef	=
			orb.resolve_initial_references("NameService");
			//	Use	NamingContextExt	instead	of	NamingContext.	This	is
			//	part	of	the	Interoperable	naming	Service.
			NamingContextExt	ncRef	=	NamingContextExtHelper.narrow(objRef);
			//	resolve	the	Object	Reference	in	Naming
			String	name	=	"WHM";
			warehouseImpl	=	WHMHelper.narrow(ncRef.resolve_str(name));
			System.out.println("Obtained	a	handle	on	server	object:	"	+	warehouseImpl);

			result = warehouseImpl.getWarehouseList(token, apiMessageList);

		}	catch	(Exception	e)	{
			System.out.println("ERROR	:	"	+	e)	;
			e.printStackTrace(System.out);
		}
		return result;
  }
  void updateWarehousePermissionForUser (short user_id, short[] warehouse_ids, String token, java_code.Warehouse.APIMessageListHolder apiMessageList) {
  	try{
			String[] params = new String[4];
			params[0] = "-ORBInitialPort";
			params[1] = port.toString();
			params[2] = "-ORBInitialHost";
			params[3] = host;
			//	create	and	initialize	the	ORB
			ORB	orb	=	ORB.init(params,	null);
			//	get	the	root	naming	context
			org.omg.CORBA.Object	objRef	=
			orb.resolve_initial_references("NameService");
			//	Use	NamingContextExt	instead	of	NamingContext.	This	is
			//	part	of	the	Interoperable	naming	Service.
			NamingContextExt	ncRef	=	NamingContextExtHelper.narrow(objRef);
			//	resolve	the	Object	Reference	in	Naming
			String	name	=	"WHM";
			warehouseImpl	=	WHMHelper.narrow(ncRef.resolve_str(name));
			System.out.println("Obtained	a	handle	on	server	object:	"	+	warehouseImpl);

			warehouseImpl.updateWarehousePermissionForUser(user_id, warehouse_ids, token, apiMessageList);

		}	catch	(Exception	e)	{
			System.out.println("ERROR	:	"	+	e)	;
			e.printStackTrace(System.out);
		}
  }


}