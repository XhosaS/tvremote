package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ina extends agtu implements agvb {
    int a;
    final /* synthetic */ ind b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ina(ind indVar, agsw agswVar) {
        super(2, agswVar);
        this.b = indVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ina) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        yrn yrnVar = null;
        try {
            if (this.a != 0) {
                agpl.b(obj);
            } else {
                agpl.b(obj);
                long j = agzn.a;
                long jB = agzp.b(20L, agzq.d);
                imz imzVar = new imz(this.b, null);
                this.a = 1;
                if (ahep.a(ahce.a(jB), imzVar, this) == agtgVar) {
                    return agtgVar;
                }
            }
        } catch (ahem e) {
            zdy zdyVar = ind.a;
            ((zdv) ((zdv) zdyVar.d()).p(e).q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer$startHeterodyneSync$1", "invokeSuspend", 1058, "HomeGraphSetupActivityPeer.kt")).u("OOBE Heterodyne sync failed. Setting experiments account to null.");
            ind indVar = this.b;
            indVar.k.a = null;
            ((zdv) zdyVar.d().q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer", "handleHeterodyneSyncTimeout", 1089, "HomeGraphSetupActivityPeer.kt")).u("Heterodyne sync timed out.");
            indVar.u = true;
            indVar.B = ybo.FAILURE;
            indVar.v.add(ybl.FIRST_SCREEN_LOADING_TIMEOUT);
            ygm ygmVar = ygm.a;
            ygl yglVar = new ygl();
            yhh.b(adzh.LOAD_EXPERIMENTS_CONFIG_TIMEOUT, yglVar);
            yrn yrnVar2 = indVar.F;
            if (yrnVar2 == null) {
                agvy.b("stopwatch");
            } else {
                yrnVar = yrnVar2;
            }
            int millis = (int) Duration.ofNanos(yrnVar.b()).toMillis();
            if ((yglVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                yglVar.y();
            }
            ygm ygmVar2 = (ygm) yglVar.b;
            ygmVar2.b |= 2;
            ygmVar2.d = millis;
            indVar.y = yhh.a(yglVar);
            indVar.n(irg.u);
        } catch (waq e2) {
            ((zdv) ((zdv) ind.a.d()).p(e2).q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer$startHeterodyneSync$1", "invokeSuspend", 1051, "HomeGraphSetupActivityPeer.kt")).u("Heterodyne sync failed.");
            ind indVar2 = this.b;
            indVar2.k.a = null;
            indVar2.j();
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new ina(this.b, agswVar);
    }
}
