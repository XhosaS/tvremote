package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ycs extends xxf implements ydh {
    public static final /* synthetic */ int z = 0;
    private final int A;
    private int B;
    private int C;
    public final Object a;
    public List b;
    public final zgk c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final ycj g;
    public final ydl h;
    public final ycz i;
    public boolean u;
    public final yfm v;
    public ydi w;
    public int x;
    final /* synthetic */ yct y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ycs(yct yctVar, int i, ybs ybsVar, Object obj, ycj ycjVar, ydl ydlVar, ycz yczVar, int i2) {
        super(i, ybsVar, yctVar.r);
        this.y = yctVar;
        this.c = new zgk();
        this.d = false;
        this.e = false;
        this.f = false;
        this.u = true;
        this.x = -1;
        this.a = obj;
        this.g = ycjVar;
        this.h = ydlVar;
        this.i = yczVar;
        this.B = i2;
        this.C = i2;
        this.A = i2;
        int i3 = yfl.a;
        this.v = yfk.a;
    }

    @Override // defpackage.xzf
    public final void a(int i) {
        int i2 = this.C - i;
        this.C = i2;
        int i3 = this.A;
        if (i2 <= i3 * 0.5f) {
            int i4 = i3 - i2;
            this.B += i4;
            this.C = i2 + i4;
            this.g.f(this.x, i4);
        }
    }

    @Override // defpackage.xzf
    public final void b(Throwable th) throws Throwable {
        q(xtk.c(th), true, new xsm());
    }

    @Override // defpackage.xxf
    protected final void c(xtk xtkVar, boolean z2, xsm xsmVar) throws Throwable {
        q(xtkVar, false, xsmVar);
    }

    @Override // defpackage.xul
    protected final void d() {
        super.d();
        ybx ybxVar = this.l;
        ybxVar.b++;
        ybxVar.a.a();
    }

    @Override // defpackage.xuo
    public final void e(Runnable runnable) {
        synchronized (this.a) {
            runnable.run();
        }
    }

    final ydi f() {
        ydi ydiVar;
        synchronized (this.a) {
            ydiVar = this.w;
        }
        return ydiVar;
    }

    @Override // defpackage.xul, defpackage.xzf
    public final void j(boolean z2) {
        if (this.s) {
            this.i.j(this.x, null, xvl.PROCESSED, false, null, null);
        } else {
            this.i.j(this.x, null, xvl.PROCESSED, false, yea.CANCEL, null);
        }
        super.j(z2);
    }

    public final void q(xtk xtkVar, boolean z2, xsm xsmVar) throws Throwable {
        if (this.f) {
            return;
        }
        this.f = true;
        if (!this.u) {
            this.i.j(this.x, xtkVar, xvl.PROCESSED, z2, yea.CANCEL, xsmVar);
            return;
        }
        ycz yczVar = this.i;
        yct yctVar = this.y;
        yczVar.A.remove(yctVar);
        yczVar.k(yctVar);
        this.b = null;
        this.c.z();
        this.u = false;
        if (xsmVar == null) {
            xsmVar = new xsm();
        }
        k(xtkVar, true, xsmVar);
    }

    public final void r(zgk zgkVar, boolean z2, int i) {
        int i2 = this.B - (((int) zgkVar.b) + i);
        this.B = i2;
        this.C -= i;
        if (i2 >= 0) {
            super.n(new ydd(zgkVar), z2);
        } else {
            this.g.e(this.x, yea.FLOW_CONTROL_ERROR);
            this.i.j(this.x, xtk.j.e("Received data size exceeded our receiving window size"), xvl.PROCESSED, false, null, null);
        }
    }
}
