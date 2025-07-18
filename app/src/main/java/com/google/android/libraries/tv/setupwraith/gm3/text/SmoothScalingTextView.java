package com.google.android.libraries.tv.setupwraith.gm3.text;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SmoothScalingTextView extends TextView {
    public SmoothScalingTextView(Context context) {
        super(context);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        setPaintFlags(getPaintFlags() | 192);
    }

    public SmoothScalingTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SmoothScalingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SmoothScalingTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
