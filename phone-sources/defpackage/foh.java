package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class foh extends Handler {
    public Runnable a;
    public final /* synthetic */ foo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public foh(foo fooVar, Looper looper) {
        super(looper);
        this.b = fooVar;
    }

    public final Runnable a() {
        Runnable runnable = this.a;
        if (runnable == null) {
            return null;
        }
        removeCallbacks(runnable);
        Runnable runnable2 = this.a;
        this.a = null;
        return runnable2;
    }

    public final void b() {
        Runnable runnableA = a();
        if (runnableA != null) {
            edt.aB(this, runnableA);
        }
    }
}
