package defpackage;

import java.net.URI;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uth {
    public final URI a;
    public final long b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    private final long f;
    private final long g;

    public uth() {
        throw null;
    }

    public final boolean equals(Object obj) {
        Integer num;
        Integer num2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof uth) {
            uth uthVar = (uth) obj;
            if (this.a.equals(uthVar.a) && this.b == uthVar.b && this.f == uthVar.f && this.g == uthVar.g && ((num = this.c) != null ? num.equals(uthVar.c) : uthVar.c == null) && ((num2 = this.d) != null ? num2.equals(uthVar.d) : uthVar.d == null)) {
                Integer num3 = this.e;
                Integer num4 = uthVar.e;
                if (num3 != null ? num3.equals(num4) : num4 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        Integer num = this.c;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        long j = this.b;
        long j2 = this.f;
        long j3 = this.g;
        int i = ((((((((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ iHashCode2) * 1000003;
        Integer num2 = this.d;
        int iHashCode3 = (i ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        Integer num3 = this.e;
        return iHashCode3 ^ (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "ChannelRuntimeConfig{uri=" + this.a.toString() + ", grpcIdleTimeoutMillis=" + this.b + ", grpcKeepAliveTimeMillis=" + this.f + ", grpcKeepAliveTimeoutMillis=" + this.g + ", trafficStatsUid=" + this.c + ", trafficStatsTag=" + this.d + ", maxMessageSize=" + this.e + "}";
    }

    public uth(URI uri, long j, long j2, long j3, Integer num, Integer num2, Integer num3) {
        this.a = uri;
        this.b = j;
        this.f = j2;
        this.g = j3;
        this.c = num;
        this.d = num2;
        this.e = num3;
    }
}
