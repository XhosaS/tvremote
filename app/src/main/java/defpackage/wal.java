package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.apps.tiktok.account.AccountId;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wal implements waw {
    private final aehf a;
    private final wec b;
    private final Context c;

    public wal(aehf aehfVar, wec wecVar, Context context) {
        aehfVar.getClass();
        context.getClass();
        this.a = aehfVar;
        this.b = wecVar;
        this.c = context;
    }

    public final zyd a(final String str, AccountId accountId, vhg vhgVar, boolean z) {
        final wgo wgoVarN = ((wak) wgv.a(this.c, wak.class, accountId)).n();
        String strA = this.b.a(vhgVar);
        wwc wwcVar = wwb.a;
        wvx wvxVarF = wzg.f("Fetching experiments for account", wwcVar, true);
        try {
            wvxVarF = wzg.f("PhenotypeApi.getConfigurationSnapshot", wwcVar, true);
            try {
                zyd zydVarC = wgoVarN.c.c(str, strA);
                if (z) {
                    zydVarC = wyy.a(zydVarC, 25L, TimeUnit.SECONDS, wgoVarN.a);
                }
                wvxVarF.a(zydVarC);
                aguc.a(wvxVarF, null);
                final zyd zydVarH = zuz.h(zydVarC, wyo.c(wyo.c(new zvi() { // from class: wgg
                    @Override // defpackage.zvi
                    public final zyd a(Object obj) {
                        zyd zydVarG;
                        rgu rguVar = (rgu) obj;
                        wvx wvxVarF2 = wzg.f("ConsistencyTierState.setNewValues", wwb.a, true);
                        String str2 = str;
                        final wgo wgoVar = wgoVarN;
                        try {
                            vzs vzsVar = (vzs) wgoVar.b.get(str2);
                            if (vzsVar != null) {
                                int iOrdinal = vzsVar.ordinal();
                                if (iOrdinal == 1) {
                                    wbm wbmVar = wgoVar.f;
                                    rguVar.getClass();
                                    zydVarG = zuz.g(wbmVar.b(str2, rguVar), wyo.a(new yqi() { // from class: wgi
                                        @Override // defpackage.yqi
                                        public final Object apply(Object obj2) {
                                            wau wauVar = (wau) obj2;
                                            wauVar.getClass();
                                            if (!wauVar.a) {
                                                wgo wgoVar2 = wgoVar;
                                                yqt yqtVar = wgoVar2.d;
                                                if (yqtVar.g()) {
                                                    wgoVar2.g.a();
                                                    ((rmj) yqtVar.c()).b();
                                                }
                                            }
                                            return wauVar;
                                        }
                                    }), zwk.a);
                                } else if (iOrdinal == 3) {
                                    wbm wbmVar2 = wgoVar.e;
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
                })), zwk.a);
                aguc.a(wvxVarF, null);
                zyd zydVarD = wgoVarN.h.f.d(false);
                yqi yqiVar = new yqi() { // from class: wgf
                    @Override // defpackage.yqi
                    public final Object apply(Object obj) {
                        kfh kfhVar = (kfh) obj;
                        kfhVar.getClass();
                        return Integer.valueOf(Log.w("ConfigurationUpdater", "Failed to update shared storage snapshot", kfhVar));
                    }
                };
                zwk zwkVar = zwk.a;
                return zuz.g(wco.a(agqq.d(zud.g(zydVarD, kfh.class, wyo.a(yqiVar), zwkVar), zydVarH)), wyo.a(new yqi() { // from class: wgh
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

    @Override // defpackage.waw
    public final zyd b(final String str, final boolean z) {
        str.getClass();
        return zuz.h(((vhb) this.a.a()).c(), wyo.c(new zvi() { // from class: waj
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                List<vha> list = (List) obj;
                list.getClass();
                ArrayList arrayList = new ArrayList(agqq.i(list, 10));
                for (vha vhaVar : list) {
                    boolean z2 = z;
                    String str2 = str;
                    wal walVar = this.a;
                    arrayList.add(walVar.a(str2, vhaVar.a(), vhaVar.b(), z2));
                }
                return wco.a(arrayList);
            }
        }), zwk.a);
    }

    @Override // defpackage.waw
    public final zyd c(final String str, final AccountId accountId) {
        return zuz.h(((vhb) this.a.a()).b(accountId), wyo.c(new zvi() { // from class: wai
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                vha vhaVar = (vha) obj;
                vhaVar.getClass();
                return this.a.a(str, accountId, vhaVar.b(), true);
            }
        }), zwk.a);
    }
}
