package java_code.Warehouse;

/**
* java_code/Warehouse/WarehouseInfoHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Hello.idl
* 22:25:38 ICT Th? hai, ng�y 18 th�ng ba n�m 2013
*/

public final class WarehouseInfoHolder implements org.omg.CORBA.portable.Streamable
{
  public java_code.Warehouse.WarehouseInfo value = null;

  public WarehouseInfoHolder ()
  {
  }

  public WarehouseInfoHolder (java_code.Warehouse.WarehouseInfo initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = java_code.Warehouse.WarehouseInfoHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    java_code.Warehouse.WarehouseInfoHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return java_code.Warehouse.WarehouseInfoHelper.type ();
  }

}
