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


    public boolean Authenticate(String name, String password){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor mCursor = db.rawQuery("SELECT * FROM " + Login.CREATE_TABLE + " WHERE NAME='?' AND PASSWORD='?';",
                new String[]{name,password});
        if (mCursor != null) {
            if(mCursor.getCount() > 0)
            {
                mCursor.close();
                return true;
            }
        }
        return false;
    }



//----------***********------------------------

//----------***********------------------------
    }

