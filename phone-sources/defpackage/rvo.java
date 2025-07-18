package defpackage;

import android.content.Context;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class rvo implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ rvo(chc chcVar, cmi cmiVar, List list, cfy cfyVar, clx clxVar, esn esnVar, int i) {
        this.g = i;
        this.a = chcVar;
        this.d = cmiVar;
        this.f = list;
        this.b = cfyVar;
        this.c = clxVar;
        this.e = esnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [rvq] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, xbw] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [clx, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.g == 0) {
            Context context = (Context) this.b;
            boolean zG = osx.g(context);
            ?? r2 = this.c;
            Object obj = this.a;
            if (zG) {
                ((rvq) obj).a(r2);
            } else {
                osx.c(context, new rvp(obj, (Object) r2, this.d, 0));
            }
            rvq rvqVar = (rvq) obj;
            if (rvqVar.b) {
                ?? r0 = this.f;
                Object obj2 = this.e;
                if (r0 == 0) {
                    vtw vtwVarM = zah.a.m();
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    zah zahVar = (zah) vtwVarM.b;
                    zahVar.d = 2;
                    zahVar.b |= 4;
                    rvqVar.a = ((rvt) obj2).a((zah) vtwVarM.r());
                    return;
                }
                try {
                    ((rvq) obj).a = ((rvt) obj2).a((zah) r0.b());
                    return;
                } catch (Throwable th) {
                    ((tug) ((tug) ((tug) rnb.a.g()).i(th)).j("com/google/android/libraries/performance/primes/sampling/Sampler", "fetchSamplingParameters", (char) 128, "Sampler.java")).s("Couldn't get sampling strategy");
                    vtw vtwVarM2 = zah.a.m();
                    if (!vtwVarM2.b.A()) {
                        vtwVarM2.u();
                    }
                    vuc vucVar = vtwVarM2.b;
                    zah zahVar2 = (zah) vucVar;
                    zahVar2.b = 2 | zahVar2.b;
                    zahVar2.c = 1L;
                    if (!vucVar.A()) {
                        vtwVarM2.u();
                    }
                    zah zahVar3 = (zah) vtwVarM2.b;
                    zahVar3.d = 3;
                    zahVar3.b |= 4;
                    rvqVar.a = ((rvt) obj2).a((zah) vtwVarM2.r());
                    return;
                }
            }
            return;
        }
        Trace.beginSection("BackgroundTextMeasurement");
        Object obj3 = this.e;
        ?? r5 = this.c;
        Object obj4 = this.b;
        Object obj5 = this.d;
        Object obj6 = this.a;
        try {
            bin binVarB = bcm.B(null, null);
            try {
                bit bitVarW = binVarB.w();
                try {
                    chc chcVarM = ccf.M((chc) obj6, (cmi) obj5);
                    Object obj7 = this.f;
                    Object obj8 = obj7;
                    if (obj7 == null) {
                        obj8 = yhb.a;
                    }
                    new cgi((cfy) obj4, chcVarM, obj8, r5, (esn) obj3).a();
                    binVarB.c().a();
                } finally {
                    bit.E(bitVarW);
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    public /* synthetic */ rvo(rvq rvqVar, Context context, xbw xbwVar, Executor executor, rvt rvtVar, yfo yfoVar, int i) {
        this.g = i;
        this.a = rvqVar;
        this.b = context;
        this.c = xbwVar;
        this.d = executor;
        this.e = rvtVar;
        this.f = yfoVar;
    }
}
