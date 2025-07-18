package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class rqo {
    public abstract int a();

    public abstract void b();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rqo) {
            rqo rqoVar = (rqo) obj;
            if (a() == rqoVar.a()) {
                rqoVar.b();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(a()), 1);
    }

    public final String toString() {
        return "app ID: " + a();
    }
}
