package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fuz {
    public final Handler a = new Handler(Looper.getMainLooper());
    public final Runnable b;
    public long c;
    public long d;
    public boolean e;

    public fuz(Runnable runnable) {
        this.b = runnable;
    }
}
