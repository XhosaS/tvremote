package defpackage;

import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afxp {
    final Object a;
    Future b;
    boolean c;

    public afxp(Object obj) {
        this.a = obj;
    }

    final Future a() {
        this.c = true;
        return this.b;
    }

    final void b(Future future) {
        boolean z;
        synchronized (this.a) {
            z = this.c;
            if (!z) {
                this.b = future;
            }
        }
        if (z) {
            future.cancel(false);
        }
    }
}
