package defpackage;

import android.app.Activity;
import android.os.Looper;
import android.os.MessageQueue;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rmo implements Executor, rox {
    public final uht a;
    private final yfo d;
    private final cb f;
    private final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
    private volatile boolean c = false;
    private final AtomicBoolean e = new AtomicBoolean();

    public rmo(uht uhtVar, cb cbVar, yfo yfoVar) {
        this.a = uhtVar;
        this.f = cbVar;
        this.d = yfoVar;
        Object obj = ((ulp) cbVar.a).a;
        int i = roy.c;
        if (((roy) obj).b.get() > 0) {
            k();
        } else {
            cbVar.x(this);
        }
    }

    private final void j() {
        while (true) {
            Runnable runnable = (Runnable) this.b.poll();
            if (runnable == null) {
                return;
            } else {
                this.a.execute(runnable);
            }
        }
    }

    private final void k() {
        this.a.schedule(new rjs(this, 3), 3000L, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.rox
    public final void c(Activity activity) {
        this.f.y(this);
        k();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.c) {
            this.a.execute(runnable);
            return;
        }
        this.b.add(runnable);
        if (this.c) {
            j();
        } else {
            if (this.e.getAndSet(true)) {
                return;
            }
            if (((Boolean) ((tst) ((xcn) this.d).a).e(false)).booleanValue()) {
                Looper.getMainLooper().getQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: rmn
                    @Override // android.os.MessageQueue.IdleHandler
                    public final boolean queueIdle() {
                        rmo rmoVar = this.a;
                        rmoVar.a.schedule(new rjs(rmoVar, 2), 7000L, TimeUnit.MILLISECONDS);
                        return false;
                    }
                });
            } else {
                this.a.schedule(new rjs(this, 2), 7000L, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void g() {
        this.c = true;
        j();
    }

    @Override // defpackage.rox
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.rox
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.rox
    public final /* synthetic */ void a(Activity activity) {
    }

    @Override // defpackage.rox
    public final /* synthetic */ void b(Activity activity) {
    }

    @Override // defpackage.rox
    public final /* synthetic */ void d(Activity activity) {
    }

    @Override // defpackage.rox
    public final /* synthetic */ void e(Activity activity) {
    }

    @Override // defpackage.rox
    public final /* synthetic */ void f(int i) {
    }
}
