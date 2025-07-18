package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uhc implements Runnable {
    public Object a;
    public Object b;
    private final /* synthetic */ int c;

    public uhc(uhp uhpVar, Future future, int i) {
        this.c = i;
        this.a = uhpVar;
        this.b = future;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, uhp] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            sfy.L(this.a, this.b);
        }
        this.a = null;
        this.b = null;
    }

    public uhc(ufv ufvVar, Executor executor, int i) {
        this.c = i;
        this.a = ufvVar;
        executor.getClass();
        this.b = executor;
    }
}
