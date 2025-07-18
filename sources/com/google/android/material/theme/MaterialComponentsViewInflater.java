package com.google.android.material.theme;

import android.content.Context;
import android.support.v7.app.AppCompatViewInflater;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import defpackage.biq;
import defpackage.bjp;
import defpackage.blc;
import defpackage.blf;
import defpackage.ff;
import defpackage.fh;
import defpackage.fi;
import defpackage.ft;
import defpackage.gm;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    @Override // android.support.v7.app.AppCompatViewInflater
    public final ff a(Context context, AttributeSet attributeSet) {
        return new blc(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final fh b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final fi c(Context context, AttributeSet attributeSet) {
        return new biq(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final ft d(Context context, AttributeSet attributeSet) {
        return new bjp(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final gm e(Context context, AttributeSet attributeSet) {
        return new blf(context, attributeSet);
    }
}
