package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vxf extends vyd {
    public final long a;

    public vxf(long j) {
        this.a = j;
    }

    @Override // defpackage.vyd
    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof vyd) && this.a == ((vyd) obj).a();
    }

    public final int hashCode() {
        long j = this.a;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public final String toString() {
        return "FetchTaskIdentifier{index=" + this.a + "}";
    }
}
