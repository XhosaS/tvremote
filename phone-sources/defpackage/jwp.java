package defpackage;

import android.support.v7.widget.ActivityChooserView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jwp implements hqf {
    public static final hlk a = new hlk("gtvm.use_smart_crop", null, hlk.a);
    private final hqf b;

    public jwp(hqf hqfVar) {
        this.b = hqfVar;
    }

    public static final boolean c(wlx wlxVar) {
        wlxVar.getClass();
        return !yks.e(wlxVar, wlx.a);
    }

    @Override // defpackage.hqf
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return c((wlx) obj);
    }

    @Override // defpackage.hqf
    public final /* synthetic */ cvi e(Object obj, int i, int i2, hll hllVar) {
        wlx wlxVar = (wlx) obj;
        wlxVar.getClass();
        hllVar.getClass();
        if (!c(wlxVar)) {
            return null;
        }
        int i3 = wlxVar.b;
        int iP = wbb.p(i3);
        if (iP == 0) {
            throw null;
        }
        int i4 = iP - 1;
        if (i4 == 0) {
            StringBuilder sb = new StringBuilder("k-v1-rwu");
            if (i > 0) {
                krf.m(i, sb);
            }
            if (i2 > 0) {
                krf.k(i2, sb);
            }
            if (yks.e(hllVar.b(a), true)) {
                sb.append("-pp");
            }
            String string = sb.toString();
            String str = (wlxVar.b == 1 ? (wlu) wlxVar.c : wlu.a).b;
            str.getClass();
            return this.b.e(new hpw(kuq.b(string, str)), i, i2, hllVar);
        }
        if (i4 != 2) {
            return null;
        }
        hqf hqfVar = this.b;
        wlw wlwVar = i3 == 3 ? (wlw) wlxVar.c : wlw.a;
        wlwVar.getClass();
        vun vunVar = wlwVar.b;
        vunVar.getClass();
        Object objU = yfm.U(vunVar);
        vun<wlv> vunVar2 = wlwVar.b;
        vunVar2.getClass();
        int iAbs = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        for (wlv wlvVar : vunVar2) {
            int i5 = wlvVar.d * wlvVar.c;
            if (i5 != 0) {
                int i6 = i5 - (i2 * i);
                if (Math.abs(i6) < iAbs) {
                    iAbs = Math.abs(i6);
                    objU = wlvVar;
                }
            }
        }
        wlv wlvVar2 = (wlv) objU;
        return hqfVar.e(new hpw(wlvVar2 != null ? wlvVar2.b : null), i, i2, hllVar);
    }
}
