package defpackage;

import android.graphics.PointF;
import android.view.View;
import androidx.leanback.widget.GridLayoutManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axb extends awz {
    public final boolean f;
    public int p;
    public final /* synthetic */ GridLayoutManager q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axb(GridLayoutManager gridLayoutManager, int i, boolean z) {
        super(gridLayoutManager);
        this.q = gridLayoutManager;
        this.p = i;
        this.f = z;
        this.g = -2;
    }

    @Override // defpackage.qr
    public final PointF k(int i) {
        int i2 = this.p;
        if (i2 == 0) {
            return null;
        }
        GridLayoutManager gridLayoutManager = this.q;
        int i3 = -1;
        if ((gridLayoutManager.n & 262144) == 0 ? i2 >= 0 : i2 <= 0) {
            i3 = 1;
        }
        int i4 = gridLayoutManager.e;
        float f = i3;
        return i4 == 0 ? new PointF(f, 0.0f) : new PointF(0.0f, f);
    }

    @Override // defpackage.awz
    protected final void o() {
        super.o();
        this.p = 0;
        View viewL = l(this.g);
        if (viewL != null) {
            this.q.aa(viewL, viewL.findFocus(), true, 0, 0);
        }
    }
}
