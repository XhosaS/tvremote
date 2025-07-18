package defpackage;

import androidx.compose.foundation.layout.AspectRatioElement;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kop {
    public static final kop a = new kop();
    private static final yy b = wv.t(16.0f, 170.0f, 16.0f, 0.0f, 8);

    private kop() {
    }

    public final void a(wlw wlwVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        wlwVar.getClass();
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-461419452);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(wlwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(this) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
        } else {
            knh.c(wlwVar, zi.a(bga.w(wv.o(bkpVar, b), aep.a(20.0f)), 1.0f).a(new AspectRatioElement(1.7777778f)), null, baoVarD, i2 & 14, 12);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kia(this, wlwVar, bkpVar, i, 16);
        }
    }

    public final void b(bkp bkpVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(380625048);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(bkpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(this) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            hv.g(ccf.y(R.drawable.background_shape_cu, baoVarD, 0), null, zi.a(bkpVar, 1.0f), null, bun.e, 0.0f, baoVarD, 24624, android.support.v7.appcompat.R.styleable.AppCompatTheme_textAppearanceListItemSecondary);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kid(this, bkpVar, i, 11);
        }
    }
}
