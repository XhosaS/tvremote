package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class abs implements yjv {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ abs(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.yjv
    public final Object a(Object obj) {
        yjv yjvVarI;
        int i = this.b;
        if (i == 0) {
            tll tllVar = (tll) obj;
            bit bitVarT = bcm.t();
            yjvVarI = bitVarT != null ? bitVarT.i() : null;
            int i2 = this.a;
            bcm.z(bitVarT, bcm.u(bitVarT), yjvVarI);
            a.bx(tllVar, i2);
            return ygi.a;
        }
        if (i == 1) {
            tll tllVar2 = (tll) obj;
            bit bitVarT2 = bcm.t();
            yjvVarI = bitVarT2 != null ? bitVarT2.i() : null;
            int i3 = this.a;
            bcm.z(bitVarT2, bcm.u(bitVarT2), yjvVarI);
            a.bx(tllVar2, i3);
            return ygi.a;
        }
        if (i != 2) {
            if (i == 3) {
                cfc cfcVar = (cfc) obj;
                cfcVar.getClass();
                sew sewVar = new sew(this.a);
                ymp[] ympVarArr = cfk.a;
                cfm cfmVar = cfi.g;
                ymp ympVar = cfk.a[23];
                cfcVar.e(cfmVar, sewVar);
                return ygi.a;
            }
            if (i == 4) {
                ith ithVar = (ith) obj;
                ithVar.getClass();
                iwf iwfVarB = ithVar.b();
                if (iwfVarB != null) {
                    iwfVarB.h(this.a, 3);
                }
                return ygi.a;
            }
            if (i != 5) {
                ((Integer) obj).intValue();
                throw new IndexOutOfBoundsException("Sequence doesn't contain element at index " + this.a + ".");
            }
            ghi ghiVarA = ((gic) obj).a("SELECT DISTINCT account_name FROM watchlist WHERE asset_state != ?");
            try {
                ghiVarA.g(1, this.a);
                ArrayList arrayList = new ArrayList();
                while (ghiVarA.l()) {
                    arrayList.add(ghiVarA.d(0));
                }
                return arrayList;
            } finally {
                ghiVarA.close();
            }
        }
        vtw vtwVar = (vtw) obj;
        vtwVar.getClass();
        ioc iocVar = ((iod) vtwVar.b).g;
        if (iocVar == null) {
            iocVar = ioc.a;
        }
        int i4 = this.a;
        vtw vtwVar2 = (vtw) iocVar.a(5, null);
        vtwVar2.x(iocVar);
        if (i4 != 0) {
            vuc vucVar = vtwVar2.b;
            int i5 = ((ioc) vucVar).f + 1;
            if (!vucVar.A()) {
                vtwVar2.u();
            }
            ((ioc) vtwVar2.b).f = i5;
            vwe vweVarE = igv.e();
            if (!vtwVar2.b.A()) {
                vtwVar2.u();
            }
            ioc iocVar2 = (ioc) vtwVar2.b;
            iocVar2.g = vweVarE;
            iocVar2.b |= 4;
        } else {
            vuc vucVar2 = vtwVar2.b;
            int i6 = ((ioc) vucVar2).d + 1;
            if (!vucVar2.A()) {
                vtwVar2.u();
            }
            ((ioc) vtwVar2.b).d = i6;
            vwe vweVarE2 = igv.e();
            if (!vtwVar2.b.A()) {
                vtwVar2.u();
            }
            ioc iocVar3 = (ioc) vtwVar2.b;
            iocVar3.e = vweVarE2;
            iocVar3.b |= 2;
        }
        ioc iocVar4 = (ioc) vtwVar2.r();
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        iod iodVar = (iod) vtwVar.b;
        iocVar4.getClass();
        iodVar.g = iocVar4;
        iodVar.b |= 1;
        return ygi.a;
    }
}
