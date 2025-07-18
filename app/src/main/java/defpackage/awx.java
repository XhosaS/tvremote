package defpackage;

import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.leanback.widget.GridLayoutManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public class awx implements awu {
    final /* synthetic */ GridLayoutManager a;

    public awx(GridLayoutManager gridLayoutManager) {
        this.a = gridLayoutManager;
    }

    @Override // defpackage.awu
    public final int a(int i, boolean z, Object[] objArr, boolean z2) {
        int i2;
        int i3;
        View viewL;
        GridLayoutManager gridLayoutManager = this.a;
        View viewJ = gridLayoutManager.J(i - gridLayoutManager.h);
        if (!((axa) viewJ.getLayoutParams()).c.s()) {
            if (z2) {
                if (z) {
                    gridLayoutManager.aL(viewJ, -1, true);
                } else {
                    gridLayoutManager.aL(viewJ, 0, true);
                }
            } else if (z) {
                gridLayoutManager.aL(viewJ, -1, false);
            } else {
                gridLayoutManager.aL(viewJ, 0, false);
            }
            int i4 = gridLayoutManager.J;
            if (i4 != -1) {
                viewJ.setVisibility(i4);
            }
            axb axbVar = gridLayoutManager.s;
            if (axbVar != null && !axbVar.f && (i2 = axbVar.p) != 0) {
                if (i2 > 0) {
                    GridLayoutManager gridLayoutManager2 = axbVar.q;
                    i3 = gridLayoutManager2.p + gridLayoutManager2.Q;
                } else {
                    GridLayoutManager gridLayoutManager3 = axbVar.q;
                    i3 = gridLayoutManager3.p - gridLayoutManager3.Q;
                }
                View view = null;
                while (axbVar.p != 0 && (viewL = axbVar.l(i3)) != null) {
                    GridLayoutManager gridLayoutManager4 = axbVar.q;
                    if (gridLayoutManager4.bF(viewL)) {
                        gridLayoutManager4.p = i3;
                        gridLayoutManager4.q = 0;
                        int i5 = axbVar.p;
                        axbVar.p = i5 > 0 ? i5 - 1 : i5 + 1;
                        view = viewL;
                    }
                    i3 = axbVar.p > 0 ? i3 + gridLayoutManager4.Q : i3 - gridLayoutManager4.Q;
                }
                if (view != null) {
                    GridLayoutManager gridLayoutManager5 = axbVar.q;
                    if (gridLayoutManager5.bl()) {
                        gridLayoutManager5.n |= 32;
                        view.requestFocus();
                        gridLayoutManager5.n &= -33;
                    }
                }
            }
            int iS = gridLayoutManager.s(viewJ, viewJ.findFocus());
            int i6 = gridLayoutManager.n;
            if ((i6 & 3) != 1) {
                if (i == gridLayoutManager.p && iS == gridLayoutManager.q && gridLayoutManager.s == null) {
                    gridLayoutManager.M();
                }
            } else if ((i6 & 4) == 0) {
                if ((i6 & 16) == 0) {
                    if (i == gridLayoutManager.p && iS == gridLayoutManager.q) {
                        gridLayoutManager.M();
                    }
                } else if (i >= gridLayoutManager.p && viewJ.hasFocusable()) {
                    gridLayoutManager.p = i;
                    gridLayoutManager.q = iS;
                    gridLayoutManager.n &= -17;
                    gridLayoutManager.M();
                }
            }
            gridLayoutManager.R(viewJ);
        }
        objArr[0] = viewJ;
        return gridLayoutManager.e == 0 ? gridLayoutManager.i(viewJ) : gridLayoutManager.c(viewJ);
    }

    @Override // defpackage.awu
    public final int b() {
        GridLayoutManager gridLayoutManager = this.a;
        return gridLayoutManager.g.a() + gridLayoutManager.h;
    }

    @Override // defpackage.awu
    public final int c(int i) {
        GridLayoutManager gridLayoutManager = this.a;
        View viewT = gridLayoutManager.T(i - gridLayoutManager.h);
        return (gridLayoutManager.n & 262144) != 0 ? gridLayoutManager.f.a(viewT) : gridLayoutManager.f.d(viewT);
    }

    @Override // defpackage.awu
    public final int d(int i) {
        GridLayoutManager gridLayoutManager = this.a;
        return gridLayoutManager.w(gridLayoutManager.T(i - gridLayoutManager.h));
    }

    @Override // defpackage.awu
    public final void e(Object obj, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        axb axbVar;
        int i7;
        View view = (View) obj;
        if (i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE) {
            GridLayoutManager gridLayoutManager = this.a;
            if (gridLayoutManager.R.c) {
                bbf bbfVar = gridLayoutManager.T.d;
                i4 = bbfVar.h - bbfVar.j;
            } else {
                i4 = gridLayoutManager.T.d.i;
            }
        }
        GridLayoutManager gridLayoutManager2 = this.a;
        if (gridLayoutManager2.R.c) {
            i5 = i4 - i2;
            i6 = i4;
        } else {
            i6 = i2 + i4;
            i5 = i4;
        }
        int iL = (gridLayoutManager2.l(i3) + gridLayoutManager2.T.e.i) - gridLayoutManager2.K;
        bbe bbeVar = gridLayoutManager2.W;
        if (bbeVar.c != null) {
            SparseArray<Parcelable> sparseArray = (SparseArray) bbeVar.c.g(Integer.toString(i));
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
            }
        }
        gridLayoutManager2.P(i3, view, i5, i6, iL);
        if (!gridLayoutManager2.g.g) {
            gridLayoutManager2.bE();
        }
        if ((gridLayoutManager2.n & 3) == 1 || (axbVar = gridLayoutManager2.s) == null) {
            return;
        }
        if (axbVar.f && (i7 = axbVar.p) != 0) {
            axbVar.p = axbVar.q.I(true, i7);
        }
        int i8 = axbVar.p;
        if (i8 == 0 || ((i8 > 0 && axbVar.q.bI()) || (axbVar.p < 0 && axbVar.q.bH()))) {
            axbVar.g = axbVar.q.p;
            axbVar.n();
        }
    }

    @Override // defpackage.awu
    public final void f(int i) {
        GridLayoutManager gridLayoutManager = this.a;
        View viewT = gridLayoutManager.T(i - gridLayoutManager.h);
        if ((gridLayoutManager.n & 3) == 1) {
            gridLayoutManager.aO(viewT, gridLayoutManager.m);
            return;
        }
        ql qlVar = gridLayoutManager.m;
        gridLayoutManager.t.j(viewT);
        qlVar.j(viewT);
    }
}
