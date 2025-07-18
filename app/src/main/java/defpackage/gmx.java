package defpackage;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: PG */
/* loaded from: classes.dex */
class gmx extends SQLiteOpenHelper {
    public gmx(Context context) {
        super(context, "behaviorcollector.db", (SQLiteDatabase.CursorFactory) null, 4);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE browse_history (_id INTEGER PRIMARY KEY,timestamp INTEGER,package_name STRING,item_type INTEGER);");
        sQLiteDatabase.execSQL("CREATE TRIGGER table_size_trigger_browse_history AFTER INSERT ON browse_history BEGIN DELETE FROM browse_history WHERE _id NOT IN (SELECT _id FROM browse_history ORDER BY timestamp DESC LIMIT 300); END;");
        sQLiteDatabase.execSQL("CREATE TABLE on_device_impressions (_id INTEGER PRIMARY KEY,search_term STRING,timestamp INTEGER,package_name STRING,number_of_results INTEGER);");
        sQLiteDatabase.execSQL("CREATE TRIGGER table_size_trigger_on_device_impressions AFTER INSERT ON on_device_impressions BEGIN DELETE FROM on_device_impressions WHERE _id NOT IN (SELECT _id FROM on_device_impressions ORDER BY timestamp DESC LIMIT 500); END;");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS katniss_event_history");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS browse_history");
        sQLiteDatabase.execSQL("CREATE TABLE browse_history (_id INTEGER PRIMARY KEY,timestamp INTEGER,package_name STRING,item_type INTEGER);");
        sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS table_size_trigger_browse_history");
        sQLiteDatabase.execSQL("CREATE TRIGGER table_size_trigger_browse_history AFTER INSERT ON browse_history BEGIN DELETE FROM browse_history WHERE _id NOT IN (SELECT _id FROM browse_history ORDER BY timestamp DESC LIMIT 300); END;");
        if (i >= 4 || i2 < 4) {
            return;
        }
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS on_device_impressions");
        sQLiteDatabase.execSQL("CREATE TABLE on_device_impressions (_id INTEGER PRIMARY KEY,search_term STRING,timestamp INTEGER,package_name STRING,number_of_results INTEGER);");
        sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS table_size_trigger_on_device_impressions");
        sQLiteDatabase.execSQL("CREATE TRIGGER table_size_trigger_on_device_impressions AFTER INSERT ON on_device_impressions BEGIN DELETE FROM on_device_impressions WHERE _id NOT IN (SELECT _id FROM on_device_impressions ORDER BY timestamp DESC LIMIT 500); END;");
    }
}
