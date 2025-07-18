package defpackage;

import android.os.Looper;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgr {
    private static final ThreadLocal i = new ThreadLocal();
    public final dhk f;
    public fbc g;
    public final ko a = new ko();
    public final ArrayList b = new ArrayList();
    public final pku h = new pku(this);
    public final Runnable c = new caw(this, 13);
    public boolean d = false;
    public float e = 1.0f;

    public dgr(dhk dhkVar) {
        this.f = dhkVar;
    }

    static dgr a() {
        ThreadLocal threadLocal = i;
        if (threadLocal.get() == null) {
            threadLocal.set(new dgr(new dhk()));
        }
        return (dgr) threadLocal.get();
    }

    final boolean b() {
        return Thread.currentThread() == ((Looper) this.f.a).getThread();
    }
}
