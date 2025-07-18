package defpackage;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class urp extends SQLiteOpenHelper {
    public urp(Context context, File file) {
        super(context, file.getAbsolutePath(), (SQLiteDatabase.CursorFactory) null, 2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE cache_table(request_data BLOB NOT NULL, account_name TEXT NOT NULL, cache_name TEXT NOT NULL, response_data BLOB NOT NULL, write_ms INTEGER NOT NULL, access_ms INTEGER NOT NULL, expiration_time INTEGER, key_metadata BLOB NOT NULL, value_metadata BLOB NOT NULL, PRIMARY KEY (request_data, account_name, cache_name))");
        String[] strArr = urq.a;
        int length = strArr.length;
        for (int i = 0; i <= 0; i++) {
            sQLiteDatabase.execSQL(strArr[i]);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        for (int i3 = i - 1; i3 < i2 - 1; i3++) {
            sQLiteDatabase.execSQL(urq.a[i3]);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
    }
}
