package com.google.android.libraries.bind.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.videos.R;
import defpackage.orr;
import defpackage.ors;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class LoadingView extends FrameLayout implements orr {
    private final ors a;

    public LoadingView(Context context) {
        this(context, null, 0);
    }

    @Override // defpackage.orr
    public final void a() {
        this.a.c();
    }

    public LoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(context, R.layout.bind__loading, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.a = new ors(context, attributeSet, this);
    }
}
