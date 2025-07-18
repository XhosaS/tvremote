package defpackage;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: PG */
/* loaded from: classes2.dex */
class uyu implements Runnable {
    final /* synthetic */ SwipeDismissBehavior a;
    private final View b;

    public uyu(SwipeDismissBehavior swipeDismissBehavior, View view) {
        this.a = swipeDismissBehavior;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        alp alpVar = this.a.a;
        if (alpVar == null || !alpVar.l()) {
            return;
        }
        this.b.postOnAnimation(this);
    }
}
