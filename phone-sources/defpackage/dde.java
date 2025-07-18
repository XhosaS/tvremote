package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dde {
    public final String a;

    public dde(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dde) {
            return yks.e(this.a, ((dde) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
