package defpackage;

import com.google.common.collect.ImmutableSet;
import j$.util.Objects;
import java.util.Collection;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqx {
    public static final String a;
    public final ImmutableSet b;

    static {
        new fqx(new HashSet());
        a = edt.Z(0);
    }

    public fqx(Collection collection) {
        this.b = ImmutableSet.copyOf(collection);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fqx) {
            return this.b.equals(((fqx) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b);
    }
}
