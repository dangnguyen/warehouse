package java_code.Warehouse;


/**
* java_code/Warehouse/User.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Hello.idl
* 23:08:36 ICT Th? ba, ng�y 12 th�ng ba n�m 2013
*/

public final class User implements org.omg.CORBA.portable.IDLEntity
{
  public short id = (short)0;
  public String username = null;
  public String password = null;
  public short role_id = (short)0;
  public String role_name = null;

  public User ()
  {
  } // ctor

  public User (short _id, String _username, String _password, short _role_id, String _role_name)
  {
    id = _id;
    username = _username;
    password = _password;
    role_id = _role_id;
    role_name = _role_name;
  } // ctor

} // class User
