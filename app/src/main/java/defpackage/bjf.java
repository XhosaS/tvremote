package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class bjf extends afn {
    final /* synthetic */ bjg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bjf(bjg bjgVar) {
        super(afn.c);
        this.a = bjgVar;
    }

    @Override // defpackage.afn
    public final void c(View view, ajr ajrVar) {
        bjg bjgVar = this.a;
        bjgVar.g.c(view, ajrVar);
        RecyclerView recyclerView = bjgVar.f;
        int iD = recyclerView.d(view);
        pq adapter = recyclerView.getAdapter();
        if (adapter instanceof biz) {
            ((biz) adapter).m(iD);
        }
    }

    @Override // defpackage.afn
    public final boolean i(View view, int i, Bundle bundle) {
        return this.a.g.i(view, i, bundle);
    }
}
