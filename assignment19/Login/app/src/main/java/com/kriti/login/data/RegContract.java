package com.kriti.login.data;

import android.provider.BaseColumns;

/**
 * Created by kriti on 29/6/18.
 */

final class RegContract {
    private RegContract(){ }
    public final static class RegEntry implements BaseColumns{
        public final static String TABLE_NAME ="reg_detail";
        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_USERNAME ="username";
        public final static String COLUMN_EMAIL = "email";
        public final static String COLUMN_PASSWORD = "password";
        public final static String COLUMN_PHONE = "phone";
    }
}
