package database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static android.provider.BaseColumns._ID;

/**
 * Created by MEJIA on 31/10/2015.
 */
public class DataBaseSqlLite  extends SQLiteOpenHelper{


    public DataBaseSqlLite(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE posts(id INTEGER PRIMARY KEY AUTOINCREMENT,user TEXT,title TEXT,content TEXT);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("CREATE TABLE posts(id INTEGER PRIMARY KEY AUTOINCREMENT,user TEXT,title TEXT,content TEXT);");
    }
}
