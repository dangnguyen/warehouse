package java_code.Warehouse;


/**
* java_code/Warehouse/ItemType.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Hello.idl
* Friday, April 5, 2013 3:56:39 PM GMT+07:00
*/

public final class ItemType implements org.omg.CORBA.portable.IDLEntity
{
  public short id = (short)0;
  public String description = null;
  public short cost = (short)0;

  public ItemType ()
  {
  } // ctor

  public ItemType (short _id, String _description, short _cost)
  {
    id = _id;
    description = _description;
    cost = _cost;
  } // ctor

} // class ItemType
