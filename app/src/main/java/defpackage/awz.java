package defpackage;

import android.util.DisplayMetrics;
import android.view.View;
import androidx.leanback.widget.GridLayoutManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public class awz extends or {
    public boolean n;
    final /* synthetic */ GridLayoutManager o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awz(GridLayoutManager gridLayoutManager) {
        super(gridLayoutManager.d.getContext());
        this.o = gridLayoutManager;
    }

    @Override // defpackage.or
    protected final float a(DisplayMetrics displayMetrics) {
        return super.a(displayMetrics) * this.o.b;
    }

    @Override // defpackage.or
    protected final int d(int i) {
        int iD = super.d(i);
        int i2 = this.o.T.d.h;
        if (i2 > 0) {
            float f = (30.0f / i2) * i;
            if (iD < f) {
                return (int) f;
            }
        }
        return iD;
    }

    @Override // defpackage.or, defpackage.qr
    protected final void g() {
        super.g();
        if (!this.n) {
            o();
        }
        GridLayoutManager gridLayoutManager = this.o;
        if (gridLayoutManager.r == this) {
            gridLayoutManager.r = null;
        }
        if (gridLayoutManager.s == this) {
            gridLayoutManager.s = null;
        }
    }

    @Override // defpackage.or, defpackage.qr
    protected final void i(View view, qp qpVar) {
        int i;
        int i2;
        int[] iArr = GridLayoutManager.a;
        GridLayoutManager gridLayoutManager = this.o;
        if (gridLayoutManager.bG(view, null, iArr)) {
            if (gridLayoutManager.e == 0) {
                i = iArr[0];
                i2 = iArr[1];
            } else {
                i = iArr[1];
                i2 = iArr[0];
            }
            qpVar.b(i, i2, c((int) Math.sqrt((i * i) + (i2 * i2))), this.b);
        }
    }

    protected void o() {
        View viewL = l(this.g);
        if (viewL == null) {
            int i = this.g;
            if (i >= 0) {
                this.o.bN(i, 0, false);
                return;
            }
            return;
        }
        GridLayoutManager gridLayoutManager = this.o;
        int i2 = gridLayoutManager.p;
        int i3 = this.g;
        if (i2 != i3) {
            gridLayoutManager.p = i3;
        }
        if (gridLayoutManager.bl()) {
            gridLayoutManager.n |= 32;
            viewL.requestFocus();
            gridLayoutManager.n &= -33;
        }
        gridLayoutManager.M();
        gridLayoutManager.N();
    }
}
