package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class efq extends pi {
    private RecyclerView b;

    private final int j(qd qdVar, View view) {
        if (view == null) {
            return -1;
        }
        return qdVar.aD(view);
    }

    @Override // defpackage.pi, defpackage.rh
    public final int[] c(qd qdVar, View view) {
        boolean z = ebc.a;
        int[] iArrC = super.c(qdVar, view);
        if (qdVar.aB() != 0) {
            View viewAI = qdVar.aI(0);
            View viewAI2 = qdVar.aI(qdVar.at() - 1);
            boolean zCanScrollHorizontally = this.b.canScrollHorizontally(-1);
            boolean zCanScrollHorizontally2 = this.b.canScrollHorizontally(1);
            int iJ = j(qdVar, viewAI);
            int iJ2 = j(qdVar, viewAI2);
            if ((!zCanScrollHorizontally && iJ != -1) || (!zCanScrollHorizontally2 && iJ2 != -1)) {
                return new int[]{0, 0};
            }
        }
        return iArrC;
    }

    @Override // defpackage.rh
    public final void g(RecyclerView recyclerView) {
        this.b = recyclerView;
        super.g(recyclerView);
    }
}
