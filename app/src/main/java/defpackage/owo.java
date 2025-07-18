package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class owo extends owt {
    private final long a;
    private final Status b;
    private final int c;

    public owo(int i, long j, Status status) {
        this.c = i;
        this.a = j;
        this.b = status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owo)) {
            return false;
        }
        owo owoVar = (owo) obj;
        return this.c == owoVar.c && this.a == owoVar.a && agvy.c(this.b, owoVar.b);
    }

    public final int hashCode() {
        long j = this.a;
        return (((this.c * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Error(cacheStatus=" + ((Object) Integer.toString(this.c - 1)) + ", staleness=" + this.a + ", status=" + this.b + ")";
    }
}
