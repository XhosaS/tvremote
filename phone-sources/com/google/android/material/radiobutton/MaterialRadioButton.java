package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatRadioButton;
import android.util.AttributeSet;
import defpackage.sin;
import defpackage.sip;
import defpackage.suy;
import defpackage.syb;
import defpackage.tde;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MaterialRadioButton extends AppCompatRadioButton {
    private static final int[][] a = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private ColorStateList b;
    private boolean c;

    public MaterialRadioButton(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.c && getButtonTintList() == null) {
            this.c = true;
            if (this.b == null) {
                int iC = sip.c(this, com.google.android.videos.R.attr.colorControlActivated);
                int iC2 = sip.c(this, com.google.android.videos.R.attr.colorOnSurface);
                int iC3 = sip.c(this, com.google.android.videos.R.attr.colorSurface);
                int[][] iArr = a;
                int length = iArr.length;
                this.b = new ColorStateList(iArr, new int[]{sip.f(iC3, iC, 1.0f), sip.f(iC3, iC2, 0.54f), sip.f(iC3, iC2, 0.38f), sip.f(iC3, iC2, 0.38f)});
            }
            setButtonTintList(this.b);
        }
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.videos.R.attr.radioButtonStyle);
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(tde.a(context, attributeSet, i, com.google.android.videos.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayA = suy.a(context2, attributeSet, syb.a, i, com.google.android.videos.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayA.hasValue(0)) {
            setButtonTintList(sin.h(context2, typedArrayA, 0));
        }
        this.c = typedArrayA.getBoolean(1, false);
        typedArrayA.recycle();
    }
}
