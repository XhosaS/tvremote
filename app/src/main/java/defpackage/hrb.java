package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
class hrb extends hhi {
    final /* synthetic */ hrc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hrb(hrc hrcVar, Bundle bundle, hhh hhhVar) {
        super(bundle, hhhVar);
        this.b = hrcVar;
    }

    @Override // defpackage.hhi
    public final int c(RecyclerView recyclerView) {
        qv qvVarJ = recyclerView.j(0);
        return qvVarJ != null ? -qvVarJ.a.getTop() : this.b.aF;
    }
}
