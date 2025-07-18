package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pz implements pq {
    private final int a;
    private final int b;
    private final nl c;
    private final ps d;

    public pz(int i, int i2, nl nlVar) {
        this.a = i;
        this.b = i2;
        this.c = nlVar;
        this.d = new ps(new ns(i, i2, nlVar));
    }

    @Override // defpackage.pn
    public final /* synthetic */ long a(ne neVar, ne neVar2, ne neVar3) {
        return hq.i(this);
    }

    @Override // defpackage.pn
    public final /* synthetic */ ne b(ne neVar, ne neVar2, ne neVar3) {
        return hq.j(this, neVar, neVar2, neVar3);
    }

    @Override // defpackage.pn
    public final ne c(long j, ne neVar, ne neVar2, ne neVar3) {
        return this.d.c(j, neVar, neVar2, neVar3);
    }

    @Override // defpackage.pn
    public final ne d(long j, ne neVar, ne neVar2, ne neVar3) {
        return this.d.d(j, neVar, neVar2, neVar3);
    }

    @Override // defpackage.pn
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // defpackage.pq
    public final int f() {
        return this.b;
    }

    @Override // defpackage.pq
    public final int g() {
        return this.a;
    }

    public pz() {
        this(kwx.JSON3, 0, no.a);
    }
}
