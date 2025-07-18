package defpackage;

import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import androidx.leanback.widget.GridLayoutManager;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ql {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    public int e;
    int f;
    qk g;
    public final /* synthetic */ RecyclerView h;

    public ql(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new ArrayList();
        this.d = DesugarCollections.unmodifiableList(arrayList);
        this.e = 2;
        this.f = 2;
    }

    public final int a(int i) {
        if (i >= 0) {
            RecyclerView recyclerView = this.h;
            if (i < recyclerView.N.a()) {
                return !recyclerView.N.g ? i : recyclerView.g.a(i, 0);
            }
        }
        StringBuilder sb = new StringBuilder("invalid position ");
        sb.append(i);
        sb.append(". State item count is ");
        RecyclerView recyclerView2 = this.h;
        sb.append(recyclerView2.N.a());
        sb.append(recyclerView2.r());
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final qk b() {
        if (this.g == null) {
            this.g = new qk();
            e();
        }
        return this.g;
    }

    final void c(qv qvVar, boolean z) {
        RecyclerView.B(qvVar);
        RecyclerView recyclerView = this.h;
        View view = qvVar.a;
        qx qxVar = recyclerView.S;
        if (qxVar != null) {
            afn afnVarJ = qxVar.j();
            ahj.n(view, afnVarJ instanceof qw ? (afn) ((qw) afnVarJ).b.remove(view) : null);
        }
        if (z) {
            List list = recyclerView.p;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                GridLayoutManager gridLayoutManager = ((awd) list.get(i)).a.ad;
                int iCs = qvVar.cs();
                if (iCs != -1) {
                    bbe bbeVar = gridLayoutManager.W;
                    int i2 = bbeVar.a;
                    if (i2 == 1) {
                        bbeVar.c(iCs);
                    } else if ((i2 == 2 || i2 == 3) && bbeVar.c != null) {
                        String string = Integer.toString(iCs);
                        SparseArray<Parcelable> sparseArray = new SparseArray<>();
                        view.saveHierarchyState(sparseArray);
                        bbeVar.c.f(string, sparseArray);
                    }
                }
            }
            pq pqVar = recyclerView.n;
            if (pqVar != null) {
                pqVar.j(qvVar);
            }
            if (recyclerView.N != null) {
                recyclerView.i.g(qvVar);
            }
        }
        qvVar.r = null;
        qvVar.q = null;
        qk qkVarB = b();
        int i3 = qvVar.f;
        ArrayList arrayList = qkVarB.b(i3).a;
        if (((qj) qkVarB.a.get(i3)).b <= arrayList.size()) {
            alf.b(view);
        } else {
            qvVar.k();
            arrayList.add(qvVar);
        }
    }

    public final void d() {
        this.a.clear();
        h();
    }

    public final void e() {
        RecyclerView recyclerView;
        pq pqVar;
        qk qkVar = this.g;
        if (qkVar == null || (pqVar = (recyclerView = this.h).n) == null || !recyclerView.s) {
            return;
        }
        qkVar.c.add(pqVar);
    }

    public final void f(pq pqVar, boolean z) {
        qk qkVar = this.g;
        if (qkVar == null) {
            return;
        }
        Set set = qkVar.c;
        set.remove(pqVar);
        if (set.size() != 0 || z) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = qkVar.a;
            if (i >= sparseArray.size()) {
                return;
            }
            ArrayList arrayList = ((qj) sparseArray.get(sparseArray.keyAt(i))).a;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                alf.b(((qv) arrayList.get(i2)).a);
            }
            i++;
        }
    }

    final void g(View view) {
        qv qvVarM = RecyclerView.m(view);
        qvVarM.m = null;
        qvVarM.n = false;
        qvVarM.h();
        k(qvVarM);
    }

    public final void h() {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                i(size);
            }
        }
        arrayList.clear();
        if (RecyclerView.b) {
            this.h.M.b();
        }
    }

    public final void i(int i) {
        int i2 = RecyclerView.ac;
        ArrayList arrayList = this.c;
        c((qv) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public final void j(View view) {
        qv qvVarM = RecyclerView.m(view);
        if (qvVarM.u()) {
            this.h.removeDetachedView(view, false);
        }
        if (qvVarM.t()) {
            qvVarM.m.n(qvVarM);
        } else if (qvVarM.y()) {
            qvVarM.h();
        }
        k(qvVarM);
        RecyclerView recyclerView = this.h;
        if (recyclerView.F == null || qvVarM.r()) {
            return;
        }
        recyclerView.F.c(qvVarM);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void k(defpackage.qv r10) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ql.k(qv):void");
    }

    final void l(View view) {
        px pxVar;
        qv qvVarM = RecyclerView.m(view);
        if (!qvVarM.n(12) && qvVarM.v() && (pxVar = this.h.F) != null && !pxVar.h(qvVarM, qvVarM.d())) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            qvVarM.m = this;
            qvVarM.n = true;
            this.b.add(qvVarM);
            return;
        }
        if (qvVarM.q() && !qvVarM.s()) {
            RecyclerView recyclerView = this.h;
            if (!recyclerView.n.b) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.r()));
            }
        }
        qvVarM.m = this;
        qvVarM.n = false;
        this.a.add(qvVarM);
    }

    public final void m(qk qkVar) {
        RecyclerView recyclerView = this.h;
        f(recyclerView.n, false);
        qk qkVar2 = this.g;
        if (qkVar2 != null) {
            qkVar2.d();
        }
        this.g = qkVar;
        if (qkVar != null && recyclerView.getAdapter() != null) {
            this.g.c();
        }
        e();
    }

    public final void n(qv qvVar) {
        if (qvVar.n) {
            this.b.remove(qvVar);
        } else {
            this.a.remove(qvVar);
        }
        qvVar.m = null;
        qvVar.n = false;
        qvVar.h();
    }

    public final void o() {
        qd qdVar = this.h.o;
        this.f = this.e + (qdVar != null ? qdVar.D : 0);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0 || arrayList.size() <= this.f) {
                return;
            } else {
                i(size);
            }
        }
    }

    public final View p(int i) {
        return q(i, Long.MAX_VALUE).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x052b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final defpackage.qv q(int r25, long r26) {
        /*
            Method dump skipped, instructions count: 1381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ql.q(int, long):qv");
    }
}
