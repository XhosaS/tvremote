package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jst extends juf {
    private final long a;

    public jst(long j) {
        this.a = j;
    }

    @Override // defpackage.juf
    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof juf) && this.a == ((juf) obj).a();
    }

    public final int hashCode() {
        long j = this.a;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public final String toString() {
        return "DownloadResult{bytesWritten=" + this.a + "}";
    }
}
