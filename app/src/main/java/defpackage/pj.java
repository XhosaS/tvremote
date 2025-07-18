package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class pj implements Runnable {
    final /* synthetic */ RecyclerView a;

    public pj(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.a;
        if (!recyclerView.u || recyclerView.isLayoutRequested()) {
            return;
        }
        if (!recyclerView.s) {
            recyclerView.requestLayout();
        } else if (recyclerView.w) {
            recyclerView.v = true;
        } else {
            recyclerView.E();
        }
    }
}
