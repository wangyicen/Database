package com.feicui.edu.sqliteproject.database;

import android.provider.BaseColumns;

/**
 * Created by ASUS on 2016/9/13.
 */
public final class PersonContract {
    public static abstract class FeedEntry implements BaseColumns{
        public static final String TABLE_NAME = "entry";
        public static final String COLUMN_NAME_ENTRY_ID = "entryid";
        public static final String COLUMN_NAME_TITLE = "title";
        public static final String COLUMN_NAME_SUBTITLE = "subtitle";
    }
}
