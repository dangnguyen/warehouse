package java_code.Warehouse;


/**
* java_code/Warehouse/ItemListHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Hello.idl
* 23:51:04 ICT Th? n�m, ng�y 04 th�ng t� n�m 2013
*/

abstract public class ItemListHelper
{
  private static String  _id = "IDL:Warehouse/ItemList:1.0";

  public static void insert (org.omg.CORBA.Any a, java_code.Warehouse.Item[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static java_code.Warehouse.Item[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = java_code.Warehouse.ItemHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (java_code.Warehouse.ItemListHelper.id (), "ItemList", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static java_code.Warehouse.Item[] read (org.omg.CORBA.portable.InputStream istream)
  {
    java_code.Warehouse.Item value[] = null;
    int _len0 = istream.read_long ();
    value = new java_code.Warehouse.Item[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = java_code.Warehouse.ItemHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, java_code.Warehouse.Item[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      java_code.Warehouse.ItemHelper.write (ostream, value[_i0]);
  }

}
