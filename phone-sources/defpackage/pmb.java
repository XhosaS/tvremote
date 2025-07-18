package defpackage;

import com.google.common.collect.ImmutableSet;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pmb implements pjj {
    public final plo a;
    public final pjo b;
    public boolean c = false;
    private final ntp d;

    public pmb(plo ploVar, pjo pjoVar, ntp ntpVar) {
        this.a = ploVar;
        this.b = pjoVar;
        this.d = ntpVar;
    }

    @Override // defpackage.pjj
    public final Set a() {
        return ImmutableSet.of(plj.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, uhp] */
    @Override // defpackage.pjj
    public final uhp b(final pkg pkgVar) {
        String strF;
        tst tstVarI;
        uhp uhpVarB;
        tql tqlVarQ = szg.q("GIL:NVLGraftHandler");
        try {
            final plj pljVar = (plj) pkgVar.a;
            pka pkaVarAq = qtl.aq(pljVar);
            vvd vvdVar = pmh.a;
            pkaVarAq.i(vvdVar);
            vtr vtrVar = pkaVarAq.l;
            Object obj = vvdVar.c;
            if (vtrVar.m((vub) obj)) {
                pka pkaVarAq2 = qtl.aq(pljVar);
                pkaVarAq2.i(vvdVar);
                Object objK = pkaVarAq2.l.k((vub) obj);
                if (objK == null) {
                    objK = vvdVar.b;
                } else {
                    vvdVar.c(objK);
                }
                strF = ((pmg) objK).b;
            } else {
                strF = this.a.f(pljVar);
            }
            final String str = strF;
            if (str.isEmpty()) {
                uhpVarB = sfy.C(null);
            } else {
                plo ploVar = this.a;
                final nte nteVar = (nte) ploVar.c(pljVar).f();
                final HashSet hashSet = new HashSet();
                for (pka pkaVar : pljVar.c) {
                    vvd vvdVar2 = pnt.a;
                    pkaVar.i(vvdVar2);
                    vtr vtrVar2 = pkaVar.l;
                    Object obj2 = vvdVar2.c;
                    if (vtrVar2.m((vub) obj2)) {
                        pkaVar.i(vvdVar2);
                        Object objK2 = pkaVar.l.k((vub) obj2);
                        if (objK2 == null) {
                            objK2 = vvdVar2.b;
                        } else {
                            vvdVar2.c(objK2);
                        }
                        hashSet.addAll(((pns) objK2).b);
                    }
                }
                ?? r2 = pkgVar.b;
                final uhp uhpVarD = ploVar.d(pljVar, r2);
                final uhp uhpVarG = ploVar.g();
                final uhp uhpVarE = ploVar.e(pljVar, r2);
                pka pkaVarAq3 = qtl.aq(pljVar);
                vvd vvdVar3 = plz.a;
                pkaVarAq3.i(vvdVar3);
                vtr vtrVar3 = pkaVarAq3.l;
                Object obj3 = vvdVar3.c;
                if (vtrVar3.m((vub) obj3)) {
                    pka pkaVarAq4 = qtl.aq(pljVar);
                    pkaVarAq4.i(vvdVar3);
                    Object objK3 = pkaVarAq4.l.k((vub) obj3);
                    if (objK3 == null) {
                        objK3 = vvdVar3.b;
                    } else {
                        vvdVar3.c(objK3);
                    }
                    tstVarI = tst.i(Integer.valueOf(((ply) objK3).b));
                } else {
                    ploVar.a(pljVar);
                    tstVarI = trk.a;
                }
                final tst tstVar = tstVarI;
                final uhp uhpVarQ = this.d.q(pljVar, this.c);
                uhpVarB = sfy.P(uhpVarD, uhpVarG, uhpVarE, uhpVarQ).b(trc.b(new ufv() { // from class: pma
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, uhp] */
                    @Override // defpackage.ufv
                    public final uhp a() {
                        int[] iArr = (int[]) sfy.J(uhpVarE);
                        Set set = hashSet;
                        pkg pkgVar2 = pkgVar;
                        if (iArr != null) {
                            set.addAll(sfy.ad(iArr));
                        }
                        plj pljVar2 = pljVar;
                        uhp uhpVar = uhpVarG;
                        tst tstVar2 = tstVar;
                        uhp uhpVar2 = uhpVarQ;
                        uhp uhpVar3 = uhpVarD;
                        nte nteVar2 = nteVar;
                        String str2 = str;
                        pmb pmbVar = this.a;
                        tad tadVarA = pjn.a();
                        tadVarA.e(str2);
                        tadVarA.e = nteVar2;
                        tadVarA.f((vvj) sfy.J(uhpVar3));
                        tadVarA.b = (uao) sfy.J(uhpVar2);
                        tadVarA.h = (Integer) tstVar2.f();
                        tadVarA.f = (int[]) sfy.J(uhpVar);
                        plo ploVar2 = pmbVar.a;
                        ploVar2.h(pljVar2);
                        tadVarA.g();
                        ploVar2.b(pljVar2);
                        if (!set.isEmpty()) {
                            tadVarA.c = sfy.ae(set);
                        }
                        tql tqlVarQ2 = szg.q("GIL:ClearcutTransmitter");
                        try {
                            uhp uhpVarB2 = pmbVar.b.b(tadVarA.d(), pkgVar2.b);
                            tqlVarQ2.a(uhpVarB2);
                            tqlVarQ2.close();
                            return uhpVarB2;
                        } catch (Throwable th) {
                            try {
                                tqlVarQ2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }), ugk.a);
                tqlVarQ.a(uhpVarB);
            }
            tqlVarQ.close();
            return uhpVarB;
        } catch (Throwable th) {
            try {
                tqlVarQ.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
