package defpackage;

import android.os.Handler;
import j$.time.Duration;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class fej {
    public final Handler a;
    public final Runnable b;
    public int c = 0;

    public fej(Handler handler, Duration duration, Runnable runnable) {
        this.a = handler;
        this.b = new fei(this, runnable, handler, duration);
    }

    public final void a() {
        this.a.removeCallbacks(this.b);
    }
}
