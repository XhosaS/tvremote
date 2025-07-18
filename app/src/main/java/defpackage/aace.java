package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aace {
    private final Class a;
    private final aage b;

    public aace(Class cls, aage aageVar) {
        this.a = cls;
        this.b = aageVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aace)) {
            return false;
        }
        aace aaceVar = (aace) obj;
        return aaceVar.a.equals(this.a) && aaceVar.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        aage aageVar = this.b;
        return this.a.getSimpleName() + ", object identifier: " + String.valueOf(aageVar);
    }
}
