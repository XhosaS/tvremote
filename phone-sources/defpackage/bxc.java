package defpackage;

import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxc {
    public final bcb a;
    public final bcb b;
    public long c;
    private final bcb d;
    private final bdl e;
    private final bdl f;
    private final bdp g;
    private final bdl h;

    public bxc() {
        bcz bczVar = bcz.c;
        this.a = new bci(true, bczVar);
        this.b = new bci(false, bczVar);
        this.e = new bce(0.0f);
        this.f = new bce(0.0f);
        this.d = new bci(null, bczVar);
        this.g = new bcg(0L);
        this.h = new bce(1.0f);
        this.c = 0L;
        String str = bux.a;
    }

    public final void a(float f) {
        this.h.h(f);
    }

    public final void b(boolean z) {
        this.b.b(Boolean.valueOf(z));
    }

    public final void c(long j) {
        this.g.h(j);
    }

    public final void d(float f) {
        this.e.h(f);
    }

    public final void e(float f) {
        this.f.h(f);
    }

    public final void f(Interpolator interpolator) {
        this.d.b(interpolator);
    }
}
