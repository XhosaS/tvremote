package defpackage;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class orh {
    public final Object a;
    public final Runnable b;
    private final Runnable d;
    private final pku f;
    private long e = -1;
    public long c = -1;

    public orh(Handler handler, Runnable runnable) {
        this.b = runnable;
        this.f = new pku(handler, null);
        nur nurVar = new nur(this, 12);
        this.d = nurVar;
        this.a = nurVar;
    }

    public final void a(long j) {
        if (this.e == -1) {
            this.e = SystemClock.uptimeMillis();
        }
        this.c = j;
        Object obj = this.f.a;
        if (obj != null) {
            Runnable runnable = this.d;
            Handler handler = (Handler) obj;
            handler.removeCallbacks(runnable);
            if (handler.postAtTime(runnable, this.c)) {
                return;
            }
            b();
        }
    }

    public final void b() {
        this.e = -1L;
        this.c = -1L;
    }
}
