package jvidals1.c4q.nyc.sqlnyc;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by s3a on 7/14/15.
 */
public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String TABLE_NYCDEATHS ="NYC CITY LEADING CAUSES OF DEATH";
    public static final String COLUMN_YEAR ="YEAR";
    public static final String COLUMN_ETHNICITY ="ETHNICITY";
    public static final String COLUMN_SEX ="SEX";
    public static final String COLUMN_CAUSESOFDEATH ="CAUSES OF DEATH";

    private static final String NYCDEATHS_DB ="causesnyc.db";
    private static final int DB_VERSION =1;
    private static final String DB_CREATE = "CREATE TABLE" + TABLE_NYCDEATHS + "( " + COLUMN_ETHNICITY + "INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_SEX + "Real)";



    public DatabaseHelper(Context context){
     super(context, NYCDEATHS_DB, null, DB_VERSION);
 }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DB_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void insertData(){
        SQLiteDatabase db = getWritableDatabase();
        insertRow("Test1", "Test2", "Tes3");
    }

    private void insertRow (String deaths, String ethnicity, String sex){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();

    }

}
