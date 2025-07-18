package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cbv {
    public Context a;
    public WorkerParameters b;
    public final AtomicInteger c = new AtomicInteger(-256);
    public boolean d;

    public cbv(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.a = context;
        this.b = workerParameters;
    }

    public zyd a() {
        return xt.a(new xq() { // from class: cbq
            @Override // defpackage.xq
            public final Object a(xo xoVar) {
                xoVar.d(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for`getForegroundInfoAsync()`"));
                return "default failing getForegroundInfoAsync";
            }
        });
    }

    public abstract zyd b();

    public final void d(int i) {
        this.c.compareAndSet(-256, i);
    }

    public final boolean e() {
        return this.c.get() != -256;
    }
}
