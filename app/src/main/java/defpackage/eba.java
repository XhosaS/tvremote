package defpackage;

import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes.dex */
class eba implements Runnable {
    final /* synthetic */ ebb a;

    public eba(ebb ebbVar) {
        this.a = ebbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b = Choreographer.getInstance();
    }
}
