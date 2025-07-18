package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aadn extends aadr {
    final aabm a;
    final aabs b;
    final aabu c;
    final boolean d;
    final aabu e;
    final aabu f;

    public aadn(aabm aabmVar, aabs aabsVar, aabu aabuVar, aabu aabuVar2, aabu aabuVar3) {
        super(aabmVar.r());
        if (!aabmVar.w()) {
            throw new IllegalArgumentException();
        }
        this.a = aabmVar;
        this.b = aabsVar;
        this.c = aabuVar;
        this.d = aadp.Q(aabuVar);
        this.e = aabuVar2;
        this.f = aabuVar3;
    }

    private final int z(long j) {
        int iA = this.b.a(j);
        long j2 = iA;
        if (((j + j2) ^ j) >= 0 || (j ^ j2) < 0) {
            return iA;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final int a(long j) {
        return this.a.a(this.b.j(j));
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final int b(Locale locale) {
        return this.a.b(locale);
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final int c() {
        return this.a.c();
    }

    @Override // defpackage.aabm
    public final int d() {
        return this.a.d();
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final long e(long j, int i) {
        if (this.d) {
            long jZ = z(j);
            return this.a.e(j + jZ, i) - jZ;
        }
        aabs aabsVar = this.b;
        return aabsVar.p(this.a.e(aabsVar.j(j), i), j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aadn) {
            aadn aadnVar = (aadn) obj;
            if (this.a.equals(aadnVar.a) && this.b.equals(aadnVar.b) && this.c.equals(aadnVar.c) && this.e.equals(aadnVar.e)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final long f(long j) {
        return this.a.f(this.b.j(j));
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final long g(long j) {
        if (this.d) {
            long jZ = z(j);
            return this.a.g(j + jZ) - jZ;
        }
        aabs aabsVar = this.b;
        return aabsVar.p(this.a.g(aabsVar.j(j)), j);
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final long h(long j, int i) {
        aabs aabsVar = this.b;
        aabm aabmVar = this.a;
        long jH = aabmVar.h(aabsVar.j(j), i);
        long jP = aabsVar.p(jH, j);
        if (a(jP) == i) {
            return jP;
        }
        aaby aabyVar = new aaby(jH, aabsVar.e);
        aabx aabxVar = new aabx(aabmVar.r(), Integer.valueOf(i), aabyVar.getMessage());
        aabxVar.initCause(aabyVar);
        throw aabxVar;
    }

    public final int hashCode() {
        aabs aabsVar = this.b;
        return aabsVar.hashCode() ^ this.a.hashCode();
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final long i(long j, String str, Locale locale) {
        aabm aabmVar = this.a;
        aabs aabsVar = this.b;
        return aabsVar.p(aabmVar.i(aabsVar.j(j), str, locale), j);
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final String k(int i, Locale locale) {
        return this.a.k(i, locale);
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final String l(long j, Locale locale) {
        return this.a.l(this.b.j(j), locale);
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final String n(int i, Locale locale) {
        return this.a.n(i, locale);
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final String o(long j, Locale locale) {
        return this.a.o(this.b.j(j), locale);
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final aabu s() {
        return this.c;
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final aabu t() {
        return this.f;
    }

    @Override // defpackage.aabm
    public final aabu u() {
        return this.e;
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final boolean v(long j) {
        return this.a.v(this.b.j(j));
    }

    @Override // defpackage.aabm
    public final void x() {
    }
}
