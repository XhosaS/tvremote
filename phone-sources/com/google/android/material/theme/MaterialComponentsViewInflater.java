package com.google.android.material.theme;

import android.content.Context;
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.widget.AppCompatAutoCompleteTextView;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.AppCompatRadioButton;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import defpackage.tct;
import defpackage.tdc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    @Override // android.support.v7.app.AppCompatViewInflater
    protected final AppCompatAutoCompleteTextView createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new tct(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    protected final AppCompatButton createButton(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    protected final AppCompatCheckBox createCheckBox(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    protected final AppCompatRadioButton createRadioButton(Context context, AttributeSet attributeSet) {
        return new MaterialRadioButton(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    protected final AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        return new tdc(context, attributeSet);
    }
}
