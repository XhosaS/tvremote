package defpackage;

import android.graphics.PointF;
import android.view.View;
import androidx.leanback.widget.GridLayoutManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vv extends vt {
    public final boolean m;
    public int p;
    public final /* synthetic */ GridLayoutManager q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv(GridLayoutManager gridLayoutManager, int i, boolean z) {
        super(gridLayoutManager);
        this.q = gridLayoutManager;
        this.p = i;
        this.m = z;
        this.a = -2;
    }

    @Override // defpackage.iw
    public final PointF b(int i) {
        int i2 = this.p;
        if (i2 == 0) {
            return null;
        }
        GridLayoutManager gridLayoutManager = this.q;
        int i3 = -1;
        if ((gridLayoutManager.m & 262144) == 0 ? i2 >= 0 : i2 <= 0) {
            i3 = 1;
        }
        int i4 = gridLayoutManager.e;
        float f = i3;
        return i4 == 0 ? new PointF(f, 0.0f) : new PointF(0.0f, f);
    }

    @Override // defpackage.vt
    protected final void m() {
        super.m();
        this.p = 0;
        View viewC = c(this.a);
        if (viewC != null) {
            this.q.O(viewC, true);
        }
    }
}
