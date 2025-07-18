package defpackage;

import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bhd implements Runnable {
    final /* synthetic */ bhe a;
    private final CoordinatorLayout b;
    private final View c;

    public bhd(bhe bheVar, CoordinatorLayout coordinatorLayout, View view) {
        this.a = bheVar;
        this.b = coordinatorLayout;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bhe bheVar;
        OverScroller overScroller;
        View view = this.c;
        if (view == null || (overScroller = (bheVar = this.a).b) == null) {
            return;
        }
        if (!overScroller.computeScrollOffset()) {
            bheVar.W(view);
        } else {
            bheVar.X(this.b, view, bheVar.b.getCurrY(), Integer.MAX_VALUE);
            view.postOnAnimation(this);
        }
    }
}
