package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qfs {
    private final zxj a;

    public qfs(zxj zxjVar) {
        this.a = zxjVar;
    }

    public final zyd a(Callable callable, Executor executor) {
        return this.a.a(wyo.i(callable), executor);
    }

    public final zyd b(zvh zvhVar, Executor executor) {
        return this.a.b(wyo.b(zvhVar), executor);
    }
}
