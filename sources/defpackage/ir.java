package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import androidx.leanback.widget.GridLayoutManager;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ir {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    public int e;
    int f;
    public final /* synthetic */ RecyclerView g;
    ael h;

    public ir(RecyclerView recyclerView) {
        this.g = recyclerView;
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
            RecyclerView recyclerView = this.g;
            ix ixVar = recyclerView.K;
            if (i < ixVar.a()) {
                return !ixVar.g ? i : recyclerView.U.h(i);
            }
        }
        StringBuilder sb = new StringBuilder("invalid position ");
        sb.append(i);
        sb.append(". State item count is ");
        RecyclerView recyclerView2 = this.g;
        sb.append(recyclerView2.K.a());
        sb.append(recyclerView2.i());
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final View b(int i) {
        return n(i, Long.MAX_VALUE).b;
    }

    final void c(ja jaVar, boolean z) {
        RecyclerView.q(jaVar);
        View view = jaVar.b;
        RecyclerView recyclerView = this.g;
        jc jcVar = recyclerView.P;
        if (jcVar != null) {
            jb jbVar = jcVar.b;
            qv.l(view, jbVar instanceof jb ? (pe) jbVar.b.remove(view) : null);
        }
        if (z) {
            List list = recyclerView.n;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                GridLayoutManager gridLayoutManager = ((vp) ((byj) list.get(i)).a).ab;
                if (jaVar.a() != -1) {
                    qp qpVar = gridLayoutManager.P;
                }
            }
            if (recyclerView.K != null) {
                recyclerView.V.s(jaVar);
            }
        }
        jaVar.q = null;
        jaVar.p = null;
        ael aelVarO = o();
        int i2 = jaVar.g;
        ArrayList arrayList = aelVarO.j(i2).a;
        int i3 = ((iq) ((SparseArray) aelVarO.b).get(i2)).b;
        if (arrayList.size() >= 5) {
            tk.d(view);
        } else {
            jaVar.i();
            arrayList.add(jaVar);
        }
    }

    public final void d() {
        this.a.clear();
        g();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final void e() {
        RecyclerView recyclerView;
        ig igVar;
        ael aelVar = this.h;
        if (aelVar == null || (igVar = (recyclerView = this.g).l) == null || !recyclerView.r) {
            return;
        }
        aelVar.c.add(igVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Set] */
    public final void f(ig igVar, boolean z) {
        ael aelVar = this.h;
        if (aelVar == null) {
            return;
        }
        ?? r1 = aelVar.c;
        r1.remove(igVar);
        if (r1.size() != 0 || z) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = (SparseArray) aelVar.b;
            if (i >= sparseArray.size()) {
                return;
            }
            ArrayList arrayList = ((iq) sparseArray.get(sparseArray.keyAt(i))).a;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                tk.d(((ja) arrayList.get(i2)).b);
            }
            i++;
        }
    }

    public final void g() {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                h(size);
            }
        }
        arrayList.clear();
        if (RecyclerView.b) {
            this.g.J.b();
        }
    }

    public final void h(int i) {
        int i2 = RecyclerView.aa;
        ArrayList arrayList = this.c;
        c((ja) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public final void i(View view) {
        ja jaVarF = RecyclerView.f(view);
        if (jaVarF.u()) {
            this.g.removeDetachedView(view, false);
        }
        if (jaVarF.t()) {
            jaVarF.m();
        } else if (jaVarF.y()) {
            jaVarF.f();
        }
        j(jaVarF);
        RecyclerView recyclerView = this.g;
        if (recyclerView.C == null || jaVarF.r()) {
            return;
        }
        recyclerView.C.d(jaVarF);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void j(defpackage.ja r10) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir.j(ja):void");
    }

    final void k(View view) {
        ik ikVar;
        ja jaVarF = RecyclerView.f(view);
        if (!jaVarF.n(12) && jaVarF.v() && (ikVar = this.g.C) != null && ja.a.isEmpty() && ikVar.a && !jaVarF.q()) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            jaVarF.l(this, true);
            this.b.add(jaVarF);
            return;
        }
        if (jaVarF.q() && !jaVarF.s()) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(this.g.i()));
        }
        jaVarF.l(this, false);
        this.a.add(jaVarF);
    }

    public final void l(ja jaVar) {
        if (jaVar.m) {
            this.b.remove(jaVar);
        } else {
            this.a.remove(jaVar);
        }
        jaVar.l = null;
        jaVar.m = false;
        jaVar.f();
    }

    public final void m() {
        in inVar = this.g.m;
        this.f = this.e + (inVar != null ? inVar.y : 0);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0 || arrayList.size() <= this.f) {
                return;
            } else {
                h(size);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02cd A[PHI: r10
  0x02cd: PHI (r10v4 ja) = (r10v3 ja), (r10v9 ja) binds: [B:104:0x01b3, B:122:0x0201] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0459 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final defpackage.ja n(int r19, long r20) {
        /*
            Method dump skipped, instructions count: 1172
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir.n(int, long):ja");
    }

    public final ael o() {
        if (this.h == null) {
            this.h = new ael((byte[]) null);
            e();
        }
        return this.h;
    }
}
