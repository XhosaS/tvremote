package defpackage;

import androidx.compose.foundation.ScrollingLayoutElement;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kod implements yka {
    final /* synthetic */ float a;
    final /* synthetic */ yld b;
    final /* synthetic */ long c;
    final /* synthetic */ bcb d;
    final /* synthetic */ bcb e;
    final /* synthetic */ bcb f;
    final /* synthetic */ sj g;
    final /* synthetic */ boolean h;
    final /* synthetic */ yjz i;

    public kod(float f, yld yldVar, long j, bcb bcbVar, bcb bcbVar2, bcb bcbVar3, sj sjVar, boolean z, yjz yjzVar) {
        this.a = f;
        this.b = yldVar;
        this.c = j;
        this.d = bcbVar;
        this.e = bcbVar2;
        this.f = bcbVar3;
        this.g = sjVar;
        this.h = z;
        this.i = yjzVar;
    }

    @Override // defpackage.yka
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        bnn bnnVarT;
        bkp bkpVarU;
        xt xtVar = (xt) obj;
        bao baoVar = (bao) obj2;
        int iIntValue = ((Number) obj3).intValue();
        xtVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != baoVar.F(xtVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && baoVar.K()) {
            baoVar.t();
        } else {
            long j = xtVar.b;
            float fCp = (clv.g(j) ? xtVar.a.cp(clv.a(j)) : Float.POSITIVE_INFINITY) - this.a;
            this.b.a = (int) ((clx) baoVar.f(ccq.d)).cr(fCp);
            bcb bcbVar = this.d;
            if (((Boolean) bcbVar.a()).booleanValue() && ((Boolean) this.e.a()).booleanValue()) {
                long j2 = this.c;
                Float fValueOf = Float.valueOf(0.0f);
                long j3 = bnq.f;
                yfw[] yfwVarArr = {new yfw(fValueOf, new bnq(j3)), new yfw(Float.valueOf(0.1f), new bnq(j2)), new yfw(Float.valueOf(0.9f), new bnq(j2)), new yfw(Float.valueOf(1.0f), new bnq(j3))};
                bnnVarT = bny.t((yfw[]) Arrays.copyOf(yfwVarArr, yfwVarArr.length), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & 4294967295L));
            } else if (((Boolean) bcbVar.a()).booleanValue()) {
                yfw[] yfwVarArr2 = {new yfw(Float.valueOf(0.9f), new bnq(this.c)), new yfw(Float.valueOf(1.0f), new bnq(bnq.f))};
                bnnVarT = bny.t((yfw[]) Arrays.copyOf(yfwVarArr2, yfwVarArr2.length), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & 4294967295L));
            } else if (((Boolean) this.e.a()).booleanValue()) {
                yfw[] yfwVarArr3 = {new yfw(Float.valueOf(0.0f), new bnq(bnq.f)), new yfw(Float.valueOf(0.1f), new bnq(this.c))};
                bnnVarT = bny.t((yfw[]) Arrays.copyOf(yfwVarArr3, yfwVarArr3.length), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & 4294967295L));
            } else {
                bnnVarT = null;
            }
            bcb bcbVar2 = this.f;
            if (!((Boolean) bcbVar2.a()).booleanValue() || bnnVarT == null) {
                bkpVarU = bkp.g;
            } else {
                bkm bkmVar = bkp.g;
                bkmVar.getClass();
                bkpVarU = bga.u(bny.f(bkmVar, 0.0f, null, false, 1, 458751), new kij(bnnVarT, 7));
            }
            sj sjVar = this.g;
            boolean z = this.h;
            yjz yjzVar = this.i;
            bkp bkpVarA = bkpVarU.a(zi.b);
            bvt bvtVarA = xu.a(xk.d, bkb.j, baoVar, 6);
            int iK = a.k(zy.p(baoVar));
            bhu bhuVarO = baoVar.O();
            bkp bkpVarC = bdi.C(baoVar, bkpVarA);
            yjk yjkVar = bxt.a;
            baoVar.c();
            baoVar.z();
            if (baoVar.J()) {
                baoVar.k(yjkVar);
            } else {
                baoVar.B();
            }
            yjz yjzVar2 = bxt.d;
            beb.a(baoVar, bvtVarA, yjzVar2);
            yjz yjzVar3 = bxt.c;
            beb.a(baoVar, bhuVarO, yjzVar3);
            yjz yjzVar4 = bxt.e;
            if (baoVar.J() || !yks.e(baoVar.g(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                baoVar.A(numValueOf);
                baoVar.i(numValueOf, yjzVar4);
            }
            yjz yjzVar5 = bxt.b;
            beb.a(baoVar, bkpVarC, yjzVar5);
            bkp bkpVarA2 = hw.l(bkp.g, sjVar, uv.a, (!((12 & 2) == 0)) | ((Boolean) bcbVar2.a()).booleanValue(), null, sjVar.c, true, null).a(new ScrollingLayoutElement(sjVar));
            if (z) {
                bkp bkpVarB = xx.b(bkpVarA2, 1.0f, true);
                cma cmaVar = new cma(fCp);
                cma cmaVar2 = new cma(0.0f);
                if (cmaVar.compareTo(cmaVar2) < 0) {
                    cmaVar = cmaVar2;
                }
                bkpVarA2 = wv.w(wv.v(bkpVarB, 0.0f, 0.0f, 0.0f, cmaVar.a, 7), 0.0f, fCp, 1);
            }
            bvt bvtVarA2 = xo.a(bkb.a, false);
            int iK2 = a.k(zy.p(baoVar));
            bhu bhuVarO2 = baoVar.O();
            bkp bkpVarC2 = bdi.C(baoVar, bkpVarA2);
            baoVar.c();
            baoVar.z();
            if (baoVar.J()) {
                baoVar.k(yjkVar);
            } else {
                baoVar.B();
            }
            beb.a(baoVar, bvtVarA2, yjzVar2);
            beb.a(baoVar, bhuVarO2, yjzVar3);
            if (baoVar.J() || !yks.e(baoVar.g(), Integer.valueOf(iK2))) {
                Integer numValueOf2 = Integer.valueOf(iK2);
                baoVar.A(numValueOf2);
                baoVar.i(numValueOf2, yjzVar4);
            }
            beb.a(baoVar, bkpVarC2, yjzVar5);
            yjzVar.a(baoVar, 0);
            baoVar.o();
            baoVar.o();
        }
        return ygi.a;
    }
}
