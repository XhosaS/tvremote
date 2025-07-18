package defpackage;

import android.accounts.Account;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteQueryBuilder;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lyp implements Runnable {
    private final idy a;
    private final ldv b;
    private final Map c;
    private final lyz d;

    public lyp(idy idyVar, Map map, ldv ldvVar, lyz lyzVar) {
        this.a = idyVar;
        this.b = ldvVar;
        this.d = lyzVar;
        this.c = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SQLiteException sQLiteException;
        lyz lyzVar;
        SQLiteDatabase sQLiteDatabaseA = this.d.a();
        boolean z = false;
        try {
            String strBuildQueryString = SQLiteQueryBuilder.buildQueryString(false, "user_configuration", new String[]{"config_account"}, null, "config_account", null, null, null);
            ArrayList<String> arrayList = new ArrayList();
            sQLiteException = null;
            Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery(strBuildQueryString, null);
            while (cursorRawQuery.moveToNext()) {
                try {
                    arrayList.add(cursorRawQuery.getString(0));
                } finally {
                }
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            for (Account account : this.b.u()) {
                arrayList.remove(account.name);
            }
            for (String str : arrayList) {
                this.c.remove(str);
                sQLiteDatabaseA.delete("user_configuration", "config_account = ?", new String[]{str});
            }
            lyzVar = this.d;
            z = true;
        } catch (SQLiteException e) {
            sQLiteException = e;
            lyzVar = this.d;
        } catch (Throwable th) {
            this.d.e(sQLiteDatabaseA, false);
            throw th;
        }
        lyzVar.e(sQLiteDatabaseA, z);
        if (z) {
            this.a.c(kvk.b);
        } else {
            this.a.c(ieg.b(sQLiteException));
        }
    }
}
