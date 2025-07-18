package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gs {
    public View d;
    public final byj e;
    public int c = 0;
    public final gr a = new gr();
    public final List b = new ArrayList();

    public gs(byj byjVar) {
        this.e = byjVar;
    }

    public final int a() {
        return this.e.w() - this.b.size();
    }

    public final int b(int i) {
        if (i < 0) {
            return -1;
        }
        int iW = this.e.w();
        int i2 = i;
        while (i2 < iW) {
            gr grVar = this.a;
            int iA = i - (i2 - grVar.a(i2));
            if (iA == 0) {
                while (grVar.f(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iA;
        }
        return -1;
    }

    public final int c() {
        return this.e.w();
    }

    final int d(View view) {
        int iX = this.e.x(view);
        if (iX != -1) {
            gr grVar = this.a;
            if (!grVar.f(iX)) {
                return iX - grVar.a(iX);
            }
        }
        return -1;
    }

    public final View e(int i) {
        return this.e.y(b(i));
    }

    public final View f(int i) {
        return this.e.y(i);
    }

    public final void g(View view, int i, boolean z) {
        int iW = i < 0 ? this.e.w() : b(i);
        this.a.c(iW, z);
        if (z) {
            j(view);
        }
        RecyclerView recyclerView = (RecyclerView) this.e.a;
        recyclerView.addView(view, iW);
        ja jaVarF = RecyclerView.f(view);
        ig igVar = recyclerView.l;
        if (igVar == null || jaVarF == null) {
            return;
        }
        jaVarF.b.setFocusable(igVar.g.isActivated());
    }

    public final void h(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int iW = i < 0 ? this.e.w() : b(i);
        this.a.c(iW, z);
        if (z) {
            j(view);
        }
        byj byjVar = this.e;
        ja jaVarF = RecyclerView.f(view);
        if (jaVarF != null) {
            if (!jaVarF.u() && !jaVarF.x()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + jaVarF + ((RecyclerView) byjVar.a).i());
            }
            jaVarF.g();
        }
        ((RecyclerView) byjVar.a).attachViewToParent(view, iW, layoutParams);
    }

    final void i(int i) {
        gr grVar = this.a;
        int iB = b(i);
        grVar.g(iB);
        byj byjVar = this.e;
        View viewY = byjVar.y(iB);
        if (viewY != null) {
            ja jaVarF = RecyclerView.f(viewY);
            if (jaVarF != null) {
                if (jaVarF.u() && !jaVarF.x()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + jaVarF + ((RecyclerView) byjVar.a).i());
                }
                jaVarF.c(256);
            }
        } else {
            int i2 = RecyclerView.aa;
        }
        ((RecyclerView) byjVar.a).detachViewFromParent(iB);
    }

    public final void j(View view) {
        this.b.add(view);
        ja jaVarF = RecyclerView.f(view);
        if (jaVarF != null) {
            byj byjVar = this.e;
            int i = jaVarF.o;
            if (i != -1) {
                jaVarF.n = i;
            } else {
                jaVarF.n = jaVarF.b.getImportantForAccessibility();
            }
            ((RecyclerView) byjVar.a).ah(jaVarF, 4);
        }
    }

    public final boolean k(View view) {
        return this.b.contains(view);
    }

    public final void l(View view) {
        if (this.b.remove(view)) {
            this.e.z(view);
        }
    }

    public final String toString() {
        return this.a.toString() + ", hidden list:" + this.b.size();
    }
}
