package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class gpm {
    private final AtomicInteger a = new AtomicInteger(-256);
    public Context e;
    public WorkerParameters f;
    public boolean g;

    public gpm(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.e = context;
        this.f = workerParameters;
    }

    public uhp c() {
        return cqv.w(new coo() { // from class: gpi
            @Override // defpackage.coo
            public final Object a(com comVar) {
                comVar.d(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for`getForegroundInfoAsync()`"));
                return "default failing getForegroundInfoAsync";
            }
        });
    }

    public abstract uhp d();

    public final int f() {
        return this.a.get();
    }

    public final gox g() {
        return this.f.b;
    }

    public final UUID h() {
        return this.f.a;
    }

    public final Executor i() {
        return this.f.e;
    }

    public final void j(int i) {
        if (this.a.compareAndSet(-256, i)) {
            e();
        }
    }

    public final boolean k() {
        return this.a.get() != -256;
    }

    public void e() {
    }
}
