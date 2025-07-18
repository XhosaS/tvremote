package defpackage;

import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cxs extends cxw {
    final WindowInsets.Builder a;

    public cxs() {
        this.a = new WindowInsets.Builder();
    }

    @Override // defpackage.cxw
    public cyh a() {
        h();
        cyh cyhVarO = cyh.o(this.a.build());
        cyhVarO.r(this.b);
        return cyhVarO;
    }

    @Override // defpackage.cxw
    public void b(csr csrVar) {
        this.a.setStableInsets(csrVar.a());
    }

    @Override // defpackage.cxw
    public void c(csr csrVar) {
        this.a.setSystemWindowInsets(csrVar.a());
    }

    @Override // defpackage.cxw
    public void d(csr csrVar) {
        this.a.setMandatorySystemGestureInsets(csrVar.a());
    }

    @Override // defpackage.cxw
    public void e(csr csrVar) {
        this.a.setSystemGestureInsets(csrVar.a());
    }

    @Override // defpackage.cxw
    public void f(csr csrVar) {
        this.a.setTappableElementInsets(csrVar.a());
    }

    public cxs(cyh cyhVar) {
        WindowInsets.Builder builder;
        super(cyhVar);
        WindowInsets windowInsetsE = cyhVar.e();
        if (windowInsetsE != null) {
            builder = new WindowInsets.Builder(windowInsetsE);
        } else {
            builder = new WindowInsets.Builder();
        }
        this.a = builder;
    }
}
