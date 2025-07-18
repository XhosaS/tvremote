package defpackage;

import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes.dex */
class jq implements MenuItem.OnMenuItemClickListener {
    final /* synthetic */ jr a;
    private final MenuItem.OnMenuItemClickListener b;

    public jq(jr jrVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.a = jrVar;
        this.b = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.b.onMenuItemClick(this.a.a(menuItem));
    }
}
