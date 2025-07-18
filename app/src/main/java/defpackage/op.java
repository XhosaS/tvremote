package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class op {
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int k;
    public boolean m;
    public boolean a = true;
    public int h = 0;
    public int i = 0;
    public boolean j = false;
    public List l = null;

    public final View a(ql qlVar) {
        List list = this.l;
        if (list == null) {
            View viewP = qlVar.p(this.d);
            this.d += this.e;
            return viewP;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((qv) this.l.get(i)).a;
            qe qeVar = (qe) view.getLayoutParams();
            if (!qeVar.c.s() && this.d == qeVar.c.c()) {
                b(view);
                return view;
            }
        }
        return null;
    }

    public final void b(View view) {
        int iC;
        int size = this.l.size();
        int i = 0;
        int i2 = Integer.MAX_VALUE;
        View view2 = null;
        while (true) {
            if (i >= size) {
                break;
            }
            View view3 = ((qv) this.l.get(i)).a;
            qe qeVar = (qe) view3.getLayoutParams();
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
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((qe) view2.getLayoutParams()).c.c();
        }
    }

    public final boolean c(qs qsVar) {
        int i = this.d;
        return i >= 0 && i < qsVar.a();
    }
}
