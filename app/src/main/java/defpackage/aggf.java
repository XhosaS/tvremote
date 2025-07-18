package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aggf implements Runnable, aggi {
    private final Handler a;
    private final Runnable b;
    private volatile boolean c;

    public aggf(Handler handler, Runnable runnable) {
        this.a = handler;
        this.b = runnable;
    }

    @Override // defpackage.aggi
    public final void dispose() {
        this.a.removeCallbacks(this);
        this.c = true;
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.run();
        } catch (Throwable th) {
            agoh.e(th);
        }
    }
}
