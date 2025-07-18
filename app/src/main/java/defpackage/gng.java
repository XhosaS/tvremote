package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteQueryBuilder;
import j$.time.Instant;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gng {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/logging/userbehavior/BrowseHistoryProvider");
    private static final HashMap c;
    public final gmx b;

    static {
        HashMap map = new HashMap();
        c = map;
        map.put("_id", "_id");
        map.put("timestamp", "timestamp");
        map.put("package_name", "package_name");
        map.put("item_type", "item_type");
    }

    public gng(Context context) {
        this.b = new gmx(context);
    }

    public final Cursor a(String[] strArr, String str, String[] strArr2, String str2) {
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables("browse_history");
        sQLiteQueryBuilder.setProjectionMap(c);
        return sQLiteQueryBuilder.query(this.b.getReadableDatabase(), strArr, str, strArr2, null, null, "timestamp DESC", str2);
    }

    final Queue b(int i) {
        ArrayDeque arrayDeque = new ArrayDeque();
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        Cursor cursorA = a(new String[]{"package_name", "timestamp"}, "item_type=?", new String[]{sb.toString()}, "40");
        try {
            if (cursorA.moveToFirst()) {
                do {
                    arrayDeque.addFirst(new gnh(cursorA.getString(0), Instant.ofEpochMilli(cursorA.getLong(1))));
                } while (cursorA.moveToNext());
            }
            if (cursorA != null) {
                cursorA.close();
            }
            return arrayDeque;
        } catch (Throwable th) {
            if (cursorA != null) {
                try {
                    cursorA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
