package defpackage;

import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ea implements MenuItem.OnMenuItemClickListener {
    final /* synthetic */ eb a;
    private final MenuItem.OnMenuItemClickListener b;

    public ea(eb ebVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.a = ebVar;
        this.b = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.b.onMenuItemClick(this.a.a(menuItem));
    }
}
