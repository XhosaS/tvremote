package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aasd extends aasi {
    public final Context a;
    public final aasv b;
    public final Executor c;
    public final Executor d;
    public final Executor e;
    public final ScheduledExecutorService f;
    public final String g;
    public final yrp h;
    public final yrp i;
    public final int j;
    public final long k;
    public final long l;
    private final yrp m;
    private final yrp n;
    private final mcw o;

    public aasd(Context context, mcw mcwVar, aasv aasvVar, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService, String str, yrp yrpVar, yrp yrpVar2, yrp yrpVar3, yrp yrpVar4, int i, long j, long j2) {
        this.a = context;
        this.o = mcwVar;
        this.b = aasvVar;
        this.c = executor;
        this.d = executor2;
        this.e = executor3;
        this.f = scheduledExecutorService;
        this.g = str;
        this.h = yrpVar;
        this.m = yrpVar2;
        this.n = yrpVar3;
        this.i = yrpVar4;
        this.j = i;
        this.k = j;
        this.l = j2;
    }

    @Override // defpackage.aasi
    public final int a() {
        return this.j;
    }

    @Override // defpackage.aasi
    public final long b() {
        return this.k;
    }

    @Override // defpackage.aasi
    public final long c() {
        return this.l;
    }

    @Override // defpackage.aasi
    public final Context d() {
        return this.a;
    }

    @Override // defpackage.aasi
    public final yrp e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        ScheduledExecutorService scheduledExecutorService;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aasi) {
            aasi aasiVar = (aasi) obj;
            if (this.a.equals(aasiVar.d()) && this.o.equals(aasiVar.o()) && this.b.equals(aasiVar.i()) && this.c.equals(aasiVar.m()) && this.d.equals(aasiVar.k()) && this.e.equals(aasiVar.l()) && ((scheduledExecutorService = this.f) != null ? scheduledExecutorService.equals(aasiVar.n()) : aasiVar.n() == null)) {
                aasiVar.p();
                aasiVar.t();
                String str = this.g;
                if (str != null ? str.equals(aasiVar.j()) : aasiVar.j() == null) {
                    if (this.h.equals(aasiVar.h()) && this.m.equals(aasiVar.g()) && this.n.equals(aasiVar.f()) && this.i.equals(aasiVar.e())) {
                        aasiVar.s();
                        aasiVar.r();
                        if (this.j == aasiVar.a() && this.k == aasiVar.b() && this.l == aasiVar.c()) {
                            aasiVar.q();
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.aasi
    public final yrp f() {
        return this.n;
    }

    @Override // defpackage.aasi
    public final yrp g() {
        return this.m;
    }

    @Override // defpackage.aasi
    public final yrp h() {
        return this.h;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        ScheduledExecutorService scheduledExecutorService = this.f;
        int iHashCode2 = scheduledExecutorService == null ? 0 : scheduledExecutorService.hashCode();
        int i = iHashCode * 1000003;
        String str = this.g;
        int iHashCode3 = (((((((((((((i ^ iHashCode2) * 583896283) ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.i.hashCode()) * 583896283) ^ this.j) * 1000003;
        long j = this.k;
        int i2 = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.l;
        return (i2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
    }

    @Override // defpackage.aasi
    public final aasv i() {
        return this.b;
    }

    @Override // defpackage.aasi
    public final String j() {
        return this.g;
    }

    @Override // defpackage.aasi
    public final Executor k() {
        return this.d;
    }

    @Override // defpackage.aasi
    public final Executor l() {
        return this.e;
    }

    @Override // defpackage.aasi
    public final Executor m() {
        return this.c;
    }

    @Override // defpackage.aasi
    public final ScheduledExecutorService n() {
        return this.f;
    }

    @Override // defpackage.aasi
    public final mcw o() {
        return this.o;
    }

    public final String toString() {
        yrp yrpVar = this.i;
        yrp yrpVar2 = this.n;
        yrp yrpVar3 = this.m;
        yrp yrpVar4 = this.h;
        ScheduledExecutorService scheduledExecutorService = this.f;
        Executor executor = this.e;
        Executor executor2 = this.d;
        Executor executor3 = this.c;
        aasv aasvVar = this.b;
        mcw mcwVar = this.o;
        return "ChannelConfig{context=" + this.a.toString() + ", clock=" + mcwVar.toString() + ", transport=" + aasvVar.toString() + ", lightweightExecutor=" + executor3.toString() + ", backgroundExecutor=" + executor2.toString() + ", blockingExecutor=" + executor.toString() + ", lightweightScheduledExecutor=" + String.valueOf(scheduledExecutorService) + ", authContextManager=null, rpcCacheProvider=null, userAgentOverride=" + this.g + ", recordNetworkMetricsToPrimes=" + yrpVar4.toString() + ", recordCachingMetricsToPrimes=" + yrpVar3.toString() + ", recordBandwidthMetrics=" + yrpVar2.toString() + ", grpcIdleTimeoutMillis=" + yrpVar.toString() + ", grpcServiceConfig=null, consistencyTokenConfig=null, maxMessageSize=" + this.j + ", grpcKeepAliveTimeMillis=" + this.k + ", grpcKeepAliveTimeoutMillis=" + this.l + ", channelCredentials=null}";
    }

    @Override // defpackage.aasi
    public final void p() {
    }

    @Override // defpackage.aasi
    public final void q() {
    }

    @Override // defpackage.aasi
    public final void r() {
    }

    @Override // defpackage.aasi
    public final void s() {
    }

    @Override // defpackage.aasi
    public final void t() {
    }
}
