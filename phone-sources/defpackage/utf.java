package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class utf extends xqb {
    public wbb d;
    private final uhp e;
    private final Executor f = new uib(ugk.a);
    public final Queue a = new ArrayDeque();
    public xqb b = null;
    public boolean c = false;

    public utf(uhp uhpVar) {
        this.e = uhpVar;
    }

    private final void b(Runnable runnable) {
        this.f.execute(trc.f(new ukm(this, runnable, 15)));
    }

    @Override // defpackage.xqb
    public final void a(wbb wbbVar, xsm xsmVar) {
        this.d = wbbVar;
        szg.n(this.e, new rhx(this, wbbVar, 3), this.f);
        b(new rvp(this, wbbVar, xsmVar, 11));
    }

    @Override // defpackage.xqb
    public final void c(String str, Throwable th) {
        b(new rvp(this, str, th, 10));
    }

    @Override // defpackage.xqb
    public final void d() {
        b(new ufx(this, 12));
    }

    @Override // defpackage.xqb
    public final void e(int i) {
        b(new utl(this, i, 1));
    }

    @Override // defpackage.xqb
    public final void f(Object obj) {
        b(new ukm(this, obj, 16));
    }

    public final String toString() {
        return super.toString() + "delegate=[" + String.valueOf(this.b) + "]";
    }
}
