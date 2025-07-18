package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.view.View;
import defpackage.tbj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TabItem extends View {
    public final CharSequence a;
    public final Drawable b;
    public final int c;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, tbj.a);
        this.a = tintTypedArrayObtainStyledAttributes.getText(2);
        this.b = tintTypedArrayObtainStyledAttributes.getDrawable(0);
        this.c = tintTypedArrayObtainStyledAttributes.getResourceId(1, 0);
        tintTypedArrayObtainStyledAttributes.recycle();
    }
}
