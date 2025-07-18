package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cio implements Runnable {
    public Object a;
    public Object b;
    private final /* synthetic */ int c;

    public cio(cja cjaVar, Future future, int i) {
        this.c = i;
        this.a = cjaVar;
        this.b = future;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cja, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            qm.R(this.a, this.b);
        }
        this.a = null;
        this.b = null;
    }

    public cio(chs chsVar, Executor executor, int i) {
        this.c = i;
        this.a = chsVar;
        executor.getClass();
        this.b = executor;
    }
}
