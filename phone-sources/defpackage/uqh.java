package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uqh {
    public final Context a;
    public final uqw b;
    public final Executor c;
    public final Executor d;
    public final Executor e;
    public final ura f;
    public final uqq g;
    public final ttm h;
    public final ttm i;
    public final ttm j;
    public final ttm k;
    public final uqo l;
    public final int m;
    public final long n;
    public final long o;
    public final osk p;

    public uqh() {
        throw null;
    }

    public final boolean equals(Object obj) {
        ura uraVar;
        uqq uqqVar;
        uqo uqoVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof uqh) {
            uqh uqhVar = (uqh) obj;
            if (this.a.equals(uqhVar.a) && this.p.equals(uqhVar.p) && this.b.equals(uqhVar.b) && this.c.equals(uqhVar.c) && this.d.equals(uqhVar.d) && this.e.equals(uqhVar.e) && ((uraVar = this.f) != null ? uraVar.equals(uqhVar.f) : uqhVar.f == null) && ((uqqVar = this.g) != null ? uqqVar.equals(uqhVar.g) : uqhVar.g == null) && this.h.equals(uqhVar.h) && this.i.equals(uqhVar.i) && this.j.equals(uqhVar.j) && this.k.equals(uqhVar.k) && ((uqoVar = this.l) != null ? uqoVar.equals(uqhVar.l) : uqhVar.l == null) && this.m == uqhVar.m && this.n == uqhVar.n && this.o == uqhVar.o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        ura uraVar = this.f;
        int iHashCode2 = ((iHashCode * (-721379959)) ^ (uraVar == null ? 0 : uraVar.hashCode())) * 1000003;
        uqq uqqVar = this.g;
        int iHashCode3 = (((((((((iHashCode2 ^ (uqqVar == null ? 0 : uqqVar.hashCode())) * (-721379959)) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003;
        uqo uqoVar = this.l;
        int iHashCode4 = (((iHashCode3 ^ (uqoVar != null ? uqoVar.hashCode() : 0)) * (-721379959)) ^ this.m) * 1000003;
        long j = this.n;
        int i = (iHashCode4 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.o;
        return (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
    }

    public final String toString() {
        uqo uqoVar = this.l;
        ttm ttmVar = this.k;
        ttm ttmVar2 = this.j;
        ttm ttmVar3 = this.i;
        ttm ttmVar4 = this.h;
        uqq uqqVar = this.g;
        ura uraVar = this.f;
        Executor executor = this.e;
        Executor executor2 = this.d;
        Executor executor3 = this.c;
        uqw uqwVar = this.b;
        osk oskVar = this.p;
        return "ChannelConfig{context=" + String.valueOf(this.a) + ", clock=" + String.valueOf(oskVar) + ", transport=" + String.valueOf(uqwVar) + ", lightweightExecutor=" + String.valueOf(executor3) + ", backgroundExecutor=" + String.valueOf(executor2) + ", blockingExecutor=" + String.valueOf(executor) + ", lightweightScheduledExecutor=null, authContextManager=" + String.valueOf(uraVar) + ", rpcCacheProvider=" + String.valueOf(uqqVar) + ", userAgentOverride=null, recordNetworkMetricsToPrimes=" + String.valueOf(ttmVar4) + ", recordCachingMetricsToPrimes=" + String.valueOf(ttmVar3) + ", recordBandwidthMetrics=" + String.valueOf(ttmVar2) + ", grpcIdleTimeoutMillis=" + String.valueOf(ttmVar) + ", grpcServiceConfig=" + String.valueOf(uqoVar) + ", consistencyTokenConfig=null, maxMessageSize=" + this.m + ", grpcKeepAliveTimeMillis=" + this.n + ", grpcKeepAliveTimeoutMillis=" + this.o + ", channelCredentials=null}";
    }

    public uqh(Context context, osk oskVar, uqw uqwVar, Executor executor, Executor executor2, Executor executor3, ura uraVar, uqq uqqVar, ttm ttmVar, ttm ttmVar2, ttm ttmVar3, ttm ttmVar4, uqo uqoVar, long j) {
        this.a = context;
        this.p = oskVar;
        this.b = uqwVar;
        this.c = executor;
        this.d = executor2;
        this.e = executor3;
        this.f = uraVar;
        this.g = uqqVar;
        this.h = ttmVar;
        this.i = ttmVar2;
        this.j = ttmVar3;
        this.k = ttmVar4;
        this.l = uqoVar;
        this.m = 4194304;
        this.n = Long.MAX_VALUE;
        this.o = j;
    }
}
