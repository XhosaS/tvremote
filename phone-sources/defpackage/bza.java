package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bza extends byz implements bvs {
    private Map f;
    public final bzq g;
    public long h = 0;
    public final bvr o = new bvr(this);
    public final jz p;
    private bvu q;

    public bza(bzq bzqVar) {
        this.g = bzqVar;
        int i = ka.a;
        this.p = new jz((byte[]) null);
    }

    public final void A(long j) {
        if (!a.s(this.h, j)) {
            this.h = j;
            bzd bzdVar = K().u.p;
            if (bzdVar != null) {
                bzdVar.t();
            }
            S(this.g);
        }
        if (this.k) {
            return;
        }
        O(J());
    }

    public final void B(bvu bvuVar) {
        Map map;
        if (bvuVar != null) {
            y((bvuVar.b() << 32) | (bvuVar.a() & 4294967295L));
        } else {
            y(0L);
        }
        if (!yks.e(this.q, bvuVar) && bvuVar != null && ((((map = this.f) != null && !map.isEmpty()) || !bvuVar.e().isEmpty()) && !yks.e(bvuVar.e(), this.f))) {
            ((bzd) t()).p.e();
            Map linkedHashMap = this.f;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                this.f = linkedHashMap;
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(bvuVar.e());
        }
        this.q = bvuVar;
    }

    public final long C(bza bzaVar) {
        long jD = 0;
        bza bzaVarB = this;
        while (!yks.e(bzaVarB, bzaVar)) {
            boolean z = bzaVarB.i;
            jD = cmf.d(jD, bzaVarB.h);
            bzq bzqVar = bzaVarB.g.w;
            bzqVar.getClass();
            bzaVarB = bzqVar.B();
            bzaVarB.getClass();
        }
        return jD;
    }

    @Override // defpackage.byz
    public final long H() {
        return this.h;
    }

    @Override // defpackage.byz
    public final bvc I() {
        return this.o;
    }

    @Override // defpackage.byz
    public final bvu J() {
        bvu bvuVar = this.q;
        if (bvuVar != null) {
            return bvuVar;
        }
        bty.a("LookaheadDelegate has not been measured yet when measureResult is requested.");
        throw new yfs();
    }

    @Override // defpackage.byz
    public final bys K() {
        return this.g.s;
    }

    @Override // defpackage.byz
    public final byz L() {
        bzq bzqVar = this.g.v;
        if (bzqVar != null) {
            return bzqVar.B();
        }
        return null;
    }

    @Override // defpackage.byz
    public final byz M() {
        bzq bzqVar = this.g.w;
        if (bzqVar != null) {
            return bzqVar.B();
        }
        return null;
    }

    @Override // defpackage.byz
    public final void P() {
        cm(this.h, 0.0f, null);
    }

    @Override // defpackage.byz
    public final boolean R() {
        return this.q != null;
    }

    @Override // defpackage.clx
    public final float a() {
        return this.g.a();
    }

    @Override // defpackage.cmd
    public final float b() {
        return this.g.b();
    }

    public int c(int i) {
        throw null;
    }

    @Override // defpackage.byz, defpackage.buz
    public final boolean cA() {
        return true;
    }

    @Override // defpackage.bwj
    public final void cm(long j, float f, yjv yjvVar) {
        A(j);
        if (this.j) {
            return;
        }
        r();
    }

    public int d(int i) {
        throw null;
    }

    public int e(int i) {
        throw null;
    }

    public int f(int i) {
        throw null;
    }

    @Override // defpackage.bwj, defpackage.buy
    public final Object g() {
        return this.g.g();
    }

    @Override // defpackage.buz
    public final cmi n() {
        return this.g.n();
    }

    protected void r() {
        J().f();
    }

    public final long s() {
        return (this.a << 32) | (this.b & 4294967295L);
    }

    public final bxm t() {
        bzd bzdVar = this.g.s.u.p;
        bzdVar.getClass();
        return bzdVar;
    }
}
