package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iff implements ifh, ifi, ifg {
    public static final idf a = icz.a;
    private static final idf h = new icy(new Object());
    public idf b;
    public icv c;
    public idy d;
    public idf e;
    public idf f;
    public boolean g;

    public iff() {
        icw icwVar = icz.a;
        this.c = icwVar;
        this.d = icwVar;
        this.e = new icy(-1L);
        this.f = a;
    }

    @Override // defpackage.ifg
    public final ifc a() {
        return new ife(this.b, this.c, this.e, this.d, this.f, this.g, idn.b);
    }

    @Override // defpackage.ifi
    public final ifc b() {
        return new ife(this.b, this.c, this.e, this.d, this.f, this.g, icz.a);
    }

    @Override // defpackage.ifg
    public final ifc c() {
        return new ife(this.b, this.c, this.e, this.d, this.f, this.g, idn.a);
    }

    @Override // defpackage.ifg
    public final void d() {
        this.f = h;
        this.g = false;
    }

    public final void e(idf idfVar, boolean z) {
        this.f = idfVar;
        this.g = z;
    }

    @Override // defpackage.ifh
    public final void f(int i) {
        this.b = new icy(Integer.valueOf(i));
    }

    @Override // defpackage.ifi
    public final void g(long j) {
        this.e = new icy(Long.valueOf(j));
    }
}
