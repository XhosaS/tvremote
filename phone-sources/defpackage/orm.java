package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class orm extends LinearSmoothScroller {
    final /* synthetic */ RecyclerView.LayoutManager a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public orm(Context context, RecyclerView.LayoutManager layoutManager) {
        super(context);
        this.a = layoutManager;
    }

    @Override // android.support.v7.widget.LinearSmoothScroller
    protected final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v7.widget.RecyclerView.SmoothScroller
    public final PointF computeScrollVectorForPosition(int i) {
        RecyclerView.LayoutManager layoutManager = this.a;
        if (layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) {
            return ((RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(i);
        }
        if (layoutManager.getChildCount() == 0) {
            return null;
        }
        return new PointF(0.0f, i < layoutManager.getPosition(layoutManager.getChildAt(0)) ? -1 : 1);
    }

    @Override // android.support.v7.widget.LinearSmoothScroller
    protected final int getVerticalSnapPreference() {
        return -1;
    }

    @Override // android.support.v7.widget.LinearSmoothScroller, android.support.v7.widget.RecyclerView.SmoothScroller
    protected final void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
        RecyclerView.SmoothScroller.Action action2 = new RecyclerView.SmoothScroller.Action(0, 0);
        action2.update(action.getDx(), action.getDy(), action.getDuration(), action.getInterpolator());
        super.onTargetFound(view, state, action2);
        if (action2.getDuration() > 0) {
            if (action2.getDy() != 0) {
                action2.setDy(action2.getDy());
            } else if (action2.getDx() != 0) {
                action2.setDx(action2.getDx());
            }
            if (action2.getDy() == 0 && action2.getDx() == 0 && action2.getInterpolator() == action.getInterpolator()) {
                return;
            }
            action.update(action2.getDx(), action2.getDy(), action2.getDuration(), action2.getInterpolator());
        }
    }

    @Override // android.support.v7.widget.LinearSmoothScroller, android.support.v7.widget.RecyclerView.SmoothScroller
    protected final void onStart() {
    }
}
