package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class gex {
    public yow a;
    public yil b;
    public Executor c;
    public Executor d;
    public geo e;
    public boolean f;
    public ged j;
    public final cvi k = new cvi(new agx(this, 6, (float[]) null));
    public final ThreadLocal g = new ThreadLocal();
    public final Map h = new LinkedHashMap();
    public boolean i = true;

    private final Object y(yjk yjkVar) {
        if (!s()) {
            return gez.j(this, false, true, new fyq(yjkVar, 10));
        }
        o();
        try {
            Object objA = yjkVar.a();
            r();
            return objA;
        } finally {
            p();
        }
    }

    protected abstract geo a();

    public final geo b() {
        geo geoVar = this.e;
        if (geoVar != null) {
            return geoVar;
        }
        yks.c("internalTracker");
        return null;
    }

    protected gfb c() {
        throw new yfv((byte[]) null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yjk] */
    public final void close() {
        cvi cviVar = this.k;
        synchronized (cviVar) {
            if (((AtomicBoolean) cviVar.c).compareAndSet(false, true)) {
                while (((AtomicInteger) cviVar.b).get() != 0) {
                }
                cviVar.a.a();
            }
        }
    }

    public final gho d() {
        ged gedVar = this.j;
        if (gedVar == null) {
            yks.c("connectionManager");
            gedVar = null;
        }
        gho ghoVar = gedVar.d;
        if (ghoVar != null) {
            return ghoVar;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    public final Object e(Callable callable) {
        return y(new gem(callable, 3));
    }

    public List f(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(yfm.e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(wef.o((ymh) entry.getKey()), entry.getValue());
        }
        return w();
    }

    protected Map g() {
        Set<Map.Entry> setEntrySet = h().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ykn.j(yfm.e(yfm.z(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            Class cls = (Class) entry.getKey();
            List list = (List) entry.getValue();
            ymh ymhVarQ = wef.q(cls);
            ArrayList arrayList = new ArrayList(yfm.z(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(wef.q((Class) it.next()));
            }
            yfw yfwVar = new yfw(ymhVarQ, arrayList);
            linkedHashMap.put(yfwVar.a, yfwVar.b);
        }
        return linkedHashMap;
    }

    protected Map h() {
        return yhc.a;
    }

    public Set i() {
        Set setJ = j();
        ArrayList arrayList = new ArrayList(yfm.z(setJ, 10));
        Iterator it = setJ.iterator();
        while (it.hasNext()) {
            arrayList.add(wef.q((Class) it.next()));
        }
        return yfm.aq(arrayList);
    }

    @yfp
    public Set j() {
        return yhd.a;
    }

    public final yil k() {
        yow yowVar = this.a;
        if (yowVar == null) {
            yks.c("coroutineScope");
            yowVar = null;
        }
        return ((ywq) yowVar).a;
    }

    public final yow l() {
        yow yowVar = this.a;
        if (yowVar != null) {
            return yowVar;
        }
        yks.c("coroutineScope");
        return null;
    }

    public final void m() {
        if (!this.f && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void n() {
        if (!s() || t()) {
            return;
        }
        yil yilVar = (yil) this.g.get();
        if ((yilVar != null ? (gfi) yilVar.get(gfi.b) : null) != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @yfp
    public final void o() {
        m();
        m();
        ghk ghkVarB = d().b();
        if (!ghkVarB.h()) {
            gez.o(new btr(b(), (yih) null, 17, (char[]) null));
        }
        if (((ghu) ghkVarB).d.isWriteAheadLoggingEnabled()) {
            ghkVarB.d();
        } else {
            ghkVarB.c();
        }
    }

    public final void p() {
        d().b().e();
        if (t()) {
            return;
        }
        geo geoVarB = b();
        geoVarB.b.g(geoVarB.e, geoVarB.f);
    }

    public final void q(Runnable runnable) {
        y(new gem(runnable, 2));
    }

    @yfp
    public final void r() {
        d().b().g();
    }

    public final boolean s() {
        ged gedVar = this.j;
        if (gedVar == null) {
            yks.c("connectionManager");
            gedVar = null;
        }
        return gedVar.d != null;
    }

    public final boolean t() {
        return u() && d().b().h();
    }

    public final boolean u() {
        ged gedVar = this.j;
        if (gedVar == null) {
            yks.c("connectionManager");
            gedVar = null;
        }
        ghk ghkVar = gedVar.e;
        if (ghkVar != null) {
            return ghkVar.i();
        }
        return false;
    }

    public final void v(gic gicVar) throws Exception {
        geo geoVarB = b();
        gft gftVar = geoVarB.b;
        ghi ghiVarA = gicVar.a("PRAGMA query_only");
        try {
            ghiVarA.l();
            boolean zN = ghiVarA.n();
            wef.r(ghiVarA, null);
            if (!zN) {
                gez.t(gicVar, "PRAGMA temp_store = MEMORY");
                gez.t(gicVar, "PRAGMA recursive_triggers = 1");
                gez.t(gicVar, "DROP TABLE IF EXISTS room_table_modification_log");
                if (gftVar.b) {
                    gez.t(gicVar, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    gez.t(gicVar, ylh.Y("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                mma mmaVar = gftVar.d;
                ReentrantLock reentrantLock = (ReentrantLock) mmaVar.c;
                reentrantLock.lock();
                try {
                    mmaVar.a = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (geoVarB.g) {
                gez gezVar = geoVarB.h;
            }
        } finally {
        }
    }

    @yfp
    public List w() {
        return yhb.a;
    }

    public final Object x(yjz yjzVar, yih yihVar) {
        ged gedVar = this.j;
        if (gedVar == null) {
            yks.c("connectionManager");
            gedVar = null;
        }
        gge ggeVar = (gge) yihVar.getContext().get(gge.b);
        ggd ggdVar = ggeVar != null ? ggeVar.a : null;
        if (ggdVar != null) {
            return yjzVar.a(ggdVar, yihVar);
        }
        ggf ggfVar = gedVar.f;
        ggd ggdVar2 = new ggd(ggfVar.b, (gic) ggfVar.c.a());
        return ykr.l(new gge(ggdVar2), new dbv(yjzVar, ggdVar2, (yih) null, 13), yihVar);
    }
}
