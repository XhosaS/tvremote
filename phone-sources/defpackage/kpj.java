package defpackage;

import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kpj {
    public static final kpj a = new kpj();

    private kpj() {
    }

    public final void a(long j, bao baoVar, int i) {
        long j2;
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-66328343);
        if (i3 == 0) {
            j2 = j;
            i2 = i | (true != baoVarD.E(j2) ? 2 : 4);
        } else {
            j2 = j;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(this) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            asg.a(ccf.y(R.drawable.gs_arrow_outward_vd_theme_24, baoVarD, 0), null, wv.o(zi.d(bkp.g, 20.0f), kpn.a), j2, baoVarD, ((i2 << 9) & 7168) | 48, 0);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kpi(this, j, i, 0);
        }
    }
}
