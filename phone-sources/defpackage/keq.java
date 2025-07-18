package defpackage;

import android.support.v7.appcompat.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class keq {
    public static final keq a = new keq();

    private keq() {
    }

    public final void a(kel kelVar, yjv yjvVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        yjvVar.getClass();
        bao baoVarD = baoVar.d(-2143928754);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.H(kelVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjvVar) ? 16 : 32;
        }
        int i3 = i2 | 384;
        if ((i3 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bkpVar = bkp.g;
            baoVarD.x(1849434622);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (objT == ban.a) {
                objT = new jxd(15);
                basVar.ae(objT);
            }
            basVar.aa();
            kdw.e(yjvVar, kelVar, cfd.b(bkpVar, false, (yjv) objT), baoVarD, ((i3 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i3 >> 3) & 14));
        }
        bkp bkpVar2 = bkpVar;
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new ahm(this, kelVar, yjvVar, bkpVar2, i, 11);
        }
    }

    public final void b(bkp bkpVar, bao baoVar, int i) {
        bao baoVar2;
        bkp bkpVar2;
        int i2 = i | 6;
        int i3 = i2 & 3;
        bao baoVarD = baoVar.d(-803787140);
        if (i3 == 2 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
            baoVar2 = baoVarD;
        } else {
            bkm bkmVar = bkp.g;
            baoVar2 = baoVarD;
            axa.b(ccf.w(com.google.android.videos.R.string.play_open_search_section_genre, baoVarD), bkmVar, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wv.N(baoVarD).h, baoVar2, (i2 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 0, 131068);
            bkpVar2 = bkmVar;
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new bho(this, bkpVar2, i, 20, null);
        }
    }
}
