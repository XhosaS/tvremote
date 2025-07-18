package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.MenuItemImpl;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class swf extends FrameLayout implements svz {
    public final TextView a;
    boolean b;
    public ColorStateList c;
    private boolean d;
    private MenuItemImpl e;

    public swf(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.m3_navigation_menu_subheader, (ViewGroup) this, true);
        this.a = (TextView) findViewById(R.id.navigation_menu_subheader_label);
    }

    public final void a() {
        MenuItemImpl menuItemImpl = this.e;
        if (menuItemImpl != null) {
            int i = 8;
            if (menuItemImpl.isVisible() && (this.d || !this.b)) {
                i = 0;
            }
            setVisibility(i);
        }
    }

    @Override // defpackage.svz
    public final void ex(boolean z) {
        this.d = z;
        a();
    }

    @Override // android.support.v7.view.menu.MenuView.ItemView
    public final MenuItemImpl getItemData() {
        return this.e;
    }

    @Override // android.support.v7.view.menu.MenuView.ItemView
    public final void initialize(MenuItemImpl menuItemImpl, int i) {
        this.e = menuItemImpl;
        menuItemImpl.setCheckable(false);
        this.a.setText(menuItemImpl.getTitle());
        a();
    }

    @Override // android.support.v7.view.menu.MenuView.ItemView
    public final boolean prefersCondensedTitle() {
        return false;
    }

    @Override // android.support.v7.view.menu.MenuView.ItemView
    public final boolean showsIcon() {
        return false;
    }

    @Override // android.support.v7.view.menu.MenuView.ItemView
    public final void setCheckable(boolean z) {
    }

    @Override // android.support.v7.view.menu.MenuView.ItemView
    public final void setChecked(boolean z) {
    }

    @Override // android.view.View, android.support.v7.view.menu.MenuView.ItemView
    public final void setEnabled(boolean z) {
    }

    @Override // android.support.v7.view.menu.MenuView.ItemView
    public final void setIcon(Drawable drawable) {
    }

    @Override // android.support.v7.view.menu.MenuView.ItemView
    public final void setTitle(CharSequence charSequence) {
    }

    @Override // android.support.v7.view.menu.MenuView.ItemView
    public final void setShortcut(boolean z, char c) {
    }
}
