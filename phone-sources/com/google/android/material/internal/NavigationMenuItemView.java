package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.TooltipCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import defpackage.cuo;
import defpackage.cww;
import defpackage.suh;
import defpackage.sum;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class NavigationMenuItemView extends suh implements MenuView.ItemView {
    private static final int[] e = {R.attr.state_checked};
    public boolean c;
    boolean d;
    private int f;
    private final CheckedTextView g;
    private FrameLayout h;
    private MenuItemImpl i;
    private final cuo j;

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    @Override // android.support.v7.view.menu.MenuView.ItemView
    public final MenuItemImpl getItemData() {
        return this.i;
    }

    @Override // android.support.v7.view.menu.MenuView.ItemView
    public final void initialize(MenuItemImpl menuItemImpl, int i) {
        StateListDrawable stateListDrawable;
        this.i = menuItemImpl;
        if (menuItemImpl.getItemId() > 0) {
            setId(menuItemImpl.getItemId());
        }
        setVisibility(true != menuItemImpl.isVisible() ? 8 : 0);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.google.android.videos.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(e, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        boolean zIsCheckable = menuItemImpl.isCheckable();
        refreshDrawableState();
        if (this.c != zIsCheckable) {
            this.c = zIsCheckable;
            this.j.sendAccessibilityEvent(this.g, RecyclerView.ItemAnimator.FLAG_MOVED);
        }
        boolean zIsChecked = menuItemImpl.isChecked();
        refreshDrawableState();
        CheckedTextView checkedTextView = this.g;
        checkedTextView.setChecked(zIsChecked);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (zIsChecked && this.d) ? 1 : 0);
        setEnabled(menuItemImpl.isEnabled());
        checkedTextView.setText(menuItemImpl.getTitle());
        Drawable icon = menuItemImpl.getIcon();
        if (icon != null) {
            int i2 = this.f;
            icon.setBounds(0, 0, i2, i2);
        }
        checkedTextView.setCompoundDrawablesRelative(icon, null, null, null);
        View actionView = menuItemImpl.getActionView();
        if (actionView != null) {
            if (this.h == null) {
                this.h = (FrameLayout) ((ViewStub) findViewById(com.google.android.videos.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (actionView.getParent() != null) {
                ((ViewGroup) actionView.getParent()).removeView(actionView);
            }
            this.h.removeAllViews();
            this.h.addView(actionView);
        }
        setContentDescription(menuItemImpl.getContentDescription());
        TooltipCompat.setTooltipText(this, menuItemImpl.getTooltipText());
        if (this.i.getTitle() == null && this.i.getIcon() == null && this.i.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.h;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                layoutParams.width = -1;
                this.h.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.h;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            layoutParams2.width = -2;
            this.h.setLayoutParams(layoutParams2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        MenuItemImpl menuItemImpl = this.i;
        if (menuItemImpl != null && menuItemImpl.isCheckable() && menuItemImpl.isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, e);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.support.v7.view.menu.MenuView.ItemView
    public final boolean prefersCondensedTitle() {
        return false;
    }

    @Override // android.support.v7.view.menu.MenuView.ItemView
    public final void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.c != z) {
            this.c = z;
            this.j.sendAccessibilityEvent(this.g, RecyclerView.ItemAnimator.FLAG_MOVED);
        }
    }

    @Override // android.support.v7.view.menu.MenuView.ItemView
    public final void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.g;
        checkedTextView.setChecked(z);
        Typeface typeface = checkedTextView.getTypeface();
        int i = 0;
        if (z && this.d) {
            i = 1;
        }
        checkedTextView.setTypeface(typeface, i);
    }

    @Override // android.support.v7.view.menu.MenuView.ItemView
    public final void setIcon(Drawable drawable) {
        if (drawable != null) {
            int i = this.f;
            drawable.setBounds(0, 0, i, i);
        }
        this.g.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    @Override // android.support.v7.view.menu.MenuView.ItemView
    public final void setTitle(CharSequence charSequence) {
        this.g.setText(charSequence);
    }

    @Override // android.support.v7.view.menu.MenuView.ItemView
    public final boolean showsIcon() {
        return true;
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = true;
        sum sumVar = new sum(this);
        this.j = sumVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.google.android.videos.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        this.f = context.getResources().getDimensionPixelSize(com.google.android.videos.R.dimen.design_navigation_icon_size);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.google.android.videos.R.id.design_menu_item_text);
        this.g = checkedTextView;
        cww.p(checkedTextView, sumVar);
    }

    @Override // android.support.v7.view.menu.MenuView.ItemView
    public final void setShortcut(boolean z, char c) {
    }
}
