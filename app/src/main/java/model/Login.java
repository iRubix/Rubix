package model;

public class Login {

    public static final String TABLE_NAME = "Login";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_USERNAME= "UserName";
    public static final String COLUMN_PASSWORD = "Password";

    private Integer id;
    private String UserName;
    private String Password;


    public Login(){

    }

        public Login(Integer id, String userName, String password) {
            this.id = id;
            this.UserName = userName;
            this.Password = password;
        }
        public Login(String userName, String password){
            this.UserName = userName;
            this.Password = password;
        }




    // Create table SQL query


    public static final String CREATE_TABLE =
                    " CREATE TABLE " + TABLE_NAME +  "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL UNIQUE,"
                    + COLUMN_USERNAME + " VARCHAR NOT NULL, "
                    + COLUMN_PASSWORD + " VARCHAR NOT NULL "
                    + ")";



    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
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
