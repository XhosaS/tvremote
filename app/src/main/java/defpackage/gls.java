package defpackage;

import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gls extends agtu implements agvb {
    int a;
    final /* synthetic */ glt b;
    final /* synthetic */ gma c;
    final /* synthetic */ Duration d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gls(glt gltVar, gma gmaVar, Duration duration, agsw agswVar) {
        super(2, agswVar);
        this.b = gltVar;
        this.c = gmaVar;
        this.d = duration;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gls) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            boolean z = gmr.a;
            if (!gmr.a) {
                glt gltVar = this.b;
                this.a = 1;
                obj = gltVar.b.c(this);
                if (obj == agtgVar) {
                    return agtgVar;
                }
                if (((Instant) obj).compareTo(this.b.c.a()) >= 0) {
                }
            }
            ((zdv) ((zdv) glt.a.b()).o(zfi.a, "LatencyLogger").q("com/google/android/apps/tvsearch/logging/primes/KatnissE2ELatencyLoggerImpl$recordE2ELatency$1", "invokeSuspend", 138, "KatnissE2ELatencyLoggerImpl.kt")).E("Recording Katniss E2E Primes Event: %s (%d ms)", this.c.s, this.d.toMillis());
        } else if (((Instant) obj).compareTo(this.b.c.a()) >= 0) {
            ((zdv) ((zdv) glt.a.b()).o(zfi.a, "LatencyLogger").q("com/google/android/apps/tvsearch/logging/primes/KatnissE2ELatencyLoggerImpl$recordE2ELatency$1", "invokeSuspend", 138, "KatnissE2ELatencyLoggerImpl.kt")).E("Recording Katniss E2E Primes Event: %s (%d ms)", this.c.s, this.d.toMillis());
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gls(this.b, this.c, this.d, agswVar);
    }
}
