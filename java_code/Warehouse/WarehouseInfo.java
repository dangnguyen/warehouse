package java_code.Warehouse;


/**
* java_code/Warehouse/WarehouseInfo.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Hello.idl
* Wednesday, March 13, 2013 2:19:53 PM GMT+07:00
*/

public final class WarehouseInfo implements org.omg.CORBA.portable.IDLEntity
{
  public short id = (short)0;
  public String name = null;

  public WarehouseInfo ()
  {
  } // ctor

  public WarehouseInfo (short _id, String _name)
  {
    id = _id;
    name = _name;
  } // ctor

} // class WarehouseInfo
