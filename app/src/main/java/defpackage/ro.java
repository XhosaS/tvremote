package defpackage;

import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ro {
    public final ArrayList a = new ArrayList();
    public int b = Integer.MIN_VALUE;
    public int c = Integer.MIN_VALUE;
    public int d = 0;
    public final int e;
    public final /* synthetic */ StaggeredGridLayoutManager f;

    public ro(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f = staggeredGridLayoutManager;
        this.e = i;
    }

    public final int a() {
        return this.f.d ? l(this.a.size() - 1, -1) : l(0, this.a.size());
    }

    public final int b() {
        return this.f.d ? l(0, this.a.size()) : l(this.a.size() - 1, -1);
    }

    public final int c() {
        int i = this.c;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        h();
        return this.c;
    }

    public final int d(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.a.size() == 0) {
            return i;
        }
        h();
        return this.c;
    }

    public final int e() {
        int i = this.b;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        i();
        return this.b;
    }

    public final int f(int i) {
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.a.size() == 0) {
            return i;
        }
        i();
        return this.b;
    }

    public final View g(int i, int i2) {
        View view = null;
        if (i2 != -1) {
            ArrayList arrayList = this.a;
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
                if ((staggeredGridLayoutManager.d && staggeredGridLayoutManager.aD(view2) >= i) || ((!staggeredGridLayoutManager.d && staggeredGridLayoutManager.aD(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        ArrayList arrayList2 = this.a;
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            View view3 = (View) arrayList2.get(i3);
            StaggeredGridLayoutManager staggeredGridLayoutManager2 = this.f;
            if ((staggeredGridLayoutManager2.d && staggeredGridLayoutManager2.aD(view3) <= i) || ((!staggeredGridLayoutManager2.d && staggeredGridLayoutManager2.aD(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i3++;
            view = view3;
        }
        return view;
    }

    final void h() {
        View view = (View) this.a.get(r0.size() - 1);
        rk rkVar = (rk) view.getLayoutParams();
        this.c = this.f.b.a(view);
        boolean z = rkVar.b;
    }

    final void i() {
        View view = (View) this.a.get(0);
        rk rkVar = (rk) view.getLayoutParams();
        this.b = this.f.b.d(view);
        boolean z = rkVar.b;
    }

    public final void j() {
        this.a.clear();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
    }

    public final void k(int i) {
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            this.b = i2 + i;
        }
        int i3 = this.c;
        if (i3 != Integer.MIN_VALUE) {
            this.c = i3 + i;
        }
    }

    final int l(int i, int i2) {
        View view;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
        int iJ = staggeredGridLayoutManager.b.j();
        int iF = staggeredGridLayoutManager.b.f();
        int i3 = i;
        while (true) {
            int i4 = -1;
            if (i3 == i2) {
                return -1;
            }
            view = (View) this.a.get(i3);
            int iD = staggeredGridLayoutManager.b.d(view);
            int iA = staggeredGridLayoutManager.b.a(view);
            boolean z = iD <= iF;
            boolean z2 = iA >= iJ;
            if (z && z2 && (iD < iJ || iA > iF)) {
                break;
            }
            if (i2 > i) {
                i4 = 1;
            }
            i3 += i4;
        }
        return staggeredGridLayoutManager.aD(view);
    }
}
