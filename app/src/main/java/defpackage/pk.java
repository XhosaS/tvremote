package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class pk implements Runnable {
    final /* synthetic */ RecyclerView a;

    public pk(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.a;
        px pxVar = recyclerView.F;
        if (pxVar != null) {
            pxVar.e();
        }
        recyclerView.R = false;
    }
}
