package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class qm extends ps {
    final /* synthetic */ RecyclerView a;

    public qm(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // defpackage.ps
    public final void a() {
        RecyclerView recyclerView = this.a;
        recyclerView.A(null);
        recyclerView.N.f = true;
        recyclerView.X(true);
        if (recyclerView.g.k()) {
            return;
        }
        recyclerView.requestLayout();
    }

    @Override // defpackage.ps
    public final void b(int i, int i2, Object obj) {
        RecyclerView recyclerView = this.a;
        recyclerView.A(null);
        lc lcVar = recyclerView.g;
        if (i2 <= 0) {
            return;
        }
        ArrayList arrayList = lcVar.a;
        arrayList.add(lcVar.b(4, i, i2, obj));
        lcVar.d |= 4;
        if (arrayList.size() == 1) {
            f();
        }
    }

    @Override // defpackage.ps
    public final void c(int i, int i2) {
        RecyclerView recyclerView = this.a;
        recyclerView.A(null);
        lc lcVar = recyclerView.g;
        if (i2 <= 0) {
            return;
        }
        ArrayList arrayList = lcVar.a;
        arrayList.add(lcVar.b(1, i, i2, null));
        lcVar.d |= 1;
        if (arrayList.size() == 1) {
            f();
        }
    }

    @Override // defpackage.ps
    public final void d(int i, int i2) {
        RecyclerView recyclerView = this.a;
        recyclerView.A(null);
        lc lcVar = recyclerView.g;
        if (i2 <= 0) {
            return;
        }
        ArrayList arrayList = lcVar.a;
        arrayList.add(lcVar.b(2, i, i2, null));
        lcVar.d |= 2;
        if (arrayList.size() == 1) {
            f();
        }
    }

    @Override // defpackage.ps
    public final void e(int i, int i2) {
        RecyclerView recyclerView = this.a;
        recyclerView.A(null);
        lc lcVar = recyclerView.g;
        if (i == i2) {
            return;
        }
        ArrayList arrayList = lcVar.a;
        arrayList.add(lcVar.b(8, i, i2, null));
        lcVar.d |= 8;
        if (arrayList.size() == 1) {
            f();
        }
    }

    final void f() {
        RecyclerView recyclerView = this.a;
        if (!recyclerView.t || !recyclerView.s) {
            recyclerView.x = true;
            recyclerView.requestLayout();
        } else {
            Runnable runnable = recyclerView.k;
            int[] iArr = ahj.a;
            recyclerView.postOnAnimation(runnable);
        }
    }
}
