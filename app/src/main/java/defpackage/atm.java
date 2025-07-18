package defpackage;

import androidx.leanback.widget.VerticalGridView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class atm extends ps {
    boolean a = false;
    final /* synthetic */ atn b;

    public atm(atn atnVar) {
        this.b = atnVar;
    }

    @Override // defpackage.ps
    public final void a() {
        g();
    }

    @Override // defpackage.ps
    public final void c(int i, int i2) {
        g();
    }

    final void f() {
        if (this.a) {
            this.a = false;
            this.b.c.a.unregisterObserver(this);
        }
    }

    final void g() {
        f();
        atn atnVar = this.b;
        VerticalGridView verticalGridView = atnVar.b;
        if (verticalGridView != null) {
            verticalGridView.setSelectedPosition(atnVar.d);
        }
    }
}
