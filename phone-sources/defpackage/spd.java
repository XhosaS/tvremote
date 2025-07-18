package defpackage;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class spd implements Runnable {
    final /* synthetic */ SwipeDismissBehavior a;
    private final View b;
    private final boolean c;

    public spd(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.a = swipeDismissBehavior;
        this.b = view;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zft zftVar;
        SwipeDismissBehavior swipeDismissBehavior = this.a;
        das dasVar = swipeDismissBehavior.a;
        if (dasVar != null && dasVar.l()) {
            this.b.postOnAnimation(this);
        } else {
            if (!this.c || (zftVar = swipeDismissBehavior.f) == null) {
                return;
            }
            zftVar.k(this.b);
        }
    }
}
