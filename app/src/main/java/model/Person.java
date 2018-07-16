package model;

public class Person {
    public static final String TABLE_NAME = "Person";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_FIRSTNAME = "FirstName";
    public static final String COLUMN_LASTNAME = "LastName";
    public static final String COLUMN_TITLE = "Title";
    public static final String COLUMN_AGE = "Age";
    public static final String COLUMN_CELLNUMBER = "CellNumber";
    public static final String COLUMN_UNIT = "Unit";


    private Integer id;
    private String FirstName;
    private String LastName;
    private String Title;
    private Integer Age;
    private String CellNumber;
    private Integer Unit;



    // Create table SQL query


    public static final String CREATE_TABLE =
            " CREATE TABLE " + TABLE_NAME +  "("
            + COLUMN_ID + "INTEGER PRIMARY KEY AUTOINCREMENT UNIQUE NOT NULL,"
            + COLUMN_FIRSTNAME + "VARCHAR NOT NULL,"
            + COLUMN_LASTNAME + "VARCHAR NOT NULL,"
            + COLUMN_TITLE + "INTEGER,"
            + COLUMN_AGE + "INTEGER NOT NULL,"
            + COLUMN_CELLNUMBER + "VARCHAR NOT NULL,"
            + COLUMN_UNIT + "INTEGER"
    + ")";

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public String getCellNumber() {
        return CellNumber;
    }

    public void setCellNumber(String cellNumber) {
        CellNumber = cellNumber;
    }

    public Integer getUnit() {
        return Unit;
    }

    public void setUnit(Integer unit) {
        Unit = unit;
    }
}
