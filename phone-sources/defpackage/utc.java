package defpackage;

import android.os.SystemClock;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class utc implements xqc {
    private final /* synthetic */ int a;
    private final Object b;

    public utc(ttm ttmVar, int i) {
        this.a = i;
        this.b = ttmVar;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.xqc
    public final xqb a(xsq xsqVar, xpy xpyVar, xpz xpzVar) {
        tst tstVarH;
        loy loyVar;
        urz urzVarA;
        owt owtVar;
        if (this.a != 0) {
            if (!((Boolean) this.b.get()).booleanValue()) {
                return xpzVar.a(xsqVar, xpyVar);
            }
            rmp rmpVar = (rmp) xpyVar.g(owm.a);
            if (rmpVar == null) {
                owtVar = new owt(new rtg(null, "https://" + xpzVar.b() + "/" + xsqVar.b, false, SystemClock.elapsedRealtime()));
            } else {
                owtVar = new owt(rtg.a(xpzVar.b(), rmpVar));
            }
            return new owr(xpzVar.a(xsqVar, xpyVar.i(owtVar)), owtVar);
        }
        uqh uqhVar = (uqh) xpyVar.g(uqi.a);
        uqq uqqVar = uqhVar.g;
        xpx xpxVar = uqr.a;
        if (((uqr) xpyVar.g(xpxVar)).e() == 2) {
            String str = (String) xpyVar.g(uqt.a);
            if (str == null) {
                str = ((uqr) xpyVar.g(xpxVar)).b().b().a;
            }
            uqx uqxVar = (uqx) xpyVar.g(uqx.a);
            String str2 = xsqVar.b;
            utb utbVar = new utb(str, uqxVar, str2);
            ?? r6 = this.b;
            synchronized (r6) {
                tstVarH = (tst) r6.get(utbVar);
                if (tstVarH == null) {
                    str.getClass();
                    loy loyVar2 = loy.a;
                    if (!((Boolean) xni.a.et(((xni) ((loz) uqqVar).b).d)).booleanValue() || (loyVar = (loy) ((loz) uqqVar).a.get(str2)) == null) {
                        loyVar = loyVar2;
                    }
                    if (ylh.ac(str2, "wireless.android.tv.gtvm.GoogleTvMobileFrontendService") && !((loz) uqqVar).a.containsKey(str2)) {
                        loyVar = loy.c;
                    }
                    if (loyVar == loyVar2) {
                        krd.e("xrpc persistent mapping entry for ".concat(str2));
                        urzVarA = ((loz) uqqVar).c.a(str, xsqVar, uqxVar);
                    } else if (loyVar == loy.b) {
                        krd.e("xrpc memory mapping entry for ".concat(str2));
                        urzVarA = ((loz) uqqVar).d.a(str, xsqVar, uqxVar);
                    } else {
                        krd.e("xrpc skip cache for ".concat(str2));
                        urzVarA = null;
                    }
                    tstVarH = tst.h(urzVarA);
                    r6.put(utbVar, tstVarH);
                }
            }
            if (tstVarH.g()) {
                tvn tvnVar = urj.a;
                uri uriVar = new uri();
                uriVar.a = (urz) tstVarH.c();
                uriVar.b = uqhVar.d;
                uriVar.a.getClass();
                uriVar.b.getClass();
                return sij.ad(new lii(new urj(uriVar), 18)).a(xsqVar, xpyVar, xpzVar);
            }
        }
        return xpzVar.a(xsqVar, xpyVar);
    }

    public utc(int i) {
        this.a = i;
        this.b = new HashMap();
    }
}
