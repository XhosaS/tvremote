package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.MenuItemImpl;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fc extends fb implements SubMenu {
    public final fb l;
    public final MenuItemImpl m;

    public fc(Context context, fb fbVar, MenuItemImpl menuItemImpl) {
        super(context);
        this.l = fbVar;
        this.m = menuItemImpl;
    }

    @Override // defpackage.fb
    public final boolean A() {
        return this.l.A();
    }

    @Override // defpackage.fb
    public final fb a() {
        return this.l.a();
    }

    @Override // defpackage.fb
    public final String d() {
        int itemId = this.m.getItemId();
        if (itemId == 0) {
            return null;
        }
        return a.cf(itemId, "android:menu:actionviewstates:");
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.m;
    }

    @Override // defpackage.fb
    public final void r(ez ezVar) {
        this.l.r(ezVar);
    }

    @Override // defpackage.fb, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.l.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        super.s(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        super.s(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        super.s(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.m.setIcon(i);
        return this;
    }

    @Override // defpackage.fb, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.l.setQwertyMode(z);
    }

    @Override // defpackage.fb
    public final boolean v(MenuItemImpl menuItemImpl) {
        return this.l.v(menuItemImpl);
    }

    @Override // defpackage.fb
    public final boolean w(fb fbVar, MenuItem menuItem) {
        return super.w(fbVar, menuItem) || this.l.w(fbVar, menuItem);
    }

    @Override // defpackage.fb
    public final boolean x(MenuItemImpl menuItemImpl) {
        return this.l.x(menuItemImpl);
    }

    @Override // defpackage.fb
    public final boolean y() {
        return this.l.y();
    }

    @Override // defpackage.fb
    public final boolean z() {
        return this.l.z();
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        super.s(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        super.s(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.m.setIcon(drawable);
        return this;
    }
}
