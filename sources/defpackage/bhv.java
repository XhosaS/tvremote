package defpackage;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhv implements Runnable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    private final Object c;

    public bhv(Object obj, Object obj2, int i) {
        this.b = i;
        this.a = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ds dsVar;
        if (this.b == 0) {
            tv tvVar = ((SwipeDismissBehavior) this.a).a;
            if (tvVar == null || !tvVar.l()) {
                return;
            }
            ((View) this.c).postOnAnimation(this);
            return;
        }
        fa faVar = (fa) this.a;
        du duVar = faVar.c;
        if (duVar != null && (dsVar = duVar.b) != null) {
            dsVar.E(duVar);
        }
        View view = (View) faVar.f;
        if (view != null && view.getWindowToken() != null) {
            Object obj = this.c;
            if (((ee) obj).h()) {
                faVar.i = (ez) obj;
            }
        }
        faVar.k = null;
    }
}
