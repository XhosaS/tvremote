package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ht {
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

    public final View a(ir irVar) {
        List list = this.l;
        if (list == null) {
            View viewB = irVar.b(this.d);
            this.d += this.e;
            return viewB;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((ja) this.l.get(i)).b;
            io ioVar = (io) view.getLayoutParams();
            if (!ioVar.d() && this.d == ioVar.b()) {
                c(view);
                return view;
            }
        }
        return null;
    }

    public final void b() {
        c(null);
    }

    public final void c(View view) {
        int iB;
        int size = this.l.size();
        int i = 0;
        int i2 = Integer.MAX_VALUE;
        View view2 = null;
        while (true) {
            if (i >= size) {
                break;
            }
            View view3 = ((ja) this.l.get(i)).b;
            io ioVar = (io) view3.getLayoutParams();
            if (view3 != view && !ioVar.d() && (iB = (ioVar.b() - this.d) * this.e) >= 0 && iB < i2) {
                if (iB == 0) {
                    view2 = view3;
                    break;
                } else {
                    view2 = view3;
                    i2 = iB;
                }
            }
            i++;
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((io) view2.getLayoutParams()).b();
        }
    }

    public final boolean d(ix ixVar) {
        int i = this.d;
        return i >= 0 && i < ixVar.a();
    }
}
