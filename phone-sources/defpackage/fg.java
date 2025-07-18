package defpackage;

import android.view.View;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fg implements yjk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, yow] */
    /* JADX WARN: Type inference failed for: r0v41, types: [bxu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [bxv, java.lang.Object] */
    @Override // defpackage.yjk
    public final Object a() {
        switch (this.b) {
            case 0:
                return fl.defaultViewModelProviderFactory_delegate$lambda$9((fl) this.a);
            case 1:
                return fl.fullyDrawnReporter_delegate$lambda$2((fl) this.a);
            case 2:
                return fl.onBackPressedDispatcher_delegate$lambda$13((fl) this.a);
            case 3:
                ?? r0 = ((fx) this.a).a;
                if (r0 != 0) {
                    r0.run();
                }
                return ygi.a;
            case 4:
                ((fv) this.a).g(true);
                return ygi.a;
            case 5:
                return Float.valueOf(og.f(this.a.c()));
            case 6:
                op opVar = (op) this.a;
                pf pfVar = opVar.c;
                opVar.d = pfVar != null ? pfVar.d() : 0L;
                return ygi.a;
            case 7:
                ((mz) this.a).d = false;
                return ygi.a;
            case 8:
                ((mz) this.a).d = false;
                return ygi.a;
            case 9:
                pf pfVar2 = (pf) this.a;
                return Boolean.valueOf(!yks.e(pfVar2.g(), pfVar2.f()) || pfVar2.z() || ((Boolean) pfVar2.b.a()).booleanValue());
            case 10:
                return Long.valueOf(((pf) this.a).a());
            case 11:
                ?? r02 = this.a;
                rn rnVar = (rn) fh.P(r02, rp.a);
                if (!(rnVar instanceof rs)) {
                    Objects.toString(rnVar);
                    wv.c("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. You can also use ComposeFoundationFlags.isNonComposedClickableEnabled to temporarily opt-out; note that this flag will be removed in a future release and is only intended to be a temporary migration aid. The Indication instance provided here was: ".concat(String.valueOf(rnVar)));
                }
                qg qgVar = (qg) r02;
                rs rsVar = qgVar.c;
                qgVar.c = (rs) rnVar;
                if (rsVar != null && !yks.e(qgVar.c, rsVar)) {
                    qgVar.o();
                }
                return ygi.a;
            case 12:
                ((qg) this.a).b.a();
                return true;
            case 13:
                yjk yjkVar = ((qz) this.a).j;
                if (yjkVar != null) {
                    yjkVar.a();
                }
                return true;
            case 14:
                ?? r03 = this.a;
                rt rtVar = (rt) r03;
                clx clxVarL = rtVar.d;
                if (clxVarL == null) {
                    clxVarL = fh.L(r03);
                    rtVar.d = clxVarL;
                }
                long j = ((bmx) rtVar.a.a(clxVarL)).a;
                if ((j & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & rtVar.e()) == 9205357640488583168L) {
                    rtVar.f = 9205357640488583168L;
                    se seVar = rtVar.h;
                    if (seVar != null) {
                        seVar.b();
                    }
                } else {
                    rtVar.f = a.D(rtVar.e(), j);
                    if (rtVar.h == null) {
                        View viewE = rtVar.c;
                        if (viewE == null) {
                            viewE = fh.E(r03);
                        }
                        rtVar.c = viewE;
                        clx clxVarL2 = rtVar.d;
                        if (clxVarL2 == null) {
                            clxVarL2 = fh.L(r03);
                        }
                        rtVar.d = clxVarL2;
                        rtVar.h = rtVar.b.a(viewE);
                        rtVar.h();
                    }
                    se seVar2 = rtVar.h;
                    if (seVar2 != null) {
                        seVar2.c(rtVar.f);
                    }
                    rtVar.h();
                }
                return ygi.a;
            case 15:
                return new bmx(((rt) this.a).f);
            case 16:
                bvc bvcVar = (bvc) ((rt) this.a).e.a();
                return new bmx(bvcVar != null ? bty.q(bvcVar) : 9205357640488583168L);
            case 17:
                return Float.valueOf(((si) this.a).a.c());
            case 18:
                return Float.valueOf(((si) this.a).a.b());
            case 19:
                sj sjVar = (sj) this.a;
                return Boolean.valueOf(sjVar.c() < sjVar.b());
            default:
                return Boolean.valueOf(((sj) this.a).c() > 0);
        }
    }
}
