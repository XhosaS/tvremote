package defpackage;

import android.content.Context;
import java.net.URI;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uqv {
    public static final long a = TimeUnit.SECONDS.toMillis(20);
    public final Context b;
    public final URI c;
    public final Executor d;
    public final Executor e;
    public final ttm f;
    public final uqo g;
    public final Integer h;
    public final Integer i;
    public final long j;
    public final int k;
    public final long l;
    private final Executor m;
    private final long n;

    public uqv() {
        throw null;
    }

    public final int a() {
        return this.c.getPort();
    }

    public final String b() {
        return this.c.getHost();
    }

    public final boolean equals(Object obj) {
        uqo uqoVar;
        Integer num;
        Integer num2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof uqv) {
            uqv uqvVar = (uqv) obj;
            if (this.b.equals(uqvVar.b) && this.c.equals(uqvVar.c) && this.m.equals(uqvVar.m) && this.d.equals(uqvVar.d) && this.e.equals(uqvVar.e) && this.f.equals(uqvVar.f) && ((uqoVar = this.g) != null ? uqoVar.equals(uqvVar.g) : uqvVar.g == null) && ((num = this.h) != null ? num.equals(uqvVar.h) : uqvVar.h == null) && ((num2 = this.i) != null ? num2.equals(uqvVar.i) : uqvVar.i == null) && this.j == uqvVar.j && this.k == uqvVar.k && this.n == uqvVar.n && this.l == uqvVar.l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 583896283) ^ this.f.hashCode();
        uqo uqoVar = this.g;
        int iHashCode2 = ((iHashCode * 1000003) ^ (uqoVar == null ? 0 : uqoVar.hashCode())) * 1000003;
        Integer num = this.h;
        int iHashCode3 = (iHashCode2 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Integer num2 = this.i;
        int iHashCode4 = num2 != null ? num2.hashCode() : 0;
        long j = this.j;
        int i = (((((iHashCode3 ^ iHashCode4) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.k) * 1000003;
        long j2 = this.n;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.l;
        return (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
    }

    public final String toString() {
        uqo uqoVar = this.g;
        ttm ttmVar = this.f;
        Executor executor = this.e;
        Executor executor2 = this.d;
        Executor executor3 = this.m;
        URI uri = this.c;
        return "TransportConfig{applicationContext=" + String.valueOf(this.b) + ", uri=" + String.valueOf(uri) + ", backgroundExecutor=" + String.valueOf(executor3) + ", blockingExecutor=" + String.valueOf(executor2) + ", lightweightExecutor=" + String.valueOf(executor) + ", lightweightScheduledExecutorService=null, userAgentOverride=null, recordNetworkMetricsToPrimes=" + String.valueOf(ttmVar) + ", grpcServiceConfig=" + String.valueOf(uqoVar) + ", trafficStatsUid=" + this.h + ", trafficStatsTag=" + this.i + ", grpcIdleTimeoutMillis=" + this.j + ", maxMessageSize=" + this.k + ", grpcKeepAliveTimeMillis=" + this.n + ", grpcKeepAliveTimeoutMillis=" + this.l + ", channelCredentials=null}";
    }

    public uqv(Context context, URI uri, Executor executor, Executor executor2, Executor executor3, ttm ttmVar, uqo uqoVar, Integer num, Integer num2, long j, int i, long j2, long j3) {
        this.b = context;
        this.c = uri;
        this.m = executor;
        this.d = executor2;
        this.e = executor3;
        this.f = ttmVar;
        this.g = uqoVar;
        this.h = num;
        this.i = num2;
        this.j = j;
        this.k = i;
        this.n = j2;
        this.l = j3;
    }
}
