package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxi {
    public static final kxi a = new kxi(Collections.EMPTY_SET);
    private final Set b;

    public kxi() {
        throw null;
    }

    public final boolean a(ksy ksyVar) {
        return this.b.contains(ksyVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kxi) {
            return this.b.equals(((kxi) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Wishlist{wishlist=" + this.b.toString() + "}";
    }

    public kxi(Set set) {
        if (set == null) {
            throw new NullPointerException("Null wishlist");
        }
        this.b = set;
    }
}
