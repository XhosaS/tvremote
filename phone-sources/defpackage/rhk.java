package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rhk extends RecyclerView.AdapterDataObserver {
    final /* synthetic */ qvx a;
    final /* synthetic */ RecyclerView b;
    final /* synthetic */ qvy c;

    public rhk(qvx qvxVar, RecyclerView recyclerView, qvy qvyVar) {
        this.a = qvxVar;
        this.b = recyclerView;
        this.c = qvyVar;
    }

    @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeInserted(int i, int i2) {
        rhp.c(this.a, this.b, this.c);
    }

    @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeRemoved(int i, int i2) {
        rhp.c(this.a, this.b, this.c);
    }
}
