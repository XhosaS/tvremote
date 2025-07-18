package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ssk implements ssl {
    public final int a;

    public ssk(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ssk) && this.a == ((ssk) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Started(routeToken=" + this.a + ")";
    }
}
