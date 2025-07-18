package defpackage;

import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes.dex */
public class rz implements jh {
    final /* synthetic */ Toolbar a;

    public rz(Toolbar toolbar) {
        this.a = toolbar;
    }

    @Override // defpackage.jh
    public final void C(jj jjVar) {
        Toolbar toolbar = this.a;
        if (toolbar.a.l()) {
            return;
        }
        toolbar.n.b(jjVar);
    }

    @Override // defpackage.jh
    public final boolean G(jj jjVar, MenuItem menuItem) {
        return false;
    }
}
