package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
class lgv implements Runnable {
    final /* synthetic */ lih a;
    final /* synthetic */ Runnable b;

    public lgv(lih lihVar, Runnable runnable) {
        this.a = lihVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lih lihVar = this.a;
        lihVar.t();
        lihVar.aC().g();
        if (lihVar.o == null) {
            lihVar.o = new ArrayList();
        }
        lihVar.o.add(this.b);
        lihVar.Z();
    }
}
