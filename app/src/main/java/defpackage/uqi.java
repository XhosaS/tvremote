package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uqi implements SQLiteDatabase.CursorFactory {
    private final Object[] a;

    public uqi(Object[] objArr) {
        this.a = objArr;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        Object[] objArr = this.a;
        if (objArr != null) {
            int i = 0;
            while (i < objArr.length) {
                int i2 = i + 1;
                Object obj = objArr[i];
                if (obj == null) {
                    sQLiteQuery.bindNull(i2);
                } else if (obj instanceof String) {
                    sQLiteQuery.bindString(i2, (String) obj);
                } else if (obj instanceof byte[]) {
                    sQLiteQuery.bindBlob(i2, (byte[]) obj);
                } else if (obj instanceof Long) {
                    sQLiteQuery.bindLong(i2, ((Long) obj).longValue());
                } else {
                    if (!(obj instanceof Double)) {
                        throw new AssertionError("Attempted to bind an unsupported type");
                    }
                    sQLiteQuery.bindDouble(i2, ((Double) obj).doubleValue());
                }
                i = i2;
            }
        }
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
