package amigoinn.example.v4sales;

import android.app.Application;
import android.content.Context;

import amigoinn.activerecordbase.ActiveRecordBase;
import amigoinn.activerecordbase.ActiveRecordException;
import amigoinn.activerecordbase.Database;
import amigoinn.activerecordbase.DatabaseBuilder;
import amigoinn.common.CommonUtils;
import amigoinn.common.Const;

/**
 * Created by Virag kuvadia on 24-04-2016.
 */
public class AccountApplication extends Application {
    private static AccountApplication _intance = null;
    private static ActiveRecordBase mDatabase;

    @Override
    public void onCreate() {
        super.onCreate();
        DatabaseBuilder builder = new DatabaseBuilder(Const.DATABASE_NAME);
        Database.setBuilder(builder);
        try {
            mDatabase = ActiveRecordBase.open(this, Const.DATABASE_NAME,
                    Const.DATABASE_VERSION);


        } catch (ActiveRecordException e) {
            e.printStackTrace();
        } catch (Exception e) {
        }
    }

    public AccountApplication() {
        _intance = this;
    }

    public static ActiveRecordBase Connection() {
        return mDatabase;
    }

    public static Context getContext() {
        return _intance;
    }

}
