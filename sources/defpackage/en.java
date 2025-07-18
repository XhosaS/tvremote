package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class en extends du implements SubMenu {
    public final du k;
    public final dw l;

    public en(Context context, du duVar, dw dwVar) {
        super(context);
        this.k = duVar;
        this.l = dwVar;
    }

    @Override // defpackage.du
    public final du a() {
        return this.k.a();
    }

    @Override // defpackage.du
    public final String d() {
        int i = this.l.a;
        if (i == 0) {
            return null;
        }
        return b.e(i, "android:menu:actionviewstates:");
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.l;
    }

    @Override // defpackage.du
    public final void p(ds dsVar) {
        this.k.p(dsVar);
    }

    @Override // defpackage.du, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.k.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        super.q(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        super.q(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        super.q(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.l.setIcon(i);
        return this;
    }

    @Override // defpackage.du, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.k.setQwertyMode(z);
    }

    @Override // defpackage.du
    public final boolean t(dw dwVar) {
        return this.k.t(dwVar);
    }

    @Override // defpackage.du
    public final boolean u(du duVar, MenuItem menuItem) {
        return super.u(duVar, menuItem) || this.k.u(duVar, menuItem);
    }

    @Override // defpackage.du
    public final boolean v(dw dwVar) {
        return this.k.v(dwVar);
    }

    @Override // defpackage.du
    public final boolean w() {
        return this.k.w();
    }

    @Override // defpackage.du
    public final boolean x() {
        return this.k.x();
    }

    @Override // defpackage.du
    public final boolean y() {
        return this.k.y();
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        super.q(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        super.q(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.l.setIcon(drawable);
        return this;
    }
}
