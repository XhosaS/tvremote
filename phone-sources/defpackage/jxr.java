package defpackage;

import android.graphics.Color;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxr extends RecyclerView.OnScrollListener {
    private final View a;

    public jxr(View view) {
        view.getClass();
        this.a = view;
    }

    @Override // android.support.v7.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        recyclerView.getClass();
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        layoutManager.getClass();
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        View viewFindViewByPosition = linearLayoutManager.findViewByPosition(linearLayoutManager.findFirstVisibleItemPosition());
        this.a.setBackgroundColor(iComputeHorizontalScrollOffset > (recyclerView.getWidth() / 2) - ((viewFindViewByPosition != null ? viewFindViewByPosition.getWidth() : 0) / 2) ? Color.parseColor("#66000000") : 0);
    }
}
