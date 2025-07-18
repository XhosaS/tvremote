package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.ViewParent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ohk extends qo {
    private boolean a = false;
    private boolean b = false;

    @Override // defpackage.qo, defpackage.qh
    public final boolean f(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean z;
        qd layoutManager;
        if (!this.a) {
            this.a = true;
            ViewParent parent = recyclerView.getParent();
            while (true) {
                if (parent == null) {
                    z = false;
                    break;
                }
                if ((parent instanceof RecyclerView) && (layoutManager = ((RecyclerView) parent).getLayoutManager()) != null && layoutManager.ae()) {
                    z = true;
                    break;
                }
                parent = parent.getParent();
            }
            this.b = z;
        }
        if (this.b && motionEvent.getAction() == 2) {
            recyclerView.getParent().requestDisallowInterceptTouchEvent(true);
        }
        return false;
    }
}
