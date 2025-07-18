package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import defpackage.bih;
import defpackage.bii;
import defpackage.bij;
import defpackage.bik;
import defpackage.bil;
import defpackage.bjz;
import defpackage.bkh;
import defpackage.bks;
import defpackage.fg;
import defpackage.fh;
import defpackage.ii;
import defpackage.jo;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MaterialButton extends fh implements Checkable, bks {
    private static final int[] g = {R.attr.state_checkable};
    private static final int[] h = {R.attr.state_checked};
    public final bik b;
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

    public MaterialButton(Context context) {
        this(context, null);
    }

    private final int i() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    private final void j() {
        if (o()) {
            setCompoundDrawablesRelative(this.l, null, null, null);
        } else if (n()) {
            setCompoundDrawablesRelative(null, null, this.l, null);
        } else if (p()) {
            setCompoundDrawablesRelative(null, this.l, null, null);
        }
    }

    private final void k(boolean z) {
        if (!h() || this.q == z) {
            return;
        }
        this.q = z;
        refreshDrawableState();
        if (getParent() instanceof bil) {
            throw null;
        }
        if (this.r) {
            return;
        }
        this.r = true;
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((bih) it.next()).a();
        }
        this.r = false;
    }

    private final void l(boolean z) {
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
            j();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((!o() || drawable3 == this.l) && ((!n() || drawable5 == this.l) && (!p() || drawable4 == this.l))) {
            return;
        }
        j();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m(int r7, int r8) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.m(int, int):void");
    }

    private final boolean n() {
        int i = this.s;
        return i == 3 || i == 4;
    }

    private final boolean o() {
        int i = this.s;
        return i == 1 || i == 2;
    }

    private final boolean p() {
        int i = this.s;
        return i == 16 || i == 32;
    }

    private final boolean q() {
        bik bikVar = this.b;
        return (bikVar == null || bikVar.p) ? false : true;
    }

    final String c() {
        if (TextUtils.isEmpty(null)) {
            return (true != h() ? Button.class : CompoundButton.class).getName();
        }
        return null;
    }

    @Override // defpackage.bks
    public final void d(bkh bkhVar) {
        if (!q()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.b.c(bkhVar);
    }

    public final void e(ColorStateList colorStateList) {
        if (q()) {
            bik bikVar = this.b;
            if (bikVar.l != colorStateList) {
                bikVar.l = colorStateList;
                if (bikVar.a() != null) {
                    bikVar.a().setTintList(bikVar.l);
                    return;
                }
                return;
            }
            return;
        }
        fg fgVar = this.a;
        if (fgVar != null) {
            if (fgVar.a == null) {
                fgVar.a = new jo();
            }
            jo joVar = fgVar.a;
            joVar.a = colorStateList;
            joVar.d = true;
            fgVar.a();
        }
    }

    public final void f(PorterDuff.Mode mode) {
        if (q()) {
            bik bikVar = this.b;
            if (bikVar.k != mode) {
                bikVar.k = mode;
                if (bikVar.a() == null || bikVar.k == null) {
                    return;
                }
                bikVar.a().setTintMode(bikVar.k);
                return;
            }
            return;
        }
        fg fgVar = this.a;
        if (fgVar != null) {
            if (fgVar.a == null) {
                fgVar.a = new jo();
            }
            jo joVar = fgVar.a;
            joVar.b = mode;
            joVar.c = true;
            fgVar.a();
        }
    }

    public final void g() {
        int i = this.d;
        getLayoutParams().width = (int) (this.u + 0.0f);
        setPaddingRelative(this.v + i, getPaddingTop(), this.w - i, getPaddingBottom());
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        jo joVar;
        if (q()) {
            return this.b.l;
        }
        fg fgVar = this.a;
        if (fgVar == null || (joVar = fgVar.a) == null) {
            return null;
        }
        return joVar.a;
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        jo joVar;
        if (q()) {
            return this.b.k;
        }
        fg fgVar = this.a;
        if (fgVar == null || (joVar = fgVar.a) == null) {
            return null;
        }
        return joVar.b;
    }

    public final boolean h() {
        bik bikVar = this.b;
        return bikVar != null && bikVar.q;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.q;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (q()) {
            bjz.a(this, this.b.a());
        }
        boolean z = false;
        if ((getParent() instanceof bij) && ((bij) getParent()).getOrientation() == 0) {
            z = true;
        }
        this.e = z;
    }

    @Override // android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (h()) {
            mergeDrawableStates(iArrOnCreateDrawableState, g);
        }
        if (this.q) {
            mergeDrawableStates(iArrOnCreateDrawableState, h);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // defpackage.fh, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(c());
        accessibilityEvent.setChecked(this.q);
    }

    @Override // defpackage.fh, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(c());
        accessibilityNodeInfo.setCheckable(h());
        accessibilityNodeInfo.setChecked(this.q);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // defpackage.fh, android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        m(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.t != i6) {
            this.t = i6;
            this.u = -1.0f;
        }
        if (this.u == -1.0f) {
            this.u = getMeasuredWidth();
            if (getParent() instanceof bij) {
                throw null;
            }
        }
        if (this.f == -1) {
            Drawable drawable = this.l;
            if (drawable == null) {
                i5 = 0;
            } else {
                int i7 = this.p;
                int intrinsicWidth = this.m;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = drawable.getIntrinsicWidth();
                }
                i5 = i7 + intrinsicWidth;
            }
            this.f = (getMeasuredWidth() - i()) - i5;
        }
        if (this.v == -1) {
            this.v = getPaddingStart();
        }
        if (this.w == -1) {
            this.w = getPaddingEnd();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof bii)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        bii biiVar = (bii) parcelable;
        super.onRestoreInstanceState(biiVar.d);
        k(biiVar.a);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        bii biiVar = new bii(super.onSaveInstanceState());
        biiVar.a = this.q;
        return biiVar;
    }

    @Override // defpackage.fh, android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m(getMeasuredWidth(), getMeasuredHeight());
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
    public final void setBackgroundColor(int i) {
        if (!q()) {
            super.setBackgroundColor(i);
            return;
        }
        bik bikVar = this.b;
        if (bikVar.a() != null) {
            bikVar.a().setTint(i);
        }
    }

    @Override // defpackage.fh, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (!q()) {
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

    @Override // defpackage.fh, android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? ii.J(getContext(), i) : null);
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        e(colorStateList);
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        f(mode);
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        k(z);
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        if (q()) {
            this.b.a().l(f);
        }
    }

    @Override // android.view.View
    public final void setTextAlignment(int i) {
        super.setTextAlignment(i);
        m(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView
    public final void setWidth(int i) {
        this.u = -1.0f;
        super.setWidth(i);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        k(!this.q);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.tv.remote.service.R.attr.materialButtonStyle);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialButton(android.content.Context r25, android.util.AttributeSet r26, int r27) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 846
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
