package com.google.android.libraries.social.peoplekit.common.ui.tooltip;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.WindowInsets;
import android.widget.LinearLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class InsetAwareLinearLayout extends LinearLayout {
    private static final Rect a = new Rect();

    public InsetAwareLinearLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        motionEvent.getActionMasked();
        return zDispatchTouchEvent;
    }

    @Override // android.view.View
    protected final boolean fitSystemWindows(Rect rect) {
        a.set(rect);
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        a.set(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        return super.onApplyWindowInsets(windowInsets);
    }

    public InsetAwareLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InsetAwareLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
