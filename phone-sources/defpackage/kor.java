package defpackage;

import androidx.compose.foundation.layout.AspectRatioElement;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kor {
    public static final kor a = new kor();
    private static final yy b = wv.t(16.0f, 170.0f, 16.0f, 0.0f, 8);

    private kor() {
    }

    public final void a(wlw wlwVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        bkp bkpVar2;
        wlwVar.getClass();
        bao baoVarD = baoVar.d(-1261814340);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.F(wlwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= true != baoVarD.F(this) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
        } else {
            bkpVar2 = bkp.g;
            knh.c(wlwVar, zi.a(bga.w(wv.o(bkpVar2, b), aep.a(20.0f)), 1.0f).a(new AspectRatioElement(1.7777778f)), null, baoVarD, i3 & 14, 12);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kia(this, wlwVar, bkpVar2, i, 17);
        }
    }

    public final void b(bkp bkpVar, bao baoVar, int i) {
        bao baoVarD = baoVar.d(-393112816);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(this) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bkm bkmVar = bkp.g;
            hv.g(ccf.y(R.drawable.background_shape_plot, baoVarD, 0), null, bkmVar, null, null, 0.0f, baoVarD, ((i2 << 6) & 896) | 48, android.support.v7.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMajor);
            bkpVar = bkmVar;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kid(this, bkpVar, i, 12);
        }
    }
}
