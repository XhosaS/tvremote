package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqc implements Executor, asu {
    public final cjd a;
    private final asv b;
    private final crv e;
    private final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    private volatile boolean d = false;
    private final AtomicBoolean f = new AtomicBoolean();

    public aqc(cjd cjdVar, asv asvVar, crv crvVar) {
        this.a = cjdVar;
        this.b = asvVar;
        this.e = crvVar;
        Object obj = ((att) asvVar.a).a;
        int i = asw.c;
        if (((asw) obj).b.get() > 0) {
            k();
        } else {
            asvVar.a(this);
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
        this.a.schedule(new aqb(this, 2), 3000L, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.asu
    public final void d(Activity activity) {
        this.b.b(this);
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
            if (((Boolean) ((byg) ((cpj) this.e).a).d(false)).booleanValue()) {
                Looper.getMainLooper().getQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: aqa
                    @Override // android.os.MessageQueue.IdleHandler
                    public final boolean queueIdle() {
                        aqc aqcVar = this.a;
                        aqcVar.a.schedule(new aqb(aqcVar, 0), 7000L, TimeUnit.MILLISECONDS);
                        return false;
                    }
                });
            } else {
                this.a.schedule(new aqb(this, 0), 7000L, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void i() {
        this.d = true;
        j();
    }

    @Override // defpackage.asu
    public final /* synthetic */ void b(Activity activity) {
    }

    @Override // defpackage.asu
    public final /* synthetic */ void c(Activity activity) {
    }

    @Override // defpackage.asu
    public final /* synthetic */ void f(Activity activity) {
    }

    @Override // defpackage.asu
    public final /* synthetic */ void g(Activity activity) {
    }

    @Override // defpackage.asu
    public final /* synthetic */ void h(int i) {
    }

    @Override // defpackage.asu
    public final /* synthetic */ void a(Activity activity, Bundle bundle) {
    }

    @Override // defpackage.asu
    public final /* synthetic */ void e(Activity activity, Bundle bundle) {
    }
}
