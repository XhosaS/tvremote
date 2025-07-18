package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class icw {
    public static final icw a = new icw();

    private icw() {
    }

    public final synchronized int a(Context context) {
        Throwable th;
        SQLiteDatabase sQLiteDatabaseOpenDatabase;
        Cursor cursorQuery;
        String path = context.getDatabasePath("voiceinteraction.db").getPath();
        path.getClass();
        SQLiteDatabase sQLiteDatabase = null;
        int i = 2;
        try {
            sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(path, null, 1);
        } catch (SQLiteException unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        if (sQLiteDatabaseOpenDatabase == null) {
            return 2;
        }
        try {
            cursorQuery = sQLiteDatabaseOpenDatabase.query("sharedvalue", null, "key = ?", new String[]{"is_hotword_enabled"}, null, null, null);
            cursorQuery.getClass();
        } catch (SQLiteException unused2) {
            sQLiteDatabase = sQLiteDatabaseOpenDatabase;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
                return 2;
            }
            return i;
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase = sQLiteDatabaseOpenDatabase;
            if (sQLiteDatabase == null) {
                throw th;
            }
            sQLiteDatabase.close();
            throw th;
        }
        if (cursorQuery.getCount() == 0) {
            sQLiteDatabaseOpenDatabase.close();
            return 2;
        }
        cursorQuery.moveToFirst();
        int i2 = cursorQuery.getInt(cursorQuery.getColumnIndex("value")) != 1 ? 0 : 1;
        sQLiteDatabaseOpenDatabase.close();
        i = i2;
        return i;
    }
}
