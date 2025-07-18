package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kud implements kum {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    public kud() {
        throw null;
    }

    public static kud b(String str, String str2, String str3, String str4) {
        krf.c(str);
        return new kud(str, str2, str3, str4);
    }

    @Override // defpackage.kum
    public final String dX() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kud) {
            kud kudVar = (kud) obj;
            if (this.a.equals(kudVar.a) && this.b.equals(kudVar.b) && this.c.equals(kudVar.c) && this.d.equals(kudVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "Coupon{promotionCode=" + this.a + ", title=" + this.b + ", couponMessage=" + this.c + ", couponPromotionId=" + this.d + "}";
    }

    public kud(String str, String str2, String str3, String str4) {
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null title");
        }
        this.b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null couponMessage");
        }
        this.c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null couponPromotionId");
        }
        this.d = str4;
    }
}
