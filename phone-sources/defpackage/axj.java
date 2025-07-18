package defpackage;

import android.support.v7.widget.RecyclerView;
import androidx.compose.material3.internal.DeterminateLinearWavyProgressElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axj {
    public static final my a;
    public static final my b;

    static {
        ni niVar = azp.a;
        a = fh.i(500, azp.d, 2);
        b = fh.i(500, azp.a, 2);
    }

    public static final void a(yjk yjkVar, bkp bkpVar, long j, long j2, bpt bptVar, bpt bptVar2, float f, float f2, yjv yjvVar, float f3, float f4, bao baoVar, int i, int i2) {
        int i3;
        long j3;
        bpt bptVar3;
        bpt bptVar4;
        float f5;
        float f6;
        int i4;
        int i5;
        int i6 = i & 6;
        bao baoVarD = baoVar.d(2019304030);
        if (i6 == 0) {
            i3 = (true != baoVarD.H(yjkVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != baoVarD.E(j) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            j3 = j2;
            i3 |= true != baoVarD.E(j3) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        } else {
            j3 = j2;
        }
        if ((i & 24576) == 0) {
            bptVar3 = bptVar;
            i3 |= true != baoVarD.H(bptVar3) ? 8192 : 16384;
        } else {
            bptVar3 = bptVar;
        }
        if ((196608 & i) == 0) {
            bptVar4 = bptVar2;
            i3 |= true != baoVarD.H(bptVar4) ? 65536 : 131072;
        } else {
            bptVar4 = bptVar2;
        }
        if ((1572864 & i) == 0) {
            f5 = f;
            i3 |= true != baoVarD.C(f5) ? 524288 : 1048576;
        } else {
            f5 = f;
        }
        if ((12582912 & i) == 0) {
            f6 = f2;
            i3 |= true != baoVarD.C(f6) ? 4194304 : 8388608;
        } else {
            f6 = f2;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != baoVarD.H(yjvVar) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != baoVarD.C(f3) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = i3;
            i5 = i2 | (true != baoVarD.C(f4) ? 2 : 4);
        } else {
            i4 = i3;
            i5 = i2;
        }
        if (baoVarD.L(((i4 & 306783379) == 306783378 && (i5 & 3) == 2) ? false : true, i4 & 1)) {
            baoVarD.u();
            if ((i & 1) != 0 && !baoVarD.I()) {
                baoVarD.t();
            }
            baoVarD.m();
            bkp bkpVarA = bkpVar.a(axr.b);
            int i7 = i4 & 14;
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (i7 == 4 || objT == ban.a) {
                objT = new ars(yjkVar, 18);
                basVar.ae(objT);
            }
            bkp bkpVarB = cfd.b(bkpVarA, true, (yjv) objT);
            float f7 = axi.a;
            zy.k(bga.x(zi.f(bkpVarB, axi.b, axi.a)).a(new DeterminateLinearWavyProgressElement(yjkVar, yjvVar, j, j3, bptVar3, bptVar4, f5, f6, f3, f4)), baoVarD);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new ppe(yjkVar, bkpVar, j, j2, bptVar, bptVar2, f, f2, yjvVar, f3, f4, i, i2, 1);
        }
    }
}
