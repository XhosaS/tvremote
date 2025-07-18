package com.google.android.libraries.onegoogle.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConstraintLayoutInterceptingTouches extends ConstraintLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutInterceptingTouches(Context context) {
        super(context);
        context.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutInterceptingTouches(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutInterceptingTouches(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutInterceptingTouches(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
    }
}
