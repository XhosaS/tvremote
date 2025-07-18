package com.google.android.play.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PageIndicator extends LinearLayout {
    public PageIndicator(Context context) {
        this(context, null, 0);
    }

    protected final void a() {
        setGravity(16);
    }

    public PageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public PageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
