package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import defpackage.hv;
import defpackage.ij;
import defpackage.sin;
import defpackage.sip;
import defpackage.sqw;
import defpackage.sqx;
import defpackage.suy;
import defpackage.szg;
import defpackage.szq;
import defpackage.tab;
import defpackage.tde;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MaterialCardView extends CardView implements Checkable, tab {
    private static final int[] i = {R.attr.state_checkable};
    private static final int[] j = {R.attr.state_checked};
    public final sqw g;
    public boolean h;
    private boolean k;

    public MaterialCardView(Context context) {
        this(context, null);
    }

    @Override // androidx.cardview.widget.CardView
    public final void c(int i2) {
        this.g.f(ColorStateList.valueOf(i2));
    }

    public final boolean d() {
        sqw sqwVar = this.g;
        return sqwVar != null && sqwVar.s;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.h;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        sqw sqwVar = this.g;
        sqwVar.i();
        szg.f(this, sqwVar.e);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 3);
        if (d()) {
            mergeDrawableStates(iArrOnCreateDrawableState, i);
        }
        if (this.h) {
            mergeDrawableStates(iArrOnCreateDrawableState, j);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.h);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(d());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.h);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i2, int i3) {
        int iCeil;
        int iCeil2;
        super.onMeasure(i2, i3);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        sqw sqwVar = this.g;
        if (sqwVar.q != null) {
            MaterialCardView materialCardView = sqwVar.c;
            if (materialCardView.a) {
                float fC = sqwVar.c();
                iCeil = (int) Math.ceil(fC + fC);
                float fB = sqwVar.b();
                iCeil2 = (int) Math.ceil(fB + fB);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i4 = sqwVar.m() ? ((measuredWidth - sqwVar.g) - sqwVar.h) - iCeil2 : sqwVar.g;
            int i5 = sqwVar.l() ? sqwVar.g : ((measuredHeight - sqwVar.g) - sqwVar.h) - iCeil;
            int i6 = sqwVar.m() ? sqwVar.g : ((measuredWidth - sqwVar.g) - sqwVar.h) - iCeil2;
            int i7 = sqwVar.l() ? ((measuredHeight - sqwVar.g) - sqwVar.h) - iCeil : sqwVar.g;
            int layoutDirection = materialCardView.getLayoutDirection();
            sqwVar.q.setLayerInset(2, layoutDirection != 1 ? i4 : i6, i7, layoutDirection == 1 ? i4 : i6, i5);
        }
    }

    @Override // defpackage.tab
    public final void p(szq szqVar) {
        RectF rectF = new RectF();
        sqw sqwVar = this.g;
        rectF.set(sqwVar.e.getBounds());
        setClipToOutline(szqVar.g(rectF));
        sqwVar.h(szqVar);
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (this.k) {
            sqw sqwVar = this.g;
            if (!sqwVar.r) {
                sqwVar.r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (this.h != z) {
            toggle();
        }
    }

    @Override // android.view.View
    public final void setClickable(boolean z) {
        super.setClickable(z);
        sqw sqwVar = this.g;
        if (sqwVar != null) {
            sqwVar.i();
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        sqw sqwVar;
        Drawable drawable;
        if (d() && isEnabled()) {
            this.h = !this.h;
            refreshDrawableState();
            if (Build.VERSION.SDK_INT > 26 && (drawable = (sqwVar = this.g).p) != null) {
                Rect bounds = drawable.getBounds();
                int i2 = bounds.bottom;
                sqwVar.p.setBounds(bounds.left, bounds.top, bounds.right, i2 - 1);
                sqwVar.p.setBounds(bounds.left, bounds.top, bounds.right, i2);
            }
            this.g.g(this.h, true);
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.videos.R.attr.materialCardViewStyle);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet, int i2) {
        super(tde.a(context, attributeSet, i2, com.google.android.videos.R.style.Widget_MaterialComponents_CardView), attributeSet, i2);
        this.h = false;
        this.k = true;
        TypedArray typedArrayA = suy.a(getContext(), attributeSet, sqx.a, i2, com.google.android.videos.R.style.Widget_MaterialComponents_CardView, new int[0]);
        sqw sqwVar = new sqw(this, attributeSet, i2);
        this.g = sqwVar;
        sqwVar.f(((ij) this.e.a).e);
        sqwVar.d.set(this.c.left, this.c.top, this.c.right, this.c.bottom);
        float fD = 0.0f;
        float fA = ((!sqwVar.c.b || sqwVar.k()) && !sqwVar.n()) ? 0.0f : sqwVar.a();
        MaterialCardView materialCardView = sqwVar.c;
        if (materialCardView.b && materialCardView.a) {
            fD = (float) ((1.0d - sqw.a) * hv.d(materialCardView.e));
        }
        float f = fA - fD;
        MaterialCardView materialCardView2 = sqwVar.c;
        int i3 = (int) f;
        materialCardView2.c.set(sqwVar.d.left + i3, sqwVar.d.top + i3, sqwVar.d.right + i3, sqwVar.d.bottom + i3);
        hv.e(materialCardView2.e);
        sqwVar.o = sin.h(sqwVar.c.getContext(), typedArrayA, 11);
        if (sqwVar.o == null) {
            sqwVar.o = ColorStateList.valueOf(-1);
        }
        sqwVar.j = typedArrayA.getDimensionPixelSize(12, 0);
        boolean z = typedArrayA.getBoolean(0, false);
        sqwVar.s = z;
        sqwVar.c.setLongClickable(z);
        sqwVar.n = sin.h(sqwVar.c.getContext(), typedArrayA, 6);
        Drawable drawableJ = sin.j(sqwVar.c.getContext(), typedArrayA, 2);
        if (drawableJ != null) {
            sqwVar.l = drawableJ.mutate();
            sqwVar.l.setTintList(sqwVar.n);
            sqwVar.g(sqwVar.c.h, false);
        } else {
            sqwVar.l = sqw.b;
        }
        LayerDrawable layerDrawable = sqwVar.q;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(com.google.android.videos.R.id.mtrl_card_checked_layer_id, sqwVar.l);
        }
        sqwVar.h = typedArrayA.getDimensionPixelSize(5, 0);
        sqwVar.g = typedArrayA.getDimensionPixelSize(4, 0);
        sqwVar.i = typedArrayA.getInteger(3, 8388661);
        sqwVar.m = sin.h(sqwVar.c.getContext(), typedArrayA, 7);
        if (sqwVar.m == null) {
            sqwVar.m = ColorStateList.valueOf(sip.c(sqwVar.c, com.google.android.videos.R.attr.colorControlHighlight));
        }
        ColorStateList colorStateListH = sin.h(sqwVar.c.getContext(), typedArrayA, 1);
        sqwVar.f.N(colorStateListH == null ? ColorStateList.valueOf(0) : colorStateListH);
        Drawable drawable = sqwVar.p;
        if (drawable != null) {
            ((RippleDrawable) drawable).setColor(sqwVar.m);
        }
        sqwVar.e.M(sqwVar.c.e.b.getElevation());
        sqwVar.j();
        super.setBackgroundDrawable(sqwVar.e(sqwVar.e));
        sqwVar.k = sqwVar.o() ? sqwVar.d() : sqwVar.f;
        sqwVar.c.setForeground(sqwVar.e(sqwVar.k));
        typedArrayA.recycle();
    }
}
