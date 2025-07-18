package defpackage;

import android.content.ComponentName;

/* compiled from: PG */
/* loaded from: classes.dex */
class lgi implements Runnable {
    final /* synthetic */ ComponentName a;
    final /* synthetic */ lgo b;

    public lgi(lgo lgoVar, ComponentName componentName) {
        this.a = componentName;
        this.b = lgoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c.n(this.a);
    }
}
