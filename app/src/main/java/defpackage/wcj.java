package defpackage;

import android.util.Log;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wcj {
    public final yqt a;
    public final wbm b;
    public final wbm c;
    public final Map d;
    public final wek e;
    private final ScheduledExecutorService f;
    private final rgy g;
    private final rfr h;

    public wcj(yqt yqtVar, ScheduledExecutorService scheduledExecutorService, wbm wbmVar, wbm wbmVar2, Map map, rgy rgyVar, wek wekVar, rfr rfrVar) {
        yqtVar.getClass();
        scheduledExecutorService.getClass();
        wbmVar.getClass();
        wbmVar2.getClass();
        map.getClass();
        rgyVar.getClass();
        rfrVar.getClass();
        this.a = yqtVar;
        this.f = scheduledExecutorService;
        this.b = wbmVar;
        this.c = wbmVar2;
        this.d = map;
        this.g = rgyVar;
        this.e = wekVar;
        this.h = rfrVar;
    }

    public final zyd a(final String str, boolean z) {
        str.getClass();
        wwc wwcVar = wwb.a;
        wvx wvxVarF = wzg.f("Fetching experiments for device", wwcVar, true);
        try {
            wvxVarF = wzg.f("PhenotypeApi.getConfigurationSnapshot", wwcVar, true);
            try {
                zyd zydVarC = this.g.c(str, "");
                if (z) {
                    zydVarC = wyy.a(zydVarC, 25L, TimeUnit.SECONDS, this.f);
                }
                wvxVarF.a(zydVarC);
                aguc.a(wvxVarF, null);
                final zyd zydVarH = zuz.h(zydVarC, wyo.c(new zvi() { // from class: wcb
                    @Override // defpackage.zvi
                    public final zyd a(Object obj) {
                        zyd zydVarG;
                        rgu rguVar = (rgu) obj;
                        wvx wvxVarF2 = wzg.f("ConsistencyTierState.setNewValues", wwb.a, true);
                        String str2 = str;
                        final wcj wcjVar = this.a;
                        try {
                            vzs vzsVar = (vzs) wcjVar.d.get(str2);
                            if (vzsVar != null) {
                                int iOrdinal = vzsVar.ordinal();
                                if (iOrdinal == 0) {
                                    wbm wbmVar = wcjVar.c;
                                    rguVar.getClass();
                                    zydVarG = zuz.g(wbmVar.b(str2, rguVar), wyo.a(new yqi() { // from class: wcc
                                        @Override // defpackage.yqi
                                        public final Object apply(Object obj2) {
                                            wau wauVar = (wau) obj2;
                                            wauVar.getClass();
                                            if (!wauVar.a) {
                                                wcj wcjVar2 = wcjVar;
                                                yqt yqtVar = wcjVar2.a;
                                                if (yqtVar.g()) {
                                                    wcjVar2.e.a();
                                                    ((rmj) yqtVar.c()).b();
                                                }
                                            }
                                            return wauVar;
                                        }
                                    }), zwk.a);
                                } else if (iOrdinal == 2) {
                                    wbm wbmVar2 = wcjVar.b;
                                    rguVar.getClass();
                                    zydVarG = wbmVar2.b(str2, rguVar);
                                }
                                wvxVarF2.a(zydVarG);
                                aguc.a(wvxVarF2, null);
                                return zydVarG;
                            }
                            throw new UnsupportedOperationException();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                aguc.a(wvxVarF2, th);
                                throw th2;
                            }
                        }
                    }
                }), zwk.a);
                wvxVarF.a(zydVarH);
                aguc.a(wvxVarF, null);
                zyd zydVarD = this.h.f.d(false);
                yqi yqiVar = new yqi() { // from class: wca
                    @Override // defpackage.yqi
                    public final Object apply(Object obj) {
                        kfh kfhVar = (kfh) obj;
                        kfhVar.getClass();
                        return Integer.valueOf(Log.w("ConfigurationUpdater", "Failed to update shared storage snapshot. GMS Core version too old.", kfhVar));
                    }
                };
                zwk zwkVar = zwk.a;
                return zuz.g(wco.a(agqq.d(zud.g(zydVarD, kfh.class, wyo.a(yqiVar), zwkVar), zydVarH)), wyo.a(new yqi() { // from class: wbz
                    @Override // defpackage.yqi
                    public final Object apply(Object obj) {
                        ((List) obj).getClass();
                        return (wau) zxn.o(zydVarH);
                    }
                }), zwkVar);
            } finally {
            }
        } finally {
        }
    }
}
