package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pd implements bdy {
    public oh a;
    public oz b;
    public boolean c;
    public ne d;
    public final np e;
    final /* synthetic */ pf f;
    public final bhi g;
    private final bcb h;
    private final os i;
    private final bcb j;
    private final bcb k;
    private final bcb l;
    private final bcb m;
    private boolean n;
    private final bdl o;
    private final bdp p;

    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, yjv] */
    public pd(pf pfVar, Object obj, ne neVar, bhi bhiVar) {
        this.f = pfVar;
        this.g = bhiVar;
        bcz bczVar = bcz.c;
        this.h = new bci(obj, bczVar);
        Object objA = null;
        os osVarG = fh.g(0.0f, 0.0f, null, 7);
        this.i = osVarG;
        this.j = new bci(osVarG, bczVar);
        this.k = new bci(new oz(d(), bhiVar, obj, o(), neVar), bczVar);
        this.l = new bci(true, bczVar);
        this.o = new bce(-1.0f);
        this.m = new bci(obj, bczVar);
        this.d = neVar;
        this.p = new bcg(e().a());
        Float f = (Float) qa.a.get(bhiVar);
        if (f != null) {
            float fFloatValue = f.floatValue();
            ne neVar2 = (ne) bhiVar.a.a(obj);
            int iB = neVar2.b();
            for (int i = 0; i < iB; i++) {
                neVar2.e(i, fFloatValue);
            }
            objA = this.g.b.a(neVar2);
        }
        this.e = fh.g(0.0f, 0.0f, objA, 3);
    }

    private final Object o() {
        return this.h.a();
    }

    private final void p(np npVar) {
        this.j.b(npVar);
    }

    private final void q(Object obj) {
        this.h.b(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void r(Object obj, boolean z) {
        oz ozVar = this.b;
        if (yks.e(ozVar != null ? ozVar.a : null, o())) {
            g(new oz(this.e, this.g, obj, obj, this.d.c()));
            this.c = true;
            h(e().a());
            return;
        }
        my myVarD = (!z || this.n || (d() instanceof os)) ? d() : this.e;
        pf pfVar = this.f;
        g(new oz(pfVar.b() > 0 ? new ot(myVarD, pfVar.b()) : myVarD, this.g, obj, o(), this.d));
        h(e().a());
        this.c = false;
        pfVar.v(true);
        if (pfVar.A()) {
            bje bjeVar = pfVar.c;
            int iA = bjeVar.a();
            long jMax = 0;
            for (int i = 0; i < iA; i++) {
                pd pdVar = (pd) bjeVar.get(i);
                jMax = Math.max(jMax, pdVar.c());
                long j = pfVar.e;
                pdVar.f(0L);
            }
            pfVar.v(false);
        }
    }

    @Override // defpackage.bdy
    public final Object a() {
        return this.m.a();
    }

    public final float b() {
        return this.o.e();
    }

    public final long c() {
        return this.p.e();
    }

    public final np d() {
        return (np) this.j.a();
    }

    public final oz e() {
        return (oz) this.k.a();
    }

    public final void f(long j) {
        if (b() == -1.0f) {
            this.n = true;
            if (yks.e(e().a, e().b)) {
                k(e().a);
            } else {
                k(e().c(j));
                this.d = e().b(j);
            }
        }
    }

    public final void g(oz ozVar) {
        this.k.b(ozVar);
    }

    public final void h(long j) {
        this.p.h(j);
    }

    public final void i(boolean z) {
        this.l.b(Boolean.valueOf(z));
    }

    public final void j(float f) {
        this.o.h(f);
    }

    public final void k(Object obj) {
        this.m.b(obj);
    }

    public final void l(Object obj, Object obj2, np npVar) {
        q(obj2);
        p(npVar);
        if (yks.e(e().b, obj) && yks.e(e().a, obj2)) {
            return;
        }
        r(obj, false);
    }

    public final void m(Object obj, np npVar) {
        if (this.c) {
            oz ozVar = this.b;
            if (yks.e(obj, ozVar != null ? ozVar.a : null)) {
                return;
            }
        }
        if (yks.e(o(), obj) && b() == -1.0f) {
            return;
        }
        q(obj);
        p(npVar);
        r(b() == -3.0f ? obj : a(), !n());
        i(b() == -3.0f);
        if (b() >= 0.0f) {
            k(e().c((long) (e().a() * b())));
        } else if (b() == -3.0f) {
            k(obj);
        }
        this.c = false;
        j(-1.0f);
    }

    public final boolean n() {
        return ((Boolean) this.l.a()).booleanValue();
    }

    public final String toString() {
        return "current value: " + a() + ", target: " + o() + ", spec: " + d();
    }
}
