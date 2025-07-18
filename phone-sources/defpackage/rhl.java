package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rhl extends RecyclerView.AdapterDataObserver {
    final /* synthetic */ qvx a;
    final /* synthetic */ rdz b;
    final /* synthetic */ rhp c;

    public rhl(rhp rhpVar, qvx qvxVar, rdz rdzVar) {
        this.a = qvxVar;
        this.b = rdzVar;
        this.c = rhpVar;
    }

    @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeInserted(int i, int i2) {
        rhp rhpVar = this.c;
        rhpVar.d(rhpVar.n, this.a, this.b);
    }

    @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeRemoved(int i, int i2) {
        rhp rhpVar = this.c;
        rhpVar.d(rhpVar.n, this.a, this.b);
    }
}
