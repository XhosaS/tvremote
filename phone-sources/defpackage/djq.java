package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class djq {
    public final String a;

    public djq(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof djq) && yks.e(this.a, ((djq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
