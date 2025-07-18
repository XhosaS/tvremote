package com.google.android.libraries.play.widget.fireball;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.videos.R;
import defpackage.sdx;
import defpackage.seb;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FireballResetTagView extends FrameLayout {
    private final int a;
    private final int b;

    public FireballResetTagView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        ImageView imageView = (ImageView) findViewById(R.id.button);
        imageView.setImageResource(R.drawable.play__fireball__reset);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int i = this.b;
        layoutParams.width = i;
        layoutParams.height = i;
        imageView.setLayoutParams(layoutParams);
        imageView.setOutlineProvider(new sdx());
        imageView.setClipToOutline(true);
        imageView.setImageTintList(ColorStateList.valueOf(this.a));
    }

    public FireballResetTagView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, seb.b, R.attr.fireballViewStyle, 0);
        this.a = typedArrayObtainStyledAttributes.getColor(2, 0);
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, resources.getDimensionPixelSize(R.dimen.play__fireball__outline_height));
        typedArrayObtainStyledAttributes.recycle();
    }
}
