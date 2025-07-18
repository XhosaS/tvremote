package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.v7.widget.SwitchCompat;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import com.google.android.videos.R;
import defpackage.a;
import defpackage.csq;
import defpackage.ssr;
import defpackage.suy;
import defpackage.svg;
import defpackage.tde;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MaterialSwitch extends SwitchCompat {
    private static final int[] a = {R.attr.state_with_icon};
    private Drawable b;
    private Drawable c;
    private int d;
    private Drawable e;
    private Drawable f;
    private ColorStateList g;
    private ColorStateList h;
    private PorterDuff.Mode i;
    private ColorStateList j;
    private ColorStateList k;
    private PorterDuff.Mode l;
    private int[] m;
    private int[] n;

    public MaterialSwitch(Context context) {
        this(context, null);
    }

    private final void a() {
        this.b = ssr.i(this.b, this.g, getThumbTintMode());
        this.c = ssr.i(this.c, this.h, this.i);
        d();
        Drawable drawable = this.b;
        Drawable drawable2 = this.c;
        int i = this.d;
        super.setThumbDrawable(ssr.d(drawable, drawable2, i, i));
        refreshDrawableState();
    }

    private final void b() {
        Drawable drawable;
        this.e = ssr.i(this.e, this.j, getTrackTintMode());
        this.f = ssr.i(this.f, this.k, this.l);
        d();
        Drawable layerDrawable = this.e;
        if (layerDrawable != null && (drawable = this.f) != null) {
            layerDrawable = new LayerDrawable(new Drawable[]{layerDrawable, drawable});
        } else if (layerDrawable == null) {
            layerDrawable = this.f;
        }
        if (layerDrawable != null) {
            setSwitchMinWidth(layerDrawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(layerDrawable);
    }

    private static void c(Drawable drawable, ColorStateList colorStateList, int[] iArr, int[] iArr2, float f) {
        if (drawable != null) {
            drawable.setTint(csq.d(colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0), f));
        }
    }

    private final void d() {
        ColorStateList colorStateList = this.g;
        if (colorStateList == null && this.h == null && this.j == null && this.k == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        if (colorStateList != null) {
            c(this.b, colorStateList, this.m, this.n, thumbPosition);
        }
        ColorStateList colorStateList2 = this.h;
        if (colorStateList2 != null) {
            c(this.c, colorStateList2, this.m, this.n, thumbPosition);
        }
        ColorStateList colorStateList3 = this.j;
        if (colorStateList3 != null) {
            c(this.e, colorStateList3, this.m, this.n, thumbPosition);
        }
        ColorStateList colorStateList4 = this.k;
        if (colorStateList4 != null) {
            c(this.f, colorStateList4, this.m, this.n, thumbPosition);
        }
    }

    @Override // android.support.v7.widget.SwitchCompat
    public final Drawable getThumbDrawable() {
        return this.b;
    }

    @Override // android.support.v7.widget.SwitchCompat
    public final ColorStateList getThumbTintList() {
        return this.g;
    }

    @Override // android.support.v7.widget.SwitchCompat
    public final Drawable getTrackDrawable() {
        return this.e;
    }

    @Override // android.support.v7.widget.SwitchCompat
    public final ColorStateList getTrackTintList() {
        return this.j;
    }

    @Override // android.view.View
    public final void invalidate() {
        d();
        super.invalidate();
    }

    @Override // android.support.v7.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.c != null) {
            mergeDrawableStates(iArrOnCreateDrawableState, a);
        }
        int[] iArr = new int[iArrOnCreateDrawableState.length];
        int i2 = 0;
        for (int i3 : iArrOnCreateDrawableState) {
            if (i3 != 16842912) {
                iArr[i2] = i3;
                i2++;
            }
        }
        this.m = iArr;
        this.n = ssr.h(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.support.v7.widget.SwitchCompat
    public final void setThumbDrawable(Drawable drawable) {
        this.b = drawable;
        a();
    }

    @Override // android.support.v7.widget.SwitchCompat
    public final void setThumbTintList(ColorStateList colorStateList) {
        this.g = colorStateList;
        a();
    }

    @Override // android.support.v7.widget.SwitchCompat
    public final void setThumbTintMode(PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        a();
    }

    @Override // android.support.v7.widget.SwitchCompat
    public final void setTrackDrawable(Drawable drawable) {
        this.e = drawable;
        b();
    }

    @Override // android.support.v7.widget.SwitchCompat
    public final void setTrackTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        b();
    }

    @Override // android.support.v7.widget.SwitchCompat
    public final void setTrackTintMode(PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        b();
    }

    public MaterialSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSwitchStyle);
    }

    public MaterialSwitch(Context context, AttributeSet attributeSet, int i) {
        super(tde.a(context, attributeSet, i, R.style.Widget_Material3_CompoundButton_MaterialSwitch), attributeSet, i);
        this.d = -1;
        Context context2 = getContext();
        this.b = super.getThumbDrawable();
        this.g = super.getThumbTintList();
        super.setThumbTintList(null);
        this.e = super.getTrackDrawable();
        this.j = super.getTrackTintList();
        super.setTrackTintList(null);
        TintTypedArray tintTypedArrayB = suy.b(context2, attributeSet, svg.a, i, R.style.Widget_Material3_CompoundButton_MaterialSwitch, new int[0]);
        this.c = tintTypedArrayB.getDrawable(0);
        this.d = tintTypedArrayB.getDimensionPixelSize(1, -1);
        this.h = tintTypedArrayB.getColorStateList(2);
        this.i = a.ae(tintTypedArrayB.getInt(3, -1), PorterDuff.Mode.SRC_IN);
        this.f = tintTypedArrayB.getDrawable(4);
        this.k = tintTypedArrayB.getColorStateList(5);
        this.l = a.ae(tintTypedArrayB.getInt(6, -1), PorterDuff.Mode.SRC_IN);
        tintTypedArrayB.recycle();
        setEnforceSwitchWidth(false);
        a();
        b();
    }
}
