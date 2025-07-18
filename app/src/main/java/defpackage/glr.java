package defpackage;

import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
final class glr extends agtu implements agvb {
    int a;
    final /* synthetic */ glt b;
    final /* synthetic */ gma c;
    final /* synthetic */ Duration d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public glr(glt gltVar, gma gmaVar, Duration duration, agsw agswVar) {
        super(2, agswVar);
        this.b = gltVar;
        this.c = gmaVar;
        this.d = duration;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((glr) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
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
            zdy zdyVar = glt.a;
            zdv zdvVar = (zdv) zdyVar.b();
            zer zerVar = zfi.a;
            zdv zdvVar2 = (zdv) zdvVar.o(zerVar, "LatencyLogger").q("com/google/android/apps/tvsearch/logging/primes/KatnissE2ELatencyLoggerImpl$recordClientLatency$1", "invokeSuspend", 170, "KatnissE2ELatencyLoggerImpl.kt");
            gma gmaVar = this.c;
            zdvVar2.E("Recording Katniss E2E Primes Event: %s (%d ms)", gmaVar.s, this.d.toMillis());
            zdv zdvVar3 = (zdv) ((zdv) zdyVar.b()).o(zerVar, "LatencyLogger").q("com/google/android/apps/tvsearch/logging/primes/KatnissE2ELatencyLoggerImpl$recordClientLatency$1", "invokeSuspend", 178, "KatnissE2ELatencyLoggerImpl.kt");
            glt gltVar2 = this.b;
            zdvVar3.K("Event [%s]: Assistant invoked to Speech begins: %d ms, Speech Duration: %d ms, Server Latency: %d ms, Client Fulfillment Latency: %d ms ", gmaVar.name(), new Long(fep.a(gltVar2.d, gltVar2.e).toMillis()), new Long(fep.a(gltVar2.e, gltVar2.f).toMillis()), new Long(fep.a(gltVar2.f, gltVar2.g).toMillis()), new Long(fep.a(gltVar2.g, gltVar2.h).toMillis()));
        } else if (((Instant) obj).compareTo(this.b.c.a()) >= 0) {
            zdy zdyVar2 = glt.a;
            zdv zdvVar4 = (zdv) zdyVar2.b();
            zer zerVar2 = zfi.a;
            zdv zdvVar22 = (zdv) zdvVar4.o(zerVar2, "LatencyLogger").q("com/google/android/apps/tvsearch/logging/primes/KatnissE2ELatencyLoggerImpl$recordClientLatency$1", "invokeSuspend", 170, "KatnissE2ELatencyLoggerImpl.kt");
            gma gmaVar2 = this.c;
            zdvVar22.E("Recording Katniss E2E Primes Event: %s (%d ms)", gmaVar2.s, this.d.toMillis());
            zdv zdvVar32 = (zdv) ((zdv) zdyVar2.b()).o(zerVar2, "LatencyLogger").q("com/google/android/apps/tvsearch/logging/primes/KatnissE2ELatencyLoggerImpl$recordClientLatency$1", "invokeSuspend", 178, "KatnissE2ELatencyLoggerImpl.kt");
            glt gltVar22 = this.b;
            zdvVar32.K("Event [%s]: Assistant invoked to Speech begins: %d ms, Speech Duration: %d ms, Server Latency: %d ms, Client Fulfillment Latency: %d ms ", gmaVar2.name(), new Long(fep.a(gltVar22.d, gltVar22.e).toMillis()), new Long(fep.a(gltVar22.e, gltVar22.f).toMillis()), new Long(fep.a(gltVar22.f, gltVar22.g).toMillis()), new Long(fep.a(gltVar22.g, gltVar22.h).toMillis()));
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new glr(this.b, this.c, this.d, agswVar);
    }
}
