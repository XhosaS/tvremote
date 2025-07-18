package defpackage;

import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ltp implements idf {
    private final lql a;
    private final /* synthetic */ int b;
    private final Object c;

    public ltp(lql lqlVar, Object obj, int i) {
        this.b = i;
        this.a = lqlVar;
        this.c = obj;
    }

    private final ImmutableList a(ksn ksnVar, ImmutableList immutableList, boolean z) {
        if (!immutableList.isEmpty()) {
            vdn vdnVarC = ((moz) this.c).c(ksnVar);
            vtw vtwVarM = wcl.a.m();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            wcl wclVar = (wcl) vtwVarM.b;
            vdnVarC.getClass();
            wclVar.e = vdnVarC;
            wclVar.b |= 1;
            vtw vtwVarM2 = wco.a.m();
            ImmutableList list = FluentIterable.from(immutableList).transform(new lsq(10)).toList();
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            wco wcoVar = (wco) vtwVarM2.b;
            vun vunVar = wcoVar.b;
            if (!vunVar.c()) {
                wcoVar.b = vuc.s(vunVar);
            }
            vsf.h(list, wcoVar.b);
            int i = true != z ? 4 : 3;
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            ((wco) vtwVarM2.b).c = a.aF(i);
            wco wcoVar2 = (wco) vtwVarM2.r();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            wcl wclVar2 = (wcl) vtwVarM.b;
            wcoVar2.getClass();
            wclVar2.d = wcoVar2;
            wclVar2.c = 6;
            if (!this.a.b(ksnVar, (wcl) vtwVarM.r(), wcq.b(), new ltu(8)).m()) {
                return ImmutableList.of();
            }
        }
        return immutableList;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, yfo] */
    @Override // defpackage.idf
    public final /* synthetic */ Object b(Object obj) {
        vxv vxvVar;
        int i = this.b;
        int i2 = 13;
        int i3 = 12;
        int i4 = 1;
        if (i == 0) {
            ksn ksnVar = ((lua) obj).a;
            vdn vdnVarC = ((moz) this.c).c(ksnVar);
            vtw vtwVarM = wbj.a.m();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            wbj wbjVar = (wbj) vtwVarM.b;
            vdnVarC.getClass();
            wbjVar.c = vdnVarC;
            wbjVar.b |= 1;
            vtw vtwVarM2 = wbx.a.m();
            wbu wbuVar = wbu.a;
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            wbx wbxVar = (wbx) vtwVarM2.b;
            wbuVar.getClass();
            wbxVar.c = wbuVar;
            wbxVar.b = 3;
            vtwVarM.bG(vtwVarM2);
            return this.a.b(ksnVar, (wbj) vtwVarM.r(), wcq.a(), new lsl(i3)).c(new lsl(i2));
        }
        int i5 = 9;
        int i6 = 10;
        int i7 = 2;
        if (i == 1) {
            lra lraVar = (lra) obj;
            ksn ksnVar2 = lraVar.a;
            vdn vdnVarC2 = ((moz) this.c.b()).c(ksnVar2);
            String str = (String) lraVar.b.h("");
            vtw vtwVarM3 = vxs.a.m();
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            vxs vxsVar = (vxs) vtwVarM3.b;
            vdnVarC2.getClass();
            vxsVar.c = vdnVarC2;
            vxsVar.b |= 1;
            vtw vtwVarM4 = vxw.a.m();
            if (str.isEmpty()) {
                vxvVar = vxv.a;
            } else {
                vtw vtwVarM5 = vxv.a.m();
                if (!vtwVarM5.b.A()) {
                    vtwVarM5.u();
                }
                vxv vxvVar2 = (vxv) vtwVarM5.b;
                vun vunVar = vxvVar2.b;
                if (!vunVar.c()) {
                    vxvVar2.b = vuc.s(vunVar);
                }
                vxvVar2.b.add(str);
                vxvVar = (vxv) vtwVarM5.r();
            }
            if (!vtwVarM4.b.A()) {
                vtwVarM4.u();
            }
            vxw vxwVar = (vxw) vtwVarM4.b;
            vxvVar.getClass();
            vxwVar.c = vxvVar;
            vxwVar.b = 2;
            vtwVarM3.bF(vtwVarM4);
            return this.a.b(ksnVar2, (vxs) vtwVarM3.r(), vxr.a(), new lqp(i5)).c(new lqp(i6));
        }
        int i8 = 15;
        int i9 = 16;
        if (i == 2) {
            lue lueVar = (lue) obj;
            ksn ksnVar3 = lueVar.a;
            vdn vdnVarC3 = ((moz) this.c).c(ksnVar3);
            ImmutableList list = FluentIterable.from(lueVar.b).transform(new lpn(i7)).filter(new efc(10)).transform(new lpn(i)).toList();
            vtw vtwVarM6 = wbj.a.m();
            if (!vtwVarM6.b.A()) {
                vtwVarM6.u();
            }
            wbj wbjVar2 = (wbj) vtwVarM6.b;
            vdnVarC3.getClass();
            wbjVar2.c = vdnVarC3;
            wbjVar2.b |= 1;
            vtw vtwVarM7 = wbx.a.m();
            vtw vtwVarM8 = wbs.a.m();
            vtw vtwVarM9 = wbh.a.m();
            vtw vtwVarM10 = vbz.a.m();
            if (!vtwVarM10.b.A()) {
                vtwVarM10.u();
            }
            vbz vbzVar = (vbz) vtwVarM10.b;
            vbzVar.b();
            vsf.h(list, vbzVar.c);
            if (!vtwVarM9.b.A()) {
                vtwVarM9.u();
            }
            wbh wbhVar = (wbh) vtwVarM9.b;
            vbz vbzVar2 = (vbz) vtwVarM10.r();
            vbzVar2.getClass();
            wbhVar.d = vbzVar2;
            wbhVar.b |= 4;
            if (!vtwVarM8.b.A()) {
                vtwVarM8.u();
            }
            wbs wbsVar = (wbs) vtwVarM8.b;
            wbh wbhVar2 = (wbh) vtwVarM9.r();
            wbhVar2.getClass();
            wbsVar.c = wbhVar2;
            wbsVar.b = 1 | wbsVar.b;
            if (!vtwVarM7.b.A()) {
                vtwVarM7.u();
            }
            wbx wbxVar2 = (wbx) vtwVarM7.b;
            wbs wbsVar2 = (wbs) vtwVarM8.r();
            wbsVar2.getClass();
            wbxVar2.c = wbsVar2;
            wbxVar2.b = 4;
            vtwVarM6.bG(vtwVarM7);
            return this.a.b(ksnVar3, (wbj) vtwVarM6.r(), wcq.a(), new lsl(i8)).c(new lsl(i9));
        }
        int i10 = 0;
        if (i == 3) {
            ltx ltxVar = (ltx) obj;
            ksn ksnVar4 = ltxVar.a;
            vdn vdnVarC4 = ((moz) this.c).c(ksnVar4);
            int i11 = ltxVar.b;
            if (i11 != 1) {
                return ieg.b(new RuntimeException(a.cf(i11, "Unknown partner: ")));
            }
            int i12 = ltxVar.d;
            int i13 = i12 - 1;
            i = i13 != 1 ? i13 != 2 ? 2 : 4 : 3;
            if (i == 2) {
                return ieg.b(new RuntimeException("Unknown state: ".concat(krf.o(i12))));
            }
            vtw vtwVarM11 = wcl.a.m();
            if (!vtwVarM11.b.A()) {
                vtwVarM11.u();
            }
            wcl wclVar = (wcl) vtwVarM11.b;
            vdnVarC4.getClass();
            wclVar.e = vdnVarC4;
            wclVar.b |= 1;
            vtw vtwVarM12 = wbd.a.m();
            if (!vtwVarM12.b.A()) {
                vtwVarM12.u();
            }
            vuc vucVar = vtwVarM12.b;
            ((wbd) vucVar).d = 1;
            if (!vucVar.A()) {
                vtwVarM12.u();
            }
            ((wbd) vtwVarM12.b).c = a.aF(i);
            vwe vweVarE = vxf.e(ltxVar.c);
            if (!vtwVarM12.b.A()) {
                vtwVarM12.u();
            }
            wbd wbdVar = (wbd) vtwVarM12.b;
            vweVarE.getClass();
            wbdVar.e = vweVarE;
            wbdVar.b |= 1;
            if (!vtwVarM11.b.A()) {
                vtwVarM11.u();
            }
            wcl wclVar2 = (wcl) vtwVarM11.b;
            wbd wbdVar2 = (wbd) vtwVarM12.r();
            wbdVar2.getClass();
            wclVar2.d = wbdVar2;
            wclVar2.c = 7;
            return this.a.b(ksnVar4, (wcl) vtwVarM11.r(), wcq.b(), new ltu(i4)).e(new ltu(i10));
        }
        if (i != 4) {
            lum lumVar = (lum) obj;
            ksn ksnVar5 = lumVar.a;
            return ieg.f(new lun(a(ksnVar5, lumVar.b, true), a(ksnVar5, lumVar.c, false)));
        }
        lud ludVar = (lud) obj;
        ksn ksnVar6 = ludVar.a;
        vdn vdnVarC5 = ((moz) this.c).c(ksnVar6);
        vtw vtwVarM13 = wcl.a.m();
        if (!vtwVarM13.b.A()) {
            vtwVarM13.u();
        }
        wcl wclVar3 = (wcl) vtwVarM13.b;
        vdnVarC5.getClass();
        wclVar3.e = vdnVarC5;
        wclVar3.b |= 1;
        vtw vtwVarM14 = wci.a.m();
        luc lucVar = ludVar.b;
        int i14 = true != lucVar.b ? 4 : 3;
        switch (lucVar.a) {
            case 0:
                i2 = 2;
                break;
            case 1:
                i2 = 8;
                break;
            case 2:
                i2 = 4;
                break;
            case 3:
                i2 = 11;
                break;
            case 4:
                i2 = 9;
                break;
            case 5:
                i2 = 10;
                break;
            case 6:
                i2 = 12;
                break;
            case 7:
                i2 = 16;
                break;
            case 8:
                i2 = 14;
                break;
            case 9:
                i2 = 15;
                break;
        }
        vtw vtwVarM15 = wch.a.m();
        if (!vtwVarM15.b.A()) {
            vtwVarM15.u();
        }
        vuc vucVar2 = vtwVarM15.b;
        ((wch) vucVar2).b = i2 - 2;
        if (!vucVar2.A()) {
            vtwVarM15.u();
        }
        ((wch) vtwVarM15.b).c = a.aF(i14);
        wch wchVar = (wch) vtwVarM15.r();
        if (!vtwVarM14.b.A()) {
            vtwVarM14.u();
        }
        wci wciVar = (wci) vtwVarM14.b;
        wchVar.getClass();
        vun vunVar2 = wciVar.b;
        if (!vunVar2.c()) {
            wciVar.b = vuc.s(vunVar2);
        }
        wciVar.b.add(wchVar);
        if (!vtwVarM13.b.A()) {
            vtwVarM13.u();
        }
        wcl wclVar4 = (wcl) vtwVarM13.b;
        wci wciVar2 = (wci) vtwVarM14.r();
        wciVar2.getClass();
        wclVar4.d = wciVar2;
        wclVar4.c = 2;
        return this.a.b(ksnVar6, (wcl) vtwVarM13.r(), wcq.b(), new ltu(i7)).e(new ltu(i));
    }
}
