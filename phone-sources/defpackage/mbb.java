package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mbb implements Runnable {
    private final Executor a;
    private final String b;
    private final String c;
    private final String d;
    private final boolean e;
    private final lyz f;
    private final gag g;

    public mbb(lyz lyzVar, ExecutorService executorService, gag gagVar, ieg iegVar, String str, String str2, boolean z) {
        this.f = lyzVar;
        this.a = executorService;
        this.g = gagVar;
        this.b = ksn.c(iegVar);
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, yfo] */
    @Override // java.lang.Runnable
    public final void run() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("hidden", Integer.valueOf(true != this.e ? 2 : 3));
        SQLiteDatabase sQLiteDatabaseA = this.f.a();
        try {
            boolean z = sQLiteDatabaseA.update("purchased_assets", contentValues, this.d, new String[]{this.b, this.c}) > 0;
            this.f.f(sQLiteDatabaseA, z, 0);
            if (z && this.e) {
                Executor executor = this.a;
                gag gagVar = this.g;
                String str = this.b;
                Context contextA = ((rgq) gagVar.b).a();
                lyz lyzVar = (lyz) gagVar.e.b();
                lyzVar.getClass();
                isy isyVar = (isy) gagVar.c.b();
                isyVar.getClass();
                lgr lgrVar = (lgr) gagVar.a.b();
                lgrVar.getClass();
                executor.execute(new mbq(contextA, lyzVar, isyVar, lgrVar, ((lzr) gagVar.d).b(), "account = ? AND (asset_type IN (6,20) AND (pinned IS NOT NULL AND pinned > 0) AND (hidden IN (1, 3) OR purchase_status != 2))", new String[]{str}, 0));
            }
        } catch (Throwable th) {
            this.f.f(sQLiteDatabaseA, false, 0);
            throw th;
        }
    }
}
