package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gns {
    public final List a;

    public gns(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !yks.e(getClass(), obj.getClass())) {
            return false;
        }
        return yks.e(this.a, ((gns) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return yfm.ax(this.a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
