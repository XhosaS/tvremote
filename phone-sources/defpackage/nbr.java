package defpackage;

import android.support.v7.appcompat.R;
import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.apps.play.movies.mobileux.view.widget.LeadingEdgeSnapRecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nbr extends RecyclerView.SmoothScroller {
    boolean a;
    final /* synthetic */ int b;
    final /* synthetic */ LeadingEdgeSnapRecyclerView c;

    public nbr(LeadingEdgeSnapRecyclerView leadingEdgeSnapRecyclerView, int i) {
        this.b = i;
        this.c = leadingEdgeSnapRecyclerView;
        setTargetPosition(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    @Override // android.support.v7.widget.RecyclerView.SmoothScroller
    protected final void onSeekTargetStep(int i, int i2, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
        if (this.a) {
            return;
        }
        this.a = true;
        action.setDx(this.b);
        action.setDuration(((int) (Math.sqrt(Math.abs(r3) / this.c.getWidth()) * 275.0d)) + R.styleable.AppCompatTheme_windowMinWidthMinor);
        action.setInterpolator(new DecelerateInterpolator(2.0f));
    }

    @Override // android.support.v7.widget.RecyclerView.SmoothScroller
    protected final void onStart() {
    }

    @Override // android.support.v7.widget.RecyclerView.SmoothScroller
    protected final void onStop() {
    }

    @Override // android.support.v7.widget.RecyclerView.SmoothScroller
    protected final void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
    }
}
