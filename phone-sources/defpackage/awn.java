package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awn implements yjz {
    final /* synthetic */ bkp a;
    final /* synthetic */ bol b;
    final /* synthetic */ long c;
    final /* synthetic */ float d;
    final /* synthetic */ float e;
    final /* synthetic */ yjz f;
    private final /* synthetic */ int g;

    public awn(bkp bkpVar, bol bolVar, long j, float f, float f2, yjz yjzVar, int i) {
        this.g = i;
        this.a = bkpVar;
        this.b = bolVar;
        this.c = j;
        this.d = f;
        this.e = f2;
        this.f = yjzVar;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.g == 0) {
            bao baoVar = (bao) obj;
            int iIntValue = ((Number) obj2).intValue();
            int i = iIntValue & 3;
            if (baoVar.L(i != 2, iIntValue & 1)) {
                bkp bkpVarA = awq.a(this.a, this.b, awq.b(this.c, this.d, baoVar), null, ((clx) baoVar.f(ccq.d)).cr(this.e));
                Object objG = baoVar.g();
                Object obj3 = ban.a;
                if (objG == obj3) {
                    objG = new aru(8);
                    baoVar.A(objG);
                }
                bkp bkpVarB = cfd.b(bkpVarA, false, (yjv) objG);
                ygi ygiVar = ygi.a;
                Object objG2 = baoVar.g();
                if (objG2 == obj3) {
                    objG2 = awm.a;
                    baoVar.A(objG2);
                }
                bkp bkpVarA2 = btm.a(bkpVarB, ygiVar, (PointerInputEventHandler) objG2);
                yjz yjzVar = this.f;
                bvt bvtVarA = xo.a(bkb.a, true);
                int iO = zy.o(baoVar);
                bhu bhuVarO = baoVar.O();
                bkp bkpVarC = bdi.C(baoVar, bkpVarA2);
                yjk yjkVar = bxt.a;
                baoVar.c();
                baoVar.z();
                if (baoVar.J()) {
                    baoVar.k(yjkVar);
                } else {
                    baoVar.B();
                }
                beb.a(baoVar, bvtVarA, bxt.d);
                beb.a(baoVar, bhuVarO, bxt.c);
                yjz yjzVar2 = bxt.e;
                if (baoVar.J() || !yks.e(baoVar.g(), Integer.valueOf(iO))) {
                    Integer numValueOf = Integer.valueOf(iO);
                    baoVar.A(numValueOf);
                    baoVar.i(numValueOf, yjzVar2);
                }
                beb.a(baoVar, bkpVarC, bxt.b);
                yjzVar.a(baoVar, 0);
                baoVar.o();
            } else {
                baoVar.t();
            }
            return ygi.a;
        }
        bao baoVar2 = (bao) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && baoVar2.K()) {
            baoVar2.t();
        } else {
            bkp bkpVar = this.a;
            bol bolVar = this.b;
            bkp bkpVarW = bga.w(hq.f(bga.q(bkpVar, this.e, bolVar, 24).a(bkp.g), og.H(this.c, (anz) baoVar2.f(aok.a), this.d, baoVar2), bolVar), bolVar);
            Object objG3 = baoVar2.g();
            Object obj4 = ban.a;
            if (objG3 == obj4) {
                objG3 = new afh(19);
                baoVar2.A(objG3);
            }
            bkp bkpVarB2 = cfd.b(bkpVarW, false, (yjv) objG3);
            ygi ygiVar2 = ygi.a;
            Object objG4 = baoVar2.g();
            if (objG4 == obj4) {
                objG4 = new cbw((yih) null, 1, (byte[]) null);
                baoVar2.A(objG4);
            }
            bsr bsrVar = btm.a;
            bkp bkpVarA3 = bkpVarB2.a(new SuspendPointerInputElement(ygiVar2, null, new btl((yjz) objG4), 6));
            yjz yjzVar3 = this.f;
            bvt bvtVarA2 = xo.a(bkb.a, true);
            int iO2 = zy.o(baoVar2);
            bhu bhuVarO2 = baoVar2.O();
            bkp bkpVarC2 = bdi.C(baoVar2, bkpVarA3);
            yjk yjkVar2 = bxt.a;
            baoVar2.c();
            baoVar2.z();
            if (baoVar2.J()) {
                baoVar2.k(yjkVar2);
            } else {
                baoVar2.B();
            }
            beb.a(baoVar2, bvtVarA2, bxt.d);
            beb.a(baoVar2, bhuVarO2, bxt.c);
            yjz yjzVar4 = bxt.e;
            if (baoVar2.J() || !yks.e(baoVar2.g(), Integer.valueOf(iO2))) {
                Integer numValueOf2 = Integer.valueOf(iO2);
                baoVar2.A(numValueOf2);
                baoVar2.i(numValueOf2, yjzVar4);
            }
            beb.a(baoVar2, bkpVarC2, bxt.b);
            yjzVar3.a(baoVar2, 0);
            baoVar2.o();
        }
        return ygi.a;
    }
}
