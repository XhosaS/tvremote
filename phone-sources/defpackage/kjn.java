package defpackage;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kjn extends GridLayoutManager {
    public kjn(Context context) {
        super(context, 1, 0, false);
    }

    @Override // android.support.v7.widget.GridLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public final int getRowCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        recycler.getClass();
        state.getClass();
        return -1;
    }

    @Override // android.support.v7.widget.GridLayoutManager, android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public final void onInitializeAccessibilityNodeInfo(RecyclerView.Recycler recycler, RecyclerView.State state, cyq cyqVar) {
        recycler.getClass();
        state.getClass();
        cyqVar.getClass();
        super.onInitializeAccessibilityNodeInfo(recycler, state, cyqVar);
        cyqVar.t("AbsListView");
    }
}
