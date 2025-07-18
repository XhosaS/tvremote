package defpackage;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jde extends SQLiteOpenHelper {
    public jde(Context context) {
        super(context, "katniss_hotwordstate.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.getClass();
        sQLiteDatabase.execSQL("\n      CREATE TABLE IF NOT EXISTS sharedvalue (\n        _id INTEGER PRIMARY KEY AUTOINCREMENT,\n        key TEXT UNIQUE ON CONFLICT REPLACE,\n        value INTEGER DEFAULT 0);\n    ");
        sQLiteDatabase.execSQL("\n      INSERT INTO sharedvalue (key, value)\n        VALUES ('is_listening_for_hotword', 0),\n        ('is_hotword_switch_visible', 0),\n        ('is_hotword_switch_disabled', 1),\n        ('hotword_switch_title', 'com.google.android.katniss:string/hotword_switch_title'),\n        ('hotword_switch_description', 'com.google.android.katniss:string/hotword_switch_description');\n    ");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        sQLiteDatabase.getClass();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS sharedvalue");
        onCreate(sQLiteDatabase);
    }
}
