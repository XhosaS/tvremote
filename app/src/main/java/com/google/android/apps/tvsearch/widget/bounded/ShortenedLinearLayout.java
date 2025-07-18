package com.google.android.apps.tvsearch.widget.bounded;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.jpf;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ShortenedLinearLayout extends LinearLayout {
    final int a;

    public ShortenedLinearLayout(Context context) {
        super(context);
        this.a = 0;
    }

    static int a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, jpf.b, 0, 0);
        try {
            return typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2) - this.a;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(0, size), View.MeasureSpec.getMode(i2)));
    }

    public ShortenedLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = a(context, attributeSet);
    }

    public ShortenedLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = a(context, attributeSet);
    }

    public ShortenedLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = a(context, attributeSet);
    }
}
