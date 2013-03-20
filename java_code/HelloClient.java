package java_code;
import	java_code.Warehouse.*;
import	org.omg.CosNaming.*;
import	org.omg.CosNaming.NamingContextPackage.*;
import	org.omg.CORBA.*;
public	class	HelloClient
{
	static	WHM	warehouseImpl;
	public	static	void	main(String	args[])
	{
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

			java_code.Warehouse.APIMessageListHolder aPIMessageListHolder = new java_code.Warehouse.APIMessageListHolder();
			System.out.println(warehouseImpl.login("admin","1", aPIMessageListHolder));
			System.out.println(aPIMessageListHolder.value[0].code);
			System.out.println(aPIMessageListHolder.value[0].description);



			// java_code.Warehouse.Item[] itemArr = warehouseImpl.getItemList ((short)1, "abc", aPIMessageListHolder);
			// System.out.println(itemArr.length);

			warehouseImpl.shutdown();
		}	catch	(Exception	e)	{
			System.out.println("ERROR	:	"	+	e)	;
			e.printStackTrace(System.out);
		}
	}
}