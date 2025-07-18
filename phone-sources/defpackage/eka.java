package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eka {
    public final ejz a;
    public int b;
    public Object c;
    public final Looper d;
    public final long e = -9223372036854775807L;
    private final ejy f;
    private boolean g;
    private boolean h;

    public eka(ejy ejyVar, ejz ejzVar, Looper looper) {
        this.f = ejyVar;
        this.a = ejzVar;
        this.d = looper;
    }

    public final synchronized void a(boolean z) {
        this.h = z | this.h;
        notifyAll();
    }

    public final synchronized void b() {
    }

    public final void c() {
        a.ab(!this.g);
        a.H(true);
        this.g = true;
        eje ejeVar = (eje) this.f;
        if (!ejeVar.i && ejeVar.e.getThread().isAlive()) {
            ejeVar.d.h(14, this).l();
        } else {
            edb.e("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            a(false);
        }
    }

    public final void d(Object obj) {
        a.ab(!this.g);
        this.c = obj;
    }

    public final void e(int i) {
        a.ab(!this.g);
        this.b = i;
    }
}
