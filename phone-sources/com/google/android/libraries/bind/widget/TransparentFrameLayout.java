package com.google.android.libraries.bind.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TransparentFrameLayout extends FrameLayout {
    public TransparentFrameLayout(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).setAlpha(getAlpha());
        }
    }

    @Override // android.view.View
    protected final boolean onSetAlpha(int i) {
        return true;
    }

    public TransparentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TransparentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
