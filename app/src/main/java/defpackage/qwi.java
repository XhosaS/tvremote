package defpackage;

import android.app.Activity;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qwi extends qwd implements quz, qsw, qsn {
    public volatile qpi a;
    public final aehf b;
    public final agow d;
    public final agow e;
    public final qvv f;
    public final qwc g;
    public final qxh h;
    private final Executor j;
    private final qux k;
    private final yqt l;
    private final qsx m;
    private final qst n;
    private final rcu o;
    private final agow t;
    private final yqt u;
    private final agow v;
    private final agow w;
    private final AtomicBoolean i = new AtomicBoolean();
    private final AtomicInteger p = new AtomicInteger();
    private final AtomicInteger q = new AtomicInteger();
    private final AtomicInteger r = new AtomicInteger();
    private final AtomicBoolean s = new AtomicBoolean(false);
    public final AtomicBoolean c = new AtomicBoolean(false);

    public qwi(quy quyVar, Executor executor, aehf aehfVar, yqt yqtVar, qsx qsxVar, qst qstVar, rcu rcuVar, agow agowVar, agow agowVar2, agow agowVar3, qvv qvvVar, qwc qwcVar, yqt yqtVar2, agow agowVar4, agow agowVar5, qxh qxhVar) {
        this.b = aehfVar;
        this.l = yqtVar;
        this.m = qsxVar;
        this.n = qstVar;
        this.o = rcuVar;
        this.k = quyVar.a(zwk.a, aehfVar, null);
        this.j = executor;
        this.t = agowVar;
        this.d = agowVar2;
        this.e = agowVar3;
        this.f = qvvVar;
        this.g = qwcVar;
        this.u = yqtVar2;
        this.v = agowVar4;
        this.w = agowVar5;
        this.h = qxhVar;
    }

    private final void q(final int i, final AtomicInteger atomicInteger) {
        atomicInteger.getAndIncrement();
        zxn.l(new zvh() { // from class: qwe
            @Override // defpackage.zvh
            public final zyd a() {
                if (atomicInteger.getAndDecrement() <= 0) {
                    return zxy.a;
                }
                int i2 = i;
                qwi qwiVar = this.a;
                return qwiVar.o(i2, (qvs) qwiVar.b.a());
            }
        }, this.j);
    }

    @Override // defpackage.qsw
    public final void c(Activity activity) {
        zxn.l(new zvh() { // from class: qwg
            @Override // defpackage.zvh
            public final zyd a() {
                qwi qwiVar = this.a;
                if (qwiVar.n()) {
                    final qvv qvvVar = qwiVar.f;
                    if (qvvVar.f.getAndSet(false)) {
                        zxn.l(new zvh() { // from class: qvu
                            @Override // defpackage.zvh
                            public final zyd a() {
                                qvv qvvVar2 = qvvVar;
                                Object objEV = qvvVar2.b.eV();
                                yqt yqtVarH = yqt.h(rnu.b());
                                yqt yqtVar = (yqt) objEV;
                                if (!yqtVar.g() || !yqtVarH.g()) {
                                    return zxy.a;
                                }
                                qvt qvtVar = new qvt((File) yqtVar.c(), (String) yqtVarH.c());
                                int iA = qvtVar.a();
                                qvtVar.b().delete();
                                qvtVar.b = 0;
                                qvtVar.c = true;
                                if (iA < ((qvx) qvvVar2.e.a()).c) {
                                    return zxy.a;
                                }
                                qux quxVar = qvvVar2.d;
                                qup qupVarN = quq.n();
                                ahvw ahvwVar = ahvw.a;
                                ahvv ahvvVar = new ahvv();
                                ahvu ahvuVar = ahvu.a;
                                ahvq ahvqVar = new ahvq();
                                if ((ahvqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    ahvqVar.y();
                                }
                                ahvu ahvuVar2 = (ahvu) ahvqVar.b;
                                ahvuVar2.c = 6;
                                ahvuVar2.b = 1 | ahvuVar2.b;
                                if ((ahvvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    ahvvVar.y();
                                }
                                ahvw ahvwVar2 = (ahvw) ahvvVar.b;
                                ahvu ahvuVar3 = (ahvu) ahvqVar.v();
                                ahvuVar3.getClass();
                                ahvwVar2.u = ahvuVar3;
                                ahvwVar2.b |= 16777216;
                                qupVarN.f((ahvw) ahvvVar.v());
                                return quxVar.b(qupVarN.a());
                            }
                        }, qvvVar.c);
                    } else {
                        zyd zydVar = zxy.a;
                    }
                }
                return zxy.a;
            }
        }, this.j);
    }

    @Override // defpackage.qsw
    public final void d(Activity activity) {
        this.a = qpi.c(activity.getClass());
    }

    @Override // defpackage.qsn
    public final void g(qpi qpiVar) {
        this.a = null;
    }

    @Override // defpackage.qsw
    public final void h() {
        if (this.s.getAndSet(true)) {
            return;
        }
        q(4, this.q);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [agow, java.lang.Object] */
    @Override // defpackage.quz
    public final void k() {
        ((qwp) ((yqz) this.l).a.a()).a(this);
        this.m.a.a(this);
        this.n.c.a(this);
        q(3, this.p);
        zxn.l(new zvh() { // from class: qwf
            @Override // defpackage.zvh
            public final zyd a() {
                qwi qwiVar = this.a;
                return (!qwiVar.n() || qwiVar.c.getAndSet(true)) ? zxy.a : qwiVar.p(6, (qvs) qwiVar.b.a(), ((qvx) qwiVar.e.a()).f);
            }
        }, this.j);
    }

    @Override // defpackage.qwd
    public final void l() {
        if (this.i.compareAndSet(false, true)) {
            Thread.setDefaultUncaughtExceptionHandler(new qwh(this, Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:5|1d|15|(23:17|(3:19|(1:21)|22)(3:23|(3:25|(1:27)|28)(2:30|(3:99|(1:101)|102)(4:35|(1:37)|38|(3:40|(1:42)|43)(4:44|(1:46)(4:47|(1:49)|50|(7:153|51|151|52|150|(5:54|164|55|56|(1:58)(2:59|60))(3:163|61|(2:63|(1:65)(2:66|67)))|88))|89|(3:91|(1:93)|94)(3:95|(1:97)|98))))|29)|103|(1:105)|106|(1:111)|155|114|(1:116)(1:117)|118|(1:120)|121|158|(2:126|124)|157|127|(1:132)|160|(2:141|133)|159|(2:137|135)|161|(2:139|140)(1:167))(1:112)|113|155|114|(0)(0)|118|(0)|121|158|(1:124)|157|127|(2:130|132)|160|(1:133)|159|(1:135)|161|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0347, code lost:
    
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ba, code lost:
    
        r8 = new defpackage.abvy(r14, defpackage.abvz.F(r0));
        defpackage.abza.a.a(r4.getClass()).m(r4, defpackage.abwa.a(r8));
        r8.O();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01d7, code lost:
    
        r14.close();
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b6 A[PHI: r4 r16 r18
  0x02b6: PHI (r4v2 ahuv) = (r4v1 ahuv), (r4v23 ahuv), (r4v23 ahuv) binds: [B:112:0x02af, B:107:0x02a6, B:110:0x02aa] A[DONT_GENERATE, DONT_INLINE]
  0x02b6: PHI (r16v1 boolean) = (r16v0 boolean), (r16v4 boolean), (r16v4 boolean) binds: [B:112:0x02af, B:107:0x02a6, B:110:0x02aa] A[DONT_GENERATE, DONT_INLINE]
  0x02b6: PHI (r18v1 int) = (r18v0 int), (r18v17 int), (r18v17 int) binds: [B:112:0x02af, B:107:0x02a6, B:110:0x02aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02c2 A[Catch: InterruptedException -> 0x0347, all -> 0x034e, TryCatch #8 {InterruptedException -> 0x0347, all -> 0x034e, blocks: (B:114:0x02b8, B:116:0x02c2, B:118:0x02d7, B:120:0x02ed, B:121:0x02f0, B:117:0x02cd), top: B:155:0x02b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02cd A[Catch: InterruptedException -> 0x0347, all -> 0x034e, TryCatch #8 {InterruptedException -> 0x0347, all -> 0x034e, blocks: (B:114:0x02b8, B:116:0x02c2, B:118:0x02d7, B:120:0x02ed, B:121:0x02f0, B:117:0x02cd), top: B:155:0x02b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02ed A[Catch: InterruptedException -> 0x0347, all -> 0x034e, TryCatch #8 {InterruptedException -> 0x0347, all -> 0x034e, blocks: (B:114:0x02b8, B:116:0x02c2, B:118:0x02d7, B:120:0x02ed, B:121:0x02f0, B:117:0x02cd), top: B:155:0x02b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0356 A[LOOP:0: B:124:0x034e->B:126:0x0356, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0388 A[LOOP:2: B:135:0x0380->B:137:0x0388, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0393 A[LOOP:1: B:133:0x0378->B:141:0x0393, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0237  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(defpackage.ahuv r27, defpackage.qxk r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 923
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwi.m(ahuv, qxk):void");
    }

    public final boolean n() {
        return ((qvx) this.e.a()).b;
    }

    public final zyd o(int i, qvs qvsVar) {
        return p(i, qvsVar, qvsVar.d() / 100.0f);
    }

    public final zyd p(int i, qvs qvsVar, float f) {
        if (!qvsVar.c()) {
            return zxy.a;
        }
        if (!this.o.a(f).a()) {
            return zxy.a;
        }
        qux quxVar = this.k;
        qup qupVarN = quq.n();
        ahvw ahvwVar = ahvw.a;
        ahvv ahvvVar = new ahvv();
        ahvu ahvuVar = ahvu.a;
        ahvq ahvqVar = new ahvq();
        float f2 = 1.0f / f;
        if ((ahvqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahvqVar.y();
        }
        int i2 = (int) f2;
        ahvu ahvuVar2 = (ahvu) ahvqVar.b;
        ahvuVar2.b |= 2;
        ahvuVar2.d = i2;
        if ((ahvqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahvqVar.y();
        }
        ahvu ahvuVar3 = (ahvu) ahvqVar.b;
        ahvuVar3.c = i - 1;
        ahvuVar3.b |= 1;
        if ((ahvvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahvvVar.y();
        }
        ahvw ahvwVar2 = (ahvw) ahvvVar.b;
        ahvu ahvuVar4 = (ahvu) ahvqVar.v();
        ahvuVar4.getClass();
        ahvwVar2.u = ahvuVar4;
        ahvwVar2.b |= 16777216;
        qupVarN.f((ahvw) ahvvVar.v());
        return quxVar.b(qupVarN.a());
    }

    @Override // defpackage.qsw
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.qsw
    public final /* synthetic */ void a(Activity activity) {
    }

    @Override // defpackage.qsw
    public final /* synthetic */ void b(Activity activity) {
    }

    @Override // defpackage.qsw
    public final /* synthetic */ void e(Activity activity) {
    }

    @Override // defpackage.qsw
    public final /* synthetic */ void f(int i) {
    }

    @Override // defpackage.qsn
    public final /* synthetic */ void j(qpi qpiVar) {
    }
}
