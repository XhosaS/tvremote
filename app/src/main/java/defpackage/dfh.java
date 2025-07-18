package defpackage;

import android.os.StrictMode;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
class dfh implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ dfi b;

    public dfh(dfi dfiVar, Runnable runnable) {
        this.a = runnable;
        this.b = dfiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.a) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
        }
        try {
            this.a.run();
        } catch (Throwable th) {
            if (Log.isLoggable("GlideExecutor", 6)) {
                Log.e("GlideExecutor", "Request threw uncaught throwable", th);
            }
        }
    }
}
