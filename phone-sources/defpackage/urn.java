package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class urn implements SQLiteDatabase.CursorFactory {
    private final Object[] a;
    private final /* synthetic */ int b;

    public urn(Object[] objArr, int i) {
        this.b = i;
        this.a = objArr;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        int i = 0;
        if (this.b != 0) {
            Object[] objArr = this.a;
            if (objArr != null) {
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
        while (true) {
            Object[] objArr2 = this.a;
            if (i >= objArr2.length) {
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
            int i3 = i + 1;
            Object obj2 = objArr2[i];
            if (obj2 == null) {
                sQLiteQuery.bindNull(i3);
            } else if (obj2 instanceof String) {
                sQLiteQuery.bindString(i3, (String) obj2);
            } else if (obj2 instanceof byte[]) {
                sQLiteQuery.bindBlob(i3, (byte[]) obj2);
            } else if (obj2 instanceof Long) {
                sQLiteQuery.bindLong(i3, ((Long) obj2).longValue());
            } else {
                if (!(obj2 instanceof Double)) {
                    throw new AssertionError("Attempted to bind an unsupported type");
                }
                sQLiteQuery.bindDouble(i3, ((Double) obj2).doubleValue());
            }
            i = i3;
        }
    }
}
