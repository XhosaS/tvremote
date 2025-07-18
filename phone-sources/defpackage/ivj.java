package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ivj {
    private final yjv a;

    public ivj() {
        this((byte[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ivj) && yks.e(this.a, ((ivj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DeviceSelectionFilter(filter=" + this.a + ")";
    }

    public ivj(yjv yjvVar) {
        this.a = yjvVar;
    }

    public /* synthetic */ ivj(byte[] bArr) {
        this(new gwp(18));
    }
}
