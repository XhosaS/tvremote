package defpackage;

import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
public class rq extends ru {
    final WindowInsets.Builder a;

    public rq() {
        this.a = new WindowInsets.Builder();
    }

    @Override // defpackage.ru
    public sf a() {
        h();
        sf sfVarN = sf.n(this.a.build());
        sfVarN.q(this.b);
        return sfVarN;
    }

    @Override // defpackage.ru
    public void b(nt ntVar) {
        this.a.setStableInsets(ntVar.a());
    }

    @Override // defpackage.ru
    public void c(nt ntVar) {
        this.a.setSystemWindowInsets(ntVar.a());
    }

    @Override // defpackage.ru
    public void d(nt ntVar) {
        this.a.setMandatorySystemGestureInsets(ntVar.a());
    }

    @Override // defpackage.ru
    public void e(nt ntVar) {
        this.a.setSystemGestureInsets(ntVar.a());
    }

    @Override // defpackage.ru
    public void f(nt ntVar) {
        this.a.setTappableElementInsets(ntVar.a());
    }

    public rq(sf sfVar) {
        WindowInsets.Builder builder;
        super(sfVar);
        WindowInsets windowInsetsE = sfVar.e();
        if (windowInsetsE != null) {
            builder = new WindowInsets.Builder(windowInsetsE);
        } else {
            builder = new WindowInsets.Builder();
        }
        this.a = builder;
    }
}
