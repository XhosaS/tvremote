package defpackage;

import androidx.compose.foundation.layout.SizeElement;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kfb {
    public static final kfb a = new kfb();

    private kfb() {
    }

    public final void a(boolean z, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(373597405);
        if (i3 == 0) {
            i2 = (true != baoVarD.G(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && baoVarD.K()) {
            baoVarD.t();
        } else if (z) {
            baoVarD.x(1580182584);
            kir.e(R.drawable.gs_history_vd_theme_24, baoVarD, 0);
            ((bas) baoVarD).aa();
        } else {
            baoVarD.x(1580269229);
            asg.a(ccf.y(R.drawable.gs_history_vd_theme_24, baoVarD, 0), null, wv.p(zi.f(bkp.g, 32.0f, 48.0f), 4.0f), 0L, baoVarD, 432, 8);
            ((bas) baoVarD).aa();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new fyo(this, z, i, 3);
        }
    }

    public final void b(boolean z, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1667453139);
        if (i3 == 0) {
            i2 = (true != baoVarD.G(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && baoVarD.K()) {
            baoVarD.t();
        } else if (z) {
            baoVarD.x(495434729);
            kir.e(R.drawable.gs_search_vd_theme_24, baoVarD, 0);
            ((bas) baoVarD).aa();
        } else {
            baoVarD.x(495520382);
            asg.a(ccf.y(R.drawable.gs_search_vd_theme_24, baoVarD, 0), null, wv.p(zi.f(bkp.g, 32.0f, 48.0f), 4.0f), 0L, baoVarD, 432, 8);
            ((bas) baoVarD).aa();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new fyo(this, z, i, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(kdh kdhVar, bao baoVar, int i) {
        int i2;
        kdhVar.getClass();
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-2126658370);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(kdhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && baoVarD.K()) {
            baoVarD.t();
        } else {
            wlx wlxVarC = kdhVar.c();
            String str = (wlxVarC.b == 1 ? (wlu) wlxVarC.c : wlu.a).b;
            if (ylh.L(str)) {
                wlx wlxVarC2 = kdhVar.c();
                str = ((wlv) (wlxVarC2.b == 3 ? (wlw) wlxVarC2.c : wlw.a).b.get(0)).b;
            }
            String str2 = str;
            str2.getClass();
            knh.d(str2, bga.w(zi.b(new SizeElement(32.0f, 0.0f, 32.0f, 0.0f, 10), 48.0f), wv.M(baoVarD).a), bun.b, null, baoVarD, 3072, 20);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new key(this, kdhVar, i, 2);
        }
    }
}
