package com.google.android.apps.tvsearch.widget.bounded;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.jpf;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FlexibleBottomPaddingFrameLayout extends FrameLayout {
    private int a;

    public FlexibleBottomPaddingFrameLayout(Context context) {
        super(context);
    }

    static int a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, jpf.a, 0, 0);
        try {
            return typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (getChildCount() > 1) {
            throw new IllegalStateException("FlexibleBottomPaddingFrameLayout can have at most 1 child!");
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            childAt.measure(i, i2);
            if (childAt.getMeasuredHeight() >= (View.MeasureSpec.getSize(i2) - this.a) - getPaddingTop()) {
                setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), 0);
            } else {
                setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), this.a);
            }
        }
        super.onMeasure(i, i2);
    }

    public FlexibleBottomPaddingFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = a(context, attributeSet);
    }

    public FlexibleBottomPaddingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = a(context, attributeSet);
    }

    public FlexibleBottomPaddingFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = a(context, attributeSet);
    }
}
