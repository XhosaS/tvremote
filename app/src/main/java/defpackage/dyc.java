package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dyc implements Runnable {
    public final Throwable b;

    /* JADX WARN: Illegal instructions before constructor call */
    public dyc(dyc dycVar) {
        boolean z = false;
        if (dycVar == null) {
            boolean z2 = ebc.a;
        } else if (dycVar.b != null) {
            z = true;
        }
        this(z);
        Throwable th = this.b;
        if (th == null || dycVar == null) {
            return;
        }
        th.initCause(dycVar.b);
    }

    public abstract void a(dyc dycVar);

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a(this);
        } catch (Throwable th) {
            Throwable th2 = this.b;
            if (th2 != null) {
                Log.w("LithoThreadTracing", "--- start debug trace");
                Log.w("LithoThreadTracing", "Thread tracing stacktrace", th2);
                Log.w("LithoThreadTracing", "--- end debug trace");
            }
            throw th;
        }
    }

    public dyc(boolean z) {
        if (!z) {
            this.b = null;
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        this.b = new Throwable("Runnable instantiated on thread id: " + threadCurrentThread.getId() + ", name: " + threadCurrentThread.getName());
    }
}
