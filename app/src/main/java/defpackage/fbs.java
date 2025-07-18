package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fbs extends agtu implements agvb {
    final /* synthetic */ long a;
    final /* synthetic */ Instant b;
    final /* synthetic */ byte[] c;
    final /* synthetic */ fbv d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fbs(long j, Instant instant, byte[] bArr, fbv fbvVar, agsw agswVar) {
        super(2, agswVar);
        this.a = j;
        this.b = instant;
        this.c = bArr;
        this.d = fbvVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fbs) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws abxv {
        int i;
        aeec aeecVar;
        fbv fbvVar;
        int i2;
        rqw rqwVarDN;
        int i3;
        agpl.b(obj);
        long j = this.a;
        Duration durationOfNanos = Duration.ofNanos(j);
        durationOfNanos.getClass();
        Instant instant = this.b;
        instant.getClass();
        long jA = ztu.a(instant) - j;
        try {
            byte[] bArr = this.c;
            int i4 = 0;
            abxd abxdVarH = abxd.h(aeec.a, bArr, 0, bArr.length, ExtensionRegistryLite.getGeneratedRegistry());
            i = 2;
            if (abxdVarH != null) {
                abxd abxdVar = null;
                byte bByteValue = ((Byte) abxdVarH.cM(1, null)).byteValue();
                if (bByteValue != 1) {
                    if (bByteValue != 0) {
                        boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                        if (true == zL) {
                            abxdVar = abxdVarH;
                        }
                        abxdVarH.cM(2, abxdVar);
                        if (zL) {
                        }
                    }
                    throw new abzz().a();
                }
            }
            aeecVar = (aeec) abxdVarH;
            aeecVar.getClass();
            fbvVar = this.d;
            int i5 = aeecVar.d;
            if (i5 == 0) {
                i4 = 2;
            } else if (i5 == 1) {
                i4 = 3;
            } else if (i5 == 2) {
                i4 = 4;
            } else if (i5 == 3) {
                i4 = 5;
            }
            if (i4 == 0) {
                i4 = 1;
            }
            i2 = i4 - 2;
        } catch (abxv e) {
            ((zdv) ((zdv) fbv.a.d()).p(e).q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer$handleKatnissTriggeredRenderingResult$1", "invokeSuspend", 441, "AppAssistantIntegrationServicePeer.kt")).u("Failed to parse KatnissTriggeredRenderingResult.");
        }
        if (i2 == 1) {
            rqwVarDN = rpm.dN();
        } else if (i2 == 2) {
            rqwVarDN = rpm.dW();
        } else {
            if (i2 != 3) {
                ((zdv) fbv.a.d().q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "logAppFlowEventFromRenderingResult", 458, "AppAssistantIntegrationServicePeer.kt")).u("Rendering type not supported.");
                return agpu.a;
            }
            rqwVarDN = rpm.dO();
        }
        String str = aeecVar.b;
        str.getClass();
        aeeb aeebVar = aeecVar.e;
        if (aeebVar == null) {
            aeebVar = aeeb.a;
        }
        aeebVar.getClass();
        if ((1 & aeebVar.b) != 0) {
            abzy abzyVar = aeebVar.c;
            if (abzyVar == null) {
                abzyVar = abzy.a;
            }
            abzyVar.getClass();
            Duration durationB = gfb.b(abzyVar, jA);
            if (durationB == null) {
                i3 = 2;
                i = 22;
            } else {
                i3 = 2;
            }
            gfl gflVarA = ((gfn) fbvVar.m.a()).a(rpm.at()).a(str);
            gflVarA.h(str);
            if (durationB == null) {
                durationB = durationOfNanos;
            }
            gflVarA.f(durationB);
            gflVarA.e(i);
        } else {
            i3 = 2;
        }
        if ((aeebVar.b & 2) != 0) {
            abzy abzyVar2 = aeebVar.d;
            if (abzyVar2 == null) {
                abzyVar2 = abzy.a;
            }
            abzyVar2.getClass();
            Duration durationB2 = gfb.b(abzyVar2, jA);
            int i6 = durationB2 == null ? 22 : i3;
            gfl gflVarA2 = ((gfn) fbvVar.m.a()).a(rpm.as()).a(str);
            gflVarA2.h(str);
            if (durationB2 == null) {
                durationB2 = durationOfNanos;
            }
            gflVarA2.f(durationB2);
            gflVarA2.e(i6);
        }
        if ((aeebVar.b & 4) != 0) {
            abzy abzyVar3 = aeebVar.e;
            if (abzyVar3 == null) {
                abzyVar3 = abzy.a;
            }
            abzyVar3.getClass();
            Duration durationB3 = gfb.b(abzyVar3, jA);
            int i7 = durationB3 == null ? 22 : i3;
            gfl gflVarA3 = ((gfn) fbvVar.m.a()).a(rpm.bo()).a(str);
            gflVarA3.h(str);
            if (durationB3 == null) {
                durationB3 = durationOfNanos;
            }
            gflVarA3.f(durationB3);
            gflVarA3.e(i7);
        }
        abzy abzyVar4 = aeebVar.f;
        if (abzyVar4 == null) {
            abzyVar4 = abzy.a;
        }
        abzyVar4.getClass();
        Duration durationB4 = gfb.b(abzyVar4, jA);
        if (durationB4 == null) {
            zdv zdvVar = (zdv) fbv.a.d().q("com/google/android/apps/tvsearch/assistant/appintegration/AppAssistantIntegrationServicePeer", "logAppFlowEventFromRenderingResult", 518, "AppAssistantIntegrationServicePeer.kt");
            abqb abqbVarB = abqb.b(aeecVar.c);
            if (abqbVarB == null) {
                abqbVarB = abqb.OK;
            }
            zdvVar.x("Received result rendered timestamp without a valid timestamp: status code: %s", abqbVarB);
            gfg gfgVarA = ((gfn) fbvVar.m.a()).c(rqwVarDN).a(str);
            gfgVarA.g(str);
            gfgVarA.e(durationOfNanos);
            gfgVarA.d(22);
        } else {
            gfg gfgVarA2 = ((gfn) fbvVar.m.a()).c(rqwVarDN).a(str);
            gfgVarA2.g(str);
            gfgVarA2.e(durationB4);
            abqb abqbVarB2 = abqb.b(aeecVar.c);
            if (abqbVarB2 == null) {
                abqbVarB2 = abqb.OK;
            }
            abqbVarB2.getClass();
            gfgVarA2.c(abqbVarB2);
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fbs(this.a, this.b, this.c, this.d, agswVar);
    }
}
