package defpackage;

import android.content.BroadcastReceiver;
import android.os.Binder;
import android.os.Process;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aqb implements Callable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aqb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.b;
        Object objA = null;
        if (i == 0) {
            ((cbs) aqn.a.b().j("com/google/android/libraries/performance/primes/DeferrableExecutor", "unblockAfterMaxDelay", 114, "DeferrableExecutor.java")).p("DeferrableExecutor unblocked after max task delay");
            ((aqc) this.a).i();
            return null;
        }
        if (i != 1) {
            if (i == 2) {
                ((cbs) aqn.a.b().j("com/google/android/libraries/performance/primes/DeferrableExecutor", "unblockAfterResume", 120, "DeferrableExecutor.java")).p("DeferrableExecutor unblocked after onResume");
                ((aqc) this.a).i();
                return null;
            }
            if (i == 3) {
                ((BroadcastReceiver.PendingResult) this.a).finish();
                return null;
            }
            Object obj = this.a;
            synchronized (((bgb) obj).b.c) {
                ((bgb) obj).a = null;
            }
            return null;
        }
        Object obj2 = this.a;
        ((yq) obj2).e.set(true);
        try {
            Process.setThreadPriority(10);
            objA = ((yq) obj2).a();
            Binder.flushPendingCommands();
            return objA;
        } finally {
        }
    }

    public aqb(yq yqVar, int i) {
        this.b = i;
        this.a = yqVar;
    }
}
