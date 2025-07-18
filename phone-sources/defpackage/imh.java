package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class imh {
    public final String a;
    public final String b;
    public final long c;

    public imh(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imh)) {
            return false;
        }
        imh imhVar = (imh) obj;
        return yks.e(this.a, imhVar.a) && yks.e(this.b, imhVar.b) && this.c == imhVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a.k(this.c);
    }

    public final String toString() {
        return "SearchHistory(accountName=" + this.a + ", query=" + this.b + ", lastWriteMills=" + this.c + ")";
    }
}
