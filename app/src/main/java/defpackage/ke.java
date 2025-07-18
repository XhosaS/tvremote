package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ke extends jj implements SubMenu {
    public final jj m;
    public final jm n;

    public ke(Context context, jj jjVar, jm jmVar) {
        super(context);
        this.m = jjVar;
        this.n = jmVar;
    }

    @Override // defpackage.jj
    public final jj a() {
        return this.m.a();
    }

    @Override // defpackage.jj
    public final String d() {
        int i = this.n.a;
        if (i == 0) {
            return null;
        }
        return a.b(i, "android:menu:actionviewstates:");
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.n;
    }

    @Override // defpackage.jj
    public final void n(jh jhVar) {
        this.m.n(jhVar);
    }

    @Override // defpackage.jj
    public final boolean r(jm jmVar) {
        return this.m.r(jmVar);
    }

    @Override // defpackage.jj
    public final boolean s(jj jjVar, MenuItem menuItem) {
        return super.s(jjVar, menuItem) || this.m.s(jjVar, menuItem);
    }

    @Override // defpackage.jj, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.m.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        super.o(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        super.o(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        super.o(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.n.setIcon(i);
        return this;
    }

    @Override // defpackage.jj, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.m.setQwertyMode(z);
    }

    @Override // defpackage.jj
    public final boolean t(jm jmVar) {
        return this.m.t(jmVar);
    }

    @Override // defpackage.jj
    public final boolean u() {
        return this.m.u();
    }

    @Override // defpackage.jj
    public final boolean v() {
        return this.m.v();
    }

    @Override // defpackage.jj
    public final boolean w() {
        return this.m.w();
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        super.o(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        super.o(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.n.setIcon(drawable);
        return this;
    }
}
