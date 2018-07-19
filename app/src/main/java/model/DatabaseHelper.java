package model;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

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

        db.execSQL(Person.CREATE_TABLE);
        db.execSQL(Login.CREATE_TABLE);
        db.execSQL(Message.CREATE_TABLE);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + Person.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + Login.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + Message.TABLE_NAME);
        onCreate(db);

    }

    public Boolean Authenticate(String username) {
     SQLiteDatabase db = this.getReadableDatabase();
     Cursor cursor = db.query(Login.TABLE_NAME, new String[] {Login.COLUMN_ID,Login.COLUMN_USERNAME, Login.COLUMN_PASSWORD} ,
             Login.COLUMN_USERNAME + "=?", new String[]{username},
             null,null , null );
        int cursorCount = cursor.getCount();
        cursor.close();
        db.close();

        if (cursorCount > 0) {


            Log.d("roshan67","khodeshe");
            return true;
        }

        return false;
     }



//----------***********------------------------

//----------***********------------------------
    }

