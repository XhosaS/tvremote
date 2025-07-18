package defpackage;

import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class soh implements Runnable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    private final Object c;
    private final Object d;

    public soh(lha lhaVar, dze dzeVar, idy idyVar, int i) {
        this.b = i;
        this.a = lhaVar;
        this.d = dzeVar;
        this.c = idyVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [idy, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        soi soiVar;
        OverScroller overScroller;
        if (this.b != 0) {
            this.c.c(((lha) this.a).ep(null, (dze) this.d));
            return;
        }
        Object obj = this.d;
        if (obj == null || (overScroller = (soiVar = (soi) this.a).b) == null) {
            return;
        }
        if (!overScroller.computeScrollOffset()) {
            soiVar.I((CoordinatorLayout) this.c, (View) obj);
            return;
        }
        View view = (View) obj;
        soiVar.O((CoordinatorLayout) this.c, view, soiVar.b.getCurrY());
        view.postOnAnimation(this);
    }

    public soh(soi soiVar, CoordinatorLayout coordinatorLayout, View view, int i) {
        this.b = i;
        this.a = soiVar;
        this.c = coordinatorLayout;
        this.d = view;
    }
}
