package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byq {
    public final List a;

    public byq(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !agvy.c(getClass(), obj.getClass())) {
            return false;
        }
        return agvy.c(this.a, ((byq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return agqq.G(this.a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
