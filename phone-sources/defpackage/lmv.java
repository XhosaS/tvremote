package defpackage;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lmv implements efy {
    public final lmi a;
    private final Handler b;
    private long c;

    public lmv(lmi lmiVar, Handler handler) {
        this.a = lmiVar;
        this.b = handler;
    }

    @Override // defpackage.efy
    public final void m(eey eeyVar, boolean z) {
        this.c = SystemClock.elapsedRealtime();
    }

    @Override // defpackage.efy
    public final void n(eey eeyVar, boolean z) {
        this.b.post(new ley(this, SystemClock.elapsedRealtime() - this.c, 2));
    }

    @Override // defpackage.efy
    public final void l(eey eeyVar, boolean z) {
    }

    @Override // defpackage.efy
    public final void k(eey eeyVar, boolean z, int i) {
    }
}
