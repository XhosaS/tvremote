package defpackage;

import android.graphics.PointF;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class qr {
    public RecyclerView h;
    public qd i;
    public boolean j;
    public boolean k;
    public View l;
    public boolean m;
    public int g = -1;
    private final qp a = new qp();

    protected abstract void g();

    protected abstract void h(int i, int i2, qp qpVar);

    protected abstract void i(View view, qp qpVar);

    public final int j() {
        return this.h.o.at();
    }

    public PointF k(int i) {
        Object obj = this.i;
        if (obj instanceof qq) {
            return ((qq) obj).P(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement ".concat(String.valueOf(qq.class.getCanonicalName())));
        return null;
    }

    public final View l(int i) {
        return this.h.o.T(i);
    }

    final void m(int i, int i2) {
        PointF pointFK;
        RecyclerView recyclerView = this.h;
        if (this.g == -1 || recyclerView == null) {
            n();
        }
        if (this.j && this.l == null && this.i != null && (pointFK = k(this.g)) != null && (pointFK.x != 0.0f || pointFK.y != 0.0f)) {
            recyclerView.ad((int) Math.signum(pointFK.x), (int) Math.signum(pointFK.y), null);
        }
        this.j = false;
        View view = this.l;
        if (view != null) {
            if (this.h.e(view) == this.g) {
                View view2 = this.l;
                qs qsVar = recyclerView.N;
                qp qpVar = this.a;
                i(view2, qpVar);
                qpVar.a(recyclerView);
                n();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.l = null;
            }
        }
        if (this.k) {
            qs qsVar2 = recyclerView.N;
            qp qpVar2 = this.a;
            h(i, i2, qpVar2);
            int i3 = qpVar2.a;
            qpVar2.a(recyclerView);
            if (i3 < 0 || !this.k) {
                return;
            }
            this.j = true;
            recyclerView.K.b();
        }
    }

    public final void n() {
        if (this.k) {
            this.k = false;
            g();
            this.h.N.a = -1;
            this.l = null;
            this.g = -1;
            this.j = false;
            qd qdVar = this.i;
            if (qdVar.x == this) {
                qdVar.x = null;
            }
            this.i = null;
            this.h = null;
        }
    }
}
