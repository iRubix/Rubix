package model;

public class Login {

    public static final String TABLE_NAME = "Login";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_USERNAME= "UserName";
    public static final String COLUMN_PASSWORD = "Password";

    private Integer id;
    private String UserName;
    private String Password;




    // Create table SQL query


    public static final String CREATE_TABLE =
                    " CREATE TABLE " + TABLE_NAME +  "("
                    + COLUMN_ID + "INTEGER PRIMARY KEY AUTOINCREMENT REFERENCES Person (id) NOT NULL UNIQUE,"
                    + COLUMN_USERNAME + "VARCHAR NOT NULL,"
                    + COLUMN_PASSWORD + "VARCHAR NOT NULL"
                    + ")";

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
