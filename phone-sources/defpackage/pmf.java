package defpackage;

import com.google.common.collect.ImmutableSet;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pmf implements pjj {
    public final plo a;
    public final pjo b;
    public boolean c = false;
    public boolean d = false;
    private final jzs e;

    public pmf(plo ploVar, pjo pjoVar, jzs jzsVar) {
        this.a = ploVar;
        this.b = pjoVar;
        this.e = jzsVar;
    }

    @Override // defpackage.pjj
    public final Set a() {
        return ImmutableSet.of(plk.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, uhp] */
    @Override // defpackage.pjj
    public final uhp b(final pkg pkgVar) {
        String strF;
        tst tstVarI;
        final plk plkVar = (plk) pkgVar.a;
        pka pkaVarAq = qtl.aq(plkVar);
        vvd vvdVar = pmh.a;
        pkaVarAq.i(vvdVar);
        vtr vtrVar = pkaVarAq.l;
        vub vubVar = (vub) vvdVar.c;
        if (vtrVar.m(vubVar)) {
            pka pkaVarAq2 = qtl.aq(plkVar);
            pkaVarAq2.i(vvdVar);
            Object objK = pkaVarAq2.l.k(vubVar);
            if (objK == null) {
                objK = vvdVar.b;
            } else {
                vvdVar.c(objK);
            }
            strF = ((pmg) objK).b;
        } else {
            strF = this.a.f(plkVar);
        }
        final String str = strF;
        if (str.isEmpty()) {
            return sfy.C(null);
        }
        plo ploVar = this.a;
        final nte nteVar = (nte) ploVar.c(plkVar).f();
        ?? r1 = pkgVar.b;
        final uhp uhpVarD = ploVar.d(plkVar, r1);
        final uhp uhpVarG = ploVar.g();
        final uhp uhpVarE = ploVar.e(plkVar, r1);
        uhp uhpVarQ = this.d ? this.e.q(plkVar, false, true) : this.e.p(plkVar, this.c);
        pka pkaVarAr = plkVar.e ? qtl.ar(plkVar) : qtl.aq(plkVar);
        vvd vvdVar2 = plz.a;
        pkaVarAr.i(vvdVar2);
        vtr vtrVar2 = pkaVarAr.l;
        vub vubVar2 = (vub) vvdVar2.c;
        if (vtrVar2.m(vubVar2)) {
            pkaVarAr.i(vvdVar2);
            Object objK2 = pkaVarAr.l.k(vubVar2);
            if (objK2 == null) {
                objK2 = vvdVar2.b;
            } else {
                vvdVar2.c(objK2);
            }
            tstVarI = tst.i(Integer.valueOf(((ply) objK2).b));
        } else {
            ploVar.a(plkVar);
            tstVarI = trk.a;
        }
        final tst tstVar = tstVarI;
        final uhp uhpVar = uhpVarQ;
        return sfy.P(uhpVarD, uhpVarQ, uhpVarG, uhpVarE).b(trc.b(new ufv() { // from class: pme
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, uhp] */
            @Override // defpackage.ufv
            public final uhp a() {
                tad tadVarA = pjn.a();
                tadVarA.e(str);
                tadVarA.e = nteVar;
                tadVarA.f((vvj) sfy.J(uhpVarD));
                tadVarA.b = (uao) sfy.J(uhpVar);
                tadVarA.h = (Integer) tstVar.f();
                tadVarA.f = (int[]) sfy.J(uhpVarG);
                pmf pmfVar = this.a;
                plo ploVar2 = pmfVar.a;
                plk plkVar2 = plkVar;
                ploVar2.h(plkVar2);
                tadVarA.g();
                ploVar2.b(plkVar2);
                int[] iArr = (int[]) sfy.J(uhpVarE);
                pka pkaVarAr2 = qtl.ar(plkVar2);
                vvd vvdVar3 = pnt.a;
                pkaVarAr2.i(vvdVar3);
                vtr vtrVar3 = pkaVarAr2.l;
                vub vubVar3 = (vub) vvdVar3.c;
                if (vtrVar3.m(vubVar3) || iArr != null) {
                    pka pkaVarAr3 = qtl.ar(plkVar2);
                    pkaVarAr3.i(vvdVar3);
                    Object objK3 = pkaVarAr3.l.k(vubVar3);
                    if (objK3 == null) {
                        objK3 = vvdVar3.b;
                    } else {
                        vvdVar3.c(objK3);
                    }
                    HashSet hashSet = new HashSet(((pns) objK3).b);
                    if (iArr != null) {
                        hashSet.addAll(sfy.ad(iArr));
                    }
                    tadVarA.c = sfy.ae(hashSet);
                }
                return pmfVar.b.b(tadVarA.d(), pkgVar.b);
            }
        }), ugk.a);
    }
}
