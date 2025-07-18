package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class is extends ii {
    final /* synthetic */ RecyclerView a;

    public is(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // defpackage.ii
    public final void n() {
        RecyclerView recyclerView = this.a;
        recyclerView.p(null);
        recyclerView.K.f = true;
        recyclerView.M(true);
        if (recyclerView.U.r()) {
            return;
        }
        recyclerView.requestLayout();
    }
}
