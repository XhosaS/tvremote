package defpackage;

import java.security.cert.CertificateException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class imv extends agtu implements agvb {
    int a;
    final /* synthetic */ ind b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imv(ind indVar, agsw agswVar) {
        super(2, agswVar);
        this.b = indVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((imv) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws CertificateException {
        agtg agtgVar = agtg.a;
        try {
            if (this.a != 0) {
                agpl.b(obj);
            } else {
                agpl.b(obj);
                long j = ind.b;
                imu imuVar = new imu(this.b, null);
                this.a = 1;
                if (ahep.a(ahce.a(j), imuVar, this) == agtgVar) {
                    return agtgVar;
                }
            }
            ind indVar = this.b;
            fcy fcyVar = indVar.q;
            if (fcyVar == null || !fcyVar.a()) {
                ((zdv) ind.a.c().q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer$loadCastInfo$1", "invokeSuspend", 320, "HomeGraphSetupActivityPeer.kt")).u("Cast id loaded as invalid value.");
                indVar.f();
            } else {
                ((zdv) ind.a.b().q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer$loadCastInfo$1", "invokeSuspend", 317, "HomeGraphSetupActivityPeer.kt")).u("Valid CastInfo loaded.");
                indVar.k();
            }
            return agpu.a;
        } catch (ahem e) {
            ((zdv) ((zdv) ind.a.d()).p(e).q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer$loadCastInfo$1", "invokeSuspend", 312, "HomeGraphSetupActivityPeer.kt")).u("Execution timed out before CastInfo could be loaded.");
            this.b.f();
            return agpu.a;
        }
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new imv(this.b, agswVar);
    }
}
