package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class sr implements Runnable {
    final /* synthetic */ sw a;
    final /* synthetic */ sz b;

    public sr(sz szVar, sw swVar) {
        this.b = szVar;
        this.a = swVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sz szVar = this.b;
        RecyclerView recyclerView = szVar.p;
        if (recyclerView == null || !recyclerView.s) {
            return;
        }
        sw swVar = this.a;
        if (swVar.n || swVar.h.cs() == -1) {
            return;
        }
        px itemAnimator = szVar.p.getItemAnimator();
        if (itemAnimator == null || !itemAnimator.i()) {
            List list = szVar.n;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((sw) list.get(i)).o) {
                }
            }
            return;
        }
        szVar.p.post(this);
    }
}
