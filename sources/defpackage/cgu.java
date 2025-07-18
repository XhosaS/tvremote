package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cgu {
    static final cgu a = new cgu();
    final Runnable b;
    final Executor c;
    cgu next;

    public cgu() {
        this.b = null;
        this.c = null;
    }

    public cgu(Runnable runnable, Executor executor) {
        this.b = runnable;
        this.c = executor;
    }
}
