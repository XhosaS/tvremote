package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import android.os.SystemClock;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dxx extends dxy {
    public volatile dxw a;
    private Executor i;
    private volatile dxw j;

    public dxx(Context context) {
        super(context);
    }

    public abstract Object a();

    final void b() {
        if (this.j != null || this.a == null) {
            return;
        }
        boolean z = this.a.a;
        if (this.i == null) {
            this.i = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        dxw dxwVar = this.a;
        Executor executor = this.i;
        if (dxwVar.f == 1) {
            dxwVar.f = 2;
            executor.execute(dxwVar.c);
            return;
        }
        int i = dxwVar.f;
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

    @Override // defpackage.dxy
    protected final void c() {
        f();
        this.a = new dxw(this);
        b();
    }

    final void d(dxw dxwVar) {
        if (this.j == dxwVar) {
            SystemClock.uptimeMillis();
            this.j = null;
            b();
        }
    }

    @Override // defpackage.dxy
    @Deprecated
    public final void e(String str, PrintWriter printWriter) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.b);
        printWriter.print(" mListener=");
        printWriter.println(this.h);
        if (this.d || this.g) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(false);
        }
        if (this.e || this.f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.e);
            printWriter.print(" mReset=");
            printWriter.println(this.f);
        }
        if (this.a != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.a);
            printWriter.print(" waiting=");
            boolean z = this.a.a;
            printWriter.println(false);
        }
        if (this.j != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.j);
            printWriter.print(" waiting=");
            boolean z2 = this.j.a;
            printWriter.println(false);
        }
    }

    @Override // defpackage.dxy
    public final void f() {
        if (this.a != null) {
            if (!this.d) {
                this.g = true;
            }
            if (this.j != null) {
                boolean z = this.a.a;
            } else {
                boolean z2 = this.a.a;
                dxw dxwVar = this.a;
                dxwVar.d.set(true);
                if (dxwVar.c.cancel(false)) {
                    this.j = this.a;
                }
            }
            this.a = null;
        }
    }
}
