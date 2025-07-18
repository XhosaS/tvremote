package defpackage;

import android.view.View;
import androidx.leanback.widget.GridLayoutManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uws implements egy {
    public final GridLayoutManager a;
    public final int b;
    public View c;
    public int d = -1;
    private final int e;

    public uws(int i, int i2) {
        this.e = i2;
        this.b = i;
        GridLayoutManager gridLayoutManager = new GridLayoutManager();
        this.a = gridLayoutManager;
        gridLayoutManager.am(i);
    }

    private final boolean p(View view) {
        return view.getLeft() >= 0 && view.getRight() <= this.c.getWidth() && view.getTop() >= 0 && view.getBottom() <= this.c.getHeight();
    }

    @Override // defpackage.egy
    public final int a(int i, int i2, int i3, int i4) {
        return ((int) (this.b != 0 ? Math.ceil(i4 / i2) : Math.ceil(i3 / i))) * this.e;
    }

    @Override // defpackage.elj
    public final int b() {
        int i = 0;
        while (true) {
            GridLayoutManager gridLayoutManager = this.a;
            if (i >= gridLayoutManager.at()) {
                return -1;
            }
            View viewAI = gridLayoutManager.aI(i);
            if (p(viewAI)) {
                return gridLayoutManager.aD(viewAI);
            }
            i++;
        }
    }

    @Override // defpackage.elj
    public final int c() {
        GridLayoutManager gridLayoutManager = this.a;
        if (gridLayoutManager.at() == 0) {
            return -1;
        }
        return gridLayoutManager.aD(gridLayoutManager.aI(0));
    }

    @Override // defpackage.elj
    public final int d() {
        GridLayoutManager gridLayoutManager = this.a;
        for (int iAt = gridLayoutManager.at() - 1; iAt >= 0; iAt--) {
            View viewAI = gridLayoutManager.aI(iAt);
            if (p(viewAI)) {
                return gridLayoutManager.aD(viewAI);
            }
        }
        return -1;
    }

    @Override // defpackage.elj
    public final int e() {
        GridLayoutManager gridLayoutManager = this.a;
        int iAt = gridLayoutManager.at();
        if (iAt == 0) {
            return -1;
        }
        return gridLayoutManager.aD(gridLayoutManager.aI(iAt - 1));
    }

    @Override // defpackage.egy
    public final int f(int i, ejm ejmVar) {
        return this.b == 0 ? i : View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    @Override // defpackage.egy
    public final int g(int i, ejm ejmVar) {
        return this.b == 1 ? i : View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    @Override // defpackage.elj
    public final int h() {
        return this.a.aB();
    }

    @Override // defpackage.egy
    public final int i() {
        return this.b;
    }

    @Override // defpackage.egy
    public final qd j() {
        return this.a;
    }

    @Override // defpackage.egy
    public final /* bridge */ /* synthetic */ egx k(int i, int i2) {
        return new uwr(i, i2, this.b, this.e);
    }

    @Override // defpackage.egy
    public final void l(int i, int i2) {
        int i3 = this.d;
        if (i3 < 0) {
            return;
        }
        this.a.bO(i3, false);
    }

    public final int n() {
        return this.b == 0 ? (int) Math.ceil(this.a.aB() / this.e) : this.e;
    }

    public final int o() {
        return this.b == 1 ? (int) Math.ceil(this.a.aB() / this.e) : this.e;
    }

    @Override // defpackage.egy
    public final void m(egw egwVar) {
    }
}
