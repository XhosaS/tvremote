package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nt implements my {
    private final nk a;
    private final long b = 0;
    private final int c;

    public nt(nk nkVar, int i) {
        this.a = nkVar;
        this.c = i;
    }

    @Override // defpackage.my
    /* renamed from: a */
    public final pn b(bhi bhiVar) {
        return new pu(this.a.b(bhiVar), this.c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nt)) {
            return false;
        }
        nt ntVar = (nt) obj;
        if (!yks.e(ntVar.a, this.a) || ntVar.c != this.c) {
            return false;
        }
        long j = ntVar.b;
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = this.c;
        a.bw(i);
        return (iHashCode + i) * 31;
    }
}
