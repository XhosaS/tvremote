package defpackage;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bmn {
    public ahbt a;
    public agte b;
    public Executor c;
    public Executor d;
    public bmd e;
    public blh f;
    public boolean h;
    public final bob g = new bob();
    public final ThreadLocal i = new ThreadLocal();
    public final Map j = new LinkedHashMap();
    public boolean k = true;

    private final Object x(final agum agumVar) {
        if (!r()) {
            return bpr.b(this, false, true, new agux() { // from class: bmh
                @Override // defpackage.agux
                public final Object a(Object obj) {
                    ((bsk) obj).getClass();
                    return agumVar.a();
                }
            });
        }
        m();
        n();
        try {
            Object objA = agumVar.a();
            q();
            return objA;
        } finally {
            o();
        }
    }

    protected abstract blh a();

    public final blh b() {
        blh blhVar = this.f;
        if (blhVar != null) {
            return blhVar;
        }
        agvy.b("internalTracker");
        return null;
    }

    protected bmv c() {
        throw new agph("An operation is not implemented.");
    }

    public final brr d() {
        bmd bmdVar = this.e;
        if (bmdVar == null) {
            agvy.b("connectionManager");
            bmdVar = null;
        }
        brr brrVar = bmdVar.d;
        if (brrVar != null) {
            return brrVar;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    public final Object e(final Callable callable) {
        return x(new agum() { // from class: bmg
            @Override // defpackage.agum
            public final Object a() {
                return callable.call();
            }
        });
    }

    public List f(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(agrj.b(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(aguk.a((agxd) entry.getKey()), entry.getValue());
        }
        return v();
    }

    protected Map g() {
        Set<Map.Entry> setEntrySet = h().entrySet();
        int iB = agrj.b(agqq.i(setEntrySet, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Map.Entry entry : setEntrySet) {
            Class cls = (Class) entry.getKey();
            List<Class> list = (List) entry.getValue();
            cls.getClass();
            agwj agwjVar = agwi.a;
            agvq agvqVar = new agvq(cls);
            ArrayList arrayList = new ArrayList(agqq.i(list, 10));
            for (Class cls2 : list) {
                cls2.getClass();
                arrayList.add(new agvq(cls2));
            }
            agpi agpiVar = new agpi(agvqVar, arrayList);
            linkedHashMap.put(agpiVar.a, agpiVar.b);
        }
        return linkedHashMap;
    }

    protected Map h() {
        return agre.a;
    }

    public Set i() {
        Set<Class> setJ = j();
        ArrayList arrayList = new ArrayList(agqq.i(setJ, 10));
        for (Class cls : setJ) {
            cls.getClass();
            agwj agwjVar = agwi.a;
            arrayList.add(new agvq(cls));
        }
        return agqq.A(arrayList);
    }

    public Set j() {
        return agrf.a;
    }

    public final agte k() {
        ahbt ahbtVar = this.a;
        if (ahbtVar == null) {
            agvy.b("coroutineScope");
            ahbtVar = null;
        }
        return ((ahky) ahbtVar).a;
    }

    public final ahbt l() {
        ahbt ahbtVar = this.a;
        if (ahbtVar != null) {
            return ahbtVar;
        }
        agvy.b("coroutineScope");
        return null;
    }

    public final void m() {
        if (!this.h && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void n() {
        m();
        SQLiteDatabase sQLiteDatabase = ((brz) d().b()).f;
        if (!sQLiteDatabase.inTransaction()) {
            bov.a(new blg(b(), null));
        }
        if (sQLiteDatabase.isWriteAheadLoggingEnabled()) {
            sQLiteDatabase.beginTransactionNonExclusive();
        } else {
            sQLiteDatabase.beginTransaction();
        }
    }

    public final void o() {
        ((brz) d().b()).f.endTransaction();
        if (s()) {
            return;
        }
        blh blhVarB = b();
        blhVarB.c.g(blhVarB.f, blhVarB.g);
    }

    public final void p(final Runnable runnable) {
        x(new agum() { // from class: bme
            @Override // defpackage.agum
            public final Object a() {
                runnable.run();
                return agpu.a;
            }
        });
    }

    public final void q() {
        ((brz) d().b()).f.setTransactionSuccessful();
    }

    public final boolean r() {
        bmd bmdVar = this.e;
        if (bmdVar == null) {
            agvy.b("connectionManager");
            bmdVar = null;
        }
        return bmdVar.d != null;
    }

    public final boolean s() {
        return t() && ((brz) d().b()).f.inTransaction();
    }

    public final boolean t() {
        bmd bmdVar = this.e;
        if (bmdVar == null) {
            agvy.b("connectionManager");
            bmdVar = null;
        }
        brm brmVar = bmdVar.e;
        if (brmVar != null) {
            return brmVar.a();
        }
        return false;
    }

    public final void u(bsk bskVar) throws Exception {
        blw blwVar;
        blh blhVarB = b();
        boa boaVar = blhVarB.c;
        brj brjVarA = bskVar.a("PRAGMA query_only");
        try {
            brjVarA.l();
            boolean zN = brjVarA.n();
            aguj.a(brjVarA, null);
            if (!zN) {
                bri.a(bskVar, "PRAGMA temp_store = MEMORY");
                bri.a(bskVar, "PRAGMA recursive_triggers = 1");
                bri.a(bskVar, "DROP TABLE IF EXISTS room_table_modification_log");
                if (boaVar.c) {
                    bri.a(bskVar, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    bri.a(bskVar, agyv.g("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                blt bltVar = boaVar.d;
                ReentrantLock reentrantLock = bltVar.a;
                reentrantLock.lock();
                try {
                    bltVar.d = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (blhVarB.j) {
                blp blpVar = blhVarB.i;
                if (blpVar != null) {
                    Intent intent = blhVarB.h;
                    if (intent == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    if (blpVar.e.compareAndSet(true, false)) {
                        blpVar.c.bindService(intent, blpVar.k, 1);
                        blh blhVar = blpVar.b;
                        bln blnVar = blpVar.i;
                        blnVar.getClass();
                        agpi agpiVarF = blhVar.c.f(blnVar.a);
                        String[] strArr = (String[]) agpiVarF.a;
                        int[] iArr = (int[]) agpiVarF.b;
                        blw blwVar2 = new blw(blnVar, iArr, strArr);
                        ReentrantLock reentrantLock2 = blhVar.e;
                        reentrantLock2.lock();
                        try {
                            Map map = blhVar.d;
                            if (map.containsKey(blnVar)) {
                                map.getClass();
                                blwVar = (blw) agrj.a(map, blnVar);
                            } else {
                                blwVar = (blw) map.put(blnVar, blwVar2);
                            }
                            if (blwVar == null) {
                                boa boaVar2 = blhVar.c;
                                iArr.getClass();
                                boaVar2.d.a(iArr);
                            }
                        } finally {
                            reentrantLock2.unlock();
                        }
                    }
                }
            }
        } finally {
        }
    }

    public List v() {
        return agrd.a;
    }

    public final Object w(agvb agvbVar, agsw agswVar) {
        bmd bmdVar = this.e;
        if (bmdVar == null) {
            agvy.b("connectionManager");
            bmdVar = null;
        }
        boo booVar = (boo) agswVar.fr().get(boo.a);
        bol bolVar = booVar != null ? booVar.b : null;
        if (bolVar != null) {
            return agvbVar.a(bolVar, agswVar);
        }
        boq boqVar = bmdVar.f;
        bol bolVar2 = new bol(boqVar.b, (bsk) boqVar.c.a());
        return ahal.a(new boo(bolVar2), new bop(agvbVar, bolVar2, null), agswVar);
    }
}
