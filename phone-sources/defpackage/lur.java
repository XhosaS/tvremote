package defpackage;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lur implements Runnable {
    final /* synthetic */ lus a;
    private final ksn b;
    private final String c;

    public lur(lus lusVar, ksn ksnVar, String str) {
        this.a = lusVar;
        this.b = ksnVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lus lusVar = this.a;
        SharedPreferences sharedPreferences = lusVar.b;
        long j = lusVar.d;
        SQLiteDatabase sQLiteDatabaseA = lusVar.e.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (sharedPreferences.getLong(krh.LAST_CLEANUP_SEARCH_HISTORY_TIMESTAMP, 0L) + (j * 1000) <= jCurrentTimeMillis) {
            sharedPreferences.edit().putLong(krh.LAST_CLEANUP_SEARCH_HISTORY_TIMESTAMP, jCurrentTimeMillis).apply();
            try {
                long j2 = lusVar.c;
                Long.signum(j2);
                sQLiteDatabaseA.delete("search_history", "timestamp < ?", new String[]{String.valueOf(jCurrentTimeMillis - (j2 * 1000))});
            } catch (SQLiteException unused) {
            }
        }
        try {
            ContentValues contentValues = new ContentValues(3);
            contentValues.put("account", this.b.a);
            contentValues.put("query", this.c);
            contentValues.put("timestamp", Long.valueOf(System.currentTimeMillis()));
            mei.k(sQLiteDatabaseA, "search_history", contentValues, lus.a);
            this.a.e.e(sQLiteDatabaseA, true);
        } catch (Throwable th) {
            this.a.e.e(sQLiteDatabaseA, false);
            throw th;
        }
    }
}
