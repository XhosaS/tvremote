package com.google.android.apps.googletv.app.presentation.views.contentrating;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.videos.R;
import defpackage.ykn;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ContentRatingView extends LinearLayout {
    public final ImageView a;
    public final TextView b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContentRatingView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContentRatingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentRatingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        View.inflate(context, R.layout.content_rating_layout_view, this);
        View viewFindViewById = findViewById(R.id.content_rating_image);
        viewFindViewById.getClass();
        this.a = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.content_rating_txt);
        viewFindViewById2.getClass();
        this.b = (TextView) viewFindViewById2;
    }

    public /* synthetic */ ContentRatingView(Context context, AttributeSet attributeSet, int i, int i2, ykn yknVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
