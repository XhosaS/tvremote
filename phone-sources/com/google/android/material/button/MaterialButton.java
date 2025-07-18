package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.AppCompatButton;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import defpackage.a;
import defpackage.dhb;
import defpackage.dhc;
import defpackage.dhe;
import defpackage.sim;
import defpackage.sin;
import defpackage.slt;
import defpackage.sql;
import defpackage.sqm;
import defpackage.sqn;
import defpackage.sqq;
import defpackage.sqr;
import defpackage.squ;
import defpackage.suy;
import defpackage.svr;
import defpackage.szg;
import defpackage.szq;
import defpackage.tab;
import defpackage.tae;
import defpackage.taf;
import defpackage.tag;
import defpackage.tde;
import defpackage.zft;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MaterialButton extends AppCompatButton implements Checkable, tab {
    private static final int[] a = {R.attr.state_checkable};
    private static final int[] b = {R.attr.state_checked};
    private static final dhc c = new sql();
    public static final /* synthetic */ int u = 0;
    private int A;
    private int B;
    private int C;
    private int D;
    private float E;
    private dhb F;
    private final LinkedHashSet d;
    public final sqr e;
    public Drawable f;
    public String g;
    public int h;
    public int i;
    public boolean j;
    public float k;
    public LinearLayout.LayoutParams l;
    public boolean m;
    public int n;
    public boolean o;
    public int p;
    public tag q;
    public int r;
    public float s;
    public zft t;
    private PorterDuff.Mode v;
    private ColorStateList w;
    private int x;
    private int y;
    private boolean z;

    public MaterialButton(Context context) {
        this(context, null);
    }

    private final int a() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    private final void b() {
        if (e()) {
            setCompoundDrawablesRelative(this.f, null, null, null);
        } else if (d()) {
            setCompoundDrawablesRelative(null, null, this.f, null);
        } else if (w()) {
            setCompoundDrawablesRelative(null, this.f, null, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void c(int r7, int r8) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.c(int, int):void");
    }

    private final boolean d() {
        int i = this.A;
        return i == 3 || i == 4;
    }

    private final boolean e() {
        int i = this.A;
        return i == 1 || i == 2;
    }

    private final boolean w() {
        int i = this.A;
        return i == 16 || i == 32;
    }

    public final int f() {
        if (u()) {
            return this.e.j;
        }
        return 0;
    }

    public final dhe g() {
        Context context = getContext();
        TypedValue typedValueD = sim.d(context, com.google.android.videos.R.attr.motionSpringFastSpatial);
        TypedArray typedArrayObtainStyledAttributes = typedValueD == null ? context.obtainStyledAttributes(null, svr.a, 0, com.google.android.videos.R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(typedValueD.resourceId, svr.a);
        dhe dheVar = new dhe();
        try {
            float f = typedArrayObtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f2 = typedArrayObtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            dheVar.e(f);
            dheVar.c(f2);
            return dheVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        return u() ? this.e.l : super.getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        return u() ? this.e.k : super.getSupportBackgroundTintMode();
    }

    @Override // android.support.v7.widget.AppCompatButton
    public final ColorStateList getSupportBackgroundTintList() {
        return u() ? this.e.l : super.getSupportBackgroundTintList();
    }

    @Override // android.support.v7.widget.AppCompatButton
    public final PorterDuff.Mode getSupportBackgroundTintMode() {
        return u() ? this.e.k : super.getSupportBackgroundTintMode();
    }

    final String h() {
        if (TextUtils.isEmpty(this.g)) {
            return (true != t() ? Button.class : CompoundButton.class).getName();
        }
        return this.g;
    }

    public final void i(boolean z) {
        if (this.q == null) {
            return;
        }
        if (this.F == null) {
            dhb dhbVar = new dhb(this, c);
            this.F = dhbVar;
            dhbVar.r = g();
        }
        if (this.o) {
            int i = this.r;
            tag tagVar = this.q;
            int iA = tagVar.a(getDrawableState());
            if (iA < 0) {
                iA = tagVar.a(StateSet.WILD_CARD);
            }
            Object obj = (iA < 0 ? tagVar.c : tagVar.d[iA]).a;
            int width = getWidth();
            taf tafVar = (taf) obj;
            int i2 = tafVar.b;
            float f = tafVar.a;
            if (i2 == 1) {
                f *= width;
            }
            this.F.d(Math.min(i, (int) f));
            if (z) {
                this.F.e();
            }
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.j;
    }

    public final void j(boolean z) {
        if (!t() || this.j == z) {
            return;
        }
        this.j = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z2 = this.j;
            if (!materialButtonToggleGroup.e) {
                materialButtonToggleGroup.k(getId(), z2);
            }
        }
        if (this.z) {
            return;
        }
        this.z = true;
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((sqm) it.next()).a();
        }
        this.z = false;
    }

    public final void k(int i) {
        if (u()) {
            sqr sqrVar = this.e;
            if (sqrVar.q && sqrVar.i == i) {
                return;
            }
            sqrVar.i = i;
            sqrVar.q = true;
            sqrVar.d(sqrVar.b.e(i));
        }
    }

    public final void l(int i) {
        this.E = Math.min(i, this.p);
        s();
        invalidate();
    }

    public final void m(Drawable drawable) {
        if (this.f != drawable) {
            this.f = drawable;
            r(true);
            c(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void n(ColorStateList colorStateList) {
        if (this.w != colorStateList) {
            this.w = colorStateList;
            r(false);
        }
    }

    public final void o(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (u()) {
            szg.f(this, this.e.a());
        }
        boolean z = false;
        if ((getParent() instanceof sqq) && ((sqq) getParent()).getOrientation() == 0) {
            z = true;
        }
        this.o = z;
    }

    @Override // android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (t()) {
            mergeDrawableStates(iArrOnCreateDrawableState, a);
        }
        if (this.j) {
            mergeDrawableStates(iArrOnCreateDrawableState, b);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.support.v7.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(h());
        accessibilityEvent.setChecked(this.j);
    }

    @Override // android.support.v7.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(h());
        accessibilityNodeInfo.setCheckable(t());
        accessibilityNodeInfo.setChecked(this.j);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // android.support.v7.widget.AppCompatButton, android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        c(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.B != i6) {
            this.B = i6;
            this.k = -1.0f;
        }
        if (this.k == -1.0f) {
            this.k = getMeasuredWidth();
            if (this.l == null && (getParent() instanceof sqq) && ((sqq) getParent()).c != null) {
                this.l = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.l);
                layoutParams.width = (int) this.k;
                setLayoutParams(layoutParams);
            }
        }
        if (this.p == -1) {
            Drawable drawable = this.f;
            if (drawable == null) {
                i5 = 0;
            } else {
                int i7 = this.i;
                int intrinsicWidth = this.h;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = drawable.getIntrinsicWidth();
                }
                i5 = i7 + intrinsicWidth;
            }
            this.p = (getMeasuredWidth() - a()) - i5;
        }
        if (this.C == -1) {
            this.C = getPaddingStart();
        }
        if (this.D == -1) {
            this.D = getPaddingEnd();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof sqn)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        sqn sqnVar = (sqn) parcelable;
        super.onRestoreInstanceState(sqnVar.getSuperState());
        j(sqnVar.a);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        sqn sqnVar = new sqn(super.onSaveInstanceState());
        sqnVar.a = this.j;
        return sqnVar;
    }

    @Override // android.support.v7.widget.AppCompatButton, android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        c(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // defpackage.tab
    public final void p(szq szqVar) {
        if (!u()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.e.d(szqVar);
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (isEnabled() && this.e.s) {
            toggle();
        }
        return super.performClick();
    }

    public final void q(boolean z) {
        if (u()) {
            sqr sqrVar = this.e;
            sqrVar.o = z;
            sqrVar.h();
        }
    }

    public final void r(boolean z) {
        Drawable drawable = this.f;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f = drawableMutate;
            drawableMutate.setTintList(this.w);
            PorterDuff.Mode mode = this.v;
            if (mode != null) {
                this.f.setTintMode(mode);
            }
            int intrinsicWidth = this.h;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f.getIntrinsicWidth();
            }
            int intrinsicHeight = this.h;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f;
            int i = this.x;
            int i2 = this.y;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.f.setVisible(true, z);
        }
        if (z) {
            b();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((!e() || drawable3 == this.f) && ((!d() || drawable5 == this.f) && (!w() || drawable4 == this.f))) {
            return;
        }
        b();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f != null) {
            if (this.f.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public final void s() {
        int i = (int) (this.s - this.E);
        int i2 = (i / 2) + this.n;
        getLayoutParams().width = (int) (this.k + i);
        setPaddingRelative(this.C + i2, getPaddingTop(), (this.D + i) - i2, getPaddingBottom());
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        if (!u()) {
            super.setBackgroundColor(i);
            return;
        }
        sqr sqrVar = this.e;
        if (sqrVar.a() != null) {
            sqrVar.a().setTint(i);
        }
    }

    @Override // android.support.v7.widget.AppCompatButton, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (!u()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.e.b();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // android.support.v7.widget.AppCompatButton, android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? AppCompatResources.getDrawable(getContext(), i) : null);
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        j(z);
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        if (u()) {
            this.e.a().M(f);
        }
    }

    @Override // android.view.View
    public final void setPressed(boolean z) {
        zft zftVar = this.t;
        if (zftVar != null) {
            ((sqq) zftVar.a).invalidate();
        }
        super.setPressed(z);
        i(false);
    }

    @Override // android.support.v7.widget.AppCompatButton
    public final void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!u()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        sqr sqrVar = this.e;
        if (sqrVar.l != colorStateList) {
            sqrVar.l = colorStateList;
            if (sqrVar.a() != null) {
                sqrVar.a().setTintList(sqrVar.l);
            }
        }
    }

    @Override // android.support.v7.widget.AppCompatButton
    public final void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!u()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        sqr sqrVar = this.e;
        if (sqrVar.k != mode) {
            sqrVar.k = mode;
            if (sqrVar.a() == null || sqrVar.k == null) {
                return;
            }
            sqrVar.a().setTintMode(sqrVar.k);
        }
    }

    @Override // android.view.View
    public final void setTextAlignment(int i) {
        super.setTextAlignment(i);
        c(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView
    public final void setWidth(int i) {
        this.k = -1.0f;
        super.setWidth(i);
    }

    public final boolean t() {
        sqr sqrVar = this.e;
        return sqrVar != null && sqrVar.r;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        j(!this.j);
    }

    public final boolean u() {
        sqr sqrVar = this.e;
        return (sqrVar == null || sqrVar.p) ? false : true;
    }

    public final void v() {
        if (this.A != 2) {
            this.A = 2;
            c(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.videos.R.attr.materialButtonStyle);
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        szq szqVar;
        super(tde.b(context, attributeSet, i, com.google.android.videos.R.style.Widget_MaterialComponents_Button, new int[]{com.google.android.videos.R.attr.materialSizeOverlay}), attributeSet, i);
        this.d = new LinkedHashSet();
        this.j = false;
        this.z = false;
        this.B = -1;
        this.k = -1.0f;
        this.C = -1;
        this.D = -1;
        this.p = -1;
        Context context2 = getContext();
        TypedArray typedArrayA = suy.a(context2, attributeSet, squ.a, i, com.google.android.videos.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.i = typedArrayA.getDimensionPixelSize(13, 0);
        this.v = a.ae(typedArrayA.getInt(16, -1), PorterDuff.Mode.SRC_IN);
        this.w = sin.h(getContext(), typedArrayA, 15);
        this.f = sin.j(getContext(), typedArrayA, 11);
        this.A = typedArrayA.getInteger(12, 1);
        this.h = typedArrayA.getDimensionPixelSize(14, 0);
        tae taeVarB = tae.b(context2, typedArrayA, 19);
        if (taeVarB != null) {
            szqVar = taeVarB.d();
        } else {
            szqVar = new szq(szq.c(context2, attributeSet, i, com.google.android.videos.R.style.Widget_MaterialComponents_Button));
        }
        boolean z = typedArrayA.getBoolean(17, false);
        sqr sqrVar = new sqr(this, szqVar);
        this.e = sqrVar;
        sqrVar.e = typedArrayA.getDimensionPixelOffset(2, 0);
        sqrVar.f = typedArrayA.getDimensionPixelOffset(3, 0);
        sqrVar.g = typedArrayA.getDimensionPixelOffset(4, 0);
        sqrVar.h = typedArrayA.getDimensionPixelOffset(5, 0);
        if (typedArrayA.hasValue(9)) {
            int dimensionPixelSize = typedArrayA.getDimensionPixelSize(9, -1);
            sqrVar.i = dimensionPixelSize;
            sqrVar.d(sqrVar.b.e(dimensionPixelSize));
            sqrVar.q = true;
        }
        sqrVar.j = typedArrayA.getDimensionPixelSize(22, 0);
        sqrVar.k = a.ae(typedArrayA.getInt(8, -1), PorterDuff.Mode.SRC_IN);
        int i2 = 7;
        sqrVar.l = sin.h(sqrVar.a.getContext(), typedArrayA, 7);
        sqrVar.m = sin.h(sqrVar.a.getContext(), typedArrayA, 21);
        sqrVar.n = sin.h(sqrVar.a.getContext(), typedArrayA, 18);
        sqrVar.r = typedArrayA.getBoolean(6, false);
        sqrVar.t = typedArrayA.getDimensionPixelSize(10, 0);
        sqrVar.s = typedArrayA.getBoolean(23, true);
        int paddingStart = sqrVar.a.getPaddingStart();
        int paddingTop = sqrVar.a.getPaddingTop();
        int paddingEnd = sqrVar.a.getPaddingEnd();
        int paddingBottom = sqrVar.a.getPaddingBottom();
        if (typedArrayA.hasValue(0)) {
            sqrVar.b();
        } else {
            sqrVar.g();
        }
        sqrVar.a.setPaddingRelative(paddingStart + sqrVar.e, paddingTop + sqrVar.g, paddingEnd + sqrVar.f, paddingBottom + sqrVar.h);
        j(typedArrayA.getBoolean(1, false));
        if (taeVarB != null) {
            sqrVar.c(g());
            sqrVar.e(taeVarB);
        }
        if (this.m != z) {
            this.m = z;
            if (z) {
                sqrVar.i(new zft(this));
            } else {
                sqrVar.i(null);
            }
            post(new slt(this, i2));
        }
        typedArrayA.recycle();
        setCompoundDrawablePadding(this.i);
        r(this.f != null);
    }
}
