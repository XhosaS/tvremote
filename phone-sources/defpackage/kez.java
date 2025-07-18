package defpackage;

import androidx.compose.foundation.layout.SizeElement;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kez {
    public static final kez a = new kez();

    private kez() {
    }

    public final void a(bkp bkpVar, bao baoVar, int i) {
        int i2;
        bao baoVar2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-353558362);
        if (i3 == 0) {
            i2 = i | (true != baoVarD.F(bkpVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && baoVarD.K()) {
            baoVarD.t();
            baoVar2 = baoVarD;
        } else {
            baoVar2 = baoVarD;
            rdd.p(ccf.w(R.string.recent_searches, baoVarD), bkpVar, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wv.N(baoVarD).h, baoVar2, (i2 << 3) & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 0, 65532);
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new key(this, bkpVar, i, 0);
        }
    }

    public final void b(int i, kem kemVar, yjv yjvVar, yjv yjvVar2, bkp bkpVar, bao baoVar, int i2) {
        int i3;
        yjv yjvVar3;
        bkp bkpVar2;
        yjvVar.getClass();
        yjvVar2.getClass();
        bao baoVarD = baoVar.d(1352544590);
        if ((i2 & 6) == 0) {
            i3 = (true != baoVarD.D(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != baoVarD.H(kemVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            yjvVar3 = yjvVar;
            i3 |= true != baoVarD.H(yjvVar3) ? 128 : 256;
        } else {
            yjvVar3 = yjvVar;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != baoVarD.H(yjvVar2) ? 1024 : 2048;
        }
        int i4 = i3 | 24576;
        if ((i4 & 9363) == 9362 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
        } else {
            bkpVar2 = bkp.g;
            baoVarD.x(-1633490746);
            boolean zH = ((i4 & 7168) == 2048) | baoVarD.H(kemVar);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (zH || objT == ban.a) {
                objT = new jzx(yjvVar2, kemVar, 11);
                basVar.ae(objT);
            }
            yjk yjkVar = (yjk) objT;
            basVar.aa();
            bkp bkpVarB = zi.b(bkpVar2.a(new SizeElement(1 != (1 & 1) ? 0.0f : Float.NaN, 0.0f, (1 & 2) != 0 ? Float.NaN : 200.0f, 0.0f, 10)), 56.0f);
            baoVarD.x(5004770);
            int i5 = i4 & 14;
            Object objT2 = basVar.T();
            if (i5 == 4 || objT2 == ban.a) {
                objT2 = new abs(i, 3);
                basVar.ae(objT2);
            }
            basVar.aa();
            kdw.b(yjvVar3, kemVar, yjkVar, cfd.b(bkpVarB, false, (yjv) objT2), baoVarD, (i4 & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i4 >> 6) & 14));
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kex(this, i, kemVar, yjvVar, yjvVar2, bkpVar2, i2, 0);
        }
    }
}
