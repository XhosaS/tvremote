package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.elements.interfaces.Closure;
import com.google.android.libraries.elements.interfaces.Executor;
import com.google.android.libraries.elements.interfaces.TaskQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nxv extends Executor {
    public final nxr a;
    public final AtomicInteger b;

    public nxv() {
        this(new nxq(new ScheduledThreadPoolExecutor(1)));
    }

    @Override // com.google.android.libraries.elements.interfaces.Executor
    public final /* bridge */ /* synthetic */ TaskQueue createTaskQueue() {
        return new nxu(this.a, this.b);
    }

    @Override // com.google.android.libraries.elements.interfaces.Executor
    public final boolean currentThreadIsMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    @Override // com.google.android.libraries.elements.interfaces.Executor
    public final int numPendingClosures() {
        return this.b.get();
    }

    @Override // com.google.android.libraries.elements.interfaces.Executor
    public final void schedule(Closure closure) {
        if (closure == null) {
            return;
        }
        this.b.getAndIncrement();
        this.a.execute(new nxp(this, closure));
    }

    @Override // com.google.android.libraries.elements.interfaces.Executor
    public final void scheduleAfter(long j, final Closure closure) {
        if (closure == null) {
            return;
        }
        this.b.getAndIncrement();
        this.a.a(j, new Runnable() { // from class: nxo
            @Override // java.lang.Runnable
            public final void run() {
                closure.run();
                this.a.b.getAndDecrement();
            }
        });
    }

    @Override // com.google.android.libraries.elements.interfaces.Executor
    public final void scheduleAfterCurrentFrame(final Closure closure) {
        if (closure == null) {
            return;
        }
        this.b.getAndIncrement();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: nxm
            @Override // java.lang.Runnable
            public final void run() {
                final nxv nxvVar = this.a;
                final Closure closure2 = closure;
                nxvVar.a.execute(new Runnable() { // from class: nxn
                    @Override // java.lang.Runnable
                    public final void run() {
                        closure2.run();
                        nxvVar.b.getAndDecrement();
                    }
                });
            }
        });
    }

    @Override // com.google.android.libraries.elements.interfaces.Executor
    public final boolean trySchedule(Closure closure) {
        if (closure == null) {
            return false;
        }
        AtomicInteger atomicInteger = this.b;
        if (atomicInteger.get() > 0) {
            return false;
        }
        atomicInteger.getAndIncrement();
        this.a.execute(new nxp(this, closure));
        return true;
    }

    public nxv(nxr nxrVar) {
        this.a = nxrVar;
        this.b = new AtomicInteger(0);
    }
}
