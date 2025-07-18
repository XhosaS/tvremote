package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axo {
    private final boolean a;
    private final List b;

    public axo(boolean z, List list) {
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axo)) {
            return false;
        }
        axo axoVar = (axo) obj;
        return this.a == axoVar.a && yks.e(this.b, axoVar.b);
    }

    public final int hashCode() {
        return (a.q(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Posture(isTabletop=" + this.a + ", hinges=[" + yfm.ax(this.b, ", ", null, null, null, 62) + "])";
    }

    public axo() {
        this(false, yhb.a);
    }
}
