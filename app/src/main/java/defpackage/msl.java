package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class msl {
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int j;
    public boolean l;
    public boolean a = true;
    public int h = 0;
    public boolean i = false;
    public List k = null;

    public final View a(ql qlVar, qs qsVar) {
        List list = this.k;
        if (list == null) {
            if (!c(qsVar)) {
                return null;
            }
            try {
                View viewP = qlVar.p(this.d);
                this.d += this.e;
                return viewP;
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            List list2 = this.k;
            list2.getClass();
            qv qvVar = (qv) list2.get(i);
            qvVar.getClass();
            View view = qvVar.a;
            qe qeVar = (qe) view.getLayoutParams();
            qeVar.getClass();
            if (!qeVar.c.s() && this.d == qeVar.c.c()) {
                b(view);
                return view;
            }
        }
        return null;
    }

    public final void b(View view) {
        int iC;
        if (view == null) {
            this.d = -1;
            return;
        }
        List list = this.k;
        list.getClass();
        int size = list.size();
        int i = 0;
        int i2 = Integer.MAX_VALUE;
        View view2 = null;
        while (true) {
            if (i >= size) {
                break;
            }
            List list2 = this.k;
            list2.getClass();
            ((qv) list2.get(i)).getClass();
            View view3 = ((qv) this.k.get(i)).a;
            qe qeVar = (qe) view3.getLayoutParams();
            qeVar.getClass();
            if (view3 != view && !qeVar.c.s() && (iC = (qeVar.c.c() - this.d) * this.e) >= 0 && iC < i2) {
                if (iC == 0) {
                    view2 = view3;
                    break;
                } else {
                    view2 = view3;
                    i2 = iC;
                }
            }
            i++;
        }
        view2.getClass();
        qe qeVar2 = (qe) view2.getLayoutParams();
        qeVar2.getClass();
        this.d = qeVar2.c.c();
    }

    public final boolean c(qs qsVar) {
        int i = this.d;
        return i >= 0 && i < qsVar.a();
    }
}
