package com.google.android.play.drawer;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.PointerIcon;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlayDrawerPrimaryActionView extends AppCompatTextView {
    public PlayDrawerPrimaryActionView(Context context) {
        super(context);
    }

    @Override // android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (isClickable() && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    public PlayDrawerPrimaryActionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
