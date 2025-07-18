package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import android.os.SystemClock;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bfj extends bfk {
    public volatile bfi a;
    public volatile bfi b;
    private Executor j;

    public bfj(Context context) {
        super(context);
    }

    public final void a() {
        if (this.b != null || this.a == null) {
            return;
        }
        boolean z = this.a.a;
        if (this.j == null) {
            this.j = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        bfi bfiVar = this.a;
        Executor executor = this.j;
        if (bfiVar.f == 1) {
            bfiVar.f = 2;
            executor.execute(bfiVar.c);
            return;
        }
        int i = bfiVar.f;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i2 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    final void b(bfi bfiVar) {
        if (this.b == bfiVar) {
            SystemClock.uptimeMillis();
            this.b = null;
            a();
        }
    }

    @Override // defpackage.bfk
    public final void c() {
        if (this.a != null) {
            if (!this.e) {
                this.h = true;
            }
            if (this.b != null) {
                boolean z = this.a.a;
            } else {
                boolean z2 = this.a.a;
                bfi bfiVar = this.a;
                bfiVar.d.set(true);
                if (bfiVar.c.cancel(false)) {
                    this.b = this.a;
                }
            }
            this.a = null;
        }
    }
}
