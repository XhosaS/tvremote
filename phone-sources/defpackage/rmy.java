package defpackage;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rmy implements RejectedExecutionHandler {
    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        ((tug) ((tug) rnb.a.b()).j("com/google/android/libraries/performance/primes/PrimesExecutorsModule$DefaultRejectedExecutionHandler", "rejectedExecution", 76, "PrimesExecutorsModule.java")).v("Service rejected execution of %s", runnable);
    }
}
