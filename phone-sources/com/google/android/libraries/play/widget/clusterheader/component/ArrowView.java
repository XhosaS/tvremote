package com.google.android.libraries.play.widget.clusterheader.component;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ArrowView extends AppCompatImageView {
    public ArrowView(Context context) {
        this(context, null);
    }

    public ArrowView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        getResources().getDimensionPixelSize(R.dimen.replay__clusterheader__arrow_spacing);
    }
}
