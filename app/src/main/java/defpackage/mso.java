package defpackage;

import android.view.View;
import com.google.android.libraries.elements.converters.layout.FlowLayoutManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mso implements egy {
    public final FlowLayoutManager a;

    public mso(FlowLayoutManager flowLayoutManager) {
        this.a = flowLayoutManager;
        boolean z = flowLayoutManager.k;
    }

    @Override // defpackage.egy
    public final int a(int i, int i2, int i3, int i4) {
        int iCeil = (int) (this.a.a != 0 ? Math.ceil(i4 / i2) : Math.ceil(i3 / i));
        if (iCeil < 2) {
            return 2;
        }
        if (iCeil > 10) {
            return 10;
        }
        return iCeil;
    }

    @Override // defpackage.elj
    public final int b() {
        FlowLayoutManager flowLayoutManager = this.a;
        View viewS = flowLayoutManager.s(0, flowLayoutManager.at(), true, false);
        if (viewS == null) {
            return -1;
        }
        return flowLayoutManager.aD(viewS);
    }

    @Override // defpackage.elj
    public final int c() {
        return this.a.i();
    }

    @Override // defpackage.elj
    public final int d() {
        FlowLayoutManager flowLayoutManager = this.a;
        View viewS = flowLayoutManager.s(flowLayoutManager.at() - 1, -1, true, false);
        if (viewS == null) {
            return -1;
        }
        return flowLayoutManager.aD(viewS);
    }

    @Override // defpackage.elj
    public final int e() {
        return this.a.k();
    }

    @Override // defpackage.egy
    public final int f(int i, ejm ejmVar) {
        FlowLayoutManager flowLayoutManager = this.a;
        if (flowLayoutManager.a == 1) {
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        int i2 = flowLayoutManager.j;
        boolean z = ejmVar != null && ejmVar.g();
        int iA = flowLayoutManager.h.a(flowLayoutManager);
        if (i2 == -1 || z) {
            return View.MeasureSpec.makeMeasureSpec(iA, true != z ? Integer.MIN_VALUE : 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec((iA - (-flowLayoutManager.i)) / 0, 1073741824);
    }

    @Override // defpackage.egy
    public final int g(int i, ejm ejmVar) {
        FlowLayoutManager flowLayoutManager = this.a;
        if (flowLayoutManager.a != 1) {
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        int i2 = flowLayoutManager.j;
        boolean z = ejmVar != null && ejmVar.g();
        int iA = flowLayoutManager.h.a(flowLayoutManager);
        if (i2 == -1 || z) {
            return View.MeasureSpec.makeMeasureSpec(iA, true != z ? Integer.MIN_VALUE : 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec((iA - (-flowLayoutManager.i)) / 0, 1073741824);
    }

    @Override // defpackage.elj
    public final int h() {
        return this.a.aB();
    }

    @Override // defpackage.egy
    public final int i() {
        return this.a.a;
    }

    @Override // defpackage.egy
    public final qd j() {
        return this.a;
    }

    @Override // defpackage.egy
    public final /* bridge */ /* synthetic */ egx k(int i, int i2) {
        return new msn(i, i2, this.a.a);
    }

    @Override // defpackage.egy
    public final void l(int i, int i2) {
        this.a.I(i, i2);
    }

    @Override // defpackage.egy
    public final void m(egw egwVar) {
    }
}
