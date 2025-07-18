package defpackage;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aql implements RejectedExecutionHandler {
    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        ((cbs) aqn.a.b().j("com/google/android/libraries/performance/primes/PrimesExecutorsModule$DefaultRejectedExecutionHandler", "rejectedExecution", 76, "PrimesExecutorsModule.java")).t("Service rejected execution of %s", runnable);
    }
}
