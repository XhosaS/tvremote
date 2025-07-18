package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eeo extends ejf {
    public int a = Integer.MAX_VALUE;

    public final void a(boolean z, int i, int i2, qr qrVar) {
        qd layoutManager;
        int i3;
        RecyclerView recyclerViewC = c();
        if (recyclerViewC == null || (layoutManager = recyclerViewC.getLayoutManager()) == null || recyclerViewC.isLayoutSuppressed()) {
            return;
        }
        if (z) {
            if (qrVar == null) {
                Context context = recyclerViewC.getContext();
                int i4 = this.a;
                if (i4 == -1) {
                    i3 = 6;
                } else if (i4 != 1) {
                    switch (i4) {
                        case 2147483646:
                        case Integer.MAX_VALUE:
                            i3 = 1;
                            break;
                        default:
                            i3 = 2;
                            break;
                    }
                } else {
                    i3 = 8;
                }
                qrVar = (i3 == 6 || i3 == 8) ? new efu(context, i3 - 7) : i3 == 1 ? new eff(context) : new or(context);
            }
            qrVar.g = i2;
            layoutManager.bk(qrVar);
            return;
        }
        if (this.a != -1) {
            e(i);
            if (layoutManager.ae()) {
                b(0, 1);
                return;
            } else {
                b(1, 0);
                return;
            }
        }
        ejt ejtVar = this.b;
        if (ejtVar != null) {
            qd layoutManager2 = ejtVar.getRecyclerView().getLayoutManager();
            if (layoutManager2 instanceof LinearLayoutManager) {
                ((LinearLayoutManager) layoutManager2).aa(i2, 0);
            } else {
                e(i2);
            }
        }
    }

    public final void b(int i, int i2) {
        RecyclerView recyclerViewC = c();
        if (recyclerViewC == null) {
            return;
        }
        recyclerViewC.ak(i, i2);
    }
}
