package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import defpackage.vco;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class Snackbar$SnackbarLayout extends vco {
    public Snackbar$SnackbarLayout(Context context) {
        super(context);
    }

    @Override // defpackage.vco, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getLayoutParams().width == -1) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
            }
        }
    }

    public Snackbar$SnackbarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
