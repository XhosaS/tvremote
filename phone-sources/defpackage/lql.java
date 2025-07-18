package defpackage;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lql {
    public final lfn a;
    private final xpz b;
    private final yeu c;
    private final lpw d;
    private final long e;
    private final boolean f;
    private final kpy g;

    public lql(lfn lfnVar, xpz xpzVar, yeu yeuVar, lpw lpwVar, long j, boolean z, kpy kpyVar) {
        this.a = lfnVar;
        this.b = xpzVar;
        this.c = yeuVar;
        this.d = lpwVar;
        this.f = z;
        this.g = kpyVar;
        this.e = j;
    }

    public final ieg a(ieg iegVar, Object obj, xsq xsqVar, idf idfVar) {
        return !iegVar.m() ? ieg.b(new IllegalStateException("No account to authenticate!")) : c(iegVar, obj, xsqVar, idfVar);
    }

    public final ieg b(ksn ksnVar, Object obj, xsq xsqVar, idf idfVar) {
        return c(ieg.f(ksnVar), obj, xsqVar, idfVar);
    }

    public final ieg c(ieg iegVar, Object obj, xsq xsqVar, idf idfVar) {
        try {
            krd.e(String.format("Checking backoff for:\nMethod [%s]\nRequest [%s]", xsqVar, obj));
            this.d.a();
            try {
                xpy xpyVar = d(iegVar).b;
                xpy xpyVar2 = d(ieg.f(ksn.b("log"))).b;
                krd.e(String.format("Making Grpc request with:\nOptions [%s]\nMethod [%s]\nRequest [%s]", xpyVar2, xsqVar, obj));
                Object objA = yez.a(this.b, xsqVar, xpyVar, obj);
                krd.e(String.format("Outcome of Grpc request with:\nOptions [%s]\nMethod [%s]\nResponse: [%s]", xpyVar2, xsqVar, objA));
                kpy kpyVar = this.g;
                vdo vdoVar = (vdo) idfVar.b(objA);
                vtw vtwVarM = wjd.a.m();
                String str = vdoVar.d;
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                wjd wjdVar = (wjd) vtwVarM.b;
                str.getClass();
                vun vunVar = wjdVar.b;
                if (!vunVar.c()) {
                    wjdVar.b = vuc.s(vunVar);
                }
                wjdVar.b.add(str);
                wjd wjdVar2 = (wjd) vtwVarM.r();
                xbw xbwVar = kpyVar.a;
                lhz lhzVar = (lhz) xbwVar.b();
                vtw vtwVarAD = kpyVar.aD();
                if (!vtwVarAD.b.A()) {
                    vtwVarAD.u();
                }
                wjm wjmVar = (wjm) vtwVarAD.b;
                wjm wjmVar2 = wjm.a;
                wjdVar2.getClass();
                wjmVar.p = wjdVar2;
                wjmVar.b |= 524288;
                lhzVar.b((wjm) vtwVarAD.r());
                ((lhz) xbwVar.b()).a(mep.a);
                this.d.c();
                return ieg.f(objA);
            } catch (RuntimeException e) {
                if (e instanceof xtn) {
                    xtn xtnVar = (xtn) e;
                    if (xtnVar.a.n == xth.INTERNAL) {
                        krd.f(String.format("Backing off Grpc request on internal error. Error [%s].", xtnVar));
                        this.d.b();
                    }
                }
                krd.f(String.format("Error encountered in Grpc request to:\n Method [%s]\nError: [%s]", xsqVar, e));
                return krf.e(5, "Rpc call failed: ".concat(xsqVar.b), e);
            }
        } catch (InterruptedException e2) {
            krd.c("Backoff interrupted");
            return ieg.b(new RuntimeException("Backoff interrupted", e2));
        }
    }

    public final yeu d(ieg iegVar) {
        kqd kqdVar = new kqd(iegVar, 4);
        lfn lfnVar = this.a;
        String strBn = lfnVar.bn();
        String strBm = lfnVar.bm();
        yeu yeuVarK = this.c.M(urj.d, this.f ? uqg.SKIP_CACHE : uqg.DEFAULT_CACHE_OK_IF_VALID).K(this.e, TimeUnit.SECONDS);
        ieg iegVar2 = (ieg) kqdVar.a;
        yeu yeuVarM = iegVar2.m() ? yeuVarK.M(uqx.a, new uqx(((ksn) iegVar2.g()).a)) : yeuVarK.M(ush.c, new usg(strBm));
        return !TextUtils.isEmpty(strBn) ? yeuVarM.M(uqt.a, strBn) : yeuVarM;
    }

    public lql(lfn lfnVar, xpz xpzVar, yeu yeuVar, lpw lpwVar, kpy kpyVar) {
        this(lfnVar, xpzVar, yeuVar, lpwVar, lfnVar.aC(), lfnVar.dm(), kpyVar);
    }
}
