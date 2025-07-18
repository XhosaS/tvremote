package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.LinearSmoothScroller;
import com.google.android.play.layout.FlowLayoutManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tgc extends LinearSmoothScroller {
    final /* synthetic */ FlowLayoutManager a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgc(FlowLayoutManager flowLayoutManager, Context context) {
        super(context);
        this.a = flowLayoutManager;
    }

    @Override // android.support.v7.widget.RecyclerView.SmoothScroller
    public final PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        FlowLayoutManager flowLayoutManager = this.a;
        return new PointF(0.0f, i < flowLayoutManager.getPosition(flowLayoutManager.getChildAt(0)) ? -1 : 1);
    }
}
