package defpackage;

import android.support.v7.widget.RecyclerView;
import androidx.leanback.widget.VerticalGridView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class wp extends wa {
    final /* synthetic */ wq a;

    public wp(wq wqVar) {
        this.a = wqVar;
    }

    @Override // defpackage.wa
    public final void a(RecyclerView recyclerView, ja jaVar, int i) {
        wq wqVar = this.a;
        int iIndexOf = wqVar.i.indexOf((VerticalGridView) recyclerView);
        wqVar.i(iIndexOf);
        if (jaVar != null) {
            wqVar.a(iIndexOf, ((wr) wqVar.j.get(iIndexOf)).b + i);
        }
    }
}
