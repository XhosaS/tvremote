package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tsm<E> implements Serializable, tsl {
    private static final long serialVersionUID = 0;
    private final Object a;

    public tsm(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.tsl
    public final E apply(Object obj) {
        return (E) this.a;
    }

    @Override // defpackage.tsl
    public final boolean equals(Object obj) {
        if (obj instanceof tsm) {
            return a.Q(this.a, ((tsm) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Functions.constant(" + String.valueOf(this.a) + ")";
    }
}
