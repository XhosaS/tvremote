package com.google.android.libraries.bind.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import defpackage.cww;
import defpackage.orf;
import defpackage.orr;
import defpackage.ors;
import defpackage.ort;
import defpackage.ory;
import defpackage.osa;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BoundTextView extends AppCompatTextView implements orr {
    public static final osa a;
    private final ors b;
    private ort c;
    private final ort d;
    private final ort e;
    private final ort f;
    private final ort g;
    private final ort h;
    private final int i;
    private final float j;

    static {
        ory.a(BoundTextView.class);
        a = new osa();
    }

    public BoundTextView(Context context) {
        this(context, null, 0);
    }

    private final void b(Drawable[] drawableArr, ort ortVar, boolean z) {
        if (ortVar != null) {
            int[] iArr = cww.a;
            char c = 2;
            if (getLayoutDirection() == 0 && z) {
                c = 0;
            }
            drawableArr[c] = null;
        }
    }

    @Override // defpackage.orr
    public final void a() {
        this.b.c();
        if (this.c != null) {
            setText((CharSequence) null);
        }
        if (this.d != null) {
            setTextColor(this.i);
        }
        ort ortVar = this.e;
        if (ortVar != null || this.f != null) {
            Drawable[] compoundDrawables = getCompoundDrawables();
            b(compoundDrawables, ortVar, true);
            b(compoundDrawables, this.f, false);
            setCompoundDrawablesWithIntrinsicBounds(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
        }
        if (this.g != null) {
            setTextSize(0, this.j);
        }
        if (this.h != null) {
            Integer num = 0;
            num.getClass();
            setBreakStrategy(0);
        }
    }

    public BoundTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BoundTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public BoundTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        String string;
        super(context, attributeSet, i);
        this.b = new ors(context, attributeSet, this);
        this.i = getCurrentTextColor();
        this.j = getTextSize();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, orf.d, i, i2);
        if (isInEditMode() && (string = typedArrayObtainStyledAttributes.getString(8)) != null) {
            setText(string);
        }
        this.c = ors.a(typedArrayObtainStyledAttributes, 3);
        this.d = ors.a(typedArrayObtainStyledAttributes, 5);
        ors.a(typedArrayObtainStyledAttributes, 6);
        this.e = ors.a(typedArrayObtainStyledAttributes, 1);
        this.f = ors.a(typedArrayObtainStyledAttributes, 0);
        ors.a(typedArrayObtainStyledAttributes, 2);
        this.g = ors.a(typedArrayObtainStyledAttributes, 7);
        this.h = ors.a(typedArrayObtainStyledAttributes, 4);
        typedArrayObtainStyledAttributes.recycle();
        setSpannableFactory(a);
    }
}
