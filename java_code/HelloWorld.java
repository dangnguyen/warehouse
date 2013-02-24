package java_code;
import	java_code.HelloApp.*;
import	org.omg.CosNaming.*;
import	org.omg.CosNaming.NamingContextPackage.*;
import	org.omg.CORBA.*;

public class HelloWorld {
	static	Hello	helloImpl;
	public HelloWorld()  {

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
			String	name	=	"Hello";
			helloImpl	=	HelloHelper.narrow(ncRef.resolve_str(name));
			System.out.println("Obtained	a	handle	on	server	object:	"	+	helloImpl);
			result = helloImpl.sayHello();
			helloImpl.shutdown();
		}	catch	(Exception	e)	{
			System.out.println("ERROR	:	"	+	e)	;
			e.printStackTrace(System.out);	
		}
		return result;
	}
}