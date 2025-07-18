package com.google.android.apps.play.movies.mobile.usecase.downloads;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DownloadSectionHeadingView extends RelativeLayout {
    public TextView a;

    public DownloadSectionHeadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        this.a = (TextView) findViewById(R.id.title);
    }
}
