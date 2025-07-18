package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class pp {
    final /* synthetic */ RecyclerView a;

    public pp(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final qv a(int i) {
        RecyclerView recyclerView = this.a;
        qv qvVarK = recyclerView.k(i, true);
        if (qvVarK == null || recyclerView.h.l(qvVarK.a)) {
            return null;
        }
        return qvVarK;
    }

    final void b(lb lbVar) {
        int i = lbVar.a;
        if (i == 1) {
            this.a.o.x(lbVar.b, lbVar.d);
            return;
        }
        if (i == 2) {
            this.a.o.A(lbVar.b, lbVar.d);
            return;
        }
        if (i != 4) {
            if (i != 8) {
                return;
            }
            this.a.o.z(lbVar.b, lbVar.d);
        } else {
            qd qdVar = this.a.o;
            int i2 = lbVar.b;
            int i3 = lbVar.d;
            Object obj = lbVar.c;
            qdVar.B(i2, i3);
        }
    }

    public final void c(int i, int i2, Object obj) {
        int i3;
        int i4;
        int i5;
        RecyclerView recyclerView = this.a;
        int iB = recyclerView.h.b();
        int i6 = 0;
        while (true) {
            i3 = i + i2;
            if (i6 >= iB) {
                break;
            }
            View viewE = recyclerView.h.e(i6);
            qv qvVarM = RecyclerView.m(viewE);
            if (qvVarM != null && !qvVarM.x() && (i5 = qvVarM.c) >= i && i5 < i3) {
                qvVarM.j |= 2;
                qvVarM.e(obj);
                ((qe) viewE.getLayoutParams()).e = true;
            }
            i6++;
        }
        ql qlVar = recyclerView.e;
        ArrayList arrayList = qlVar.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                recyclerView.Q = true;
                return;
            }
            qv qvVar = (qv) arrayList.get(size);
            if (qvVar != null && (i4 = qvVar.c) >= i && i4 < i3) {
                qvVar.j |= 2;
                qlVar.i(size);
            }
        }
    }

    public final void d(int i, int i2) {
        RecyclerView recyclerView = this.a;
        int iB = recyclerView.h.b();
        for (int i3 = 0; i3 < iB; i3++) {
            qv qvVarM = RecyclerView.m(recyclerView.h.e(i3));
            if (qvVarM != null && !qvVarM.x() && qvVarM.c >= i) {
                qvVarM.j(i2, false);
                recyclerView.N.f = true;
            }
        }
        ArrayList arrayList = recyclerView.e.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            qv qvVar = (qv) arrayList.get(i4);
            if (qvVar != null && qvVar.c >= i) {
                qvVar.j(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.P = true;
    }

    public final void e(int i, int i2) {
        int i3;
        RecyclerView recyclerView = this.a;
        int iB = recyclerView.h.b();
        int i4 = 0;
        while (true) {
            if (i4 >= iB) {
                break;
            }
            qv qvVarM = RecyclerView.m(recyclerView.h.e(i4));
            if (qvVarM != null) {
                int i5 = i < i2 ? i : i2;
                int i6 = qvVarM.c;
                if (i6 >= i5) {
                    if (i6 <= (i < i2 ? i2 : i)) {
                        if (i6 == i) {
                            qvVarM.j(i2 - i, false);
                        } else {
                            qvVarM.j(i >= i2 ? 1 : -1, false);
                        }
                        recyclerView.N.f = true;
                    }
                }
            }
            i4++;
        }
        ql qlVar = recyclerView.e;
        int i7 = i < i2 ? i2 : i;
        int i8 = i < i2 ? i : i2;
        ArrayList arrayList = qlVar.c;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            qv qvVar = (qv) arrayList.get(i9);
            if (qvVar != null && (i3 = qvVar.c) >= i8 && i3 <= i7) {
                if (i3 == i) {
                    qvVar.j(i2 - i, false);
                } else {
                    qvVar.j(i < i2 ? -1 : 1, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.P = true;
    }

    public final void f(int i, int i2) {
        RecyclerView recyclerView = this.a;
        recyclerView.T(i, i2, true);
        recyclerView.P = true;
        recyclerView.N.c += i2;
    }
}
