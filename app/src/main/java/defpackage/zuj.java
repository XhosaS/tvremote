package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zuj {
    static final zuj a = new zuj();
    final Runnable b;
    final Executor c;
    zuj next;

    public zuj() {
        this.b = null;
        this.c = null;
    }

    public zuj(Runnable runnable, Executor executor) {
        this.b = runnable;
        this.c = executor;
    }
}
