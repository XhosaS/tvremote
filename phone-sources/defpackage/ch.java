package defpackage;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ch implements cvk {
    final /* synthetic */ cr a;

    public ch(cr crVar) {
        this.a = crVar;
    }

    @Override // defpackage.cvk
    public final void a(Menu menu, MenuInflater menuInflater) {
        this.a.V(menu, menuInflater);
    }

    @Override // defpackage.cvk
    public final void b(Menu menu) {
        this.a.x(menu);
    }

    @Override // defpackage.cvk
    public final void c(Menu menu) {
        this.a.X(menu);
    }

    @Override // defpackage.cvk
    public final boolean d(MenuItem menuItem) {
        return this.a.W(menuItem);
    }
}
