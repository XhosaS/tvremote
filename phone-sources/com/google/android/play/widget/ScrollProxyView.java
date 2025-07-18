package com.google.android.play.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ScrollProxyView extends View {
    public ScrollProxyView(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return i >= 0 || getScrollY() > 0;
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public ScrollProxyView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrollProxyView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getVisibility() != 8) {
            setVisibility(8);
        }
    }
}
