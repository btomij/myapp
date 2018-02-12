package com.joe.myapplication.database;

import android.content.Context;

import com.joe.myapplication.Model.DaoMaster;
import com.joe.myapplication.Model.DaoSession;
import com.joe.myapplication.Model.userDao;

import org.greenrobot.greendao.database.Database;

import static android.content.ContentValues.TAG;

/**
 * Created by Joe on 2018/2/12.
 */

//greenDAO step 6 建立一個DBService or DBHelper(建議使用，DB操作要singleton才安全)
public class DBService {
    private static final String DB_NAME = "database.sqlite";
    private static final String DB_Pass = "1";
    /** A flag to show how easily you can switch from standard SQLite to the encrypted SQLCipher. */
    public static final boolean ENCRYPTED = true;

    private DaoSession daoSession;

    public void init(Context context) {
        try {

            DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(context, DB_NAME);
            Database db = ENCRYPTED ? helper.getEncryptedWritableDb(DB_Pass) : helper.getWritableDb();
            DaoMaster daoMaster = new DaoMaster(db);
            daoSession = daoMaster.newSession();
        }catch (Exception ex){

        }
    }

    public userDao getNoteDao(){
        return daoSession.getUserDao();
    }
}
