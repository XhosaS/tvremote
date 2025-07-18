package com.google.android.material.slider;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.videos.R;
import defpackage.irc;
import defpackage.tam;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class Slider extends tam<Slider, Object, irc> {
    public Slider(Context context) {
        this(context, null);
    }

    @Override // defpackage.tam
    protected final void q() {
        if (this.h != -1) {
            return;
        }
        this.h = 0;
    }

    public final void s(float f) {
        i(Float.valueOf(f));
    }

    public final /* bridge */ /* synthetic */ void t() {
        this.f = 0.0f;
        this.i = true;
        postInvalidate();
    }

    public Slider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.sliderStyle);
    }

    public Slider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.value});
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            s(typedArrayObtainStyledAttributes.getFloat(0, 0.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
