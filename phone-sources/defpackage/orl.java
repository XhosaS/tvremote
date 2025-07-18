package defpackage;

import com.google.android.libraries.bind.card.BindRecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class orl extends orn {
    final /* synthetic */ BindRecyclerView a;

    public orl(BindRecyclerView bindRecyclerView) {
        this.a = bindRecyclerView;
    }

    @Override // defpackage.orn, android.support.v7.widget.RecyclerView.AdapterDataObserver
    public final void onChanged() {
        BindRecyclerView bindRecyclerView = this.a;
        oro oroVar = bindRecyclerView.b;
        if (oroVar != null) {
            bindRecyclerView.b = null;
            if (oroVar.d == 0) {
                BindRecyclerView.a.c("restoreStashedStateIfNeeded() saved state: %s", oroVar);
            }
            bindRecyclerView.b(oroVar);
        }
    }
}
