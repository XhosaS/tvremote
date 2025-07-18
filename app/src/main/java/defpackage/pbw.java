package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pbw {
    public final abwk a;
    public final Object b;

    public pbw(abwk abwkVar, Object obj) {
        this.a = abwkVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pbw) {
            pbw pbwVar = (pbw) obj;
            if (this.a.equals(pbwVar.a)) {
                Object obj2 = this.b;
                Object obj3 = pbwVar.b;
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
