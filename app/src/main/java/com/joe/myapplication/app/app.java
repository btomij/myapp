package com.joe.myapplication.app;

import android.app.Application;

import com.joe.myapplication.factory.ServiceFactory;

/**
 * Created by Joe on 2018/2/12.
 */

public class app extends Application {
    /** A flag to show how easily you can switch from standard SQLite to the encrypted SQLCipher. */

    @Override
    public void onCreate() {
        super.onCreate();

        //greenDAO step 8 init DBService
        ServiceFactory.getDbService().init(this);
    }
}
