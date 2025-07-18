package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.googletv.app.presentation.views.verticalgridrecyclerview.VerticalGridRecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class klg extends RecyclerView.ItemDecoration {
    final /* synthetic */ VerticalGridRecyclerView a;

    public klg(VerticalGridRecyclerView verticalGridRecyclerView) {
        this.a = verticalGridRecyclerView;
    }

    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.getClass();
        view.getClass();
        recyclerView.getClass();
        state.getClass();
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition < 0) {
            return;
        }
        VerticalGridRecyclerView verticalGridRecyclerView = this.a;
        RecyclerView.LayoutManager layoutManager = verticalGridRecyclerView.getLayoutManager();
        layoutManager.getClass();
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        if (gridLayoutManager.getSpanSizeLookup().getSpanSize(childAdapterPosition) == gridLayoutManager.getSpanCount()) {
            rect.left = -verticalGridRecyclerView.getPaddingLeft();
            rect.right = -verticalGridRecyclerView.getPaddingRight();
        }
    }
}
