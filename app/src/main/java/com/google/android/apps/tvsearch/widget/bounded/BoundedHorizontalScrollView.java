package com.google.android.apps.tvsearch.widget.bounded;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class BoundedHorizontalScrollView extends HorizontalScrollView {
    private int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoundedHorizontalScrollView(Context context) {
        super(context);
        context.getClass();
        this.a = Integer.MAX_VALUE;
    }

    public final int getMaximumWidth() {
        return this.a;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.a >= 0 && getMeasuredWidth() > this.a) {
            getMeasuredWidth();
            getLayoutParams().width = this.a;
            requestLayout();
        }
    }

    public final void setMaximumWidth(int i) {
        this.a = i;
        if (i <= 0) {
            this.a = Integer.MAX_VALUE;
            getLayoutParams().width = -2;
            requestLayout();
            return;
        }
        if (i == Integer.MAX_VALUE) {
            getLayoutParams().width = -2;
            requestLayout();
            return;
        }
        if (getMeasuredWidth() != 0) {
            if (getMeasuredWidth() < i) {
                getMeasuredWidth();
                getLayoutParams().width = -2;
                requestLayout();
            } else {
                if (getMeasuredWidth() > i) {
                    getMeasuredWidth();
                    getLayoutParams().width = i;
                    requestLayout();
                    return;
                }
                int i2 = getLayoutParams().width;
                if (i2 <= 0 || i2 >= i) {
                    return;
                }
                int i3 = getLayoutParams().width;
                getLayoutParams().width = i;
                requestLayout();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BoundedHorizontalScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BoundedHorizontalScrollView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoundedHorizontalScrollView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        this.a = Integer.MAX_VALUE;
    }
}
