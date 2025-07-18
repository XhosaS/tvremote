package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.fa;
import defpackage.fb;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements MenuView, AdapterView.OnItemClickListener, fa {
    private static final int[] TINT_ATTRS = {R.attr.background, R.attr.divider};
    private int mAnimations;
    private fb mMenu;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // android.support.v7.view.menu.MenuView
    public int getWindowAnimations() {
        return this.mAnimations;
    }

    @Override // android.support.v7.view.menu.MenuView
    public void initialize(fb fbVar) {
        this.mMenu = fbVar;
    }

    @Override // defpackage.fa
    public boolean invokeItem(MenuItemImpl menuItemImpl) {
        return this.mMenu.B(menuItemImpl, 0);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        invokeItem((MenuItemImpl) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, TINT_ATTRS, i, 0);
        if (tintTypedArrayObtainStyledAttributes.hasValue(0)) {
            setBackgroundDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(0));
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(1)) {
            setDivider(tintTypedArrayObtainStyledAttributes.getDrawable(1));
        }
        tintTypedArrayObtainStyledAttributes.recycle();
    }
}
