package defpackage;

import android.support.v7.widget.RecyclerView;
import androidx.leanback.widget.VerticalGridView;

/* compiled from: PG */
/* loaded from: classes.dex */
class bbi extends aze {
    final /* synthetic */ bbl a;

    public bbi(bbl bblVar) {
        this.a = bblVar;
    }

    @Override // defpackage.aze
    public final void a(RecyclerView recyclerView, qv qvVar, int i, int i2) {
        bbl bblVar = this.a;
        int iIndexOf = bblVar.j.indexOf((VerticalGridView) recyclerView);
        bblVar.k(iIndexOf);
        if (qvVar != null) {
            bblVar.a(iIndexOf, ((bbm) bblVar.k.get(iIndexOf)).b + i);
        }
    }
}
