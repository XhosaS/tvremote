package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iak extends RuntimeException {
    private final Object a;
    private final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iak(Object obj, Object obj2, Throwable th) {
        super("Failed to write value to Source of Truth. key: ".concat(String.valueOf(obj)), th);
        Objects.toString(obj);
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!yks.e(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        iak iakVar = (iak) obj;
        return yks.e(this.a, iakVar.a) && yks.e(this.b, iakVar.b) && yks.e(getCause(), iakVar.getCause());
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        Object obj2 = this.b;
        return (iHashCode * 31) + (obj2 != null ? obj2.hashCode() : 0);
    }
}
