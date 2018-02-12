package com.joe.myapplication.factory;

import com.joe.myapplication.database.DBService;

/**
 * Created by Joe on 2018/2/12.
 */

public class ServiceFactory {
    private static class DBServiceHolder {
        private static final DBService INSTANCE = new DBService();
    }
    public static final DBService getDbService() {
        return DBServiceHolder.INSTANCE;
    }
}
