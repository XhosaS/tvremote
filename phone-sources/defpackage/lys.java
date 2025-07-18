package defpackage;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lys extends icu implements ids {
    public final Executor g;
    public final ldv h;
    public final ConcurrentHashMap i;
    public final ieg j;
    public final lyz k;
    public final lfz l;
    private final lfn m;
    private final yfo n;
    private final Executor o;
    private final lie p;

    public lys(ExecutorService executorService, Executor executor, lfn lfnVar, ldv ldvVar, lyz lyzVar, yfo yfoVar, lfz lfzVar, SharedPreferences sharedPreferences, lie lieVar) throws ExecutionException, InterruptedException {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.i = concurrentHashMap;
        executorService.getClass();
        this.g = executorService;
        this.o = executor;
        lfnVar.getClass();
        this.m = lfnVar;
        ldvVar.getClass();
        this.h = ldvVar;
        lyzVar.getClass();
        this.k = lyzVar;
        this.n = yfoVar;
        lfzVar.getClass();
        this.l = lfzVar;
        this.j = ksh.c(sharedPreferences.getString("country_override", ""));
        this.p = lieVar;
        try {
            executorService.submit(new lyt(lyzVar, concurrentHashMap)).get();
        } catch (InterruptedException | ExecutionException e) {
            krd.c("Error loading configuration(ignore): ".concat(e.toString()));
        }
    }

    public final int a(ksn ksnVar) {
        ConcurrentHashMap concurrentHashMap = this.i;
        String str = ksnVar.a;
        if (concurrentHashMap.get(str) != null) {
            return ((lcs) concurrentHashMap.get(str)).j;
        }
        return 0;
    }

    public final ieg b(ksn ksnVar, ltz ltzVar) {
        SQLiteException sQLiteException;
        lcs lcsVar = ltzVar.a;
        boolean zX = ktw.x(lcsVar.c);
        String str = ksnVar.a;
        if (!zX) {
            this.p.z(lcsVar.c);
            ConcurrentHashMap concurrentHashMap = this.i;
            if (concurrentHashMap.get(str) != null && ktw.x(((lcs) concurrentHashMap.get(str)).c)) {
                vtw vtwVarN = lcs.a.n(lcsVar);
                String str2 = ((lcs) concurrentHashMap.get(str)).c;
                if (!vtwVarN.b.A()) {
                    vtwVarN.u();
                }
                lcs lcsVar2 = (lcs) vtwVarN.b;
                str2.getClass();
                lcsVar2.c = str2;
                lcsVar = (lcs) vtwVarN.r();
            } else {
                if (!ktw.x(d(ksnVar))) {
                    return ieg.b;
                }
                vtw vtwVarN2 = lcs.a.n(lcsVar);
                String strD = d(ksnVar);
                if (!vtwVarN2.b.A()) {
                    vtwVarN2.u();
                }
                lcs lcsVar3 = (lcs) vtwVarN2.b;
                strD.getClass();
                lcsVar3.c = strD;
                lcsVar = (lcs) vtwVarN2.r();
            }
        }
        vun vunVar = lcsVar.d;
        this.i.put(str, lcsVar);
        eb();
        SQLiteDatabase sQLiteDatabaseA = this.k.a();
        ContentValues contentValues = new ContentValues();
        try {
            contentValues.put("config_account", str);
            contentValues.put("config_proto", lcsVar.h());
            sQLiteException = null;
            sQLiteDatabaseA.replace("user_configuration", null, contentValues);
            this.k.e(sQLiteDatabaseA, true);
        } catch (SQLiteException e) {
            sQLiteException = e;
            this.k.e(sQLiteDatabaseA, false);
        } catch (Throwable th) {
            this.k.e(sQLiteDatabaseA, true);
            throw th;
        }
        return sQLiteException != null ? ieg.b(sQLiteException) : ieg.f(kvk.a);
    }

    public final String c(ieg iegVar) {
        return iegVar.k() ? this.m.bh() : d((ksn) iegVar.g());
    }

    public final String d(ksn ksnVar) {
        ieg iegVarC = this.j;
        if (!iegVarC.m()) {
            lcs lcsVar = (lcs) this.i.get(ksnVar.a);
            iegVarC = lcsVar != null ? ksh.c(lcsVar.c) : ieg.a;
        }
        return iegVarC.m() ? (String) iegVarC.g() : this.m.bh();
    }

    public final void e(ksn ksnVar) {
        ieg iegVar = (ieg) ((ltq) this.n.b()).b(new lty(ksnVar));
        if (iegVar.m()) {
            b(ksnVar, (ltz) iegVar.g());
        }
    }

    public final void f(ksn ksnVar, idy idyVar) {
        int i = 4;
        byte[] bArr = null;
        mjo.e(new krn(idyVar, new lff(this, ksnVar, i, bArr), i, bArr), new iei((idf) this.n.b(), new lty(ksnVar)), this.o);
    }

    public final boolean g(ieg iegVar) {
        if (iegVar.k()) {
            return false;
        }
        lcs lcsVar = (lcs) this.i.get(((ksn) iegVar.g()).a);
        return lcsVar != null && lcsVar.h;
    }

    public final boolean m(ieg iegVar) {
        if (!g(iegVar)) {
            return false;
        }
        lcq lcqVar = ((lcs) this.i.get(((ksn) iegVar.g()).a)).i;
        if (lcqVar == null) {
            lcqVar = lcq.a;
        }
        return (lcqVar.b.isEmpty() && lcqVar.c.isEmpty()) ? false : true;
    }

    public final boolean n(ieg iegVar, int i) {
        lcs lcsVar;
        int i2;
        if (iegVar.k() || (lcsVar = (lcs) this.i.get(((ksn) iegVar.g()).a)) == null) {
            return false;
        }
        for (laz lazVar : lcsVar.f) {
            if (lazVar.c) {
                lay layVar = lazVar.d;
                if (layVar == null) {
                    layVar = lay.a;
                }
                int i3 = layVar.b;
                if (i3 != 0) {
                    i2 = 3;
                    if (i3 != 1) {
                        i2 = i3 != 3 ? 0 : 5;
                    }
                } else {
                    i2 = 2;
                }
                if (i2 == 0) {
                    i2 = 1;
                }
                if (i2 == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void o() {
        this.l.m();
    }

    public final void p() {
        this.l.n();
    }
}
