package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.apps.googletv.app.services.workmanager.WorkerWrapper;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class isy {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public isy(heh hehVar, heh hehVar2, hei heiVar, hei heiVar2) {
        this.b = hehVar;
        this.c = hehVar2;
        this.a = heiVar;
        this.d = heiVar2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, xjk] */
    public static /* synthetic */ void p(isy isyVar) {
        vtl vtlVar = vtl.a;
        vtlVar.getClass();
        ?? r1 = isyVar.d;
        if (!r1.a()) {
            isyVar.m();
            return;
        }
        vtl vtlVar2 = ((isi) isyVar.a).i.n;
        if (vtlVar2 == null) {
            vtlVar2 = vtlVar;
        }
        vtlVar2.getClass();
        gpv gpvVar = new gpv(WorkerWrapper.class, !yks.e(vtlVar, vtlVar) ? vtlVar.b : !yks.e(vtlVar2, vtlVar) ? vtlVar2.b : ((Long) xjl.b.et(((xjl) r1).c)).longValue() / 1000, TimeUnit.SECONDS);
        gpvVar.b("google_tv_widget_tag");
        gpvVar.c((gou) isyVar.b);
        yfw[] yfwVarArr = {new yfw("google_tv_worker_name_key", "google_tv_widget_worker_key"), new yfw("FORCE_REFRESH", true), new yfw("google_tv_second_run_key", false)};
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < 3; i++) {
            yfw yfwVar = yfwVarArr[i];
            gli.z((String) yfwVar.a, yfwVar.b, linkedHashMap);
        }
        gpvVar.e(gli.y(linkedHashMap));
        ((gpz) isyVar.c).f("google_tv_widget_tag", 4, gpvVar.f());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, yfo] */
    public final ixw a(wly wlyVar) {
        jzs jzsVar = (jzs) this.c.b();
        jzsVar.getClass();
        irc ircVar = (irc) this.a.b();
        ircVar.getClass();
        kw kwVar = (kw) this.d.b();
        kwVar.getClass();
        isf isfVar = (isf) this.b.b();
        isfVar.getClass();
        wlyVar.getClass();
        return new ixw(jzsVar, ircVar, kwVar, isfVar, wlyVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, yft] */
    public final iog b(wvg wvgVar) {
        wll wllVar = wvgVar.c;
        if (wllVar == null) {
            wllVar = wll.a;
        }
        wllVar.getClass();
        return new iog(wllVar, (String) this.b.a());
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.List] */
    public final int c() {
        int iAs = a.as(((wnv) this.a).b);
        int i = 0;
        if (iAs != 0 && iAs == 3) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                if (yks.e(((wnu) it.next()).c, ((mdw) this.c).j().d)) {
                    break;
                }
                i++;
            }
            i = -1;
        } else {
            Iterator it2 = this.d.iterator();
            while (it2.hasNext()) {
                if (yks.e(((wnu) it2.next()).c, ((mdw) this.c).k().d)) {
                    break;
                }
                i++;
            }
            i = -1;
        }
        return i == -1 ? this.d.size() - 1 : i;
    }

    public final jaz d() {
        int iAs = a.as(((wnv) this.a).b);
        if (iAs == 0) {
            iAs = 1;
        }
        int i = iAs - 2;
        return i != 1 ? i != 2 ? jaz.c : jaz.b : jaz.a;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Iterable, java.lang.Object] */
    public final wnu e() {
        int iAs = a.as(((wnv) this.a).b);
        Object obj = null;
        if (iAs != 0 && iAs == 3) {
            Iterator it = this.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (yks.e(((wnu) next).c, ((mdw) this.c).j().d)) {
                    obj = next;
                    break;
                }
            }
            wnu wnuVar = (wnu) obj;
            if (wnuVar != null) {
                return wnuVar;
            }
            wnu wnuVar2 = wnu.a;
            wnuVar2.getClass();
            return wnuVar2;
        }
        Iterator it2 = this.d.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (yks.e(((wnu) next2).c, ((mdw) this.c).k().d)) {
                obj = next2;
                break;
            }
        }
        wnu wnuVar3 = (wnu) obj;
        if (wnuVar3 != null) {
            return wnuVar3;
        }
        wnu wnuVar4 = wnu.a;
        wnuVar4.getClass();
        return wnuVar4;
    }

    public final SQLiteDatabase f() {
        SQLiteDatabase sQLiteDatabaseA = ((lyz) this.b).a();
        ((ReentrantLock) this.d).lock();
        return sQLiteDatabaseA;
    }

    public final void g(SQLiteDatabase sQLiteDatabase, boolean z) {
        h(sQLiteDatabase, z, false);
    }

    public final void h(SQLiteDatabase sQLiteDatabase, boolean z, boolean z2) {
        ((lyz) this.b).f(sQLiteDatabase, z, -1);
        if (z && z2) {
            i();
        }
        ((ReentrantLock) this.d).unlock();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    public final void i() {
        ((ReentrantLock) this.d).lock();
        try {
            ?? r0 = this.c;
            r0.clear();
            ?? r1 = this.a;
            r1.clear();
            SQLiteDatabase sQLiteDatabaseB = ((lyz) this.b).b();
            if (sQLiteDatabaseB != null) {
                Cursor cursorQuery = sQLiteDatabaseB.query("purchased_assets", lzm.a, "(pinned IS NOT NULL AND pinned > 0)", null, null, null, null);
                while (cursorQuery.moveToNext()) {
                    try {
                        String string = cursorQuery.getString(0);
                        kuh kuhVar = new kuh(ksn.b(string), cursorQuery.getString(1));
                        Integer numValueOf = Integer.valueOf(cursorQuery.getInt(2));
                        r0.put(kuhVar, numValueOf);
                        String str = kuhVar.b;
                        Set hashSet = (Set) r1.get(str);
                        if (hashSet == null) {
                            hashSet = new HashSet();
                            r1.put(str, hashSet);
                        }
                        hashSet.add(numValueOf);
                    } finally {
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        } finally {
            ((ReentrantLock) this.d).unlock();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    public final boolean j(kuh kuhVar) {
        a.ab(((ReentrantLock) this.d).isHeldByCurrentThread());
        return this.c.containsKey(kuhVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    public final boolean k(String str, int i) {
        a.ab(((ReentrantLock) this.d).isHeldByCurrentThread());
        Set set = (Set) this.a.get(str);
        return set != null && set.contains(Integer.valueOf(i));
    }

    public final void l(SQLiteDatabase sQLiteDatabase, ksn ksnVar, String str) {
        ((lyz) this.b).g(sQLiteDatabase, true, ksnVar, str);
        i();
        ((ReentrantLock) this.d).unlock();
    }

    public final void m() {
        ((gpz) this.c).c("google_tv_widget_tag");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xjk] */
    public final void n(boolean z, boolean z2) {
        if (!this.d.a()) {
            m();
            return;
        }
        gpo gpoVar = new gpo(WorkerWrapper.class);
        gpoVar.b("google_tv_widget_tag");
        gpoVar.c((gou) this.b);
        yfw[] yfwVarArr = {new yfw("google_tv_worker_name_key", "google_tv_widget_worker_key"), new yfw("FORCE_REFRESH", Boolean.valueOf(z)), new yfw("google_tv_second_run_key", Boolean.valueOf(z2))};
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < 3; i++) {
            yfw yfwVar = yfwVarArr[i];
            gli.z((String) yfwVar.a, yfwVar.b, linkedHashMap);
        }
        gpoVar.e(gli.y(linkedHashMap));
        ((gpz) this.c).g("google_tv_widget_tag", 1, gpoVar.f());
    }

    public final /* synthetic */ void q(Runnable runnable) {
        ((gvq) this.c).execute(runnable);
    }

    public final void r(long j, edi ediVar) {
        if (ediVar.a() < 9) {
            return;
        }
        int iE = ediVar.e();
        int iE2 = ediVar.e();
        int iJ = ediVar.j();
        if (iE == 434 && iE2 == 1195456820 && iJ == 3) {
            ((eeh) this.b).a(j, ediVar);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    public final void s(fdr fdrVar, fmr fmrVar) {
        int i = 0;
        while (true) {
            fel[] felVarArr = (fel[]) this.d;
            if (i >= felVarArr.length) {
                return;
            }
            fmrVar.c();
            fel felVarDq = fdrVar.dq(fmrVar.a(), 3);
            dze dzeVar = (dze) this.a.get(i);
            String str = dzeVar.Y;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            eci.a(z, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            dzd dzdVar = new dzd();
            dzdVar.a = fmrVar.b();
            dzdVar.a((String) this.c);
            dzdVar.d(str);
            dzdVar.e = dzeVar.O;
            dzdVar.d = dzeVar.N;
            dzdVar.J = dzeVar.av;
            dzdVar.p = dzeVar.ab;
            felVarDq.b(new dze(dzdVar));
            felVarArr[i] = felVarDq;
            i++;
        }
    }

    public isy(ljd ljdVar, Collection collection, Collection collection2, List list) {
        this.a = ljdVar;
        this.d = collection;
        this.b = collection2;
        this.c = list;
    }

    public isy(lnl lnlVar, lnp lnpVar, lkt lktVar, lny lnyVar) {
        this.b = lnlVar;
        this.c = lnpVar;
        this.d = lnyVar;
        this.a = lktVar;
    }

    public isy(List list) {
        this.a = list;
        this.c = "video/mp2t";
        this.d = new fel[list.size()];
        eeh eehVar = new eeh(new fml(this, 2));
        this.b = eehVar;
        eehVar.c(3);
    }

    public isy(kdj kdjVar, kw kwVar, ldv ldvVar) {
        this.a = kdjVar;
        this.b = ldvVar;
        this.d = kwVar.B(new gew(this, 20, (char[]) null, (byte[]) null), itc.j).i();
        vtw vtwVarM = ink.a.m();
        vtwVarM.getClass();
        vtw vtwVarM2 = wxc.a.m();
        vtwVarM2.getClass();
        vtw vtwVarM3 = wxb.a.m();
        vtwVarM3.getClass();
        wxe.c(wxe.a(vtwVarM3), vtwVarM2);
        wxc wxcVarB = wxe.b(vtwVarM2);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ink inkVar = (ink) vtwVarM.b;
        inkVar.d = wxcVarB;
        inkVar.c = 17;
        this.c = ipc.p(vtwVarM);
    }

    public isy(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, byte[] bArr, char[] cArr) {
        yfoVar.getClass();
        this.d = yfoVar;
        yfoVar2.getClass();
        this.b = yfoVar2;
        yfoVar3.getClass();
        this.c = yfoVar3;
        yfoVar4.getClass();
        this.a = yfoVar4;
    }

    public isy(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, char[] cArr) {
        yfoVar.getClass();
        this.a = yfoVar;
        yfoVar2.getClass();
        this.d = yfoVar2;
        this.c = yfoVar3;
        yfoVar4.getClass();
        this.b = yfoVar4;
    }

    public isy(gen genVar, int[] iArr, String[] strArr) {
        iArr.getClass();
        strArr.getClass();
        this.b = genVar;
        this.a = iArr;
        this.d = strArr;
        int length = iArr.length;
        String[] strArr2 = strArr;
        int length2 = strArr2.length;
        if (length == length2) {
            this.c = length2 == 0 ? yhd.a : wcq.aj(strArr2[0]);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public isy(lyz lyzVar, ReentrantLock reentrantLock) {
        this.c = new HashMap();
        this.a = new HashMap();
        this.b = lyzVar;
        this.d = reentrantLock;
    }

    public isy() {
        this.a = new ir();
        this.b = new SparseArray();
        this.d = new jn();
        this.c = new ir();
    }

    public isy(Executor executor) {
        this.b = new Handler(Looper.getMainLooper());
        this.a = new emk(this, 7);
        gvq gvqVar = new gvq(executor);
        this.c = gvqVar;
        this.d = ylh.ai(gvqVar);
    }

    public isy(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4) {
        yfoVar.getClass();
        this.c = yfoVar;
        yfoVar2.getClass();
        this.a = yfoVar2;
        yfoVar3.getClass();
        this.d = yfoVar3;
        yfoVar4.getClass();
        this.b = yfoVar4;
    }

    public isy(qsa qsaVar, iea ieaVar, xib xibVar) {
        qsaVar.getClass();
        this.c = qsaVar;
        this.d = ieaVar;
        this.a = xibVar;
        this.b = yoz.l(ypk.a);
    }

    public isy(mdw mdwVar, Context context, wnv wnvVar) {
        this.c = mdwVar;
        this.b = context;
        this.a = wnvVar;
        vun vunVar = wnvVar.c;
        vunVar.getClass();
        this.d = yfm.aj(vunVar, new fab(11));
    }

    public isy(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, byte[] bArr, byte[] bArr2) {
        yfoVar.getClass();
        this.c = yfoVar;
        yfoVar2.getClass();
        this.b = yfoVar2;
        yfoVar3.getClass();
        this.d = yfoVar3;
        yfoVar4.getClass();
        this.a = yfoVar4;
    }

    public isy(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, byte[] bArr) {
        yfoVar.getClass();
        this.a = yfoVar;
        yfoVar2.getClass();
        this.c = yfoVar2;
        yfoVar3.getClass();
        this.b = yfoVar3;
        yfoVar4.getClass();
        this.d = yfoVar4;
    }

    public isy(isw iswVar, ieh iehVar, yow yowVar) {
        iswVar.getClass();
        this.d = iswVar;
        this.c = iehVar;
        this.a = yowVar;
        this.b = new yga(new jwz(this, 11));
    }

    public isy(gpz gpzVar, xjk xjkVar, isi isiVar) {
        gpzVar.getClass();
        isiVar.getClass();
        this.c = gpzVar;
        this.d = xjkVar;
        this.a = isiVar;
        this.b = new gou(2, 14);
    }

    public isy(gpz gpzVar, lfn lfnVar) {
        gos gosVar = new gos();
        gosVar.c(2);
        this.a = gosVar.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        gli.D("worker_name_key", "RefreshLicenseWorker", linkedHashMap);
        this.b = gli.y(linkedHashMap);
        this.c = gpzVar;
        this.d = lfnVar;
    }
}
