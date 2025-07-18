package defpackage;

import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class khj implements yjz {
    final /* synthetic */ boolean a;
    private final /* synthetic */ int b;

    public khj(boolean z, int i) {
        this.b = i;
        this.a = z;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.b != 0) {
            bao baoVar = (bao) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && baoVar.K()) {
                baoVar.t();
            } else if (this.a) {
                khk.a.e(R.drawable.gs_check_vd_theme_24, null, 0L, baoVar, 3072);
            }
            return ygi.a;
        }
        bao baoVar2 = (bao) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && baoVar2.K()) {
            baoVar2.t();
        } else if (this.a) {
            khk.a.e(R.drawable.gs_check_vd_theme_24, null, 0L, baoVar2, 3072);
        }
        return ygi.a;
    }
}
