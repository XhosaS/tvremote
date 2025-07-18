package com.google.android.play.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TouchBlockingFrameLayout extends FrameLayout {
    public TouchBlockingFrameLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public TouchBlockingFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TouchBlockingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
