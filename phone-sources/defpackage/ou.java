package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ou implements pn {
    private final pn a;
    private final long b;

    public ou(pn pnVar, long j) {
        this.a = pnVar;
        this.b = j;
    }

    @Override // defpackage.pn
    public final long a(ne neVar, ne neVar2, ne neVar3) {
        return this.a.a(neVar, neVar2, neVar3) + this.b;
    }

    @Override // defpackage.pn
    public final /* synthetic */ ne b(ne neVar, ne neVar2, ne neVar3) {
        return hq.j(this, neVar, neVar2, neVar3);
    }

    @Override // defpackage.pn
    public final ne c(long j, ne neVar, ne neVar2, ne neVar3) {
        long j2 = this.b;
        return j < j2 ? neVar : this.a.c(j - j2, neVar, neVar2, neVar3);
    }

    @Override // defpackage.pn
    public final ne d(long j, ne neVar, ne neVar2, ne neVar3) {
        long j2 = this.b;
        return j < j2 ? neVar3 : this.a.d(j - j2, neVar, neVar2, neVar3);
    }

    @Override // defpackage.pn
    public final boolean e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ou)) {
            return false;
        }
        ou ouVar = (ou) obj;
        return ouVar.b == this.b && yks.e(ouVar.a, this.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.k(this.b);
    }
}
