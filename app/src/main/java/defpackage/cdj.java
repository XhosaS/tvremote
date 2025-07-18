package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cdj implements ccm {
    private final Handler a = Handler.createAsync(Looper.getMainLooper());

    @Override // defpackage.ccm
    public final void a(Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }

    @Override // defpackage.ccm
    public final void b(long j, Runnable runnable) {
        this.a.postDelayed(runnable, j);
    }
}
