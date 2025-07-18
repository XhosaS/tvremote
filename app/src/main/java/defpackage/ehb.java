package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ehb implements egy {
    public final LinearLayoutManager a;

    public ehb(int i) {
        egz egzVar = new egz(i);
        this.a = egzVar;
        egzVar.B = false;
    }

    @Override // defpackage.egy
    public final int a(int i, int i2, int i3, int i4) {
        int iCeil = (int) (this.a.k != 0 ? Math.ceil(i4 / i2) : Math.ceil(i3 / i));
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
        return this.a.K();
    }

    @Override // defpackage.elj
    public final int c() {
        return this.a.L();
    }

    @Override // defpackage.elj
    public final int d() {
        return this.a.M();
    }

    @Override // defpackage.elj
    public final int e() {
        return this.a.N();
    }

    @Override // defpackage.egy
    public final int f(int i, ejm ejmVar) {
        return this.a.k != 0 ? View.MeasureSpec.makeMeasureSpec(0, 0) : i;
    }

    @Override // defpackage.egy
    public final int g(int i, ejm ejmVar) {
        return this.a.k != 0 ? i : View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    @Override // defpackage.elj
    public final int h() {
        return this.a.aB();
    }

    @Override // defpackage.egy
    public final int i() {
        return this.a.k;
    }

    @Override // defpackage.egy
    public final qd j() {
        return this.a;
    }

    @Override // defpackage.egy
    public final /* bridge */ /* synthetic */ egx k(int i, int i2) {
        return new eha(i, i2, this.a.k);
    }

    @Override // defpackage.egy
    public final void l(int i, int i2) {
        this.a.aa(i, i2);
    }

    @Override // defpackage.egy
    public final void m(egw egwVar) {
    }
}
