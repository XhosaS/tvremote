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
import defpackage.bjg;
import defpackage.bjh;
import defpackage.dw;
import defpackage.eh;
import defpackage.hp;
import defpackage.ii;
import defpackage.pe;
import defpackage.qv;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NavigationMenuItemView extends bjg implements eh {
    private static final int[] e = {R.attr.state_checked};
    public boolean c;
    boolean d;
    private int i;
    private final CheckedTextView j;
    private FrameLayout k;
    private dw l;
    private final pe m;

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    @Override // defpackage.eh
    public final dw a() {
        return this.l;
    }

    @Override // defpackage.eh
    public final boolean e() {
        return false;
    }

    @Override // defpackage.eh
    public final void f(dw dwVar) {
        StateListDrawable stateListDrawable;
        this.l = dwVar;
        int i = dwVar.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(true != dwVar.isVisible() ? 8 : 0);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.google.android.tv.remote.service.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(e, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        boolean zIsCheckable = dwVar.isCheckable();
        refreshDrawableState();
        if (this.c != zIsCheckable) {
            this.c = zIsCheckable;
            this.m.d(this.j, 2048);
        }
        boolean zIsChecked = dwVar.isChecked();
        refreshDrawableState();
        CheckedTextView checkedTextView = this.j;
        checkedTextView.setChecked(zIsChecked);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (zIsChecked && this.d) ? 1 : 0);
        setEnabled(dwVar.isEnabled());
        checkedTextView.setText(dwVar.d);
        Drawable icon = dwVar.getIcon();
        if (icon != null) {
            int i2 = this.i;
            icon.setBounds(0, 0, i2, i2);
        }
        checkedTextView.setCompoundDrawablesRelative(icon, null, null, null);
        View actionView = dwVar.getActionView();
        if (actionView != null) {
            if (this.k == null) {
                this.k = (FrameLayout) ((ViewStub) findViewById(com.google.android.tv.remote.service.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (actionView.getParent() != null) {
                ((ViewGroup) actionView.getParent()).removeView(actionView);
            }
            this.k.removeAllViews();
            this.k.addView(actionView);
        }
        setContentDescription(dwVar.l);
        ii.r(this, dwVar.m);
        dw dwVar2 = this.l;
        if (dwVar2.d == null && dwVar2.getIcon() == null && this.l.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.k;
            if (frameLayout != null) {
                hp hpVar = (hp) frameLayout.getLayoutParams();
                hpVar.width = -1;
                this.k.setLayoutParams(hpVar);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.k;
        if (frameLayout2 != null) {
            hp hpVar2 = (hp) frameLayout2.getLayoutParams();
            hpVar2.width = -2;
            this.k.setLayoutParams(hpVar2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        dw dwVar = this.l;
        if (dwVar != null && dwVar.isCheckable() && dwVar.isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, e);
        }
        return iArrOnCreateDrawableState;
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = true;
        bjh bjhVar = new bjh(this);
        this.m = bjhVar;
        q(0);
        LayoutInflater.from(context).inflate(com.google.android.tv.remote.service.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        this.i = context.getResources().getDimensionPixelSize(com.google.android.tv.remote.service.R.dimen.design_navigation_icon_size);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.google.android.tv.remote.service.R.id.design_menu_item_text);
        this.j = checkedTextView;
        qv.l(checkedTextView, bjhVar);
    }
}
