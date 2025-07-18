package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mav implements Runnable {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;
    private final Object d;
    private final Object e;
    private final Object f;

    public mav(ldv ldvVar, isy isyVar, hx hxVar, gag gagVar, Executor executor, int i) {
        this.a = i;
        this.c = ldvVar;
        this.b = executor;
        this.f = isyVar;
        this.d = hxVar;
        this.e = gagVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ldv] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, ldv] */
    /* JADX WARN: Type inference failed for: r0v21, types: [idy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, yfo] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int iDelete;
        if (this.a == 0) {
            Account[] accountArrU = this.c.u();
            String[] strArr = new String[accountArrU.length];
            StringBuilder sb = new StringBuilder(" NOT IN (");
            int i = 0;
            while (i < accountArrU.length) {
                strArr[i] = accountArrU[i].name;
                sb.append(i == 0 ? "?" : ",?");
                i++;
            }
            sb.append(")");
            String string = sb.toString();
            SQLiteDatabase sQLiteDatabaseF = ((isy) this.f).f();
            try {
                iDelete = sQLiteDatabaseF.delete("purchased_assets", a.cr(string, "account"), strArr);
            } catch (Throwable th) {
                th = th;
                iDelete = 0;
            }
            try {
                sQLiteDatabaseF.delete("user_data", a.cr(string, krh.USER_ACCOUNT), strArr);
                ((isy) this.f).h(sQLiteDatabaseF, true, iDelete > 0);
                ?? r0 = this.b;
                gag gagVar = (gag) this.e;
                Context contextA = ((rgq) gagVar.b).a();
                lyz lyzVar = (lyz) gagVar.e.b();
                lyzVar.getClass();
                isy isyVar = (isy) gagVar.c.b();
                isyVar.getClass();
                lgr lgrVar = (lgr) gagVar.a.b();
                lgrVar.getClass();
                r0.execute(new mbq(contextA, lyzVar, isyVar, lgrVar, ((lzr) gagVar.d).b(), "asset_type IN (6,20) AND (pinned IS NOT NULL AND pinned > 0) AND (hidden IN (1, 3) OR purchase_status != 2)", (String[]) null, 0));
                r0.execute(this.d);
                return;
            } catch (Throwable th2) {
                th = th2;
                ((isy) this.f).h(sQLiteDatabaseF, false, iDelete > 0);
                throw th;
            }
        }
        String str = (String) this.e;
        String strBuildQueryString = SQLiteQueryBuilder.buildQueryString(false, (String) this.b, new String[]{str}, null, str, null, null, null);
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = ((lyz) this.d).b().rawQuery(strBuildQueryString, null);
        while (cursorRawQuery.moveToNext()) {
            try {
                arrayList.add(cursorRawQuery.getString(0));
            } finally {
            }
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        for (Account account : this.f.u()) {
            arrayList.remove(account.name);
        }
        if (!arrayList.isEmpty()) {
            SQLiteDatabase sQLiteDatabaseA = ((lyz) this.d).a();
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    sQLiteDatabaseA.delete((String) this.b, ((String) this.e) + " = ?", new String[]{(String) it.next()});
                }
                ((lyz) this.d).e(sQLiteDatabaseA, true);
            } catch (Throwable th3) {
                ((lyz) this.d).e(sQLiteDatabaseA, false);
                throw th3;
            }
        }
        this.c.c(kvk.b);
    }

    public mav(ldv ldvVar, lyz lyzVar, idy idyVar, String str, String str2, int i) {
        this.a = i;
        this.f = ldvVar;
        this.d = lyzVar;
        this.c = idyVar;
        this.b = str;
        this.e = str2;
    }
}
