package defpackage;

import android.os.Binder;
import android.os.Process;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
class bfl implements Callable {
    final /* synthetic */ bfo a;

    public bfl(bfo bfoVar) {
        this.a = bfoVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Throwable th;
        Object objA;
        bfo bfoVar = this.a;
        bfoVar.e.set(true);
        try {
            Process.setThreadPriority(10);
            objA = bfoVar.a();
        } catch (Throwable th2) {
            th = th2;
            objA = null;
        }
        try {
            Binder.flushPendingCommands();
            return objA;
        } catch (Throwable th3) {
            th = th3;
            try {
                this.a.d.set(true);
                throw th;
            } finally {
                this.a.d(objA);
            }
        }
    }
}
