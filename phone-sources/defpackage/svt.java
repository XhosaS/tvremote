package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.MenuItemImpl;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class svt extends FrameLayout implements svz {
    boolean a;
    private boolean b;
    private boolean c;

    public svt(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.m3_navigation_menu_divider, (ViewGroup) this, true);
        c();
    }

    public final void a(boolean z) {
        this.c = z;
        c();
    }

    public final void c() {
        int i = 8;
        if (this.c && (this.b || !this.a)) {
            i = 0;
        }
        setVisibility(i);
    }

    @Override // defpackage.svz
    public final void ex(boolean z) {
        this.b = z;
        c();
    }

    @Override // android.support.v7.view.menu.MenuView.ItemView
    public final MenuItemImpl getItemData() {
        return null;
    }

    @Override // android.support.v7.view.menu.MenuView.ItemView
    public final void initialize(MenuItemImpl menuItemImpl, int i) {
        c();
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
