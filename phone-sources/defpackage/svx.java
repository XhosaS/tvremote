package defpackage;

import android.content.Context;
import android.support.v7.view.menu.MenuItemImpl;
import android.view.MenuItem;
import android.view.SubMenu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class svx extends fb {
    private final Class l;
    private final int m;
    private final boolean n;

    public svx(Context context, Class cls, int i, boolean z) {
        super(context);
        this.l = cls;
        this.m = i;
        this.n = z;
    }

    @Override // defpackage.fb, android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        if (!this.n) {
            throw new UnsupportedOperationException(String.valueOf(this.l.getSimpleName()).concat(" does not support submenus"));
        }
        MenuItemImpl menuItemImpl = (MenuItemImpl) c(i, i2, i3, charSequence);
        swe sweVar = new swe(this.a, this, menuItemImpl);
        menuItemImpl.setSubMenu(sweVar);
        return sweVar;
    }

    @Override // defpackage.fb
    public final MenuItem c(int i, int i2, int i3, CharSequence charSequence) {
        int size = size() + 1;
        int i4 = this.m;
        if (size <= i4) {
            u();
            MenuItem menuItemC = super.c(i, i2, i3, charSequence);
            t();
            return menuItemC;
        }
        String simpleName = this.l.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + i4 + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }
}
