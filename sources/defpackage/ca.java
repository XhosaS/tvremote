package defpackage;

import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ca implements cx {
    final /* synthetic */ cj a;
    private final cx b;

    public ca(cj cjVar, cx cxVar) {
        this.a = cjVar;
        this.b = cxVar;
    }

    @Override // defpackage.cx
    public final void a(cy cyVar) {
        da daVar = (da) this.b;
        daVar.a.onDestroyActionMode(daVar.e(cyVar));
        cj cjVar = this.a;
        if (cjVar.r != null) {
            cjVar.l.getDecorView().removeCallbacks(cjVar.s);
        }
        if (cjVar.q != null) {
            cjVar.B();
            asv asvVarS = qv.s(cjVar.q);
            asvVarS.P(0.0f);
            cjVar.K = asvVarS;
            cjVar.K.R(new bz(this));
        }
        cjVar.p = null;
        ViewGroup viewGroup = cjVar.v;
        int[] iArr = qv.a;
        qk.j(viewGroup);
        cjVar.F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cx
    public final boolean b(cy cyVar, MenuItem menuItem) {
        da daVar = (da) this.b;
        return daVar.a.onActionItemClicked(daVar.e(cyVar), new eb(daVar.b, menuItem));
    }

    @Override // defpackage.cx
    public final boolean c(cy cyVar, Menu menu) {
        da daVar = (da) this.b;
        return daVar.a.onCreateActionMode(daVar.e(cyVar), daVar.f(menu));
    }

    @Override // defpackage.cx
    public final void d(cy cyVar, Menu menu) {
        ViewGroup viewGroup = this.a.v;
        int[] iArr = qv.a;
        qk.j(viewGroup);
        da daVar = (da) this.b;
        daVar.a.onPrepareActionMode(daVar.e(cyVar), daVar.f(menu));
    }
}
