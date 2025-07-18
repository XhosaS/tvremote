package defpackage;

import android.content.Context;
import java.net.URI;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aasf extends aasu {
    public final Context a;
    public final URI b;
    public final Executor c;
    public final Executor d;
    public final ScheduledExecutorService e;
    public final String f;
    public final yrp g;
    public final Integer h;
    public final Integer i;
    public final long j;
    public final int k;
    private final Executor m;
    private final long n;
    private final long o;

    public aasf(Context context, URI uri, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService, String str, yrp yrpVar, Integer num, Integer num2, long j, int i, long j2, long j3) {
        this.a = context;
        this.b = uri;
        this.m = executor;
        this.c = executor2;
        this.d = executor3;
        this.e = scheduledExecutorService;
        this.f = str;
        this.g = yrpVar;
        this.h = num;
        this.i = num2;
        this.j = j;
        this.k = i;
        this.n = j2;
        this.o = j3;
    }

    @Override // defpackage.aasu
    public final int a() {
        return this.k;
    }

    @Override // defpackage.aasu
    public final long b() {
        return this.j;
    }

    @Override // defpackage.aasu
    public final long c() {
        return this.n;
    }

    @Override // defpackage.aasu
    public final long d() {
        return this.o;
    }

    @Override // defpackage.aasu
    public final Context e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        ScheduledExecutorService scheduledExecutorService;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aasu) {
            aasu aasuVar = (aasu) obj;
            if (this.a.equals(aasuVar.e()) && this.b.equals(aasuVar.j()) && this.m.equals(aasuVar.k()) && this.c.equals(aasuVar.l()) && this.d.equals(aasuVar.m()) && ((scheduledExecutorService = this.e) != null ? scheduledExecutorService.equals(aasuVar.n()) : aasuVar.n() == null) && ((str = this.f) != null ? str.equals(aasuVar.i()) : aasuVar.i() == null) && this.g.equals(aasuVar.f())) {
                aasuVar.p();
                Integer num = this.h;
                if (num != null ? num.equals(aasuVar.h()) : aasuVar.h() == null) {
                    Integer num2 = this.i;
                    if (num2 != null ? num2.equals(aasuVar.g()) : aasuVar.g() == null) {
                        if (this.j == aasuVar.b() && this.k == aasuVar.a() && this.n == aasuVar.c() && this.o == aasuVar.d()) {
                            aasuVar.o();
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.aasu
    public final yrp f() {
        return this.g;
    }

    @Override // defpackage.aasu
    public final Integer g() {
        return this.i;
    }

    @Override // defpackage.aasu
    public final Integer h() {
        return this.h;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        ScheduledExecutorService scheduledExecutorService = this.e;
        int iHashCode2 = ((iHashCode * 1000003) ^ (scheduledExecutorService == null ? 0 : scheduledExecutorService.hashCode())) * 1000003;
        String str = this.f;
        int iHashCode3 = ((iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.g.hashCode();
        Integer num = this.h;
        int iHashCode4 = ((iHashCode3 * (-721379959)) ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Integer num2 = this.i;
        int iHashCode5 = num2 != null ? num2.hashCode() : 0;
        long j = this.j;
        int i = (((((iHashCode4 ^ iHashCode5) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.k) * 1000003;
        long j2 = this.n;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.o;
        return (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
    }

    @Override // defpackage.aasu
    public final String i() {
        return this.f;
    }

    @Override // defpackage.aasu
    public final URI j() {
        return this.b;
    }

    @Override // defpackage.aasu
    public final Executor k() {
        return this.m;
    }

    @Override // defpackage.aasu
    public final Executor l() {
        return this.c;
    }

    @Override // defpackage.aasu
    public final Executor m() {
        return this.d;
    }

    @Override // defpackage.aasu
    public final ScheduledExecutorService n() {
        return this.e;
    }

    public final String toString() {
        yrp yrpVar = this.g;
        ScheduledExecutorService scheduledExecutorService = this.e;
        Executor executor = this.d;
        Executor executor2 = this.c;
        Executor executor3 = this.m;
        URI uri = this.b;
        return "TransportConfig{applicationContext=" + String.valueOf(this.a) + ", uri=" + String.valueOf(uri) + ", backgroundExecutor=" + String.valueOf(executor3) + ", blockingExecutor=" + String.valueOf(executor2) + ", lightweightExecutor=" + String.valueOf(executor) + ", lightweightScheduledExecutorService=" + String.valueOf(scheduledExecutorService) + ", userAgentOverride=" + this.f + ", recordNetworkMetricsToPrimes=" + String.valueOf(yrpVar) + ", grpcServiceConfig=null, trafficStatsUid=" + this.h + ", trafficStatsTag=" + this.i + ", grpcIdleTimeoutMillis=" + this.j + ", maxMessageSize=" + this.k + ", grpcKeepAliveTimeMillis=" + this.n + ", grpcKeepAliveTimeoutMillis=" + this.o + ", channelCredentials=null}";
    }

    @Override // defpackage.aasu
    public final void o() {
    }

    @Override // defpackage.aasu
    public final void p() {
    }
}
