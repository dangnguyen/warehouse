package java_code.Warehouse;

/**
* java_code/Warehouse/ItemTypeHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Hello.idl
* 23:08:36 ICT Th? ba, ng�y 12 th�ng ba n�m 2013
*/

public final class ItemTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public java_code.Warehouse.ItemType value = null;

  public ItemTypeHolder ()
  {
  }

  public ItemTypeHolder (java_code.Warehouse.ItemType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = java_code.Warehouse.ItemTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    java_code.Warehouse.ItemTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return java_code.Warehouse.ItemTypeHelper.type ();
  }

}
