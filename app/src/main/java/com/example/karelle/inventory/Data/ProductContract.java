package com.example.karelle.inventory.Data;

import android.provider.BaseColumns;

public class ProductContract implements BaseColumns {
    public static final class ProductEntry implements BaseColumns{
        public final static String TABLE_NAME = "inventory.db";
        public final static String COLUMN_PRODUCT_ID = BaseColumns._ID;
        public final static String COLUMN_PRODUCT_NAME  = "NAME";
        public final static String COLUMN_PRODUCT_PRICE = "price";
        public final static Integer COLUMN_PRODUCT_QUANTITY = 1;
        public final static String COLUMN_PRODUCT_SUPPLIER = "Supplier";
        public final static int COLUMN_PRODUCT_SUPPLIER_PHONE_NUMBER = 1234567890;
    }
}
