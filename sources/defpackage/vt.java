package defpackage;

import android.util.DisplayMetrics;
import android.view.View;
import androidx.leanback.widget.GridLayoutManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public class vt extends iw {
    public boolean n;
    final /* synthetic */ GridLayoutManager o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt(GridLayoutManager gridLayoutManager) {
        super(gridLayoutManager.d.getContext());
        this.o = gridLayoutManager;
    }

    @Override // defpackage.iw
    protected final float f(DisplayMetrics displayMetrics) {
        return super.f(displayMetrics) * this.o.b;
    }

    @Override // defpackage.iw
    protected final int h(int i) {
        int iH = super.h(i);
        int i2 = this.o.O.d.f;
        if (i2 > 0) {
            float f = (30.0f / i2) * i;
            if (iH < f) {
                return (int) f;
            }
        }
        return iH;
    }

    @Override // defpackage.iw
    protected final void i() {
        super.i();
        if (!this.n) {
            m();
        }
        GridLayoutManager gridLayoutManager = this.o;
        if (gridLayoutManager.p == this) {
            gridLayoutManager.p = null;
        }
        if (gridLayoutManager.q == this) {
            gridLayoutManager.q = null;
        }
    }

    @Override // defpackage.iw
    protected final void l(View view, iu iuVar) {
        int i;
        int i2;
        GridLayoutManager gridLayoutManager = this.o;
        int[] iArr = GridLayoutManager.a;
        if (gridLayoutManager.ai(view, null, iArr)) {
            if (gridLayoutManager.e == 0) {
                i = iArr[0];
                i2 = iArr[1];
            } else {
                i = iArr[1];
                i2 = iArr[0];
            }
            iuVar.b(i, i2, g((int) Math.sqrt((i * i) + (i2 * i2))), this.i);
        }
    }

    protected void m() {
        View viewC = c(this.a);
        if (viewC == null) {
            int i = this.a;
            if (i >= 0) {
                this.o.bC(i, false);
                return;
            }
            return;
        }
        GridLayoutManager gridLayoutManager = this.o;
        int i2 = gridLayoutManager.o;
        int i3 = this.a;
        if (i2 != i3) {
            gridLayoutManager.o = i3;
        }
        if (gridLayoutManager.be()) {
            gridLayoutManager.m |= 32;
            viewC.requestFocus();
            gridLayoutManager.m &= -33;
        }
        gridLayoutManager.G();
        gridLayoutManager.H();
    }
}
