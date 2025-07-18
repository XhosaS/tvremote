package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.navigationrail.NavigationRailView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class swp implements svd {
    final /* synthetic */ ViewGroup a;
    private final /* synthetic */ int b;

    public swp(ViewGroup viewGroup, int i) {
        this.b = i;
        this.a = viewGroup;
    }

    @Override // defpackage.svd
    public final void a(View view, cyh cyhVar, sve sveVar) {
        boolean z;
        if (this.b == 0) {
            ViewGroup viewGroup = this.a;
            csr csrVarF = cyhVar.f(519);
            csr csrVarF2 = cyhVar.f(128);
            NavigationRailView navigationRailView = (NavigationRailView) viewGroup;
            if (navigationRailView.c(navigationRailView.f)) {
                sveVar.b += csrVarF.c;
            }
            if (navigationRailView.c(navigationRailView.g)) {
                sveVar.d += csrVarF.e;
            }
            if (navigationRailView.c(navigationRailView.h)) {
                if (sil.p(view)) {
                    sveVar.a += Math.max(csrVarF.d, csrVarF2.d);
                } else {
                    sveVar.a += Math.max(csrVarF.b, csrVarF2.b);
                }
            }
            sveVar.a(view);
            return;
        }
        BottomAppBar bottomAppBar = (BottomAppBar) this.a;
        if (bottomAppBar.j) {
            bottomAppBar.o = cyhVar.a();
        }
        boolean z2 = false;
        if (bottomAppBar.k) {
            z = bottomAppBar.q != cyhVar.b();
            bottomAppBar.q = cyhVar.b();
        } else {
            z = false;
        }
        if (bottomAppBar.l) {
            boolean z3 = bottomAppBar.p != cyhVar.c();
            bottomAppBar.p = cyhVar.c();
            z2 = z3;
        }
        if (z || z2) {
            bottomAppBar.m();
            bottomAppBar.t();
            bottomAppBar.r();
        }
    }
}
