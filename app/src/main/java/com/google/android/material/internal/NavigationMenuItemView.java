package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import defpackage.afn;
import defpackage.ahj;
import defpackage.jm;
import defpackage.jx;
import defpackage.ol;
import defpackage.vaj;
import defpackage.vak;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class NavigationMenuItemView extends vaj implements jx {
    private static final int[] e = {R.attr.state_checked};
    public boolean c;
    boolean d;
    private int g;
    private final CheckedTextView h;
    private FrameLayout i;
    private jm j;
    private final afn k;

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    @Override // defpackage.jx
    public final boolean d() {
        return false;
    }

    @Override // defpackage.jx
    public final void e(jm jmVar) {
        StateListDrawable stateListDrawable;
        this.j = jmVar;
        int i = jmVar.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(true != jmVar.isVisible() ? 8 : 0);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.google.android.katniss.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(e, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        boolean zIsCheckable = jmVar.isCheckable();
        refreshDrawableState();
        if (this.c != zIsCheckable) {
            this.c = zIsCheckable;
            this.k.d.sendAccessibilityEvent(this.h, 2048);
        }
        boolean zIsChecked = jmVar.isChecked();
        refreshDrawableState();
        CheckedTextView checkedTextView = this.h;
        checkedTextView.setChecked(zIsChecked);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (zIsChecked && this.d) ? 1 : 0);
        setEnabled(jmVar.isEnabled());
        checkedTextView.setText(jmVar.d);
        Drawable icon = jmVar.getIcon();
        if (icon != null) {
            int i2 = this.g;
            icon.setBounds(0, 0, i2, i2);
        }
        checkedTextView.setCompoundDrawablesRelative(icon, null, null, null);
        View actionView = jmVar.getActionView();
        if (actionView != null) {
            if (this.i == null) {
                this.i = (FrameLayout) ((ViewStub) findViewById(com.google.android.katniss.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (actionView.getParent() != null) {
                ((ViewGroup) actionView.getParent()).removeView(actionView);
            }
            this.i.removeAllViews();
            this.i.addView(actionView);
        }
        setContentDescription(jmVar.l);
        setTooltipText(jmVar.m);
        jm jmVar2 = this.j;
        if (jmVar2.d == null && jmVar2.getIcon() == null && this.j.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.i;
            if (frameLayout != null) {
                ol olVar = (ol) frameLayout.getLayoutParams();
                olVar.width = -1;
                this.i.setLayoutParams(olVar);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.i;
        if (frameLayout2 != null) {
            ol olVar2 = (ol) frameLayout2.getLayoutParams();
            olVar2.width = -2;
            this.i.setLayoutParams(olVar2);
        }
    }

    @Override // defpackage.jx
    public jm getItemData() {
        return this.j;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        jm jmVar = this.j;
        if (jmVar != null && jmVar.isCheckable() && jmVar.isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, e);
        }
        return iArrOnCreateDrawableState;
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIconPadding(int i) {
        this.h.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.g = i;
    }

    public void setMaxLines(int i) {
        this.h.setMaxLines(i);
    }

    public void setTextAppearance(int i) {
        this.h.setTextAppearance(i);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = true;
        vak vakVar = new vak(this);
        this.k = vakVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.google.android.katniss.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.google.android.katniss.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.google.android.katniss.R.id.design_menu_item_text);
        this.h = checkedTextView;
        ahj.n(checkedTextView, vakVar);
    }
}
