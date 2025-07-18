package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ejf {
    private final Runnable a = new eje(this);
    public ejt b;

    public final RecyclerView c() {
        ejt ejtVar = this.b;
        if (ejtVar == null) {
            return null;
        }
        return ejtVar.getRecyclerView();
    }

    public final void d() {
        ejt ejtVar = this.b;
        if (ejtVar == null || !ejtVar.a) {
            return;
        }
        if (dyd.b()) {
            ejtVar.j(false, false);
            return;
        }
        Runnable runnable = this.a;
        ejtVar.removeCallbacks(runnable);
        ejtVar.post(runnable);
    }

    public final void e(int i) {
        ejt ejtVar = this.b;
        if (ejtVar == null) {
            return;
        }
        ejtVar.getRecyclerView().ae(i);
    }
}
