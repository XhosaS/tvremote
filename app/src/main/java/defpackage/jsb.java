package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jsb extends jse {
    private final Integer a;

    public jsb(Integer num) {
        this.a = num;
    }

    @Override // defpackage.jse
    public final Integer a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jse) {
            return this.a.equals(((jse) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.a + "}";
    }
}
