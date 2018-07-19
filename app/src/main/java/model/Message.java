package model;

import java.util.Date;

public class Message {

    public static final String TABLE_NAME = "Message";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_SUBJECT = "Subject";
    public static final String COLUMN_TEXT= "Text";
    public static final String COLUMN_DATE = "Date";
    public static final String COLUMN_SEEN = "SeenMsg";



    private Integer id;
    private String Subject;
    private String Text;
    private java.util.Date Date;
    private Boolean SeenMsg;





    // Create table SQL query


    public static final String CREATE_TABLE =
            " CREATE TABLE " + TABLE_NAME +  "("
                    + COLUMN_ID + "INTEGER  PRIMARY KEY UNIQUE NOT NULL,"
                    + COLUMN_SUBJECT + "VARCHAR NOT NULL,"
                    + COLUMN_TEXT + "VARCHAR,"
                    + COLUMN_DATE + "DATE,"
                    + COLUMN_SEEN + "BOOLEAN"
                    + ")";

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public Boolean getSeenMsg() {
        return SeenMsg;
    }

    public void setSeenMsg(Boolean seenMsg) {
        SeenMsg = seenMsg;
    }
}
