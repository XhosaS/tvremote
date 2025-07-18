package com.google.android.libraries.internal.growth.growthkit.internal.ui.impl.gm.dialogs;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.pgx;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MaxDimensionsLinearLayout extends LinearLayout {
    public int a;
    public int b;

    public MaxDimensionsLinearLayout(Context context) {
        super(context);
        this.a = -1;
        this.b = -1;
    }

    private final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pgx.a);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    private static final int b(int i, int i2) {
        return (i2 == -1 || i2 >= View.MeasureSpec.getSize(i)) ? i : View.MeasureSpec.makeMeasureSpec(i2, View.MeasureSpec.getMode(i));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(b(i, this.b), b(i2, this.a));
    }

    public MaxDimensionsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = -1;
        this.b = -1;
        a(context, attributeSet);
    }

    public MaxDimensionsLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = -1;
        this.b = -1;
        a(context, attributeSet);
    }

    public MaxDimensionsLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = -1;
        this.b = -1;
        a(context, attributeSet);
    }
}
