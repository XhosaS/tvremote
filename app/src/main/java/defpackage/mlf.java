package defpackage;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mlf extends dxv {

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    agow A;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    muw B;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    mlm C;

    @eau(a = eav.NONE)
    @eat(a = 6)
    List a;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    aggh b;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    ngd c;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    oaa d;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    oal e;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    oao f;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    oap r;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    String s;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    niv t;

    @eau(a = eav.NONE)
    @eat(a = 3)
    boolean u;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    oco v;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    ogq w;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    ogq x;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    ogq y;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    AtomicReference z;

    public mlf() {
        super("Collection");
    }

    public static dtu aA(dru druVar) {
        return o(mlf.class, "Collection", druVar, 1803022739, new Object[]{druVar});
    }

    private final mle aB(dru druVar) {
        dxo dxoVar = druVar.j;
        dxoVar.getClass();
        return (mle) dxoVar.c;
    }

    @Override // defpackage.drq
    protected final void E(dru druVar) {
        mle mleVarAB = aB(druVar);
        dxz dxzVar = new dxz();
        dxz dxzVar2 = new dxz();
        dxz dxzVar3 = new dxz();
        dxz dxzVar4 = new dxz();
        dxz dxzVar5 = new dxz();
        dxz dxzVar6 = new dxz();
        dxz dxzVar7 = new dxz();
        dxz dxzVar8 = new dxz();
        String str = this.s;
        agow agowVar = this.A;
        niv nivVar = this.t;
        ngd ngdVar = this.c;
        oal oalVar = this.e;
        oao oaoVar = this.f;
        aggh agghVar = this.b;
        String str2 = mll.a;
        eeo eeoVar = new eeo();
        ngdVar.A();
        dxzVar.a = eeoVar;
        dxzVar5.a = new mlk(ngdVar, druVar.a, eeoVar);
        dxzVar4.a = new AtomicBoolean(false);
        if (agowVar != null) {
            dxzVar2.a = (oes) agowVar.a();
        }
        dxzVar3.a = new AtomicBoolean(true);
        if (nivVar != null && nivVar.o()) {
            dxzVar6.a = new ohk();
        }
        mqw mqwVar = null;
        nzu nzuVarA = ngdVar.r() ? oaoVar.a(ngdVar.h(), oalVar, str) : null;
        if (nzuVarA != null) {
            dxzVar7.a = nzuVarA;
            agghVar.a(nzuVarA);
            if (((mqq) nzuVarA).b) {
                mqy mqyVar = ((mqv) oaoVar).b;
                oalVar.getClass();
                ngdVar.getClass();
                oaa oaaVar = (oaa) mqyVar.a.a();
                oaaVar.getClass();
                mqwVar = new mqw(new mqx(oalVar, nzuVarA, ngdVar, oaaVar, (agfx) mqyVar.b.a()));
            }
            if (mqwVar != null) {
                dxzVar8.a = mqwVar;
            }
        }
        aghb aghbVar = ((nyx) oalVar).f;
        if (aghbVar != null) {
            aghbVar.a(agghVar);
        }
        mleVarAB.d = (eeo) dxzVar.a;
        mleVarAB.f = (oes) dxzVar2.a;
        mleVarAB.g = (AtomicBoolean) dxzVar3.a;
        mleVarAB.e = (AtomicBoolean) dxzVar4.a;
        mleVarAB.c = (mlk) dxzVar5.a;
        mleVarAB.h = (ohk) dxzVar6.a;
        mleVarAB.a = (nzu) dxzVar7.a;
        mleVarAB.b = (ocr) dxzVar8.a;
    }

    @Override // defpackage.drq
    protected final void G(dru druVar) {
        mle mleVarAB = aB(druVar);
        String str = this.s;
        muw muwVar = this.B;
        eeo eeoVar = mleVarAB.d;
        AtomicBoolean atomicBoolean = mleVarAB.e;
        String str2 = mll.a;
        if (str != null && eeoVar != null) {
            eeo eeoVar2 = (eeo) muw.a.put(str, eeoVar);
            if (eeoVar2 != null) {
                muw.b.remove(eeoVar2.c());
            }
            actc actcVar = (actc) muw.c.remove(str);
            if (actcVar != null) {
                muwVar.c(actcVar, null, null);
            }
        }
        atomicBoolean.set(false);
    }

    @Override // defpackage.drq
    protected final void J(dru druVar) {
        mle mleVarAB = aB(druVar);
        String str = this.s;
        aggh agghVar = this.b;
        eeo eeoVar = mleVarAB.d;
        String str2 = mll.a;
        if (str != null) {
            Map map = muw.a;
            eeo eeoVar2 = (eeo) map.get(str);
            if (eeoVar2 != null && eeoVar2 == eeoVar) {
                map.remove(str);
                muw.b.remove(eeoVar2.c());
            }
        }
        agghVar.dispose();
    }

    @Override // defpackage.drq
    protected final void O(dxx dxxVar, dxx dxxVar2) {
        mle mleVar = (mle) dxxVar;
        mle mleVar2 = (mle) dxxVar2;
        mleVar2.a = mleVar.a;
        mleVar2.b = mleVar.b;
        mleVar2.c = mleVar.c;
        mleVar2.d = mleVar.d;
        mleVar2.e = mleVar.e;
        mleVar2.f = mleVar.f;
        mleVar2.g = mleVar.g;
        mleVar2.h = mleVar.h;
    }

    @Override // defpackage.drq
    protected final boolean Q() {
        return true;
    }

    @Override // defpackage.drq
    protected final boolean U() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018a  */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v59 */
    @Override // defpackage.dxv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final defpackage.drq ay(defpackage.dru r34) {
        /*
            Method dump skipped, instructions count: 1232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mlf.ay(dru):drq");
    }

    @Override // defpackage.drq
    protected final /* synthetic */ dxx u() {
        return new mle();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    @Override // defpackage.drq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final java.lang.Object y(defpackage.dtu r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mlf.y(dtu, java.lang.Object):java.lang.Object");
    }
}
