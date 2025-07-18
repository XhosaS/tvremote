package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ows extends owt {
    private final boolean a;

    public ows(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ows) && this.a == ((ows) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "Update(currentHomeChanged=" + this.a + ")";
    }
}
