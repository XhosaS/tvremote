package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class rem extends rdu {
    final dvv k;
    final dvv l;
    final dvv m;
    final dvv n;
    final dvv o;
    final dvv p;
    final dvv q;
    final dvv r;
    final dvv s;
    final dvv t;
    final dvv u;
    public final tst v;
    final rel w;
    public tst x;

    protected rem(ren renVar) {
        super(renVar.a, renVar.d.a);
        trk trkVar = trk.a;
        this.l = new dvv(trkVar);
        this.m = new dvv(ImmutableList.of());
        this.n = new dvv(trkVar);
        this.o = new dvv(trkVar);
        this.p = new dvv(trkVar);
        this.q = new dvv(ImmutableList.of());
        this.r = new dvv(trkVar);
        this.s = new dvv(trkVar);
        this.t = new dvv(trkVar);
        this.u = new dvv(true);
        this.x = trkVar;
        this.k = new dvv(renVar.b);
        this.v = renVar.c;
        this.w = renVar.d;
    }

    public final void m(rej rejVar) {
        this.x = tst.i(rejVar);
    }

    protected final void n(tst tstVar) {
        rrx.ap(this.t, tstVar);
        if (tstVar.g()) {
            rrx.ap(this.p, trk.a);
        }
    }

    protected void k() {
    }

    protected void l() {
    }
}
