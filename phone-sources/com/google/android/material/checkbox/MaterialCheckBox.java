package com.google.android.material.checkbox;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.TintTypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.google.android.videos.R;
import defpackage.a;
import defpackage.bb$$ExternalSyntheticApiModelOutline1;
import defpackage.gku;
import defpackage.gky;
import defpackage.sil;
import defpackage.sin;
import defpackage.sip;
import defpackage.sqy;
import defpackage.sqz;
import defpackage.sra;
import defpackage.srb;
import defpackage.ssr;
import defpackage.suy;
import defpackage.tde;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MaterialCheckBox extends AppCompatCheckBox {
    private static final int e = 2132085926;
    private static final int[] f = {R.attr.state_indeterminate};
    private static final int[] g = {R.attr.state_error};
    private static final int[][] h = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private static final int i = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public ColorStateList a;
    ColorStateList b;
    public int[] c;
    public CompoundButton.OnCheckedChangeListener d;
    private final LinkedHashSet j;
    private ColorStateList k;
    private boolean l;
    private boolean m;
    private boolean n;
    private CharSequence o;
    private Drawable p;
    private Drawable q;
    private boolean r;
    private PorterDuff.Mode s;
    private int t;
    private boolean u;
    private CharSequence v;
    private final gky w;
    private final gku x;

    public MaterialCheckBox(Context context) {
        this(context, null);
    }

    private final void b() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Animator.AnimatorListener animatorListener;
        this.p = ssr.i(this.p, this.a, getButtonTintMode());
        this.q = ssr.i(this.q, this.b, this.s);
        if (this.r) {
            gky gkyVar = this.w;
            if (gkyVar != null) {
                gku gkuVar = this.x;
                if (gkuVar != null) {
                    Drawable drawable = gkyVar.e;
                    if (drawable != null) {
                        ((AnimatedVectorDrawable) drawable).unregisterAnimationCallback(gkuVar.a());
                    }
                    ArrayList arrayList = gkyVar.c;
                    if (arrayList != null) {
                        arrayList.remove(gkuVar);
                        if (gkyVar.c.size() == 0 && (animatorListener = gkyVar.b) != null) {
                            gkyVar.a.c.removeListener(animatorListener);
                            gkyVar.b = null;
                        }
                    }
                }
                gkyVar.c(gkuVar);
            }
            Drawable drawable2 = this.p;
            if ((drawable2 instanceof AnimatedStateListDrawable) && gkyVar != null) {
                ((AnimatedStateListDrawable) drawable2).addTransition(R.id.checked, R.id.unchecked, gkyVar, false);
                ((AnimatedStateListDrawable) this.p).addTransition(R.id.indeterminate, R.id.unchecked, gkyVar, false);
            }
        }
        Drawable drawable3 = this.p;
        if (drawable3 != null && (colorStateList2 = this.a) != null) {
            drawable3.setTintList(colorStateList2);
        }
        Drawable drawable4 = this.q;
        if (drawable4 != null && (colorStateList = this.b) != null) {
            drawable4.setTintList(colorStateList);
        }
        super.setButtonDrawable(ssr.d(this.p, this.q, -1, -1));
        refreshDrawableState();
    }

    private final void c() {
        if (Build.VERSION.SDK_INT < 30 || this.v != null) {
            return;
        }
        int i2 = this.t;
        super.setStateDescription(i2 == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i2 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate));
    }

    public final void a(int i2) {
        AutofillManager autofillManagerM69m;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.t != i2) {
            this.t = i2;
            super.setChecked(i2 == 1);
            refreshDrawableState();
            c();
            if (this.u) {
                return;
            }
            this.u = true;
            LinkedHashSet linkedHashSet = this.j;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((sqz) it.next()).a();
                }
            }
            if (this.t != 2 && (onCheckedChangeListener = this.d) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26 && (autofillManagerM69m = bb$$ExternalSyntheticApiModelOutline1.m69m(getContext().getSystemService(bb$$ExternalSyntheticApiModelOutline1.m78m$1()))) != null) {
                autofillManagerM69m.notifyValueChanged(this);
            }
            this.u = false;
        }
    }

    @Override // android.widget.CompoundButton
    public final Drawable getButtonDrawable() {
        return this.p;
    }

    @Override // android.widget.CompoundButton
    public final ColorStateList getButtonTintList() {
        return this.a;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.t == 1;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.l && this.a == null && this.b == null) {
            this.l = true;
            if (this.k == null) {
                int[][] iArr = h;
                int length = iArr.length;
                int iC = sip.c(this, R.attr.colorControlActivated);
                int iC2 = sip.c(this, R.attr.colorError);
                int iC3 = sip.c(this, R.attr.colorSurface);
                int iC4 = sip.c(this, R.attr.colorOnSurface);
                this.k = new ColorStateList(iArr, new int[]{sip.f(iC3, iC2, 1.0f), sip.f(iC3, iC, 1.0f), sip.f(iC3, iC4, 0.54f), sip.f(iC3, iC4, 0.38f), sip.f(iC3, iC4, 0.38f)});
            }
            setButtonTintList(this.k);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (this.t == 2) {
            mergeDrawableStates(iArrOnCreateDrawableState, f);
        }
        if (this.n) {
            mergeDrawableStates(iArrOnCreateDrawableState, g);
        }
        this.c = ssr.h(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.m || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int i2 = true == sil.p(this) ? -1 : 1;
        int width = getWidth() - buttonDrawable.getIntrinsicWidth();
        int iSave = canvas.save();
        int i3 = (width / 2) * i2;
        canvas.translate(i3, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + i3, bounds.top, bounds.right + i3, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.n) {
            accessibilityNodeInfo.setText(String.valueOf(accessibilityNodeInfo.getText()) + ", " + String.valueOf(this.o));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof sra)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        sra sraVar = (sra) parcelable;
        super.onRestoreInstanceState(sraVar.getSuperState());
        a(sraVar.a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        sra sraVar = new sra(super.onSaveInstanceState());
        sraVar.a = this.t;
        return sraVar;
    }

    @Override // android.support.v7.widget.AppCompatCheckBox, android.widget.CompoundButton
    public final void setButtonDrawable(int i2) {
        setButtonDrawable(AppCompatResources.getDrawable(getContext(), i2));
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintList(ColorStateList colorStateList) {
        if (this.a == colorStateList) {
            return;
        }
        this.a = colorStateList;
        b();
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        a(z ? 1 : 0);
    }

    @Override // android.widget.CompoundButton
    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.d = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public final void setStateDescription(CharSequence charSequence) {
        this.v = charSequence;
        if (charSequence == null) {
            c();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        a(!isChecked() ? 1 : 0);
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    @Override // android.support.v7.widget.AppCompatCheckBox, android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        this.p = drawable;
        this.r = false;
        b();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCheckBox(Context context, AttributeSet attributeSet, int i2) {
        int i3 = e;
        super(tde.a(context, attributeSet, i2, i3), attributeSet, i2);
        new LinkedHashSet();
        this.j = new LinkedHashSet();
        this.w = gky.a(getContext(), R.drawable.mtrl_checkbox_button_checked_unchecked);
        this.x = new sqy(this);
        Context context2 = getContext();
        this.p = getButtonDrawable();
        ColorStateList supportButtonTintList = this.a;
        if (supportButtonTintList == null) {
            if (super.getButtonTintList() != null) {
                supportButtonTintList = super.getButtonTintList();
            } else {
                supportButtonTintList = getSupportButtonTintList();
            }
        }
        this.a = supportButtonTintList;
        setSupportButtonTintList(null);
        TintTypedArray tintTypedArrayB = suy.b(context2, attributeSet, srb.a, i2, i3, new int[0]);
        this.q = tintTypedArrayB.getDrawable(2);
        if (this.p != null && suy.e(context2)) {
            int resourceId = tintTypedArrayB.getResourceId(0, 0);
            int resourceId2 = tintTypedArrayB.getResourceId(1, 0);
            if (resourceId == i && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.p = AppCompatResources.getDrawable(context2, R.drawable.mtrl_checkbox_button);
                this.r = true;
                if (this.q == null) {
                    this.q = AppCompatResources.getDrawable(context2, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.b = sin.i(context2, tintTypedArrayB, 3);
        this.s = a.ae(tintTypedArrayB.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.l = tintTypedArrayB.getBoolean(10, false);
        this.m = tintTypedArrayB.getBoolean(6, true);
        this.n = tintTypedArrayB.getBoolean(9, false);
        this.o = tintTypedArrayB.getText(8);
        if (tintTypedArrayB.hasValue(7)) {
            a(tintTypedArrayB.getInt(7, 0));
        }
        tintTypedArrayB.recycle();
        b();
    }
}
