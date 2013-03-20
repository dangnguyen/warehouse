package java_code.WarehouseStatic;

public enum APIMessageConst
{

    OK((short)1, "OK"),
    CONNECTION_ERROR((short)2, "Connection error"), 
    DB_CONNECTION_ERROR((short)3, "Database connection error"),
    NOT_OK((short)4, "Database Insert/Update/Delete false"),
    ORTHER_ERROR((short)5, "Other error")
    ;


    private short id;

    private String label;

    private APIMessageConst(short id, String label) {
        this.id = id;
        this.label = label;
    }

    public short getId() {
        return this.id;
    }
    public String getLabel() {
        return this.label;
    }
}
