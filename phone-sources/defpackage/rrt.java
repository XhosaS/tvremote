package defpackage;

import android.support.v7.appcompat.R;
import java.lang.Thread;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class rrt implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ Thread.UncaughtExceptionHandler a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ rrt(Object obj, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, int i) {
        this.c = i;
        this.b = obj;
        this.a = uncaughtExceptionHandler;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, lie] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        if (this.c != 0) {
            try {
                ((kqy) this.b).e.A();
            } catch (Throwable unused) {
            }
            this.a.uncaughtException(thread, th);
            return;
        }
        Object obj = this.b;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        try {
            try {
                ulp ulpVarB = tqb.b(th);
                if (ulpVarB != null) {
                    Object obj2 = ulpVarB.a;
                    rrs rrsVarA = rrs.a(((tqw) obj2).b);
                    if (rrsVarA != null && ((rrr) rrsVarA.a.get()) != null && rrsVarA.b.get() == null) {
                        UUID uuid = ((tqw) obj2).c;
                        long mostSignificantBits = (uuid.getMostSignificantBits() ^ uuid.getLeastSignificantBits()) & Long.MAX_VALUE;
                        if (mostSignificantBits == 0) {
                            mostSignificantBits = 1;
                        }
                        Long lValueOf = Long.valueOf(mostSignificantBits);
                        vtl vtlVarD = vxd.d(((tqw) obj2).d);
                        vtw vtwVarM = yzg.a.m();
                        if (!vtwVarM.b.A()) {
                            vtwVarM.u();
                        }
                        vuc vucVar = vtwVarM.b;
                        yzg yzgVar = (yzg) vucVar;
                        yzgVar.b |= 1;
                        yzgVar.c = 0;
                        if (!vucVar.A()) {
                            vtwVarM.u();
                        }
                        yzg yzgVar2 = (yzg) vtwVarM.b;
                        yzgVar2.f = 2;
                        yzgVar2.b |= 8;
                        lValueOf.getClass();
                        if (!vtwVarM.b.A()) {
                            vtwVarM.u();
                        }
                        vuc vucVar2 = vtwVarM.b;
                        yzg yzgVar3 = (yzg) vucVar2;
                        yzgVar3.b |= 4;
                        yzgVar3.e = mostSignificantBits;
                        if (vtlVarD != null) {
                            if (!vucVar2.A()) {
                                vtwVarM.u();
                            }
                            yzg yzgVar4 = (yzg) vtwVarM.b;
                            yzgVar4.d = vtlVarD;
                            yzgVar4.b |= 2;
                        }
                        yzg yzgVar5 = (yzg) vtwVarM.r();
                        rqd rqdVar = ((rru) obj).a;
                        rpz rpzVarA = rqa.a();
                        rpzVarA.d(true);
                        vtw vtwVarM2 = zba.a.m();
                        if (!vtwVarM2.b.A()) {
                            vtwVarM2.u();
                        }
                        zba zbaVar = (zba) vtwVarM2.b;
                        yzgVar5.getClass();
                        zbaVar.o = yzgVar5;
                        zbaVar.b |= 1048576;
                        rpzVarA.f((zba) vtwVarM2.r());
                        rpzVarA.b = null;
                        rqdVar.b(rpzVarA.a());
                    }
                }
            } catch (Exception e) {
                ((tug) ((tug) ((tug) rnb.a.g()).i(e)).j("com/google/android/libraries/performance/primes/metrics/cui/CuiMetricServiceImpl", "onApplicationStartup", R.styleable.AppCompatTheme_windowFixedHeightMinor, "CuiMetricServiceImpl.java")).s("Failed to end CUI.");
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
