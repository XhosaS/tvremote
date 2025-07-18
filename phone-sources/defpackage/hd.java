package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hd extends hf {
    public static final Executor a = new fba(1);
    private static volatile hd c;
    public final hf b;
    private final hf d;

    private hd() {
        he heVar = new he();
        this.d = heVar;
        this.b = heVar;
    }

    public static hd a() {
        if (c == null) {
            synchronized (hd.class) {
                if (c == null) {
                    c = new hd();
                }
            }
        }
        return c;
    }

    @Override // defpackage.hf
    public final void b(Runnable runnable) {
        hf hfVar = this.b;
        he heVar = (he) hfVar;
        if (heVar.c == null) {
            synchronized (heVar.a) {
                if (((he) hfVar).c == null) {
                    ((he) hfVar).c = he.a(Looper.getMainLooper());
                }
            }
        }
        heVar.c.post(runnable);
    }

    @Override // defpackage.hf
    public final boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
