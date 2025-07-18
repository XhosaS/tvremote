package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tbt extends RecyclerView.AdapterDataObserver {
    final /* synthetic */ tbw a;

    public tbt(tbw tbwVar) {
        this.a = tbwVar;
    }

    @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
    public final void onChanged() {
        this.a.a();
    }

    @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeChanged(int i, int i2) {
        this.a.a();
    }

    @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeInserted(int i, int i2) {
        this.a.a();
    }

    @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeMoved(int i, int i2, int i3) {
        this.a.a();
    }

    @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeRemoved(int i, int i2) {
        this.a.a();
    }

    @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeChanged(int i, int i2, Object obj) {
        this.a.a();
    }
}
