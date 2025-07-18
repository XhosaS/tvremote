package com.google.android.libraries.bind.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import defpackage.orf;
import defpackage.orr;
import defpackage.ors;
import defpackage.ort;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BoundImageView extends AppCompatImageView implements orr {
    protected ors a;
    private final ort b;
    private final ort c;

    public BoundImageView(Context context) {
        this(context, null);
    }

    @Override // defpackage.orr
    public final void a() {
        this.a.c();
        if (this.b != null) {
            setColorFilter((ColorFilter) null);
        }
        if (this.c != null) {
            setImageTintList(null);
        }
    }

    public BoundImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new ors(context, attributeSet, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, orf.c, i, 0);
        ors.a(typedArrayObtainStyledAttributes, 1);
        this.b = ors.a(typedArrayObtainStyledAttributes, 0);
        this.c = ors.a(typedArrayObtainStyledAttributes, 2);
        typedArrayObtainStyledAttributes.recycle();
    }
}
