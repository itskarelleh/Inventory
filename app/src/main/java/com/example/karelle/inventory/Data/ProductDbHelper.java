package com.example.karelle.inventory.Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.karelle.inventory.Data.ProductContract.ProductEntry
public class ProductDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "products.db";
    private static final int DATABASE_VERSION = 1;

    public ProductDbHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_PETS_TABLE = "CREATE TABLE " + ProductContract.ProductEntry.TABLE_NAME + " ("
                + ProductContract.ProductEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + ProductContract.ProductEntry.COLUMN_PRODUCT_NAME + " TEXT NOT NULL, "
                + ProductContract.ProductEntry.COLUMN_PRODUCT_PRICE + " TEXT NOT NULL, "
                + ProductContract.ProductEntry.COLUMN_PRODUCT_QUANTITY + " INTEGER NOT NULL, "
                + ProductContract.ProductEntry.COLUMN_PRODUCT_SUPPLIER + " TEXT NOT NULL, "
                + ProductContract.ProductEntry.COLUMN_PRODUCT_SUPPLIER_PHONE_NUMBER + " INTEGER NOT NULL DEFAULT 0);";

        db.execSQL(SQL_CREATE_PETS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
