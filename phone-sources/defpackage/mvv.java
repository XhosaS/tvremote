package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mvv extends RecyclerView.AdapterDataObserver {
    final /* synthetic */ mvw a;

    public mvv(mvw mvwVar) {
        this.a = mvwVar;
    }

    @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
    public final void onChanged() {
        this.a.a(false);
    }

    @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeChanged(int i, int i2) {
        onChanged();
    }

    @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeInserted(int i, int i2) {
        onChanged();
    }

    @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeMoved(int i, int i2, int i3) {
        onChanged();
    }

    @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeRemoved(int i, int i2) {
        onChanged();
    }
}
