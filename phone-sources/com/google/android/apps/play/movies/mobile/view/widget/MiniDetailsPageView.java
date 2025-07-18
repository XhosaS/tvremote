package com.google.android.apps.play.movies.mobile.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MiniDetailsPageView extends RelativeLayout {
    public MiniDetailsPageView(Context context) {
        super(context);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        findViewById(R.id.subtitle_panel);
        findViewById(R.id.rating_container);
        findViewById(R.id.price);
    }

    public MiniDetailsPageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MiniDetailsPageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
