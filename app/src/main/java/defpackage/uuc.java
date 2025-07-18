package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
class uuc extends qi {
    final /* synthetic */ uuj a;

    public uuc(uuj uujVar) {
        this.a = uujVar;
    }

    @Override // defpackage.qi
    public final void b(RecyclerView recyclerView, int i) {
        if (i == 0) {
            this.a.b();
        }
    }

    @Override // defpackage.qi
    public final void d(RecyclerView recyclerView, int i, int i2) {
        uuj uujVar = this.a;
        yqw.L(recyclerView == uujVar.g);
        if (i == 0 && i2 == 0) {
            return;
        }
        uujVar.b();
    }
}
