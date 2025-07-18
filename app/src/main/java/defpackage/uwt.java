package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
class uwt extends qx {
    final /* synthetic */ uws f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uwt(RecyclerView recyclerView, uws uwsVar) {
        super(recyclerView);
        this.f = uwsVar;
    }

    @Override // defpackage.qx, defpackage.afn
    public final void c(View view, ajr ajrVar) {
        super.c(view, ajrVar);
        uws uwsVar = this.f;
        ajrVar.d(ajp.a(uwsVar.o(), uwsVar.n()));
    }
}
