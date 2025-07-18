package com.android.tv.twopanelsettings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TwoPanelScrollView extends HorizontalScrollView {
    public TwoPanelScrollView(Context context) {
        super(context);
    }

    @Override // android.widget.HorizontalScrollView
    public final boolean arrowScroll(int i) {
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 1 || actionMasked == 2 || actionMasked == 3) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 1 || actionMasked == 2 || actionMasked == 3) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public TwoPanelScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
