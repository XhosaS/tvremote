package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iaj extends RuntimeException {
    private final Object a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iaj(Object obj, Throwable th) {
        super("Failed to read from Source of Truth. key: ".concat(String.valueOf(obj)), th);
        th.getClass();
        Objects.toString(obj);
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!yks.e(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        iaj iajVar = (iaj) obj;
        return yks.e(this.a, iajVar.a) && yks.e(getCause(), iajVar.getCause());
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }
}
