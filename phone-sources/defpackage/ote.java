package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.LinearSmoothScroller;
import com.google.android.libraries.flowlayoutmanager.FlowLayoutManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ote extends LinearSmoothScroller {
    final /* synthetic */ FlowLayoutManager a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ote(FlowLayoutManager flowLayoutManager, Context context) {
        super(context);
        this.a = flowLayoutManager;
    }

    @Override // android.support.v7.widget.RecyclerView.SmoothScroller
    public final PointF computeScrollVectorForPosition(int i) {
        return this.a.computeScrollVectorForPosition(i);
    }
}
