package defpackage;

import android.graphics.PointF;
import androidx.leanback.widget.GridLayoutManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vs extends vt {
    final /* synthetic */ GridLayoutManager m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs(GridLayoutManager gridLayoutManager) {
        super(gridLayoutManager);
        this.m = gridLayoutManager;
    }

    @Override // defpackage.iw
    public final PointF b(int i) {
        if (a() == 0) {
            return null;
        }
        GridLayoutManager gridLayoutManager = this.m;
        int iBp = GridLayoutManager.bp(gridLayoutManager.aB(0));
        int i2 = -1;
        if ((gridLayoutManager.m & 262144) == 0 ? i >= iBp : i <= iBp) {
            i2 = 1;
        }
        int i3 = gridLayoutManager.e;
        float f = i2;
        return i3 == 0 ? new PointF(f, 0.0f) : new PointF(0.0f, f);
    }
}
