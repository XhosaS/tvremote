package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qrz {
    private final int a;

    public qrz(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qrz) && this.a == ((qrz) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "TrayLimit(limit=" + this.a + ")";
    }
}
