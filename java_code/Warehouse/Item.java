package java_code.Warehouse;


/**
* java_code/Warehouse/Item.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Hello.idl
* Friday, April 5, 2013 2:09:04 PM GMT+07:00
*/

public final class Item implements org.omg.CORBA.portable.IDLEntity
{
  public short itemCode = (short)0;
  public String description = null;
  public short qty = (short)0;
  public long date = (long)0;
  public short cost = (short)0;
  public short warehouse_id = (short)0;

  public Item ()
  {
  } // ctor

  public Item (short _itemCode, String _description, short _qty, long _date, short _cost, short _warehouse_id)
  {
    itemCode = _itemCode;
    description = _description;
    qty = _qty;
    date = _date;
    cost = _cost;
    warehouse_id = _warehouse_id;
  } // ctor

} // class Item
