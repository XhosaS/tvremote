package defpackage;

import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
class uya implements Runnable {
    final /* synthetic */ uyb a;
    private final CoordinatorLayout b;
    private final View c;

    public uya(uyb uybVar, CoordinatorLayout coordinatorLayout, View view) {
        this.a = uybVar;
        this.b = coordinatorLayout;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uyb uybVar;
        OverScroller overScroller;
        View view = this.c;
        if (view == null || (overScroller = (uybVar = this.a).b) == null) {
            return;
        }
        if (!overScroller.computeScrollOffset()) {
            uybVar.u(view);
        } else {
            uybVar.v(this.b, view, uybVar.b.getCurrY(), Integer.MAX_VALUE);
            view.postOnAnimation(this);
        }
    }
}
