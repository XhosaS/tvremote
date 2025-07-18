package defpackage;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sdb extends GridLayoutManager.SpanSizeLookup {
    final /* synthetic */ sdc a;

    public sdb(sdc sdcVar) {
        this.a = sdcVar;
    }

    @Override // android.support.v7.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i) {
        sdc sdcVar = this.a;
        RecyclerView recyclerView = sdcVar.b;
        if (recyclerView == null) {
            yks.c("recyclerView");
            recyclerView = null;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        layoutManager.getClass();
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        Object objC = sdcVar.c(i);
        scl sclVar = objC instanceof scl ? (scl) objC : null;
        if (sclVar == null) {
            return gridLayoutManager.getSpanCount();
        }
        int iC = sclVar.c();
        if (iC == -1) {
            return gridLayoutManager.getSpanCount();
        }
        if (iC != 0) {
            return sclVar.c();
        }
        return 1;
    }
}
