package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ndv {
    private final Integer a;

    public ndv() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ndv) {
            return this.a.equals(((ndv) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.a + "}";
    }

    public ndv(Integer num) {
        this.a = num;
    }
}
