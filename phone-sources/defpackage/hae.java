package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hae extends hjs {
    public final int a;

    public hae(int i) {
        super(null, null, null);
        this.a = i;
        if (i <= 0) {
            throw new IllegalArgumentException("px must be > 0.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hae) && this.a == ((hae) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
