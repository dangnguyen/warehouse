package java_code.Warehouse;


/**
* java_code/Warehouse/WarehouseListHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Hello.idl
* Wednesday, March 13, 2013 2:19:53 PM GMT+07:00
*/

public final class WarehouseListHolder implements org.omg.CORBA.portable.Streamable
{
  public java_code.Warehouse.WarehouseInfo value[] = null;

  public WarehouseListHolder ()
  {
  }

  public WarehouseListHolder (java_code.Warehouse.WarehouseInfo[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = java_code.Warehouse.WarehouseListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    java_code.Warehouse.WarehouseListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return java_code.Warehouse.WarehouseListHelper.type ();
  }

}
