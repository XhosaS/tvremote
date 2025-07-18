package defpackage;

import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dck implements Runnable, Comparable, dcd, dqs {
    public static final dam a = new dam("glide_thread_priority_override", null, dam.a);
    private daj A;
    private Object B;
    private daw C;
    private volatile boolean D;
    private boolean E;
    private int F;
    private int G;
    public cyk e;
    public daj f;
    public cyn g;
    public ddf h;
    public int i;
    public int j;
    public dcr k;
    public dan l;
    public dcg m;
    public int n;
    public cym o;
    public Supplier p;
    public daj q;
    public volatile dce r;
    public volatile boolean s;
    public int t;
    public final dcw u;
    private final afh x;
    private long y;
    private Thread z;
    public final dcf b = new dcf();
    private final List v = new ArrayList();
    private final dqw w = new dqv();
    public final dch c = new dch();
    public final dci d = new dci();

    public dck(dcw dcwVar, afh afhVar) {
        this.u = dcwVar;
        this.x = afhVar;
    }

    private final dce g() {
        int i = this.F;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            return new ddq(this.b, this);
        }
        if (i2 == 2) {
            dcf dcfVar = this.b;
            return new dca(dcfVar.c(), dcfVar, this);
        }
        if (i2 == 3) {
            return new ddv(this.b, this);
        }
        if (i2 == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(dcj.a(i)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0256 A[LOOP:0: B:42:0x00f5->B:110:0x0256, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x026e A[Catch: all -> 0x02a4, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x02a4, blocks: (B:114:0x026e, B:126:0x029e, B:127:0x02a3), top: B:175:0x00dd }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x028c A[Catch: all -> 0x0299, TRY_ENTER, TryCatch #11 {all -> 0x0299, blocks: (B:54:0x0134, B:58:0x014d, B:60:0x0153, B:61:0x0156, B:63:0x016a, B:65:0x017c, B:69:0x018d, B:71:0x0197, B:74:0x01a0, B:79:0x01bb, B:82:0x01c7, B:84:0x01cb, B:86:0x01f6, B:90:0x0213, B:120:0x028c, B:121:0x0298, B:85:0x01ed, B:87:0x0203, B:88:0x0210, B:77:0x01b5, B:107:0x0250, B:66:0x0181, B:67:0x018a, B:101:0x022b, B:102:0x023e), top: B:190:0x0134 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0268 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x026a A[EDGE_INSN: B:203:0x026a->B:112:0x026a BREAK  A[LOOP:0: B:42:0x00f5->B:110:0x0256], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f7 A[Catch: all -> 0x029b, TRY_LEAVE, TryCatch #16 {all -> 0x029b, blocks: (B:41:0x00ea, B:43:0x00f7, B:44:0x00fe, B:48:0x0118, B:50:0x0128, B:52:0x0130), top: B:196:0x00ea }] */
    /* JADX WARN: Type inference failed for: r0v45, types: [ddp] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void h() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 829
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dck.h():void");
    }

    private final void i(String str, long j, String str2) {
        double dA = dqf.a(j);
        String strValueOf = String.valueOf(this.h);
        String strConcat = str2 != null ? ", ".concat(str2) : "";
        Log.v("DecodeJob", str + " in " + dA + ", load key: " + strValueOf + strConcat + ", thread: " + Thread.currentThread().getName());
    }

    private final void j() throws SecurityException, IllegalArgumentException {
        if (this.o.a(cyj.class)) {
            k();
        }
        m();
        this.m.cA(new ddj("Failed to load resource", new ArrayList(this.v)));
        if (this.d.c()) {
            c();
        }
    }

    private final void k() throws SecurityException, IllegalArgumentException {
        if (!this.o.a(cyj.class)) {
            throw new IllegalStateException("OverrideGlideThreadPriority experiment is not enabled.");
        }
        Supplier supplier = this.p;
        if (supplier == null || supplier.get() == null) {
            return;
        }
        try {
            Process.setThreadPriority(Process.myTid(), 9);
        } catch (IllegalArgumentException | SecurityException e) {
            this.p = null;
            if (Log.isLoggable("DecodeJob", 2)) {
                Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e);
            }
        }
    }

    private final void l() throws SecurityException, IllegalArgumentException {
        this.z = Thread.currentThread();
        int i = dqf.a;
        this.y = SystemClock.elapsedRealtimeNanos();
        boolean zC = false;
        while (!this.s && this.r != null && !(zC = this.r.c())) {
            this.F = f(this.F);
            this.r = g();
            if (this.F == 4) {
                n(2);
                return;
            }
        }
        if ((this.F == 6 || this.s) && !zC) {
            j();
        }
    }

    private final void m() {
        this.w.a();
        if (this.D) {
            List list = this.v;
            throw new IllegalStateException("Already notified", list.isEmpty() ? null : (Throwable) list.get(list.size() - 1));
        }
        this.D = true;
    }

    private final void n(int i) {
        this.t = i;
        this.m.b(this);
    }

    @Override // defpackage.dcd
    public final void b() {
        n(2);
    }

    public final void c() {
        this.d.a();
        dch dchVar = this.c;
        dchVar.a = null;
        dchVar.b = null;
        dchVar.c = null;
        dcf dcfVar = this.b;
        dcfVar.c = null;
        dcfVar.d = null;
        dcfVar.m = null;
        dcfVar.g = null;
        dcfVar.j = null;
        dcfVar.h = null;
        dcfVar.n = null;
        dcfVar.i = null;
        dcfVar.o = null;
        dcfVar.a.clear();
        dcfVar.k = false;
        dcfVar.b.clear();
        dcfVar.l = false;
        this.D = false;
        this.e = null;
        this.f = null;
        this.l = null;
        this.g = null;
        this.h = null;
        this.m = null;
        this.F = 0;
        this.r = null;
        this.z = null;
        this.q = null;
        this.B = null;
        this.G = 0;
        this.C = null;
        this.y = 0L;
        this.s = false;
        this.v.clear();
        this.x.b(this);
    }

    @Override // defpackage.dqs
    public final dqw cB() {
        return this.w;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        dck dckVar = (dck) obj;
        int iOrdinal = this.g.ordinal() - dckVar.g.ordinal();
        return iOrdinal == 0 ? this.n - dckVar.n : iOrdinal;
    }

    @Override // defpackage.dcd
    public final void d(daj dajVar, Exception exc, daw dawVar, int i) throws SecurityException, IllegalArgumentException {
        dawVar.d();
        ddj ddjVar = new ddj("Fetching data failed", Collections.singletonList(exc));
        ddjVar.b(dajVar, i, dawVar.a());
        this.v.add(ddjVar);
        if (Thread.currentThread() != this.z) {
            n(2);
        } else {
            l();
        }
    }

    @Override // defpackage.dcd
    public final void e(daj dajVar, Object obj, daw dawVar, int i, daj dajVar2) throws Throwable {
        this.q = dajVar;
        this.B = obj;
        this.C = dawVar;
        this.G = i;
        this.A = dajVar2;
        this.E = dajVar != this.b.c().get(0);
        if (Thread.currentThread() == this.z) {
            h();
        } else {
            n(3);
        }
    }

    public final int f(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            if (this.k.b()) {
                return 2;
            }
            return f(2);
        }
        if (i2 == 1) {
            if (this.k.a()) {
                return 3;
            }
            return f(3);
        }
        if (i2 == 2) {
            return 4;
        }
        if (i2 == 3 || i2 == 5) {
            return 6;
        }
        throw new IllegalArgumentException("Unrecognized stage: ".concat(dcj.a(i)));
    }

    @Override // java.lang.Runnable
    public final void run() {
        daw dawVar = this.C;
        try {
            try {
                if (this.s) {
                    j();
                } else {
                    int i = this.t;
                    int i2 = i - 1;
                    if (i == 0) {
                        throw null;
                    }
                    if (i2 == 0) {
                        this.F = f(1);
                        this.r = g();
                        l();
                    } else if (i2 == 1) {
                        l();
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("Unrecognized run reason: ".concat(i != 1 ? i != 2 ? "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE"));
                        }
                        h();
                    }
                }
            } catch (dbz e) {
                throw e;
            } catch (Throwable th) {
                if (Log.isLoggable("DecodeJob", 3)) {
                    Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.s + ", stage: " + dcj.a(this.F), th);
                }
                if (this.F != 5) {
                    this.v.add(th);
                    j();
                }
                if (!this.s) {
                    throw th;
                }
                throw th;
            }
        } finally {
            if (dawVar != null) {
                dawVar.d();
            }
        }
    }
}
