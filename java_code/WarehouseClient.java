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
	static	WHM	warehouseImpl;
	public WarehouseClient()  {

	}
	public static void hehe() {
		System.out.println("ha ha ha");
	}
	public static String hoho() {
		String result = "";

		try{
			String[] params = new String[4];
			params[0] = "-ORBInitialPort";
			params[1] = "1050";
			params[2] = "-ORBInitialHost";
			params[3] = "localhost";
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
	public static String login (String username, String password, java_code.Warehouse.APIMessageListHolder apiMessageList) {
		Long port = null;
		String host = null;
		try{
			//get jruby engine
    	ScriptEngine jruby = new ScriptEngineManager().getEngineByName("jruby");
    	//process a ruby file
    	// RubyHash yaml = (RubyHash)jruby.eval("YAML.load_file(Rails.root.join('config', 'api_server.yml'))[Rails.env]");
    	// RubyHash yaml = (RubyHash)jruby.eval("WareHouse::Application.config.api_host");
    	host = (String) jruby.eval("WareHouse::Application.config.api_host");
    	port = (Long) jruby.eval("WareHouse::Application.config.api_port");
  	}
  	catch (ScriptException e) {
  		System.out.println(e);
  	}
  	

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

	public static void logout (String token, java_code.Warehouse.APIMessageListHolder apiMessageList) {
		try{
			String[] params = new String[4];
			params[0] = "-ORBInitialPort";
			params[1] = "1050";
			params[2] = "-ORBInitialHost";
			params[3] = "localhost";
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

	public static void addUser (String username, String password, short role_id, String token, java_code.Warehouse.APIMessageListHolder apiMessageList) {

	}
  public static void removeUser (short user_id, String token, java_code.Warehouse.APIMessageListHolder apiMessageList) {

  }

	public static java_code.Warehouse.User getLoggedUser (String token, java_code.Warehouse.APIMessageListHolder apiMessageList) {
		java_code.Warehouse.User result = null;
		try{
			String[] params = new String[4];
			params[0] = "-ORBInitialPort";
			params[1] = "1050";
			params[2] = "-ORBInitialHost";
			params[3] = "localhost";
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
}