package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class rql {
    public abstract int a();

    public abstract rqo b();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rql) {
            rql rqlVar = (rql) obj;
            if (a() == rqlVar.a() && b().equals(rqlVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(a()), b());
    }
}
