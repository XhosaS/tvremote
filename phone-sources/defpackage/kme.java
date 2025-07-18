package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kme {
    public final String a;
    public final long b;
    public final String c;

    public kme(String str, long j, String str2) {
        this.a = str;
        this.b = j;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kme)) {
            return false;
        }
        kme kmeVar = (kme) obj;
        return yks.e(this.a, kmeVar.a) && this.b == kmeVar.b && yks.e(this.c, kmeVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.c;
        return ((iHashCode + a.k(this.b)) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "PurchaseDetails(purchaseId=" + this.a + ", purchaseAmountMicros=" + this.b + ", currencyCode=" + this.c + ")";
    }
}
