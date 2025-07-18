package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uey {
    static final uey a = new uey();
    final Runnable b;
    final Executor c;
    uey next;

    public uey() {
        this.b = null;
        this.c = null;
    }

    public uey(Runnable runnable, Executor executor) {
        this.b = runnable;
        this.c = executor;
    }
}
