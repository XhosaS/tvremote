package defpackage;

import android.os.Process;

/* compiled from: PG */
/* loaded from: classes.dex */
class dbt implements Runnable {
    final /* synthetic */ Runnable a;

    public dbt(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        this.a.run();
    }
}
