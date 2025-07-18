package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byr implements Serializable, byo {
    private static final long serialVersionUID = 0;
    public final Object a;

    public byr(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.byo
    public final Object aL() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof byr) {
            return ii.X(this.a, ((byr) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.a.toString() + ")";
    }
}
