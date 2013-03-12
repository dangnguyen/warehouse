package java_code.Warehouse;


/**
* java_code/Warehouse/RoleHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Hello.idl
* 23:08:36 ICT Th? ba, ng�y 12 th�ng ba n�m 2013
*/

abstract public class RoleHelper
{
  private static String  _id = "IDL:Warehouse/Role/Role:1.0";

  public static void insert (org.omg.CORBA.Any a, java_code.Warehouse.Role that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static java_code.Warehouse.Role extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [2];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_short);
          _members0[0] = new org.omg.CORBA.StructMember (
            "id",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "role_name",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (java_code.Warehouse.RoleHelper.id (), "Role", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static java_code.Warehouse.Role read (org.omg.CORBA.portable.InputStream istream)
  {
    java_code.Warehouse.Role value = new java_code.Warehouse.Role ();
    value.id = istream.read_short ();
    value.role_name = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, java_code.Warehouse.Role value)
  {
    ostream.write_short (value.id);
    ostream.write_string (value.role_name);
  }

}
