package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class rh extends qg {
    RecyclerView a;
    private Scroller b;
    private final qi c = new rf(this);

    public abstract int a(qd qdVar, int i, int i2);

    public abstract View b(qd qdVar);

    public abstract int[] c(qd qdVar, View view);

    protected qr d(qd qdVar) {
        return f(qdVar);
    }

    @Override // defpackage.qg
    public final boolean e(int i, int i2) {
        qr qrVarD;
        int iA;
        qd layoutManager = this.a.getLayoutManager();
        if (layoutManager == null || this.a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.a.getMinFlingVelocity();
        if ((Math.abs(i2) <= minFlingVelocity && Math.abs(i) <= minFlingVelocity) || !(layoutManager instanceof qq) || (qrVarD = d(layoutManager)) == null || (iA = a(layoutManager, i, i2)) == -1) {
            return false;
        }
        qrVarD.g = iA;
        layoutManager.bk(qrVarD);
        return true;
    }

    @Deprecated
    protected or f(qd qdVar) {
        if (qdVar instanceof qq) {
            return new rg(this, this.a.getContext());
        }
        return null;
    }

    public void g(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.ac(this.c);
            this.a.G = null;
        }
        this.a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.a.y(this.c);
            RecyclerView recyclerView3 = this.a;
            recyclerView3.G = this;
            this.b = new Scroller(recyclerView3.getContext(), new DecelerateInterpolator());
            h();
        }
    }

    final void h() {
        qd layoutManager;
        View viewB;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewB = b(layoutManager)) == null) {
            return;
        }
        int[] iArrC = c(layoutManager, viewB);
        int i = 0;
        int i2 = iArrC[0];
        if (i2 != 0) {
            i = i2;
        } else if (iArrC[1] == 0) {
            return;
        }
        this.a.ak(i, iArrC[1]);
    }

    public final int[] i(int i, int i2) {
        this.b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.b.getFinalX(), this.b.getFinalY()};
    }
}
