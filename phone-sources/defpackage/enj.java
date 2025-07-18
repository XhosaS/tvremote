package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class enj {
    public final enz a;
    public final enq b;
    public final eng c;
    public final long d;
    public final long e;
    public final exo f;

    public enj(long j, enz enzVar, enq enqVar, exo exoVar, long j2, eng engVar) {
        this.d = j;
        this.a = enzVar;
        this.b = enqVar;
        this.e = j2;
        this.f = exoVar;
        this.c = engVar;
    }

    public final long a(long j) {
        eng engVar = this.c;
        eci.e(engVar);
        return engVar.c(this.d, j) + this.e;
    }

    public final long b() {
        eng engVar = this.c;
        eci.e(engVar);
        return engVar.d() + this.e;
    }

    public final long c(long j) {
        eng engVar = this.c;
        long jA = a(j);
        eci.e(engVar);
        return (jA + engVar.a(this.d, j)) - 1;
    }

    public final long d() {
        eng engVar = this.c;
        eci.e(engVar);
        return engVar.f(this.d);
    }

    public final long e(long j) {
        eng engVar = this.c;
        long jG = g(j);
        eci.e(engVar);
        return jG + engVar.b(j - this.e, this.d);
    }

    public final long f(long j) {
        eng engVar = this.c;
        eci.e(engVar);
        return engVar.g(j, this.d) + this.e;
    }

    public final long g(long j) {
        eng engVar = this.c;
        eci.e(engVar);
        return engVar.h(j - this.e);
    }

    public final enw h(long j) {
        eng engVar = this.c;
        eci.e(engVar);
        return engVar.i(j - this.e);
    }

    public final boolean i(long j, long j2) {
        eng engVar = this.c;
        eci.e(engVar);
        return engVar.j() || j2 == -9223372036854775807L || e(j) <= j2;
    }
}
