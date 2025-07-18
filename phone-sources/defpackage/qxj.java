package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qxj {
    public final vou a;
    private final boolean b;
    private final String c;
    private final pjd d;
    private final int e;

    public qxj(vou vouVar, boolean z, String str, pjd pjdVar, int i) {
        this.a = vouVar;
        this.b = z;
        this.c = str;
        this.d = pjdVar;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qxj)) {
            return false;
        }
        qxj qxjVar = (qxj) obj;
        return yks.e(this.a, qxjVar.a) && this.b == qxjVar.b && yks.e(this.c, qxjVar.c) && yks.e(this.d, qxjVar.d) && this.e == qxjVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.c;
        int iQ = (((((iHashCode + a.q(this.b)) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.d.hashCode()) * 31;
        int i = this.e;
        a.bw(i);
        return iQ + i;
    }

    public final String toString() {
        return "AccountSnapshot(accountInfo=" + this.a + ", isMetadataAvailable=" + this.b + ", avatarUrl=" + this.c + ", logAuthSpec=" + this.d + ", isUnicornUser=" + ((Object) qtl.b(this.e)) + ")";
    }
}
