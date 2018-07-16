package model;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "Kadous";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(Person.TABLE_NAME);
        db.execSQL(Login.TABLE_NAME);
        db.execSQL(Message.TABLE_NAME);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + Person.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + Login.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + Message.TABLE_NAME);
        onCreate(db);

    }

    public Boolean Authenticate(Login user) {

        Boolean valid=false;
        Login User = new Login();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(Login.CREATE_TABLE,// Selecting Table
                new String[]{User.getId().toString(), User.getUserName(), User.getPassword()},//Selecting columns want to query
                User.getId() + "=?",
                new String[]{User.getUserName()},//Where clause
                null, null, null);

        if (cursor != null && cursor.moveToFirst() && cursor.getCount() > 0) {
            //if cursor has value then in user database there is user associated with this given email

            Login user2 = new Login(cursor.getInt(0), cursor.getString(1), cursor.getString(3));
            //Match both passwords check they are same or not
            if (user.getPassword().equalsIgnoreCase(user2.getPassword())) {
                valid = true;

            }

        }
        return valid;
    }
}

