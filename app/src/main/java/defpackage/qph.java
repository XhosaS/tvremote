package defpackage;

import android.app.Activity;
import android.os.Looper;
import android.os.MessageQueue;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qph implements Executor, qsw {
    public final zyh a;
    private final qsx b;
    private final agow e;
    private final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    private volatile boolean d = false;
    private final AtomicBoolean f = new AtomicBoolean();

    public qph(zyh zyhVar, qsx qsxVar, agow agowVar) {
        this.a = zyhVar;
        this.b = qsxVar;
        this.e = agowVar;
        qsy qsyVar = qsxVar.a.a;
        int i = qsy.c;
        if (qsyVar.b.get() > 0) {
            k();
        } else {
            qsxVar.a.a(this);
        }
    }

    private final void j() {
        while (true) {
            Runnable runnable = (Runnable) this.c.poll();
            if (runnable == null) {
                return;
            } else {
                this.a.execute(runnable);
            }
        }
    }

    private final void k() {
        this.a.schedule(new Callable() { // from class: qpg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.a.g();
                return null;
            }
        }, 3000L, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.qsw
    public final void c(Activity activity) {
        this.b.a.b(this);
        k();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.d) {
            this.a.execute(runnable);
            return;
        }
        this.c.add(runnable);
        if (this.d) {
            j();
        } else {
            if (this.f.getAndSet(true)) {
                return;
            }
            if (((Boolean) ((yqt) ((aejh) this.e).b).e(false)).booleanValue()) {
                Looper.getMainLooper().getQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: qpe
                    @Override // android.os.MessageQueue.IdleHandler
                    public final boolean queueIdle() {
                        qph qphVar = this.a;
                        qphVar.a.schedule(new qpf(qphVar), 7000L, TimeUnit.MILLISECONDS);
                        return false;
                    }
                });
            } else {
                this.a.schedule(new qpf(this), 7000L, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void g() {
        this.d = true;
        j();
    }

    @Override // defpackage.qsw
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.qsw
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.qsw
    public final /* synthetic */ void a(Activity activity) {
    }

    @Override // defpackage.qsw
    public final /* synthetic */ void b(Activity activity) {
    }

    @Override // defpackage.qsw
    public final /* synthetic */ void d(Activity activity) {
    }

    @Override // defpackage.qsw
    public final /* synthetic */ void e(Activity activity) {
    }

    @Override // defpackage.qsw
    public final /* synthetic */ void f(int i) {
    }
}
