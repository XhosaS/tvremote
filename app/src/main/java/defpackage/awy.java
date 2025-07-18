package defpackage;

import android.graphics.PointF;
import androidx.leanback.widget.GridLayoutManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public class awy extends awz {
    final /* synthetic */ GridLayoutManager f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awy(GridLayoutManager gridLayoutManager) {
        super(gridLayoutManager);
        this.f = gridLayoutManager;
    }

    @Override // defpackage.qr
    public final PointF k(int i) {
        if (j() == 0) {
            return null;
        }
        GridLayoutManager gridLayoutManager = this.f;
        int iAD = gridLayoutManager.aD(gridLayoutManager.aI(0));
        int i2 = -1;
        if ((gridLayoutManager.n & 262144) == 0 ? i >= iAD : i <= iAD) {
            i2 = 1;
        }
        int i3 = gridLayoutManager.e;
        float f = i2;
        return i3 == 0 ? new PointF(f, 0.0f) : new PointF(0.0f, f);
    }
}
