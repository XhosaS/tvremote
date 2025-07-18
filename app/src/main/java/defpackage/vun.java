package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vun implements ccm {
    final Handler a;

    public vun(Handler handler) {
        this.a = handler;
    }

    @Override // defpackage.ccm
    public final void a(Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }

    @Override // defpackage.ccm
    public final void b(long j, Runnable runnable) {
        this.a.postDelayed(runnable, j);
    }
}
