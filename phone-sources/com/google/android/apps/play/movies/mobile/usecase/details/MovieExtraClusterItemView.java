package com.google.android.apps.play.movies.mobile.usecase.details;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.videos.R;
import defpackage.mue;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MovieExtraClusterItemView extends mue {
    public View a;
    public ProgressBar b;
    public TextView c;
    public TextView d;

    public MovieExtraClusterItemView(Context context) {
        super(context);
    }

    @Override // defpackage.muf, android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.c = (TextView) findViewById(R.id.title);
        this.d = (TextView) findViewById(R.id.duration);
        this.b = (ProgressBar) findViewById(R.id.watch_progress);
        this.a = findViewById(R.id.synopsis_target);
    }

    public MovieExtraClusterItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MovieExtraClusterItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
