package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yn extends yo {
    public volatile ym a;
    public volatile ym b;
    public List c;
    private Executor k;

    public yn(Context context) {
        super(context.getApplicationContext());
    }

    public final void a() {
        if (this.b != null || this.a == null) {
            return;
        }
        boolean z = this.a.a;
        if (this.k == null) {
            this.k = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        ym ymVar = this.a;
        Executor executor = this.k;
        if (ymVar.f == 1) {
            ymVar.f = 2;
            executor.execute(ymVar.c);
            return;
        }
        int i = ymVar.f;
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

    public final void b(List list) {
        Object obj;
        Object obj2;
        this.c = list;
        yi yiVar = this.j;
        if (yiVar != null) {
            if (yh.b(2)) {
                Objects.toString(yiVar);
                Log.v("LoaderManager", "onLoadComplete: ".concat(yiVar.toString()));
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                yiVar.e(list);
                return;
            }
            if (yh.b(4)) {
                Log.i("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            synchronized (yiVar.b) {
                obj = yiVar.g;
                obj2 = xk.a;
                yiVar.g = list;
            }
            if (obj != obj2) {
                return;
            }
            Runnable runnable = yiVar.i;
            mo moVar = li.a().a;
            lk lkVar = (lk) moVar;
            if (lkVar.b == null) {
                synchronized (lkVar.a) {
                    if (((lk) moVar).b == null) {
                        ((lk) moVar).b = lk.a(Looper.getMainLooper());
                    }
                }
            }
            lkVar.b.post(runnable);
        }
    }

    final void c(ym ymVar) {
        if (this.b == ymVar) {
            SystemClock.uptimeMillis();
            this.b = null;
            a();
        }
    }

    @Override // defpackage.yo
    public final void d() {
        if (this.a != null) {
            if (!this.f) {
                this.i = true;
            }
            if (this.b != null) {
                boolean z = this.a.a;
            } else {
                boolean z2 = this.a.a;
                ym ymVar = this.a;
                ymVar.d.set(true);
                if (ymVar.c.cancel(false)) {
                    this.b = this.a;
                }
            }
            this.a = null;
        }
    }
}
