package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmq implements dms {
    public final Set a;

    public dmq(Set set) {
        this.a = set;
        if (set.isEmpty()) {
            throw new IllegalArgumentException("The set of sizes cannot be empty");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!yks.e(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return yks.e(this.a, ((dmq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SizeMode.Responsive(sizes=" + this.a + ')';
    }
}
