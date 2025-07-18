package com.google.android.libraries.tv.widgets.card;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CardFocusableFrameLayout extends FrameLayout {
    private boolean a;

    public CardFocusableFrameLayout(Context context) {
        super(context);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.a) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setForeground(Drawable drawable) {
        try {
            this.a = true;
            super.setForeground(drawable);
        } finally {
            this.a = false;
        }
    }

    public CardFocusableFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardFocusableFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CardFocusableFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
