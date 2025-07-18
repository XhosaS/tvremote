package defpackage;

import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pnd implements pjj {
    public final lia a;
    private final jzs b;

    public pnd(lia liaVar, jzs jzsVar) {
        this.a = liaVar;
        this.b = jzsVar;
    }

    @Override // defpackage.pjj
    public final /* bridge */ /* synthetic */ Set a() {
        return ImmutableSet.of(plk.class);
    }

    @Override // defpackage.pjj
    public final uhp b(pkg pkgVar) {
        final plk plkVar = (plk) pkgVar.a;
        pka pkaVarAq = qtl.aq(plkVar);
        vvd vvdVar = nbu.a;
        pkaVarAq.i(vvdVar);
        if (!pkaVarAq.l.m((vub) vvdVar.c)) {
            return uhl.a;
        }
        if (plkVar.e) {
            uhp uhpVarP = this.b.p(plkVar, false);
            lia liaVar = this.a;
            liaVar.getClass();
            return ufn.j(uhpVarP, new pbb(liaVar, 7), ugk.a);
        }
        pjy pjyVar = plkVar.c.a;
        vvd vvdVar2 = nbu.c;
        pjyVar.i(vvdVar2);
        Object objK = pjyVar.l.k((vub) vvdVar2.c);
        if (objK == null) {
            objK = vvdVar2.b;
        } else {
            vvdVar2.c(objK);
        }
        final ubx ubxVar = (ubx) objK;
        return ufn.j(this.b.p(plkVar, true), new ufw() { // from class: pnc
            @Override // defpackage.ufw
            public final uhp a(Object obj) {
                long j;
                uao uaoVar = (uao) obj;
                plk plkVar2 = plkVar;
                pjw pjwVar = plkVar2.c;
                int iD = pjwVar.d() - 1;
                int i = 3;
                if (iD == 3 || iD == 4) {
                    i = 2;
                } else if (iD != 31) {
                    i = 1;
                }
                pjy pjyVar2 = pjwVar.a;
                vvd vvdVar3 = nbu.c;
                pjyVar2.i(vvdVar3);
                Object objK2 = pjyVar2.l.k((vub) vvdVar3.c);
                if (objK2 == null) {
                    objK2 = vvdVar3.b;
                } else {
                    vvdVar3.c(objK2);
                }
                List list = plkVar2.b;
                ubx ubxVar2 = (ubx) objK2;
                ArrayList arrayList = new ArrayList(list.size());
                for (int i2 = 0; i2 < list.size(); i2++) {
                    pka pkaVar = (pka) list.get(i2);
                    if (i2 == 0) {
                        int iBm = a.bm(ubxVar2.d);
                        if (iBm == 0) {
                            iBm = 1;
                        }
                        int i3 = iBm - 1;
                        if (i3 == 1) {
                            arrayList.add(nsf.u(pkaVar, 110034).r());
                        } else if (i3 != 2) {
                            vvd vvdVar4 = ple.c;
                            pjyVar2.i(vvdVar4);
                            Object objK3 = pjyVar2.l.k((vub) vvdVar4.c);
                            if (objK3 == null) {
                                objK3 = vvdVar4.b;
                            } else {
                                vvdVar4.c(objK3);
                            }
                            int iBm2 = a.bm(((udh) objK3).c);
                            if (iBm2 == 0) {
                                iBm2 = 1;
                            }
                            ucy ucyVar = qtl.ar(plkVar2).d;
                            if (ucyVar == null) {
                                ucyVar = ucy.a;
                            }
                            if (ucyVar.d == 139332) {
                                int i4 = iBm2 - 1;
                                if (i4 == 1) {
                                    arrayList.add(nsf.u(pkaVar, 108217).r());
                                } else if (i4 != 2) {
                                    arrayList.add(nsf.t(pkaVar).r());
                                } else {
                                    arrayList.add(nsf.u(pkaVar, 109932).r());
                                }
                            } else {
                                ucy ucyVar2 = qtl.ar(plkVar2).d;
                                if (ucyVar2 == null) {
                                    ucyVar2 = ucy.a;
                                }
                                if (ucyVar2.d == 141583) {
                                    int i5 = iBm2 - 1;
                                    if (i5 == 1) {
                                        arrayList.add(nsf.u(pkaVar, 109934).r());
                                    } else if (i5 != 2) {
                                        arrayList.add(nsf.t(pkaVar).r());
                                    } else {
                                        arrayList.add(nsf.u(pkaVar, 109936).r());
                                    }
                                } else {
                                    ucy ucyVar3 = qtl.ar(plkVar2).d;
                                    if (ucyVar3 == null) {
                                        ucyVar3 = ucy.a;
                                    }
                                    if (ucyVar3.d == 141582) {
                                        int i6 = iBm2 - 1;
                                        if (i6 == 1) {
                                            arrayList.add(nsf.u(pkaVar, 109933).r());
                                        } else if (i6 != 2) {
                                            arrayList.add(nsf.t(pkaVar).r());
                                        } else {
                                            arrayList.add(nsf.u(pkaVar, 109935).r());
                                        }
                                    } else {
                                        arrayList.add(nsf.t(pkaVar).r());
                                    }
                                }
                            }
                        } else {
                            arrayList.add(nsf.u(pkaVar, 113888).r());
                        }
                    } else {
                        arrayList.add(nsf.t(pkaVar).r());
                    }
                }
                vtw vtwVarM = wil.a.m();
                vtwVarM.aG(arrayList);
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                wil wilVar = (wil) vtwVarM.b;
                wilVar.d = i - 1;
                wilVar.b = 2 | wilVar.b;
                wil wilVar2 = (wil) vtwVarM.r();
                pka pkaVarAq2 = qtl.aq(plkVar2);
                vvd vvdVar5 = nbu.a;
                pkaVarAq2.i(vvdVar5);
                Object objK4 = pkaVarAq2.l.k((vub) vvdVar5.c);
                if (objK4 == null) {
                    objK4 = vvdVar5.b;
                } else {
                    vvdVar5.c(objK4);
                }
                pnd pndVar = this.a;
                ubx ubxVar3 = ubxVar;
                long j2 = ((nbt) objK4).c;
                long j3 = ubxVar3.c;
                Long lValueOf = Long.valueOf(j3);
                lia liaVar2 = pndVar.a;
                vtw vtwVarN = kff.n(liaVar2.b, liaVar2.c);
                Long lValueOf2 = Long.valueOf(j2);
                Map map = liaVar2.d;
                lid lidVar = map.containsKey(lValueOf2) ? (lid) map.get(lValueOf2) : lid.a;
                if (liaVar2.g) {
                    lidVar = (lid) liaVar2.e.get(lValueOf2);
                }
                lid lidVarA = lid.a();
                lValueOf.getClass();
                if (j3 == 0) {
                    j = lidVarA.b;
                } else {
                    lValueOf.getClass();
                    j = j3;
                }
                liaVar2.f = j;
                liaVar2.g = true;
                Map map2 = liaVar2.e;
                if (!map2.containsKey(lValueOf2)) {
                    map2.put(lValueOf2, lidVarA);
                }
                map.put(lValueOf2, lidVarA);
                lhz lhzVar = liaVar2.a;
                if (!vtwVarN.b.A()) {
                    vtwVarN.u();
                }
                wjm wjmVar = (wjm) vtwVarN.b;
                wjm wjmVar2 = wjm.a;
                wilVar2.getClass();
                wjmVar.f = wilVar2;
                wjmVar.b |= 8;
                lValueOf.getClass();
                if (j3 == 0) {
                    j3 = lidVarA.b;
                } else {
                    lValueOf.getClass();
                }
                if (!vtwVarN.b.A()) {
                    vtwVarN.u();
                }
                vuc vucVar = vtwVarN.b;
                wjm wjmVar3 = (wjm) vucVar;
                wjmVar3.b |= 65536;
                wjmVar3.l = j3;
                long j4 = lidVar.b;
                if (!vucVar.A()) {
                    vtwVarN.u();
                }
                wjm wjmVar4 = (wjm) vtwVarN.b;
                wjmVar4.b |= 131072;
                wjmVar4.m = j4;
                lhzVar.c((wjm) vtwVarN.r(), uaoVar);
                return uhl.a;
            }
        }, ugk.a);
    }
}
