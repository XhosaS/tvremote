package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class stg implements sti {
    private final String a;

    public stg(byte[] bArr) {
        this.a = "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof stg) && agvy.c(this.a, ((stg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Occupied(appOwner=" + this.a + ")";
    }

    public stg() {
        this(null);
    }
}
