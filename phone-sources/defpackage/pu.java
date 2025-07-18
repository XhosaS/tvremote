package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pu implements pn {
    private final pq a;
    private final long b;
    private final int c;

    public pu(pq pqVar, int i) {
        this.a = pqVar;
        this.c = i;
        this.b = (pqVar.f() + pqVar.g()) * 1000000;
    }

    private final long f(long j) {
        if (j <= 0) {
            return 0L;
        }
        long j2 = this.b;
        long j3 = j / j2;
        if (this.c != 1 && j3 % 2 != 0) {
            return ((j3 + 1) * j2) - j;
        }
        Long.signum(j3);
        return j - (j3 * j2);
    }

    private final ne g(long j, ne neVar, ne neVar2, ne neVar3) {
        long j2 = this.b;
        return j > j2 ? this.a.d(j2, neVar, neVar3, neVar2) : neVar2;
    }

    @Override // defpackage.pn
    public final long a(ne neVar, ne neVar2, ne neVar3) {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.pn
    public final /* synthetic */ ne b(ne neVar, ne neVar2, ne neVar3) {
        return hq.j(this, neVar, neVar2, neVar3);
    }

    @Override // defpackage.pn
    public final ne c(long j, ne neVar, ne neVar2, ne neVar3) {
        return this.a.c(f(j), neVar, neVar2, g(j, neVar, neVar3, neVar2));
    }

    @Override // defpackage.pn
    public final ne d(long j, ne neVar, ne neVar2, ne neVar3) {
        return this.a.d(f(j), neVar, neVar2, g(j, neVar, neVar3, neVar2));
    }

    @Override // defpackage.pn
    public final boolean e() {
        return true;
    }
}
