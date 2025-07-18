package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nxs implements nxr {
    private final Handler a = new Handler(Looper.getMainLooper());

    @Override // defpackage.nxr
    public final void a(long j, Runnable runnable) {
        this.a.postDelayed(runnable, j);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.a.post(runnable);
        }
    }
}
