package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxa extends bqh implements bda {
    public static final yjv a = new gwp(2);
    public yjv b;
    public buo c;
    public int d;
    public boolean e;
    public final bcb f;
    public final bcb g;
    public final bcb h;
    public final yvc i;
    private yow j;
    private final bcb k;
    private final bcb l;
    private final bcb m;
    private gwu n;
    private bqh o;

    public gxa(gzu gzuVar, riv rivVar) {
        gzuVar.getClass();
        this.i = yvd.a(new bna(0L));
        bcz bczVar = bcz.c;
        this.k = new bci(null, bczVar);
        this.l = new bci(Float.valueOf(1.0f), bczVar);
        this.m = new bci(null, bczVar);
        gwq gwqVar = gwq.a;
        this.n = gwqVar;
        this.b = a;
        this.c = bun.b;
        this.d = 1;
        this.f = new bci(gwqVar, bczVar);
        this.g = new bci(gzuVar, bczVar);
        this.h = new bci(rivVar, bczVar);
    }

    private final bqh j() {
        return (bqh) this.k.a();
    }

    private final void k() {
        yow yowVar = this.j;
        if (yowVar != null) {
            yoz.n(yowVar, null);
        }
        this.j = null;
    }

    @Override // defpackage.bqh
    public final long a() {
        bqh bqhVarJ = j();
        if (bqhVarJ != null) {
            return bqhVarJ.a();
        }
        return 9205357640488583168L;
    }

    @Override // defpackage.bqh
    protected final void b(bpq bpqVar) {
        this.i.e(new bna(bpqVar.n()));
        bqh bqhVarJ = j();
        if (bqhVarJ != null) {
            bqhVarJ.e(bpqVar, bpqVar.n(), ((Number) this.l.a()).floatValue(), (bnr) this.m.a());
        }
    }

    @Override // defpackage.bqh
    protected final void c(float f) {
        this.l.b(Float.valueOf(f));
    }

    @Override // defpackage.bda
    public final void cb() {
        if (this.j == null) {
            yqy yqyVar = new yqy(null);
            yot yotVar = ypk.a;
            yow yowVarL = yoz.l(wcq.W(yqyVar, yxi.a.i()));
            this.j = yowVarL;
            Object obj = this.o;
            bda bdaVar = obj instanceof bda ? (bda) obj : null;
            if (bdaVar != null) {
                bdaVar.cb();
            }
            if (!this.e) {
                ykr.q(yowVarL, null, 0, new gow(this, (yih) null, 6), 3);
                return;
            }
            gzs gzsVarA = gzu.a(g());
            gzsVarA.c((gzo) i().g);
            gzsVarA.a();
            gzo gzoVar = har.a;
            h(new gws());
        }
    }

    @Override // defpackage.bqh
    protected final void d(bnr bnrVar) {
        this.m.b(bnrVar);
    }

    @Override // defpackage.bda
    public final void dI() {
        k();
        Object obj = this.o;
        bda bdaVar = obj instanceof bda ? (bda) obj : null;
        if (bdaVar != null) {
            bdaVar.dI();
        }
    }

    @Override // defpackage.bda
    public final void dJ() {
        k();
        Object obj = this.o;
        bda bdaVar = obj instanceof bda ? (bda) obj : null;
        if (bdaVar != null) {
            bdaVar.dJ();
        }
    }

    public final gzu g() {
        return (gzu) this.g.a();
    }

    public final void h(gwu gwuVar) {
        gwu gwuVar2 = this.n;
        Object objA = this.b.a(gwuVar);
        gwu gwuVar3 = (gwu) objA;
        this.n = gwuVar3;
        this.f.b(objA);
        if (objA instanceof gwt) {
        } else if (objA instanceof gwr) {
        }
        bqh bqhVarA = gwuVar3.a();
        this.o = bqhVarA;
        this.k.b(bqhVarA);
        if (this.j == null || gwuVar2.a() == gwuVar3.a()) {
            return;
        }
        Object objA2 = gwuVar2.a();
        bda bdaVar = objA2 instanceof bda ? (bda) objA2 : null;
        if (bdaVar != null) {
            bdaVar.dJ();
        }
        Object objA3 = gwuVar3.a();
        bda bdaVar2 = objA3 instanceof bda ? (bda) objA3 : null;
        if (bdaVar2 != null) {
            bdaVar2.cb();
        }
    }

    public final riv i() {
        return (riv) this.h.a();
    }
}
