package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atj {
    public static final /* synthetic */ int a = 0;

    static {
        ni niVar = azp.a;
    }

    public static final void a(yjk yjkVar, bkp bkpVar, long j, long j2, yjv yjvVar, bao baoVar, int i) {
        int i2;
        bao baoVarD = baoVar.d(-339970038);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.H(yjkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.E(j) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.E(j2) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            i2 |= true != baoVarD.D(1) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != baoVarD.C(0.0f) ? 65536 : 131072;
        }
        if ((i & 1572864) == 0) {
            i2 |= true != baoVarD.H(yjvVar) ? 524288 : 1048576;
        }
        if (baoVarD.L((599187 & i2) != 599186, i2 & 1)) {
            baoVarD.u();
            if ((i & 1) != 0 && !baoVarD.I()) {
                baoVarD.t();
            }
            baoVarD.m();
            int i3 = i2 & 14;
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (i3 == 4 || objT == ban.a) {
                objT = new aoe(yjkVar, 12);
                basVar.ae(objT);
            }
            yjk yjkVar2 = (yjk) objT;
            bkp bkpVarA = bkpVar.a(axr.b);
            boolean zF = baoVarD.F(yjkVar2);
            Object objT2 = basVar.T();
            if (zF || objT2 == ban.a) {
                objT2 = new ars(yjkVar2, 9);
                basVar.ae(objT2);
            }
            bkp bkpVarF = zi.f(cfd.b(bkpVarA, true, (yjv) objT2), 240.0f, 4.0f);
            boolean zF2 = ((458752 & i2) == 131072) | ((57344 & i2) == 16384) | baoVarD.F(yjkVar2) | ((((i2 & 7168) ^ 3072) > 2048 && baoVarD.E(j2)) || (i2 & 3072) == 2048) | ((((i2 & 896) ^ 384) > 256 && baoVarD.E(j)) || (i2 & 384) == 256) | ((((3670016 & i2) ^ 1572864) > 1048576 && baoVarD.F(yjvVar)) || (i2 & 1572864) == 1048576);
            Object objT3 = basVar.T();
            if (zF2 || objT3 == ban.a) {
                ati atiVar = new ati(yjkVar2, j2, j, yjvVar, 0);
                basVar.ae(atiVar);
                objT3 = atiVar;
            }
            ht.i(bkpVarF, (yjv) objT3, baoVarD, 0);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new avt(yjkVar, bkpVar, j, j2, yjvVar, i, 1);
        }
    }

    public static final void b(bpq bpqVar, float f, float f2, long j, float f3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (bpqVar.n() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (bpqVar.n() & 4294967295L));
        float f4 = fIntBitsToFloat2 / 2.0f;
        boolean z = bpqVar.o() == cmi.a;
        float f5 = (z ? f : 1.0f - f2) * fIntBitsToFloat;
        float f6 = (z ? f2 : 1.0f - f) * fIntBitsToFloat;
        if (a.r(1, 0) || fIntBitsToFloat2 > fIntBitsToFloat) {
            brx.n(bpqVar, j, (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), f3, 0, 496);
            return;
        }
        float f7 = f3 / 2.0f;
        float f8 = fIntBitsToFloat - f7;
        if (f5 < f7) {
            f5 = f7;
        }
        if (f6 < f7) {
            f6 = f7;
        }
        if (Math.abs(f2 - f) > 0.0f) {
            if (f6 > f8) {
                f6 = f8;
            }
            if (f5 <= f8) {
                f8 = f5;
            }
            brx.n(bpqVar, j, (Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), f3, 1, 480);
        }
    }
}
