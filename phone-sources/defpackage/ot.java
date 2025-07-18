package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ot implements my {
    private final my a;
    private final long b;

    public ot(my myVar, long j) {
        this.a = myVar;
        this.b = j;
    }

    @Override // defpackage.my
    /* renamed from: a */
    public final pn b(bhi bhiVar) {
        return new ou(this.a.b(bhiVar), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ot)) {
            return false;
        }
        ot otVar = (ot) obj;
        return otVar.b == this.b && yks.e(otVar.a, this.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.k(this.b);
    }
}
