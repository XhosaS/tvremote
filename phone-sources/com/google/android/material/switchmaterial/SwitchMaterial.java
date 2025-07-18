package com.google.android.material.switchmaterial;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import defpackage.sil;
import defpackage.sip;
import defpackage.sst;
import defpackage.suy;
import defpackage.tbg;
import defpackage.tde;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SwitchMaterial extends SwitchCompat {
    private static final int[][] a = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private final sst b;
    private ColorStateList c;
    private ColorStateList d;
    private boolean e;

    public SwitchMaterial(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() throws Resources.NotFoundException {
        super.onAttachedToWindow();
        if (this.e && getThumbTintList() == null) {
            if (this.c == null) {
                int iC = sip.c(this, com.google.android.videos.R.attr.colorSurface);
                int iC2 = sip.c(this, com.google.android.videos.R.attr.colorControlActivated);
                float dimension = getResources().getDimension(com.google.android.videos.R.dimen.mtrl_switch_thumb_elevation);
                sst sstVar = this.b;
                if (sstVar.a) {
                    dimension += sil.g(this);
                }
                int iB = sstVar.b(iC, dimension);
                int[][] iArr = a;
                int length = iArr.length;
                this.c = new ColorStateList(iArr, new int[]{sip.f(iC, iC2, 1.0f), iB, sip.f(iC, iC2, 0.38f), iB});
            }
            setThumbTintList(this.c);
        }
        if (this.e && getTrackTintList() == null) {
            if (this.d == null) {
                int[][] iArr2 = a;
                int length2 = iArr2.length;
                int iC3 = sip.c(this, com.google.android.videos.R.attr.colorSurface);
                int iC4 = sip.c(this, com.google.android.videos.R.attr.colorControlActivated);
                int iC5 = sip.c(this, com.google.android.videos.R.attr.colorOnSurface);
                this.d = new ColorStateList(iArr2, new int[]{sip.f(iC3, iC4, 0.54f), sip.f(iC3, iC5, 0.32f), sip.f(iC3, iC4, 0.12f), sip.f(iC3, iC5, 0.12f)});
            }
            setTrackTintList(this.d);
        }
    }

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.videos.R.attr.switchStyle);
    }

    public SwitchMaterial(Context context, AttributeSet attributeSet, int i) {
        super(tde.a(context, attributeSet, i, com.google.android.videos.R.style.Widget_MaterialComponents_CompoundButton_Switch), attributeSet, i);
        Context context2 = getContext();
        this.b = new sst(context2);
        TypedArray typedArrayA = suy.a(context2, attributeSet, tbg.a, i, com.google.android.videos.R.style.Widget_MaterialComponents_CompoundButton_Switch, new int[0]);
        this.e = typedArrayA.getBoolean(0, false);
        typedArrayA.recycle();
    }
}
