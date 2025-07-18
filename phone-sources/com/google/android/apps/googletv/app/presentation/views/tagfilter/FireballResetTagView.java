package com.google.android.apps.googletv.app.presentation.views.tagfilter;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.videos.R;
import defpackage.kkf;
import defpackage.ykn;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class FireballResetTagView extends FrameLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FireballResetTagView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        ImageView imageView = (ImageView) findViewById(R.id.button);
        imageView.setImageResource(R.drawable.gtv__fireball__reset);
        imageView.setOutlineProvider(new kkf());
        imageView.setClipToOutline(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FireballResetTagView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ FireballResetTagView(Context context, AttributeSet attributeSet, int i, ykn yknVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
