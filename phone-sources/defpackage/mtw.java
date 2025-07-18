package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mtw extends RecyclerView.ItemDecoration {
    private final Context a;
    private final lfn b;

    public mtw(Context context, lfn lfnVar) {
        this.a = context;
        this.b = lfnVar;
    }

    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        if (this.b.bY() && !(recyclerView.getLayoutManager() instanceof GridLayoutManager) && (recyclerView.getLayoutManager() instanceof LinearLayoutManager) && ((LinearLayoutManager) recyclerView.getLayoutManager()).getOrientation() == 1 && recyclerView.getChildAdapterPosition(view) == state.getItemCount() - 1) {
            try {
                nmq nmqVarA = nmg.d(this.a).h().a();
                if (nmqVarA != null) {
                    if (nmqVarA.d().q()) {
                        rect.bottom = recyclerView.getResources().getDimensionPixelSize(R.dimen.cast_mini_controller_height) + ((int) (recyclerView.getResources().getDisplayMetrics().density * 6.0f));
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}
