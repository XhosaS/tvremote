package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kcg extends RecyclerView.ItemDecoration {
    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.getClass();
        view.getClass();
        recyclerView.getClass();
        state.getClass();
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (childAdapterPosition < 0 || !(layoutManager instanceof GridLayoutManager)) {
            return;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        if (gridLayoutManager.getSpanCount() != 1 && gridLayoutManager.getSpanSizeLookup().getSpanSize(childAdapterPosition) == 1) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.getClass();
            view.setBackground(((GridLayoutManager.LayoutParams) layoutParams).getSpanIndex() == gridLayoutManager.getSpanCount() + (-1) ? null : view.getContext().getResources().getDrawable(R.drawable.item_border, view.getContext().getTheme()));
        }
    }
}
