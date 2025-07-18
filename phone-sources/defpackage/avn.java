package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avn implements uf {
    public yjk a;
    public yjv b;
    public final float[] c;
    public boolean d;
    public uv e;
    public final yjk f;
    public final tz g;
    public final ylz h;
    public final bdn i;
    public final bdn j;
    public final bdn k;
    public final bdn l;
    public final bhi m;
    private boolean n;
    private final bcb o;
    private final bdl p;
    private final bdl q;
    private final bdl r;

    public avn() {
        this(0.0f, new ylz(0.0f, 1.0f));
    }

    @Override // defpackage.uf
    public final Object a(rv rvVar, yjz yjzVar, yih yihVar) {
        Object objK = yoz.k(new th(this, rvVar, yjzVar, (yih) null, 8), yihVar);
        return objK == yio.a ? objK : ygi.a;
    }

    public final float b() {
        ylz ylzVar = this.h;
        return avm.a(((Number) ylzVar.b()).floatValue(), ((Number) ylzVar.a()).floatValue(), ykn.i(d(), ((Number) ylzVar.b()).floatValue(), ((Number) ylzVar.a()).floatValue()));
    }

    public final float c() {
        return this.q.e();
    }

    public final float d() {
        return this.p.e();
    }

    public final int e() {
        return this.l.e();
    }

    public final int f() {
        return this.k.e();
    }

    public final int g() {
        return this.i.e();
    }

    public final void h(float f) {
        float fMax;
        float fMin;
        if (this.e == uv.a) {
            fMax = Math.max(this.j.e() - (e() / 2.0f), 0.0f);
            fMin = Math.min(e() / 2.0f, fMax);
        } else {
            fMax = Math.max(g() - (f() / 2.0f), 0.0f);
            fMin = Math.min(f() / 2.0f, fMax);
        }
        this.q.h(c() + f + this.r.e());
        j(0.0f);
        float fC = c();
        ylz ylzVar = this.h;
        bxa bxaVar = avm.a;
        float fB = avm.b(fMin, fMax, fC, ((Number) ylzVar.b()).floatValue(), ((Number) ylzVar.a()).floatValue());
        if (fB == d()) {
            return;
        }
        yjv yjvVar = this.b;
        if (yjvVar != null) {
            yjvVar.a(Float.valueOf(fB));
        } else {
            k(fB);
        }
    }

    public final void i(boolean z) {
        this.o.b(Boolean.valueOf(z));
    }

    public final void j(float f) {
        this.r.h(f);
    }

    public final void k(float f) {
        if (this.n) {
            ylz ylzVar = this.h;
            f = ykn.i(f, ((Number) ylzVar.b()).floatValue(), ((Number) ylzVar.a()).floatValue());
            ((Number) ylzVar.b()).floatValue();
            ((Number) ylzVar.a()).floatValue();
            bxa bxaVar = avm.a;
        }
        this.p.h(f);
    }

    public final boolean l() {
        return ((Boolean) this.o.a()).booleanValue();
    }

    public avn(float f, ylz ylzVar) {
        this.a = null;
        this.h = ylzVar;
        this.p = new bce(f);
        this.n = true;
        bxa bxaVar = avm.a;
        this.c = new float[0];
        this.i = new bcf(0);
        this.j = new bcf(0);
        this.k = new bcf(0);
        this.l = new bcf(0);
        this.e = uv.b;
        this.o = new bci(false, bcz.c);
        this.f = new aoe(this, 20);
        this.q = new bce(avm.b(((Number) ylzVar.b()).floatValue(), ((Number) ylzVar.a()).floatValue(), f, 0.0f, 0.0f));
        this.r = new bce(0.0f);
        this.g = new ayb(this, 1);
        this.m = new bhi((char[]) null, (byte[]) null, (byte[]) null);
    }
}
