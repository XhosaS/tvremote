package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mly extends LinearLayoutManager {
    public mly(Context context) {
        super(context);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final boolean isLayoutHierarchical(RecyclerView.Recycler recycler, RecyclerView.State state) {
        return true;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, cyq cyqVar) {
        super.onInitializeAccessibilityNodeInfoForItem(recycler, state, view, cyqVar);
        int itemViewType = getItemViewType(view);
        cyqVar.w(new cxe(AccessibilityNodeInfo.CollectionItemInfo.obtain(getPosition(view), 1, 0, 1, itemViewType == R.layout.details_trailers_title || itemViewType == R.layout.details_extras_title)));
    }
}
