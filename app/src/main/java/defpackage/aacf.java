package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aacf {
    private final Class a;
    private final Class b;

    public aacf(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aacf)) {
            return false;
        }
        aacf aacfVar = (aacf) obj;
        return aacfVar.a.equals(this.a) && aacfVar.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        Class cls = this.b;
        return this.a.getSimpleName() + " with serialization type: " + cls.getSimpleName();
    }
}
