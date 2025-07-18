package com.google.android.apps.googletv.app.presentation.views.viewinflater;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import com.google.android.material.theme.MaterialComponentsViewInflater;
import defpackage.kje;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CustomViewInflater extends MaterialComponentsViewInflater {
    @Override // android.support.v7.app.AppCompatViewInflater
    protected final AppCompatEditText createEditText(Context context, AttributeSet attributeSet) {
        context.getClass();
        return new kje(context, attributeSet);
    }
}
