package model;

import android.content.Context;
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
}
