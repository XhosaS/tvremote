package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.ActivityChooserView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class sug extends ViewGroup {
    public int c;
    public int d;
    public boolean e;
    public int f;

    public sug(Context context) {
        this(context, null);
    }

    private static int a(int i, int i2, int i3) {
        return i2 != Integer.MIN_VALUE ? i2 != 1073741824 ? i3 : i : Math.min(i3, i);
    }

    private final void b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, suo.a, 0, 0);
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int marginEnd;
        int marginStart;
        boolean z2;
        int i5 = 0;
        if (getChildCount() == 0) {
            this.f = 0;
            return;
        }
        boolean z3 = true;
        this.f = 1;
        boolean z4 = getLayoutDirection() == 1;
        int paddingRight = z4 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z4 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i6 = 0;
        int measuredWidth = paddingRight;
        int i7 = paddingTop;
        while (i6 < getChildCount()) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
                z2 = z3;
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginStart = marginLayoutParams.getMarginStart();
                    marginEnd = marginLayoutParams.getMarginEnd();
                } else {
                    marginEnd = i5;
                    marginStart = marginEnd;
                }
                int measuredWidth2 = measuredWidth + marginStart + childAt.getMeasuredWidth();
                int i8 = i3 - i;
                z2 = z3;
                int i9 = i8 - paddingLeft;
                if (!this.e && measuredWidth2 > i9) {
                    measuredWidth2 = paddingRight + marginStart + childAt.getMeasuredWidth();
                    i7 = paddingTop + this.c;
                    this.f++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.f - 1));
                int measuredHeight = childAt.getMeasuredHeight() + i7;
                if (z4) {
                    childAt.layout(i8 - measuredWidth2, i7, (i8 - measuredWidth) - marginStart, measuredHeight);
                } else {
                    childAt.layout(measuredWidth + marginStart, i7, measuredWidth2, measuredHeight);
                }
                measuredWidth += marginStart + marginEnd + childAt.getMeasuredWidth() + this.d;
                paddingTop = measuredHeight;
            }
            i6++;
            z3 = z2;
            i5 = 0;
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int paddingLeft;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i3 = size;
        } else if (mode == 1073741824) {
            mode = 1073741824;
            i3 = size;
        } else {
            i3 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
        int paddingLeft2 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i3 - getPaddingRight();
        int i6 = paddingTop;
        int i7 = 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i4 = marginLayoutParams.leftMargin;
                    i5 = marginLayoutParams.rightMargin;
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                int i9 = paddingLeft2;
                if (paddingLeft2 + i4 + childAt.getMeasuredWidth() <= paddingRight || this.e) {
                    paddingLeft = i9;
                } else {
                    paddingLeft = getPaddingLeft();
                    i6 = this.c + paddingTop;
                }
                int measuredWidth = paddingLeft + i4 + childAt.getMeasuredWidth();
                int measuredHeight = i6 + childAt.getMeasuredHeight();
                if (measuredWidth > i7) {
                    i7 = measuredWidth;
                }
                paddingLeft2 = paddingLeft + i4 + i5 + childAt.getMeasuredWidth() + this.d;
                if (i8 == getChildCount() - 1) {
                    i7 += i5;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(a(size, mode, i7 + getPaddingRight()), a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    public sug(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public sug(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = false;
        b(context, attributeSet);
    }

    public sug(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.e = false;
        b(context, attributeSet);
    }
}
