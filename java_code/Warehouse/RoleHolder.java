package java_code.Warehouse;

/**
* java_code/Warehouse/RoleHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Hello.idl
* 23:35:39 ICT Th? b?y, ng�y 09 th�ng ba n�m 2013
*/

public final class RoleHolder implements org.omg.CORBA.portable.Streamable
{
  public java_code.Warehouse.Role value = null;

  public RoleHolder ()
  {
  }

  public RoleHolder (java_code.Warehouse.Role initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = java_code.Warehouse.RoleHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    java_code.Warehouse.RoleHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return java_code.Warehouse.RoleHelper.type ();
  }

}
