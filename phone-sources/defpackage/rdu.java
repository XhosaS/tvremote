package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class rdu {
    private final dvv a;
    final dvv b;
    final dvv c;
    final dvv d;
    final dvv e;
    public final dvv f;
    final int g;
    public rhu h;
    public tst i;
    final dvv j;
    private View.OnClickListener k;

    rdu() {
        this(105607);
    }

    public void d(dvk dvkVar, dvw dvwVar) {
        this.a.d(dvkVar, dvwVar);
    }

    public void e(dvw dvwVar) {
        this.a.i(dvwVar);
    }

    public void f(dvk dvkVar) {
        this.a.j(dvkVar);
    }

    public final void h(View.OnClickListener onClickListener) {
        this.k = onClickListener;
        j();
    }

    public final void i(boolean z) {
        rrx.ap(this.a, Boolean.valueOf(z));
    }

    public final void j() {
        rhz rhzVar = new rhz(this.k);
        rhzVar.d = new qxp(this, 2);
        rhzVar.e = new qxp(this, 3);
        rhzVar.b = this.i;
        rrx.ap(this.b, tst.i(new rhy(rhzVar)));
        rrx.ap(this.c, tst.i(this.k));
    }

    public Boolean p() {
        return (Boolean) this.a.a();
    }

    public void q(dvw dvwVar) {
        this.a.e(dvwVar);
    }

    public rdu(int i) {
        this.a = new dvv(true);
        trk trkVar = trk.a;
        this.b = new dvv(trkVar);
        this.c = new dvv(trkVar);
        this.d = new dvv(trkVar);
        this.e = new dvv(false);
        this.f = new dvv(trkVar);
        this.k = new ras(2);
        this.h = new rdt();
        this.i = trkVar;
        this.g = i;
    }

    public rdu(ret retVar, int i) {
        this(i);
        this.j = new dvv(retVar);
    }

    protected void g() {
    }

    protected void b(dvk dvkVar) {
    }
}
