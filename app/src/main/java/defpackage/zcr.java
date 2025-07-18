package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zcr extends zca implements Serializable {
    private static final long serialVersionUID = 0;
    final zca a;

    public zcr(zca zcaVar) {
        this.a = zcaVar;
    }

    @Override // defpackage.zca, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zcr) {
            return this.a.equals(((zcr) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return -Arrays.hashCode(((yxe) this.a).a);
    }

    public final String toString() {
        return this.a.toString().concat(".reverse()");
    }
}
