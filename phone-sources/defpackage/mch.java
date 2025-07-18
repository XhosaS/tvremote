package defpackage;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import java.util.Collections;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mch implements Runnable, icv {
    private final ksn a;
    private final idf b;
    private final lfu c;
    private final SharedPreferences d;
    private final idy e;
    private final lyz f;
    private final lys g;
    private final lfx h;

    public mch(lyz lyzVar, idf idfVar, lys lysVar, lfu lfuVar, lfx lfxVar, SharedPreferences sharedPreferences, ksn ksnVar, idy idyVar) {
        this.a = ksnVar;
        this.f = lyzVar;
        idh idhVarD = idh.d();
        idhVarD.e(idfVar);
        this.b = idhVarD.b(new jxt(new lbj(lxq.b, 16), 7));
        this.g = lysVar;
        this.c = lfuVar;
        this.h = lfxVar;
        this.d = sharedPreferences;
        this.e = idyVar;
    }

    @Override // defpackage.icv
    public final /* synthetic */ void a(Object obj, Object obj2) {
        lai laiVar = (lai) obj;
        ksn ksnVar = (ksn) obj2;
        SharedPreferences.Editor editorEdit = this.d.edit();
        String strValueOf = String.valueOf(String.valueOf(ksnVar));
        editorEdit.putLong(krh.WATCH_NEXT_SYNC_TIMESTAMP_PREFIX.concat(strValueOf), System.currentTimeMillis() / 1000).apply();
        SQLiteDatabase sQLiteDatabaseA = this.f.a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("watch_next_feed_account", ksnVar.a);
            contentValues.putNull("feed");
            vtw vtwVarM = kzw.a.m();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            kzw kzwVar = (kzw) vtwVarM.b;
            laiVar.getClass();
            kzwVar.c = laiVar;
            kzwVar.b = 7;
            contentValues.put("feed_blob", ((kzw) vtwVarM.r()).h());
            sQLiteDatabaseA.insertWithOnConflict("watch_next_feed", null, contentValues, 5);
            this.f.f(sQLiteDatabaseA, true, 13);
        } catch (Throwable th) {
            this.f.f(sQLiteDatabaseA, false, 13);
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = !this.c.cW();
        lys lysVar = this.g;
        ksn ksnVar = this.a;
        String strD = lysVar.d(ksnVar);
        Locale locale = Locale.getDefault();
        lysVar.o();
        lysVar.p();
        ieg iegVar = (ieg) this.b.b(new mag(ieg.f(ksnVar), z, strD, locale, this.h.b(ksnVar).c, Collections.EMPTY_LIST, Collections.EMPTY_LIST, Collections.EMPTY_LIST));
        Object obj = iegVar.c;
        if (obj != null) {
            a(obj, ksnVar);
        }
        mlw mlwVar = new mlw(1);
        Throwable th = iegVar.d;
        if (th != null) {
            mlwVar.a(th, ksnVar);
        }
        this.e.c(iegVar.c(new icy(kvk.b)));
    }
}
