package java_code.Warehouse;

/**
* java_code/Warehouse/ItemHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Hello.idl
* 23:08:36 ICT Th? ba, ng�y 12 th�ng ba n�m 2013
*/

public final class ItemHolder implements org.omg.CORBA.portable.Streamable
{
  public java_code.Warehouse.Item value = null;

  public ItemHolder ()
  {
  }

  public ItemHolder (java_code.Warehouse.Item initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = java_code.Warehouse.ItemHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    java_code.Warehouse.ItemHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return java_code.Warehouse.ItemHelper.type ();
  }

}