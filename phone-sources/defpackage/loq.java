package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class loq {
    public final String a;
    public final Integer b;

    public loq(String str, Integer num) {
        this.a = str;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof loq)) {
            return false;
        }
        loq loqVar = (loq) obj;
        return yks.e(this.a, loqVar.a) && yks.e(this.b, loqVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.b;
        return (iHashCode * 31) + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "AssetTypeAndId(assetId=" + this.a + ", assetType=" + this.b + ")";
    }
}
