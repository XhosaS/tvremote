package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cnr extends can implements cvq {
    public final Window a;
    public boolean b;
    public boolean c;
    public boolean d;
    private final bcb e;
    private boolean f;

    public cnr(Context context, Window window) {
        super(context, null, 0, 6, null);
        this.a = window;
        this.e = new bci(cnn.a, bcz.c);
        int[] iArr = cww.a;
        cwm.l(this, this);
        nxb.q(this, new cnp(this));
    }

    @Override // defpackage.can
    public final void a(bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(1735448596);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (baoVarD.L((i2 & 3) != 2, i2 & 1)) {
            ((yjz) this.e.a()).a(baoVarD, 0);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new cnq(this, i, 0);
        }
    }

    public final void b(baw bawVar, yjz yjzVar) {
        super.h(bawVar);
        this.e.b(yjzVar);
        this.f = true;
        d();
    }

    @Override // defpackage.can
    protected final boolean c() {
        return this.f;
    }

    @Override // defpackage.can
    public final void f(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft2 = getPaddingLeft() + (((i5 - measuredWidth) - paddingLeft) / 2);
        int paddingTop2 = getPaddingTop() + (((i6 - measuredHeight) - paddingTop) / 2);
        childAt.layout(paddingLeft2, paddingTop2, measuredWidth + paddingLeft2, measuredHeight + paddingTop2);
    }

    @Override // defpackage.can
    public final void g(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.g(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        int i3 = (mode != Integer.MIN_VALUE || this.b || this.c || this.a.getAttributes().height != -2) ? size2 : size2 + 1;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i4 = size - paddingLeft;
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = i3 - paddingTop;
        int i6 = i5 >= 0 ? i5 : 0;
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 != 0) {
            i = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        }
        childAt.measure(i, i2);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingLeft);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingLeft;
        }
        setMeasuredDimension(size, mode != Integer.MIN_VALUE ? mode != 1073741824 ? childAt.getMeasuredHeight() + paddingTop : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingTop));
        if (this.c || childAt.getMeasuredHeight() + paddingTop <= size2) {
            return;
        }
        Window window = this.a;
        if (window.getAttributes().height == -2) {
            window.addFlags(Integer.MIN_VALUE);
            if (this.b) {
                return;
            }
            window.setLayout(-1, -1);
        }
    }

    @Override // defpackage.cvq
    public final cyh onApplyWindowInsets(View view, cyh cyhVar) {
        if (!this.c) {
            int i = 0;
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0) {
                i = iMax;
            } else if (iMax2 == 0) {
                if (iMax3 != 0) {
                    iMax2 = 0;
                } else if (iMax4 != 0) {
                    iMax2 = 0;
                    iMax3 = 0;
                }
            }
            return cyhVar.n(i, iMax2, iMax3, iMax4);
        }
        return cyhVar;
    }
}
