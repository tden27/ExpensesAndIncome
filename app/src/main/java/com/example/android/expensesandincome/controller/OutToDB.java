package com.example.android.expensesandincome.controller;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class OutToDB extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION=1;
    private static final String DATABASE_NAME="ExpensesDB";
    private static final String TABLE_EXPENSES="expenses";
    private static final String TABLE_INCOME="income";
    private static final String EXPENSES_ID="expensesID";
    private static final String EXPENSES_CATEGORY="expensesCategory";
    private static final String EXPENSES_SUM="expensesSum";
    private static final String EXPENSES_DATE="expensesDate";
    private static final String EXPENSES_COMMENTS="expensesComments";

    public OutToDB(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
