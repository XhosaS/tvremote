package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.LinearSmoothScroller;
import com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class thw extends LinearSmoothScroller {
    final /* synthetic */ SpannedGridLayoutManager a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public thw(SpannedGridLayoutManager spannedGridLayoutManager, Context context) {
        super(context);
        this.a = spannedGridLayoutManager;
    }

    @Override // android.support.v7.widget.RecyclerView.SmoothScroller
    public final PointF computeScrollVectorForPosition(int i) {
        SpannedGridLayoutManager spannedGridLayoutManager = this.a;
        return new PointF(0.0f, spannedGridLayoutManager.b.d(i) - spannedGridLayoutManager.f);
    }
}
