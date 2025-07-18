package com.google.android.play.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.videos.R;
import defpackage.cww;
import defpackage.tdk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlayCardThumbnail extends FrameLayout {
    private ImageView a;
    private final int b;

    public PlayCardThumbnail(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final int getBaseline() {
        return getPaddingTop() + this.a.getMeasuredHeight();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageView) findViewById(this.b);
    }

    public PlayCardThumbnail(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tdk.g);
        this.b = typedArrayObtainStyledAttributes.getResourceId(1, R.id.li_thumbnail);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        int[] iArr = cww.a;
        getPaddingStart();
        getPaddingTop();
        getPaddingEnd();
        getPaddingBottom();
    }
}
