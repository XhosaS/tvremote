package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spr extends swa {
    private final int P;
    private final int Q;
    private final int R;
    private final int S;
    private final List T;
    public boolean a;

    public spr(Context context) {
        super(context);
        this.T = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.P = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.Q = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.R = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.S = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // defpackage.swa
    protected final svw a(Context context) {
        return new spq(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int measuredWidth = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                int i6 = i4 - i2;
                if (getLayoutDirection() == 1) {
                    int i7 = (i3 - i) - measuredWidth;
                    childAt.layout(i7 - childAt.getMeasuredWidth(), 0, i7, i6);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i6);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int measuredWidth;
        int iMax;
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        int iB = b();
        int childCount = getChildCount();
        List list = this.T;
        list.clear();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), Integer.MIN_VALUE);
        int i5 = 0;
        if (this.d == 0) {
            if (j(this.c, iB) && this.a) {
                View childAt = getChildAt(this.g);
                int iMax2 = this.S;
                if (childAt.getVisibility() != 8) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(this.R, Integer.MIN_VALUE), iMakeMeasureSpec);
                    iMax2 = Math.max(iMax2, childAt.getMeasuredWidth());
                }
                int i6 = iB - (childAt.getVisibility() != 8 ? 1 : 0);
                int iMin = Math.min(size - (this.Q * i6), Math.min(iMax2, this.R));
                int i7 = size - iMin;
                int iMin2 = Math.min(i7 / (i6 != 0 ? i6 : 1), this.P);
                int i8 = i7 - (i6 * iMin2);
                int i9 = 0;
                while (i9 < childCount) {
                    if (getChildAt(i9).getVisibility() != 8) {
                        i4 = i9 == this.g ? iMin : iMin2;
                        if (i8 > 0) {
                            i4++;
                            i8--;
                        }
                    } else {
                        i4 = 0;
                    }
                    list.add(Integer.valueOf(i4));
                    i9++;
                }
            } else {
                int iMin3 = Math.min(size / (iB != 0 ? iB : 1), this.R);
                int i10 = size - (iB * iMin3);
                for (int i11 = 0; i11 < childCount; i11++) {
                    if (getChildAt(i11).getVisibility() == 8) {
                        i3 = 0;
                    } else if (i10 > 0) {
                        i3 = iMin3 + 1;
                        i10--;
                    } else {
                        i3 = iMin3;
                    }
                    list.add(Integer.valueOf(i3));
                }
            }
            measuredWidth = 0;
            iMax = 0;
            while (i5 < childCount) {
                View childAt2 = getChildAt(i5);
                if (childAt2.getVisibility() != 8) {
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(((Integer) list.get(i5)).intValue(), 1073741824), iMakeMeasureSpec);
                    childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                    measuredWidth += childAt2.getMeasuredWidth();
                    iMax = Math.max(iMax, childAt2.getMeasuredHeight());
                }
                i5++;
            }
        } else {
            if (iB == 0) {
                iB = 1;
            }
            float f = size;
            float fMin = Math.min((iB + 3) / 10.0f, 0.9f) * f;
            float f2 = iB;
            float f3 = f / f2;
            int iRound = Math.round(fMin / f2);
            int iRound2 = Math.round(f3);
            int measuredWidth2 = 0;
            int iMax3 = 0;
            while (i5 < childCount) {
                View childAt3 = getChildAt(i5);
                if (childAt3.getVisibility() != 8) {
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(iRound2, Integer.MIN_VALUE), iMakeMeasureSpec);
                    if (childAt3.getMeasuredWidth() < iRound) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(iRound, 1073741824), iMakeMeasureSpec);
                    }
                    measuredWidth2 += childAt3.getMeasuredWidth();
                    iMax3 = Math.max(iMax3, childAt3.getMeasuredHeight());
                }
                i5++;
            }
            measuredWidth = measuredWidth2;
            iMax = iMax3;
        }
        setMeasuredDimension(measuredWidth, Math.max(iMax, getSuggestedMinimumHeight()));
    }
}
