package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatButton;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.customview.view.AbsSavedState;
import defpackage.abs;
import defpackage.aqo;
import defpackage.le;
import defpackage.ra;
import defpackage.rt;
import defpackage.uzi;
import defpackage.uzj;
import defpackage.uzk;
import defpackage.uzl;
import defpackage.uzm;
import defpackage.vbb;
import defpackage.vbr;
import defpackage.vbw;
import defpackage.vch;
import defpackage.vck;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MaterialButton extends AppCompatButton implements Checkable, vch {
    private static final int[] g = {R.attr.state_checkable};
    private static final int[] h = {R.attr.state_checked};
    public final uzl b;
    public boolean c;
    public int d;
    public boolean e;
    int f;
    private final LinkedHashSet i;
    private PorterDuff.Mode j;
    private ColorStateList k;
    private Drawable l;
    private int m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private boolean r;
    private int s;
    private int t;
    private float u;
    private int v;
    private int w;
    private LinearLayout.LayoutParams x;

    public MaterialButton(Context context) {
        this(context, null);
    }

    private final int j() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    private final void k() {
        if (p()) {
            setCompoundDrawablesRelative(this.l, null, null, null);
        } else if (o()) {
            setCompoundDrawablesRelative(null, null, this.l, null);
        } else if (q()) {
            setCompoundDrawablesRelative(null, this.l, null, null);
        }
    }

    private final void l(boolean z) {
        if (!i() || this.q == z) {
            return;
        }
        this.q = z;
        refreshDrawableState();
        if (getParent() instanceof uzm) {
            throw null;
        }
        if (this.r) {
            return;
        }
        this.r = true;
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((uzi) it.next()).a();
        }
        this.r = false;
    }

    private final void m(boolean z) {
        Drawable drawable = this.l;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.l = drawableMutate;
            drawableMutate.setTintList(this.k);
            PorterDuff.Mode mode = this.j;
            if (mode != null) {
                this.l.setTintMode(mode);
            }
            int intrinsicWidth = this.m;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.l.getIntrinsicWidth();
            }
            int intrinsicHeight = this.m;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.l.getIntrinsicHeight();
            }
            Drawable drawable2 = this.l;
            int i = this.n;
            int i2 = this.o;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.l.setVisible(true, z);
        }
        if (z) {
            k();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((!p() || drawable3 == this.l) && ((!o() || drawable5 == this.l) && (!q() || drawable4 == this.l))) {
            return;
        }
        k();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void n(int r7, int r8) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.n(int, int):void");
    }

    private final boolean o() {
        int i = this.s;
        return i == 3 || i == 4;
    }

    private final boolean p() {
        int i = this.s;
        return i == 1 || i == 2;
    }

    private final boolean q() {
        int i = this.s;
        return i == 16 || i == 32;
    }

    private final boolean r() {
        uzl uzlVar = this.b;
        return (uzlVar == null || uzlVar.o) ? false : true;
    }

    final String c() {
        if (TextUtils.isEmpty(null)) {
            return (true != i() ? Button.class : CompoundButton.class).getName();
        }
        return null;
    }

    public final void d(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.vch
    public final void e(vbw vbwVar) {
        if (!r()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.b.c(vbwVar);
    }

    public final void f(ColorStateList colorStateList) {
        if (r()) {
            uzl uzlVar = this.b;
            if (uzlVar.l != colorStateList) {
                uzlVar.l = colorStateList;
                if (uzlVar.a(false) != null) {
                    uzlVar.a(false).setTintList(uzlVar.l);
                    return;
                }
                return;
            }
            return;
        }
        le leVar = this.a;
        if (leVar != null) {
            if (leVar.a == null) {
                leVar.a = new rt();
            }
            rt rtVar = leVar.a;
            rtVar.a = colorStateList;
            rtVar.d = true;
            leVar.c();
        }
    }

    public final void g(PorterDuff.Mode mode) {
        if (r()) {
            uzl uzlVar = this.b;
            if (uzlVar.k != mode) {
                uzlVar.k = mode;
                if (uzlVar.a(false) == null || uzlVar.k == null) {
                    return;
                }
                uzlVar.a(false).setTintMode(uzlVar.k);
                return;
            }
            return;
        }
        le leVar = this.a;
        if (leVar != null) {
            if (leVar.a == null) {
                leVar.a = new rt();
            }
            rt rtVar = leVar.a;
            rtVar.b = mode;
            rtVar.c = true;
            leVar.c();
        }
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (r()) {
            return this.b.i;
        }
        return 0;
    }

    public aqo getCornerSpringForce() {
        return this.b.d;
    }

    public Drawable getIcon() {
        return this.l;
    }

    public int getIconGravity() {
        return this.s;
    }

    public int getIconPadding() {
        return this.p;
    }

    public int getIconSize() {
        return this.m;
    }

    public ColorStateList getIconTint() {
        return this.k;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.j;
    }

    public int getInsetBottom() {
        return this.b.h;
    }

    public int getInsetTop() {
        return this.b.g;
    }

    public ColorStateList getRippleColor() {
        if (r()) {
            return this.b.n;
        }
        return null;
    }

    public vbw getShapeAppearanceModel() {
        if (r()) {
            return this.b.b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public vck getStateListShapeAppearanceModel() {
        if (r()) {
            return this.b.c;
        }
        throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (r()) {
            return this.b.m;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (r()) {
            return this.b.j;
        }
        return 0;
    }

    @Override // android.support.v7.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return r() ? this.b.l : super.getSupportBackgroundTintList();
    }

    @Override // android.support.v7.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return r() ? this.b.k : super.getSupportBackgroundTintMode();
    }

    public final void h() {
        int i = this.d;
        getLayoutParams().width = (int) (this.u + 0.0f);
        setPaddingRelative(this.v + i, getPaddingTop(), this.w - i, getPaddingBottom());
    }

    public final boolean i() {
        uzl uzlVar = this.b;
        return uzlVar != null && uzlVar.q;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.q;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (r()) {
            vbr.b(this, this.b.a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (i()) {
            mergeDrawableStates(iArrOnCreateDrawableState, g);
        }
        if (this.q) {
            mergeDrawableStates(iArrOnCreateDrawableState, h);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.support.v7.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(c());
        accessibilityEvent.setChecked(this.q);
    }

    @Override // android.support.v7.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(c());
        accessibilityNodeInfo.setCheckable(i());
        accessibilityNodeInfo.setChecked(this.q);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        n(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.t != i6) {
            this.t = i6;
            this.u = -1.0f;
        }
        if (this.u == -1.0f) {
            this.u = getMeasuredWidth();
            if (this.x == null && (getParent() instanceof uzk) && ((uzk) getParent()).getButtonSizeChange() != null) {
                this.x = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.x);
                layoutParams.width = (int) this.u;
                setLayoutParams(layoutParams);
            }
        }
        boolean z2 = false;
        if (this.f == -1) {
            if (this.l == null) {
                i5 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.m;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.l.getIntrinsicWidth();
                }
                i5 = iconPadding + intrinsicWidth;
            }
            this.f = (getMeasuredWidth() - j()) - i5;
        }
        if (this.v == -1) {
            this.v = getPaddingStart();
        }
        if (this.w == -1) {
            this.w = getPaddingEnd();
        }
        if ((getParent() instanceof uzk) && ((uzk) getParent()).getOrientation() == 0) {
            z2 = true;
        }
        this.e = z2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        l(savedState.a);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.q;
        return savedState;
    }

    @Override // android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        n(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (isEnabled() && this.b.r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.l != null) {
            if (this.l.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!r()) {
            super.setBackgroundColor(i);
            return;
        }
        uzl uzlVar = this.b;
        if (uzlVar.a(false) != null) {
            uzlVar.a(false).setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.support.v7.widget.AppCompatButton, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (!r()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.b.b();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // android.support.v7.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i) {
        Drawable drawableC;
        if (i != 0) {
            drawableC = ra.e().c(getContext(), i);
        } else {
            drawableC = null;
        }
        setBackgroundDrawable(drawableC);
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        f(colorStateList);
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        g(mode);
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        l(z);
    }

    public void setCornerRadius(int i) {
        if (r()) {
            uzl uzlVar = this.b;
            if (uzlVar.p && uzlVar.i == i) {
                return;
            }
            uzlVar.i = i;
            uzlVar.p = true;
            uzlVar.c(uzlVar.b.c(i));
        }
    }

    public void setCornerRadiusResource(int i) {
        if (r()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (r()) {
            this.b.a(false).k(f);
        }
    }

    public void setIconGravity(int i) {
        if (this.s != i) {
            this.s = i;
            n(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.p != i) {
            this.p = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        Drawable drawableC;
        if (i != 0) {
            drawableC = ra.e().c(getContext(), i);
        } else {
            drawableC = null;
        }
        if (this.l != drawableC) {
            this.l = drawableC;
            m(true);
            n(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.m != i) {
            this.m = i;
            m(true);
        }
    }

    public void setIconTintResource(int i) throws Resources.NotFoundException {
        ColorStateList colorStateListB = abs.b(getContext(), i);
        if (this.k != colorStateListB) {
            this.k = colorStateListB;
            m(false);
        }
    }

    public void setInsetBottom(int i) {
        uzl uzlVar = this.b;
        uzlVar.d(uzlVar.g, i);
    }

    public void setInsetTop(int i) {
        uzl uzlVar = this.b;
        uzlVar.d(i, uzlVar.h);
    }

    public void setRippleColorResource(int i) throws Resources.NotFoundException {
        if (r()) {
            ColorStateList colorStateListB = abs.b(getContext(), i);
            if (r()) {
                uzl uzlVar = this.b;
                if (uzlVar.n != colorStateListB) {
                    uzlVar.n = colorStateListB;
                    MaterialButton materialButton = uzlVar.a;
                    if (materialButton.getBackground() instanceof RippleDrawable) {
                        ((RippleDrawable) materialButton.getBackground()).setColor(vbb.a(colorStateListB));
                    }
                }
            }
        }
    }

    public void setStrokeColorResource(int i) throws Resources.NotFoundException {
        if (r()) {
            ColorStateList colorStateListB = abs.b(getContext(), i);
            if (r()) {
                uzl uzlVar = this.b;
                if (uzlVar.m != colorStateListB) {
                    uzlVar.m = colorStateListB;
                    uzlVar.g();
                }
            }
        }
    }

    public void setStrokeWidth(int i) {
        if (r()) {
            uzl uzlVar = this.b;
            if (uzlVar.j != i) {
                uzlVar.j = i;
                uzlVar.g();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (r()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        n(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        this.u = -1.0f;
        super.setWidth(i);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        l(!this.q);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.katniss.R.attr.materialButtonStyle);
    }

    /* compiled from: PG */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new uzj();
        boolean a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            this.a = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.d, i);
            parcel.writeInt(this.a ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialButton(android.content.Context r11, android.util.AttributeSet r12, int r13) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
