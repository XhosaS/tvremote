package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class swo extends swa {
    private int P;
    private int Q;
    public final FrameLayout.LayoutParams a;

    public swo(Context context) {
        super(context);
        this.P = -1;
        this.Q = 0;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.a = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        this.E = true;
        svz[] svzVarArr = this.e;
        if (svzVarArr != null) {
            for (svz svzVar : svzVarArr) {
                if (svzVar instanceof svw) {
                    ((svw) svzVar).l = true;
                }
            }
        }
    }

    private final int n(int i, int i2, int i3) {
        int iMax = i2 / Math.max(1, i3);
        int size = this.P;
        if (size == -1) {
            size = View.MeasureSpec.getSize(i);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, iMax), 0);
    }

    private final int o(int i, int i2, int i3, View view) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, 0);
        int childCount = getChildCount();
        int iP = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (!(childAt instanceof svw)) {
                int iP2 = p(childAt, i, iMakeMeasureSpec);
                i2 -= iP2;
                iP += iP2;
            }
        }
        int iN = view == null ? n(i, Math.max(i2, 0), i3) : View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = getChildAt(i6);
            if (childAt2.getVisibility() == 0) {
                i5++;
            }
            if ((childAt2 instanceof svw) && childAt2 != view) {
                iP += p(childAt2, i, iN);
            }
        }
        return iP + (Math.max(0, i5 - 1) * this.Q);
    }

    private static final int p(View view, int i, int i2) {
        view.measure(i, i2);
        if (view.getVisibility() != 8) {
            return view.getMeasuredHeight();
        }
        return 0;
    }

    @Override // defpackage.swa
    protected final svw a(Context context) {
        return new swn(context);
    }

    public final void l(int i) {
        if (this.P != i) {
            this.P = i;
            requestLayout();
        }
    }

    public final void m(int i) {
        if (this.Q != i) {
            this.Q = i;
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = 0;
        int measuredHeight = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                measuredHeight += childAt.getMeasuredHeight();
                i5++;
            }
        }
        int iMax = i5 <= 1 ? 0 : Math.max(0, Math.min((getMeasuredHeight() - measuredHeight) / (i5 - 1), this.Q));
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt2 = getChildAt(i8);
            if (childAt2.getVisibility() != 8) {
                int measuredHeight2 = childAt2.getMeasuredHeight();
                childAt2.layout(0, i7, i3 - i, measuredHeight2 + i7);
                i7 += measuredHeight2 + iMax;
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int iO;
        int iP;
        int size = View.MeasureSpec.getSize(i2);
        int iB = b();
        if (iB <= 1 || !j(this.c, iB)) {
            iO = o(i, size, iB, null);
        } else {
            View childAt = getChildAt(this.g);
            if (childAt != null) {
                iP = p(childAt, i, n(i, size, iB));
                size -= iP;
                iB--;
            } else {
                iP = 0;
            }
            iO = iP + o(i, size, iB, childAt);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.resolveSizeAndState(iO, i2, 0));
    }
}
