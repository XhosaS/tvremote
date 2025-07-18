package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mmi extends RecyclerView.ItemDecoration {
    final /* synthetic */ mmk a;

    public mmi(mmk mmkVar) {
        this.a = mmkVar;
    }

    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        if (recyclerView.getChildAdapterPosition(view) == recyclerView.getAdapter().getItemCount() - 1) {
            rect.set(0, 0, 0, this.a.R.l());
        }
    }
}
