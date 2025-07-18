package com.google.android.libraries.bind.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import defpackage.orf;
import defpackage.oru;
import defpackage.orz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BindingFrameLayout extends orz {
    public final oru a;

    public BindingFrameLayout(Context context) {
        this(context, null, 0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.ViewGroup, orr] */
    public final void b() {
        ?? r0 = this.a.c;
        r0.a();
        oru.c(r0);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        oru oruVar = this.a;
        oruVar.a = true;
        oruVar.b = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        oru oruVar = this.a;
        oruVar.a = false;
        oruVar.b = false;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        oru.b(this.a.c);
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.a.a();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        oru oruVar = this.a;
        if (oruVar.b) {
            oruVar.a();
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.a.b = true;
    }

    public BindingFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BindingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        oru oruVar = new oru(this);
        this.a = oruVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, orf.b);
        oruVar.d = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }
}
