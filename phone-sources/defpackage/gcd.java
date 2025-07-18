package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gcd extends gcf {
    public final int a;
    public final int b;

    public gcd(int i, int i2, int i3, int i4, int i5, int i6) {
        super(i3, i4, i5, i6);
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.gcf
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcd)) {
            return false;
        }
        gcd gcdVar = (gcd) obj;
        return this.a == gcdVar.a && this.b == gcdVar.b && this.c == gcdVar.c && this.d == gcdVar.d && this.e == gcdVar.e && this.f == gcdVar.f;
    }

    @Override // defpackage.gcf
    public final int hashCode() {
        return super.hashCode() + this.a + this.b;
    }

    public final String toString() {
        return ylh.t("ViewportHint.Access(\n            |    pageOffset=" + this.a + ",\n            |    indexInPage=" + this.b + ",\n            |    presentedItemsBefore=" + this.c + ",\n            |    presentedItemsAfter=" + this.d + ",\n            |    originalPageOffsetFirst=" + this.e + ",\n            |    originalPageOffsetLast=" + this.f + ",\n            |)");
    }
}
