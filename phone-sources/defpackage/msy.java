package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class msy extends RecyclerView.AdapterDataObserver {
    final /* synthetic */ msz a;

    public msy(msz mszVar) {
        this.a = mszVar;
    }

    @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
    public final void onChanged() {
        msz mszVar = this.a;
        if (mszVar.k) {
            return;
        }
        mszVar.j.c(Integer.valueOf(mszVar.d.getItemCount()));
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
