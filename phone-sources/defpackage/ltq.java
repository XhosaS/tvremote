package defpackage;

import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import j$.util.DesugarCollections;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ltq implements idf {
    private final lql a;
    private final lfn b;
    private final ltp c;
    private final moz d;

    public ltq(lql lqlVar, moz mozVar, ltp ltpVar, lfn lfnVar) {
        this.a = lqlVar;
        this.d = mozVar;
        this.c = ltpVar;
        this.b = lfnVar;
    }

    @Override // defpackage.idf
    public final /* synthetic */ Object b(Object obj) {
        int i;
        String str;
        ksn ksnVar = ((lty) obj).a;
        vdn vdnVarC = this.d.c(ksnVar);
        vtw vtwVarM = wbj.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wbj wbjVar = (wbj) vtwVarM.b;
        vdnVarC.getClass();
        wbjVar.c = vdnVarC;
        wbjVar.b |= 1;
        wbx wbxVar = wbx.a;
        vtw vtwVarM2 = wbxVar.m();
        wbm wbmVar = wbm.a;
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        wbx wbxVar2 = (wbx) vtwVarM2.b;
        wbmVar.getClass();
        wbxVar2.c = wbmVar;
        int i2 = 8;
        wbxVar2.b = 8;
        vtwVarM.bG(vtwVarM2);
        vtw vtwVarM3 = wbxVar.m();
        wbk wbkVar = wbk.a;
        if (!vtwVarM3.b.A()) {
            vtwVarM3.u();
        }
        wbx wbxVar3 = (wbx) vtwVarM3.b;
        wbkVar.getClass();
        wbxVar3.c = wbkVar;
        wbxVar3.b = 1;
        vtwVarM.bG(vtwVarM3);
        vtw vtwVarM4 = wbxVar.m();
        wbl wblVar = wbl.a;
        if (!vtwVarM4.b.A()) {
            vtwVarM4.u();
        }
        wbx wbxVar4 = (wbx) vtwVarM4.b;
        wblVar.getClass();
        wbxVar4.c = wblVar;
        int i3 = 7;
        wbxVar4.b = 7;
        vtwVarM.bG(vtwVarM4);
        vtw vtwVarM5 = wbxVar.m();
        wbp wbpVar = wbp.a;
        if (!vtwVarM5.b.A()) {
            vtwVarM5.u();
        }
        wbx wbxVar5 = (wbx) vtwVarM5.b;
        wbpVar.getClass();
        wbxVar5.c = wbpVar;
        wbxVar5.b = 10;
        vtwVarM.bG(vtwVarM5);
        vtw vtwVarM6 = wbxVar.m();
        wbt wbtVar = wbt.a;
        if (!vtwVarM6.b.A()) {
            vtwVarM6.u();
        }
        wbx wbxVar6 = (wbx) vtwVarM6.b;
        wbtVar.getClass();
        wbxVar6.c = wbtVar;
        int i4 = 11;
        wbxVar6.b = 11;
        vtwVarM.bG(vtwVarM6);
        vtw vtwVarM7 = wbxVar.m();
        wbq wbqVar = wbq.a;
        if (!vtwVarM7.b.A()) {
            vtwVarM7.u();
        }
        wbx wbxVar7 = (wbx) vtwVarM7.b;
        wbqVar.getClass();
        wbxVar7.c = wbqVar;
        wbxVar7.b = 12;
        vtwVarM.bG(vtwVarM7);
        ieg iegVarB = this.a.b(ksnVar, (wbj) vtwVarM.r(), wcq.a(), new lsl(14));
        if (iegVarB.k()) {
            iegVarB.p();
            return iegVarB;
        }
        vtw vtwVarM8 = lcs.a.m();
        for (wca wcaVar : ((wby) iegVarB.g()).c) {
            int i5 = wcaVar.b;
            int iC = wcq.c(i5);
            if (iC == 0) {
                throw null;
            }
            int i6 = iC - 1;
            if (i6 != 0) {
                if (i6 == 13) {
                    i = i2;
                    int i7 = (i5 == 15 ? (wcb) wcaVar.c : wcb.a).b;
                    if (!vtwVarM8.b.A()) {
                        vtwVarM8.u();
                    }
                    ((lcs) vtwVarM8.b).j = i7;
                } else if (i6 != i3) {
                    str = "";
                    if (i6 == i2) {
                        str = i5 == i2 ? (String) wcaVar.c : "";
                        if (!vtwVarM8.b.A()) {
                            vtwVarM8.u();
                        }
                        lcs lcsVar = (lcs) vtwVarM8.b;
                        str.getClass();
                        lcsVar.c = str;
                    } else if (i6 == 10) {
                        wbf wbfVar = i5 == 10 ? (wbf) wcaVar.c : wbf.a;
                        vtw vtwVarM9 = lba.a.m();
                        int iAK = a.aK(wbfVar.b);
                        if (iAK == 0) {
                            iAK = 1;
                        }
                        int i8 = iAK - 2;
                        int i9 = i8 != 2 ? i8 != 3 ? i8 != 4 ? 2 : 5 : 4 : 3;
                        vtw vtwVarM10 = lbc.a.m();
                        if (!vtwVarM10.b.A()) {
                            vtwVarM10.u();
                        }
                        ((lbc) vtwVarM10.b).b = a.aG(i9);
                        vwe vweVar = wbfVar.d;
                        if (vweVar == null) {
                            vweVar = vwe.a;
                        }
                        long jB = vxf.b(vweVar);
                        if (!vtwVarM10.b.A()) {
                            vtwVarM10.u();
                        }
                        ((lbc) vtwVarM10.b).c = jB;
                        lbc lbcVar = (lbc) vtwVarM10.r();
                        if (!vtwVarM9.b.A()) {
                            vtwVarM9.u();
                        }
                        lba lbaVar = (lba) vtwVarM9.b;
                        lbcVar.getClass();
                        lbaVar.d = lbcVar;
                        lbaVar.b |= 2;
                        int iAs = a.as(wbfVar.c);
                        if (iAs == 0) {
                            iAs = 1;
                        }
                        int i10 = iAs - 2;
                        int i11 = i10 != 1 ? i10 != 2 ? 2 : 4 : 3;
                        vtw vtwVarM11 = lbb.a.m();
                        if (!vtwVarM11.b.A()) {
                            vtwVarM11.u();
                        }
                        ((lbb) vtwVarM11.b).b = a.aF(i11);
                        lbb lbbVar = (lbb) vtwVarM11.r();
                        if (!vtwVarM9.b.A()) {
                            vtwVarM9.u();
                        }
                        lba lbaVar2 = (lba) vtwVarM9.b;
                        lbbVar.getClass();
                        lbaVar2.c = lbbVar;
                        lbaVar2.b |= 1;
                        lba lbaVar3 = (lba) vtwVarM9.r();
                        if (!vtwVarM8.b.A()) {
                            vtwVarM8.u();
                        }
                        lcs lcsVar2 = (lcs) vtwVarM8.b;
                        lbaVar3.getClass();
                        lcsVar2.g = lbaVar3;
                        lcsVar2.b |= 1;
                    } else if (i6 == i4) {
                        wbg wbgVar = i5 == i4 ? (wbg) wcaVar.c : wbg.a;
                        String str2 = "";
                        for (vbh vbhVar : wbgVar.c) {
                            Iterator<T> it = new vul(vbhVar.e, vbh.a).iterator();
                            while (it.hasNext()) {
                                int iOrdinal = ((vak) it.next()).ordinal();
                                if (iOrdinal == 1) {
                                    vbi vbiVar = vbhVar.d;
                                    if (vbiVar == null) {
                                        vbiVar = vbi.a;
                                    }
                                    str = vbiVar.b;
                                } else if (iOrdinal == 3) {
                                    vbi vbiVar2 = vbhVar.d;
                                    if (vbiVar2 == null) {
                                        vbiVar2 = vbi.a;
                                    }
                                    str2 = vbiVar2.b;
                                }
                            }
                        }
                        int iAs2 = a.as(wbgVar.b);
                        boolean z = false;
                        if (iAs2 != 0 && iAs2 == 3) {
                            z = true;
                        }
                        if (!vtwVarM8.b.A()) {
                            vtwVarM8.u();
                        }
                        ((lcs) vtwVarM8.b).h = z;
                        vtw vtwVarM12 = lcq.a.m();
                        if (!vtwVarM12.b.A()) {
                            vtwVarM12.u();
                        }
                        vuc vucVar = vtwVarM12.b;
                        str.getClass();
                        ((lcq) vucVar).b = str;
                        if (!vucVar.A()) {
                            vtwVarM12.u();
                        }
                        lcq lcqVar = (lcq) vtwVarM12.b;
                        str2.getClass();
                        lcqVar.c = str2;
                        if (!vtwVarM8.b.A()) {
                            vtwVarM8.u();
                        }
                        lcs lcsVar3 = (lcs) vtwVarM8.b;
                        lcq lcqVar2 = (lcq) vtwVarM12.r();
                        lcqVar2.getClass();
                        lcsVar3.i = lcqVar2;
                        lcsVar3.b |= 2;
                    }
                    i2 = 8;
                    i3 = 7;
                } else {
                    wcg wcgVar = i5 == i3 ? (wcg) wcaVar.c : wcg.a;
                    i = 8;
                    ImmutableList list = FluentIterable.from(DesugarCollections.unmodifiableMap(wcgVar.b).entrySet()).transform(new lsq(i)).toList();
                    if (!vtwVarM8.b.A()) {
                        vtwVarM8.u();
                    }
                    lcs lcsVar4 = (lcs) vtwVarM8.b;
                    vun vunVar = lcsVar4.e;
                    if (!vunVar.c()) {
                        lcsVar4.e = vuc.s(vunVar);
                    }
                    vsf.h(list, lcsVar4.e);
                }
                i2 = i;
                i3 = 7;
            } else {
                int i12 = i2;
                ImmutableList list2 = FluentIterable.from((i5 == 1 ? (wbe) wcaVar.c : wbe.a).b).transform(new lsq(7)).toList();
                if (!vtwVarM8.b.A()) {
                    vtwVarM8.u();
                }
                lcs lcsVar5 = (lcs) vtwVarM8.b;
                vun vunVar2 = lcsVar5.f;
                if (!vunVar2.c()) {
                    lcsVar5.f = vuc.s(vunVar2);
                }
                vsf.h(list2, lcsVar5.f);
                i2 = i12;
                i3 = 7;
            }
            i4 = 11;
        }
        if (((lcs) vtwVarM8.b).c.isEmpty()) {
            String strBl = this.b.bl();
            if (strBl.isEmpty()) {
                return ieg.b(new Error("Country code must exist in the response"));
            }
            krd.f("Use fallback country code: ".concat(String.valueOf(strBl)));
            if (!vtwVarM8.b.A()) {
                vtwVarM8.u();
            }
            lcs lcsVar6 = (lcs) vtwVarM8.b;
            strBl.getClass();
            lcsVar6.c = strBl;
        }
        ieg iegVar = (ieg) this.c.b(new lra(ksnVar, ieg.f(((lcs) vtwVarM8.b).c)));
        if (iegVar.m()) {
            ImmutableList immutableList = ((lrb) iegVar.g()).a;
            if (!vtwVarM8.b.A()) {
                vtwVarM8.u();
            }
            lcs lcsVar7 = (lcs) vtwVarM8.b;
            vun vunVar3 = lcsVar7.d;
            if (!vunVar3.c()) {
                lcsVar7.d = vuc.s(vunVar3);
            }
            vsf.h(immutableList, lcsVar7.d);
        }
        return ieg.f(new ltz((lcs) vtwVarM8.r()));
    }
}
