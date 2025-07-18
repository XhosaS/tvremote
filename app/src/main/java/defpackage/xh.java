package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class xh {
    static final xh a = new xh(null, null);
    final Runnable b;
    final Executor c;
    xh next;

    public xh(Runnable runnable, Executor executor) {
        this.b = runnable;
        this.c = executor;
    }
}
