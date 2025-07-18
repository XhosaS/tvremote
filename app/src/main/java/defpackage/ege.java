package defpackage;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ege implements egy {
    public final GridLayoutManager a;
    public egw b;
    private final ega c;

    public ege(Context context, int i, int i2) {
        egc egcVar = new egc(i, i2);
        this.a = egcVar;
        ega egaVar = new ega(this);
        this.c = egaVar;
        egcVar.g = egaVar;
    }

    @Override // defpackage.egy
    public final int a(int i, int i2, int i3, int i4) {
        GridLayoutManager gridLayoutManager = this.a;
        return ((int) (gridLayoutManager.k != 0 ? Math.ceil(i4 / i2) : Math.ceil(i3 / i))) * gridLayoutManager.b;
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
        GridLayoutManager gridLayoutManager = this.a;
        if (gridLayoutManager.k != 0) {
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        Integer num = (Integer) ejmVar.d("OVERRIDE_SIZE");
        if (num != null) {
            return View.MeasureSpec.makeMeasureSpec(num.intValue(), 1073741824);
        }
        if (ejmVar.g()) {
            return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(ejmVar.a() * (((View.MeasureSpec.getSize(i) - gridLayoutManager.getPaddingTop()) - gridLayoutManager.getPaddingBottom()) / gridLayoutManager.b), 1073741824);
    }

    @Override // defpackage.egy
    public final int g(int i, ejm ejmVar) {
        GridLayoutManager gridLayoutManager = this.a;
        if (gridLayoutManager.k == 0) {
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        Integer num = (Integer) ejmVar.d("OVERRIDE_SIZE");
        if (num != null) {
            return View.MeasureSpec.makeMeasureSpec(num.intValue(), 1073741824);
        }
        if (ejmVar.g()) {
            return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(ejmVar.a() * (((View.MeasureSpec.getSize(i) - gridLayoutManager.getPaddingLeft()) - gridLayoutManager.getPaddingRight()) / gridLayoutManager.b), 1073741824);
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
        GridLayoutManager gridLayoutManager = this.a;
        return new egd(i, i2, gridLayoutManager.k, gridLayoutManager.b);
    }

    @Override // defpackage.egy
    public final void l(int i, int i2) {
        this.a.aa(i, i2);
    }

    @Override // defpackage.egy
    public final void m(egw egwVar) {
        this.b = egwVar;
    }
}
