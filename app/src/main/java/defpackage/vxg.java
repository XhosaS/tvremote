package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vxg extends vyh {
    public final long a;

    public vxg(long j) {
        this.a = j;
    }

    @Override // defpackage.vyh
    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof vyh) && this.a == ((vyh) obj).a();
    }

    public final int hashCode() {
        long j = this.a;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public final String toString() {
        return "LoadTaskIdentifier{index=" + this.a + "}";
    }
}
