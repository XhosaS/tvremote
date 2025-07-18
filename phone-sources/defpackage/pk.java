package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pk implements nk {
    private final int a;
    private final int b;
    private final nl c;

    public pk() {
        this(0, (nl) null, 7);
    }

    @Override // defpackage.my
    public final /* bridge */ /* synthetic */ pn a(bhi bhiVar) {
        return c();
    }

    @Override // defpackage.nk
    public final /* bridge */ /* synthetic */ pq b(bhi bhiVar) {
        return c();
    }

    public final pz c() {
        return new pz(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pk)) {
            return false;
        }
        pk pkVar = (pk) obj;
        return pkVar.a == this.a && pkVar.b == this.b && yks.e(pkVar.c, this.c);
    }

    public final int hashCode() {
        return (((this.a * 31) + this.c.hashCode()) * 31) + this.b;
    }

    public pk(int i, int i2, nl nlVar) {
        this.a = i;
        this.b = i2;
        this.c = nlVar;
    }

    public /* synthetic */ pk(int i, nl nlVar, int i2) {
        this(1 == (i2 & 1) ? kwx.JSON3 : i, 0, (i2 & 4) != 0 ? no.a : nlVar);
    }
}
