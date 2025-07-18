package defpackage;

import android.os.Process;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmz implements Runnable, Comparable, hmv, hwu {
    public static final hlk a = new hlk("glide_thread_priority_override", null, hlk.a);
    private volatile boolean A;
    private boolean B;
    private int C;
    private int D;
    public hjv d;
    public hlg e;
    public hjw f;
    public int g;
    public int h;
    public hng i;
    public hll j;
    public int k;
    public Supplier l;
    public hlg m;
    public volatile hmw n;
    public volatile boolean o;
    public int p;
    public final hni q;
    public hnn r;
    public hfx s;
    private final cuj v;
    private Thread w;
    private hlg x;
    private Object y;
    private hlu z;
    public final hmx b = new hmx();
    private final List u = new ArrayList();
    private final mfm E = new mfm();
    public final kvw t = new kvw((char[]) null);
    public final hmy c = new hmy();

    public hmz(hni hniVar, cuj cujVar) {
        this.q = hniVar;
        this.v = cujVar;
    }

    private final int g() {
        return this.f.ordinal();
    }

    private final hmw h() {
        int i = this.C;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            return new hnw(this.b, this);
        }
        if (i2 == 2) {
            hmx hmxVar = this.b;
            return new hmt(hmxVar.d(), hmxVar, this);
        }
        if (i2 == 3) {
            return new hoa(this.b, this);
        }
        if (i2 == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(hjs.a(i)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0213 A[EDGE_INSN: B:221:0x0213->B:98:0x0213 BREAK  A[LOOP:1: B:36:0x00ac->B:96:0x0203], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0203 A[LOOP:1: B:36:0x00ac->B:96:0x0203, LOOP_END] */
    /* JADX WARN: Type inference failed for: r0v21, types: [hos] */
    /* JADX WARN: Type inference failed for: r20v1, types: [hnx] */
    /* JADX WARN: Type inference failed for: r5v6, types: [hlg, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void i() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 874
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hmz.i():void");
    }

    private final void j() throws SecurityException, IllegalArgumentException {
        if (this.s.a(hju.class)) {
            k();
        }
        m();
        hnr hnrVar = new hnr("Failed to load resource", new ArrayList(this.u));
        hnn hnnVar = this.r;
        synchronized (hnnVar) {
            hnnVar.f = hnrVar;
        }
        synchronized (hnnVar) {
            hnnVar.k.c();
            if (hnnVar.i) {
                hnnVar.d();
            } else {
                hnm hnmVar = hnnVar.a;
                if (hnmVar.c()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (hnnVar.g) {
                    throw new IllegalStateException("Already failed once");
                }
                hnnVar.g = true;
                hlg hlgVar = hnnVar.b;
                hnm hnmVarB = hnmVar.b();
                hnnVar.c(hnmVarB.a() + 1);
                hnnVar.m.f(hnnVar, hlgVar, null);
                Iterator<hnl> it = hnmVarB.iterator();
                while (it.hasNext()) {
                    hnl next = it.next();
                    next.a.execute(new hnk(hnnVar, next.b, 1));
                }
                hnnVar.b();
            }
        }
        if (this.c.c()) {
            a();
        }
    }

    private final void k() throws SecurityException, IllegalArgumentException {
        if (!this.s.a(hju.class)) {
            throw new IllegalStateException("OverrideGlideThreadPriority experiment is not enabled.");
        }
        Supplier supplier = this.l;
        if (supplier == null || supplier.get() == null) {
            return;
        }
        try {
            Process.setThreadPriority(Process.myTid(), 9);
        } catch (IllegalArgumentException | SecurityException unused) {
            this.l = null;
        }
    }

    private final void l() throws SecurityException, IllegalArgumentException {
        this.w = Thread.currentThread();
        double d = hwk.a;
        SystemClock.elapsedRealtimeNanos();
        boolean zC = false;
        while (!this.o && this.n != null && !(zC = this.n.c())) {
            this.C = c(this.C);
            this.n = h();
            if (this.C == 4) {
                e(2);
                return;
            }
        }
        if ((this.C == 6 || this.o) && !zC) {
            j();
        }
    }

    private final void m() {
        this.E.c();
        if (this.A) {
            List list = this.u;
            throw new IllegalStateException("Already notified", list.isEmpty() ? null : (Throwable) list.get(list.size() - 1));
        }
        this.A = true;
    }

    public final void a() {
        this.c.a();
        kvw kvwVar = this.t;
        kvwVar.b = null;
        kvwVar.a = null;
        kvwVar.c = null;
        hmx hmxVar = this.b;
        hmxVar.c = null;
        hmxVar.d = null;
        hmxVar.m = null;
        hmxVar.g = null;
        hmxVar.j = null;
        hmxVar.h = null;
        hmxVar.n = null;
        hmxVar.i = null;
        hmxVar.o = null;
        hmxVar.a.clear();
        hmxVar.k = false;
        hmxVar.b.clear();
        hmxVar.l = false;
        this.A = false;
        this.d = null;
        this.e = null;
        this.j = null;
        this.f = null;
        this.r = null;
        this.C = 0;
        this.n = null;
        this.w = null;
        this.m = null;
        this.y = null;
        this.D = 0;
        this.z = null;
        this.o = false;
        this.u.clear();
        this.v.b(this);
    }

    @Override // defpackage.hmv
    public final void b(hlg hlgVar, Exception exc, hlu hluVar, int i) throws SecurityException, IllegalArgumentException {
        hluVar.d();
        hnr hnrVar = new hnr("Fetching data failed", Collections.singletonList(exc));
        hnrVar.b(hlgVar, i, hluVar.a());
        this.u.add(hnrVar);
        if (Thread.currentThread() != this.w) {
            e(2);
        } else {
            l();
        }
    }

    public final int c(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            if (this.i.b()) {
                return 2;
            }
            return c(2);
        }
        if (i2 == 1) {
            if (this.i.a()) {
                return 3;
            }
            return c(3);
        }
        if (i2 == 2) {
            return 4;
        }
        if (i2 == 3 || i2 == 5) {
            return 6;
        }
        throw new IllegalArgumentException("Unrecognized stage: ".concat(hjs.a(i)));
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        hmz hmzVar = (hmz) obj;
        int iG = g() - hmzVar.g();
        return iG == 0 ? this.k - hmzVar.k : iG;
    }

    @Override // defpackage.hmv
    public final void d(hlg hlgVar, Object obj, hlu hluVar, int i, hlg hlgVar2) throws Throwable {
        this.m = hlgVar;
        this.y = obj;
        this.z = hluVar;
        this.D = i;
        this.x = hlgVar2;
        this.B = hlgVar != this.b.d().get(0);
        if (Thread.currentThread() == this.w) {
            i();
        } else {
            e(3);
        }
    }

    public final void e(int i) {
        this.p = i;
        this.r.a().execute(this);
    }

    @Override // defpackage.hwu
    public final mfm f() {
        return this.E;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hlu hluVar = this.z;
        try {
            try {
                try {
                    if (this.o) {
                        j();
                    } else {
                        int i = this.p;
                        int i2 = i - 1;
                        if (i == 0) {
                            throw null;
                        }
                        if (i2 == 0) {
                            this.C = c(1);
                            this.n = h();
                            l();
                        } else if (i2 == 1) {
                            l();
                        } else {
                            if (i2 != 2) {
                                throw new IllegalStateException("Unrecognized run reason: ".concat(i != 1 ? i != 2 ? "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE"));
                            }
                            i();
                        }
                    }
                    if (hluVar != null) {
                        hluVar.d();
                    }
                } catch (Throwable th) {
                    if (this.C != 5) {
                        this.u.add(th);
                        j();
                    }
                    if (!this.o) {
                        throw th;
                    }
                    throw th;
                }
            } catch (hms e) {
                throw e;
            }
        } catch (Throwable th2) {
            if (hluVar != null) {
                hluVar.d();
            }
            throw th2;
        }
    }
}
