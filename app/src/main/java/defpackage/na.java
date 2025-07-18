package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class na {
    public View d;
    public final po e;
    public int c = 0;
    public final mz a = new mz();
    public final List b = new ArrayList();

    public na(po poVar) {
        this.e = poVar;
    }

    private final int n(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = this.e.a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            mz mzVar = this.a;
            int iA = i - (i2 - mzVar.a(i2));
            if (iA == 0) {
                while (mzVar.f(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iA;
        }
        return -1;
    }

    public final int a() {
        return this.e.a.getChildCount() - this.b.size();
    }

    public final int b() {
        return this.e.a.getChildCount();
    }

    final int c(View view) {
        int iIndexOfChild = this.e.a.indexOfChild(view);
        if (iIndexOfChild != -1) {
            mz mzVar = this.a;
            if (!mzVar.f(iIndexOfChild)) {
                return iIndexOfChild - mzVar.a(iIndexOfChild);
            }
        }
        return -1;
    }

    public final View d(int i) {
        return this.e.a.getChildAt(n(i));
    }

    public final View e(int i) {
        return this.e.a.getChildAt(i);
    }

    public final void f(View view, int i, boolean z) {
        int childCount = i < 0 ? this.e.a.getChildCount() : n(i);
        this.a.c(childCount, z);
        if (z) {
            i(view);
        }
        RecyclerView recyclerView = this.e.a;
        recyclerView.addView(view, childCount);
        qv qvVarM = RecyclerView.m(view);
        pq pqVar = recyclerView.n;
        if (pqVar != null && qvVarM != null) {
            pqVar.v(qvVarM);
        }
        List list = recyclerView.y;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((qf) recyclerView.y.get(size)).b();
            }
        }
    }

    public final void g(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int childCount = i < 0 ? this.e.a.getChildCount() : n(i);
        this.a.c(childCount, z);
        if (z) {
            i(view);
        }
        po poVar = this.e;
        qv qvVarM = RecyclerView.m(view);
        if (qvVarM != null) {
            if (!qvVarM.u() && !qvVarM.x()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + qvVarM + poVar.a.r());
            }
            qvVarM.i();
        }
        poVar.a.attachViewToParent(view, childCount, layoutParams);
    }

    final void h(int i) {
        qv qvVarM;
        mz mzVar = this.a;
        int iN = n(i);
        mzVar.g(iN);
        RecyclerView recyclerView = this.e.a;
        View childAt = recyclerView.getChildAt(iN);
        if (childAt != null && (qvVarM = RecyclerView.m(childAt)) != null) {
            if (qvVarM.u() && !qvVarM.x()) {
                throw new IllegalArgumentException("called detach on an already detached child " + qvVarM + recyclerView.r());
            }
            qvVarM.j |= 256;
        }
        recyclerView.detachViewFromParent(iN);
    }

    public final void i(View view) {
        this.b.add(view);
        qv qvVarM = RecyclerView.m(view);
        if (qvVarM != null) {
            po poVar = this.e;
            int i = qvVarM.p;
            if (i != -1) {
                qvVarM.o = i;
            } else {
                qvVarM.o = qvVarM.a.getImportantForAccessibility();
            }
            poVar.a.ax(qvVarM, 4);
        }
    }

    public final void j(View view) {
        int i = this.c;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            this.c = 1;
            this.d = view;
            po poVar = this.e;
            int iIndexOfChild = poVar.a.indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (this.a.g(iIndexOfChild)) {
                    m(view);
                }
                poVar.b(iIndexOfChild);
            }
        } finally {
            this.c = 0;
            this.d = null;
        }
    }

    final void k(int i) {
        int i2 = this.c;
        if (i2 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i2 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int iN = n(i);
            po poVar = this.e;
            View childAt = poVar.a.getChildAt(iN);
            if (childAt != null) {
                this.c = 1;
                this.d = childAt;
                if (this.a.g(iN)) {
                    m(childAt);
                }
                poVar.b(iN);
            }
        } finally {
            this.c = 0;
            this.d = null;
        }
    }

    public final boolean l(View view) {
        return this.b.contains(view);
    }

    public final void m(View view) {
        if (this.b.remove(view)) {
            this.e.a(view);
        }
    }

    public final String toString() {
        return this.a.toString() + ", hidden list:" + this.b.size();
    }
}
