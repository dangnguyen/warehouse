package java_code.Warehouse;


/**
* java_code/Warehouse/APIMessageListHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Hello.idl
* 23:51:04 ICT Th? n�m, ng�y 04 th�ng t� n�m 2013
*/

public final class APIMessageListHolder implements org.omg.CORBA.portable.Streamable
{
  public java_code.Warehouse.APIMessage value[] = null;

  public APIMessageListHolder ()
  {
  }

  public APIMessageListHolder (java_code.Warehouse.APIMessage[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = java_code.Warehouse.APIMessageListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    java_code.Warehouse.APIMessageListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return java_code.Warehouse.APIMessageListHelper.type ();
  }

}
