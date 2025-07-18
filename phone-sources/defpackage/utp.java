package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class utp implements Executor {
    private volatile Executor a;

    public utp(Executor executor) {
        this.a = executor;
    }

    public final void a() {
        this.a = ugk.a;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
