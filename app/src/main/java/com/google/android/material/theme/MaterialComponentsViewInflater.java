package com.google.android.material.theme;

import android.content.Context;
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import defpackage.ld;
import defpackage.lg;
import defpackage.ly;
import defpackage.uzr;
import defpackage.vax;
import defpackage.vcw;
import defpackage.vda;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    @Override // android.support.v7.app.AppCompatViewInflater
    public final ld a(Context context, AttributeSet attributeSet) {
        return new vcw(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final lg c(Context context, AttributeSet attributeSet) {
        return new uzr(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final ly d(Context context, AttributeSet attributeSet) {
        return new vax(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new vda(context, attributeSet);
    }
}
