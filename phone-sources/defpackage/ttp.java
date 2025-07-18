package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ttp<T> implements Serializable, ttm {
    private static final long serialVersionUID = 0;
    public final Object a;

    public ttp(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ttp) {
            return a.Q(this.a, ((ttp) obj).a);
        }
        return false;
    }

    @Override // defpackage.ttm
    public final T get() {
        return (T) this.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.a.toString() + ")";
    }
}
