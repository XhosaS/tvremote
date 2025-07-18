package defpackage;

import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lsl implements idf {
    private final /* synthetic */ int a;

    public /* synthetic */ lsl(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.idf
    public final Object b(Object obj) {
        int iR;
        Object objI;
        Object objI2;
        int i = 6;
        int i2 = 12;
        switch (this.a) {
            case 0:
                vdo vdoVar = ((vzu) obj).b;
                return vdoVar == null ? vdo.a : vdoVar;
            case 1:
                return ieg.f(new lsh(FluentIterable.from(((vzu) obj).c).transform(new lpn(i2)).toList()));
            case 2:
                vzu vzuVar = (vzu) obj;
                vdo vdoVar2 = vzuVar.b;
                if (vdoVar2 == null) {
                    vdoVar2 = vdo.a;
                }
                vbr vbrVar = vdoVar2.b;
                if (vbrVar == null) {
                    vbrVar = vbr.a;
                }
                vwe vweVar = vbrVar.b;
                if (vweVar == null) {
                    vweVar = vwe.a;
                }
                return ieg.f(new lsk(ImmutableList.copyOf((Collection) vzuVar.c), vweVar.b));
            case 3:
                lbl lblVar = (lbl) obj;
                vtw vtwVarM = kzw.a.m();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                kzw kzwVar = (kzw) vtwVarM.b;
                lblVar.getClass();
                kzwVar.c = lblVar;
                kzwVar.b = 1;
                return (kzw) vtwVarM.r();
            case 4:
                lbr lbrVar = (lbr) obj;
                vtw vtwVarM2 = kzw.a.m();
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                kzw kzwVar2 = (kzw) vtwVarM2.b;
                lbrVar.getClass();
                kzwVar2.c = lbrVar;
                kzwVar2.b = 5;
                return (kzw) vtwVarM2.r();
            case 5:
                lcg lcgVar = (lcg) obj;
                vtw vtwVarM3 = kzw.a.m();
                if (!vtwVarM3.b.A()) {
                    vtwVarM3.u();
                }
                kzw kzwVar3 = (kzw) vtwVarM3.b;
                lcgVar.getClass();
                kzwVar3.c = lcgVar;
                kzwVar3.b = 2;
                return (kzw) vtwVarM3.r();
            case 6:
                lcd lcdVar = (lcd) obj;
                vtw vtwVarM4 = kzw.a.m();
                if (!vtwVarM4.b.A()) {
                    vtwVarM4.u();
                }
                kzw kzwVar4 = (kzw) vtwVarM4.b;
                lcdVar.getClass();
                kzwVar4.c = lcdVar;
                kzwVar4.b = 3;
                return (kzw) vtwVarM4.r();
            case 7:
                lau lauVar = (lau) obj;
                vtw vtwVarM5 = kzw.a.m();
                if (!vtwVarM5.b.A()) {
                    vtwVarM5.u();
                }
                kzw kzwVar5 = (kzw) vtwVarM5.b;
                lauVar.getClass();
                kzwVar5.c = lauVar;
                kzwVar5.b = 4;
                return (kzw) vtwVarM5.r();
            case 8:
                laq laqVar = (laq) obj;
                vtw vtwVarM6 = kzw.a.m();
                if (!vtwVarM6.b.A()) {
                    vtwVarM6.u();
                }
                kzw kzwVar6 = (kzw) vtwVarM6.b;
                laqVar.getClass();
                kzwVar6.c = laqVar;
                kzwVar6.b = 6;
                return (kzw) vtwVarM6.r();
            case 9:
                kzi kziVar = (kzi) obj;
                vtw vtwVarM7 = kzw.a.m();
                if (!vtwVarM7.b.A()) {
                    vtwVarM7.u();
                }
                kzw kzwVar7 = (kzw) vtwVarM7.b;
                kziVar.getClass();
                kzwVar7.c = kziVar;
                kzwVar7.b = 10;
                return (kzw) vtwVarM7.r();
            case 10:
                lbe lbeVar = (lbe) obj;
                vtw vtwVarM8 = kzw.a.m();
                if (!vtwVarM8.b.A()) {
                    vtwVarM8.u();
                }
                kzw kzwVar8 = (kzw) vtwVarM8.b;
                lbeVar.getClass();
                kzwVar8.c = lbeVar;
                kzwVar8.b = 13;
                return (kzw) vtwVarM8.r();
            case 11:
                vdo vdoVar3 = ((vby) obj).b;
                return vdoVar3 == null ? vdo.a : vdoVar3;
            case 12:
                return nwo.i(obj);
            case 13:
                for (wca wcaVar : ((wby) obj).c) {
                    int i3 = wcaVar.b;
                    if (wcq.c(i3) == 4) {
                        return ieg.f(new lub(FluentIterable.from((i3 == 3 ? (wci) wcaVar.c : wci.a).b).transform(new lsq(i)).filter(new lsp(11)).toList()));
                    }
                }
                return ieg.b(new RuntimeException("Response doesn't contain user setting"));
            case 14:
                return nwo.i(obj);
            case 15:
                return nwo.i(obj);
            case 16:
                for (wca wcaVar2 : ((wby) obj).c) {
                    int i4 = wcaVar2.b;
                    if (wcq.c(i4) == 5) {
                        vun vunVar = (i4 == 4 ? (wbi) wcaVar2.c : wbi.a).c;
                        ImmutableList.Builder builder = ImmutableList.builder();
                        Iterator<E> it = vunVar.iterator();
                        while (it.hasNext()) {
                            vay vayVar = ((vat) it.next()).d;
                            if (vayVar == null) {
                                vayVar = vay.a;
                            }
                            for (vau vauVar : (vayVar.b == 5 ? (vav) vayVar.c : vav.a).b) {
                                val valVar = vauVar.b;
                                if (valVar == null) {
                                    valVar = val.a;
                                }
                                ksy ksyVarM = kgu.m(valVar);
                                Iterator<E> it2 = vauVar.c.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        vaj vajVar = (vaj) it2.next();
                                        int i5 = vajVar.b;
                                        if (vef.c(i5) == 12) {
                                            iR = kgu.r(i5 == 13 ? (vdq) vajVar.c : vdq.a);
                                        }
                                    } else {
                                        iR = 3;
                                    }
                                }
                                builder.add((ImmutableList.Builder) new kxe(ksyVarM, iR, -1L, false));
                            }
                        }
                        return ieg.f(new luf(builder.build(), trk.a));
                    }
                }
                return ieg.a;
            case 17:
                return nwo.i(obj);
            case 18:
                wca wcaVar3 = (wca) ((wby) obj).c.get(0);
                wbi wbiVar = wcaVar3.b == 5 ? (wbi) wcaVar3.c : wbi.a;
                int i6 = wbiVar.b;
                int iAQ = a.aQ(i6);
                if (iAQ == 0 || iAQ != 4) {
                    return ieg.b(new IllegalStateException("Unexpected status: ".concat(Integer.toString((a.aQ(i6) != 0 ? r1 : 1) - 2))));
                }
                HashMap map = new HashMap();
                vay vayVar2 = ((vat) wbiVar.c.get(0)).d;
                if (vayVar2 == null) {
                    vayVar2 = vay.a;
                }
                for (vau vauVar2 : (vayVar2.b == 5 ? (vav) vayVar2.c : vav.a).b) {
                    tst tstVarFirst = FluentIterable.from(vauVar2.c).filter(new lsp(i2)).transform(new lsq(9)).first();
                    if (tstVarFirst.g()) {
                        val valVar2 = vauVar2.b;
                        if (valVar2 == null) {
                            valVar2 = val.a;
                        }
                        ksy ksyVarM2 = kgu.m(valVar2);
                        kvw kvwVar = new kvw((byte[]) null);
                        vdz vdzVar = (vdz) tstVarFirst.c();
                        vtl vtlVar = (vdzVar.c == 1 ? (vdx) vdzVar.d : vdx.a).c;
                        if (vtlVar == null) {
                            vtlVar = vtl.a;
                        }
                        kvwVar.b(vtlVar);
                        vdz vdzVar2 = (vdz) tstVarFirst.c();
                        int i7 = vdzVar2.c;
                        if (((i7 == 1 ? (vdx) vdzVar2.d : vdx.a).b & 2) != 0) {
                            vwe vweVar2 = (i7 == 1 ? (vdx) vdzVar2.d : vdx.a).d;
                            if (vweVar2 == null) {
                                vweVar2 = vwe.a;
                            }
                            objI = tst.i(vweVar2);
                        } else {
                            objI = trk.a;
                        }
                        kvwVar.b = objI;
                        vdz vdzVar3 = (vdz) tstVarFirst.c();
                        if ((vdzVar3.b & 2) != 0) {
                            vwe vweVar3 = vdzVar3.e;
                            if (vweVar3 == null) {
                                vweVar3 = vwe.a;
                            }
                            objI2 = tst.i(vweVar3);
                        } else {
                            objI2 = trk.a;
                        }
                        kvwVar.c = objI2;
                        map.put(ksyVarM2, kvwVar.a());
                    }
                }
                return ieg.f(new lts(ImmutableMap.copyOf((Map) map)));
            case 19:
                return nwo.i(obj);
            default:
                for (wca wcaVar4 : ((wby) obj).c) {
                    int i8 = wcaVar4.b;
                    if (wcq.c(i8) == 7) {
                        wbi wbiVar2 = i8 == 6 ? (wbi) wcaVar4.c : wbi.a;
                        String str = wbiVar2.d;
                        vun vunVar2 = wbiVar2.c;
                        ImmutableList.Builder builder2 = ImmutableList.builder();
                        Iterator<E> it3 = vunVar2.iterator();
                        while (it3.hasNext()) {
                            vay vayVar3 = ((vat) it3.next()).d;
                            if (vayVar3 == null) {
                                vayVar3 = vay.a;
                            }
                            Iterator<E> it4 = (vayVar3.b == 5 ? (vav) vayVar3.c : vav.a).b.iterator();
                            while (it4.hasNext()) {
                                val valVar3 = ((vau) it4.next()).b;
                                if (valVar3 == null) {
                                    valVar3 = val.a;
                                }
                                builder2.add((ImmutableList.Builder) kgu.m(valVar3));
                            }
                        }
                        return ieg.f(new lul(str, builder2.build()));
                    }
                }
                return ieg.a;
        }
    }
}
