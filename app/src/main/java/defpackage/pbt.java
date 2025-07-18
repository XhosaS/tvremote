package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pbt {
    public final abwk a;
    public final Object b;

    public pbt(abwk abwkVar, Object obj) {
        int i = ((abxc) abwkVar).d.b;
        boolean z = false;
        if (i >= 100000000 && i < 200000000) {
            z = true;
        }
        yqw.A(z);
        this.a = abwkVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pbt) {
            pbt pbtVar = (pbt) obj;
            if (this.a.equals(pbtVar.a)) {
                Object obj2 = this.b;
                Object obj3 = pbtVar.b;
                if (obj2 == obj3) {
                    return true;
                }
                if (obj3 != null && obj2.getClass() == obj3.getClass() && abza.a.a(obj2.getClass()).k(obj2, obj3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
