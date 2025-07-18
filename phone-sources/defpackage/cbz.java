package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbz extends yot {
    public static final yft a = new yga(bmf.m);
    public static final ThreadLocal b = new cbx();
    public final Choreographer c;
    public final Handler d;
    public boolean h;
    public final bby j;
    private boolean n;
    public final Object e = new Object();
    private final ygx m = new ygx();
    public List f = new ArrayList();
    public List g = new ArrayList();
    public final cby i = new cby(this);

    public cbz(Choreographer choreographer, Handler handler) {
        this.c = choreographer;
        this.d = handler;
        this.j = new ccb(choreographer, this, 0);
    }

    private final Runnable e() {
        Runnable runnable;
        synchronized (this.e) {
            runnable = (Runnable) this.m.g();
        }
        return runnable;
    }

    @Override // defpackage.yot
    public final void a(yil yilVar, Runnable runnable) {
        synchronized (this.e) {
            this.m.addLast(runnable);
            if (!this.n) {
                this.n = true;
                Handler handler = this.d;
                cby cbyVar = this.i;
                handler.post(cbyVar);
                if (!this.h) {
                    this.h = true;
                    this.c.postFrameCallback(cbyVar);
                }
            }
        }
    }

    public final void b() {
        boolean z;
        do {
            Runnable runnableE = e();
            while (runnableE != null) {
                runnableE.run();
                runnableE = e();
            }
            synchronized (this.e) {
                if (this.m.isEmpty()) {
                    z = false;
                    this.n = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }
}
