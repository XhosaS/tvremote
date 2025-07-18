package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
class the extends RecyclerView.AdapterDataObserver {
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

    @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
    public void onChanged() {
    }
}
