package defpackage;

import com.google.android.libraries.elements.interfaces.Closure;
import com.google.android.libraries.elements.interfaces.TaskQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nxu extends TaskQueue {
    public final AtomicInteger a;
    private final Executor b;

    public nxu(Executor executor, AtomicInteger atomicInteger) {
        this.b = new zyt(executor);
        this.a = atomicInteger;
    }

    @Override // com.google.android.libraries.elements.interfaces.TaskQueue
    public final void submit(final Closure closure) {
        if (closure == null) {
            return;
        }
        this.a.getAndIncrement();
        this.b.execute(wyo.h(new Runnable() { // from class: nxt
            @Override // java.lang.Runnable
            public final void run() {
                closure.run();
                this.a.a.getAndDecrement();
            }
        }));
    }
}
