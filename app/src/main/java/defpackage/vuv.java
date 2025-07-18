package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.apps.tiktok.account.AccountId;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vuv implements vta {
    public static final zdy a = zdy.h("com/google/apps/tiktok/contrib/work/impl/TikTokInternalAccountWorker");
    public final Executor b;
    public volatile vtj c;
    private final Context d;
    private final vft e;
    private final Map f;
    private final Executor g;
    private final yqi h;
    private final String i = "com.google.android.libraries.search.geller.GellerSyncRetryWorker";

    public vuv(Context context, vft vftVar, Map map, Executor executor, Executor executor2, yqi yqiVar) {
        this.d = context;
        this.e = vftVar;
        this.f = map;
        this.b = executor;
        this.g = executor2;
        this.h = yqiVar;
    }

    @Override // defpackage.vtu
    public final zyd a(final WorkerParameters workerParameters) {
        return zuz.h(c(vvv.a(workerParameters.c)), wyo.c(new zvi() { // from class: vut
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                return ((vta) obj).a(workerParameters);
            }
        }), this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vta, defpackage.vtu
    public final zyd b(final WorkerParameters workerParameters) {
        zyd zydVarG;
        wwa wwaVarB = wwb.a.b();
        Set set = workerParameters.c;
        vfh.a(wwaVarB, vvv.a(set));
        final wvx wvxVarF = wzg.f("AccountWorkerFactory startWork()", ((wwc) wwaVarB).e(), true);
        try {
            if (set.contains("tiktok_account_work")) {
                final AccountId accountIdA = vvv.a(set);
                zyd zydVarC = ((vuu) wgv.a(this.d, vuu.class, accountIdA)).k().c(new zvh() { // from class: vup
                    @Override // defpackage.zvh
                    public final zyd a() {
                        final vuv vuvVar = this.a;
                        final WorkerParameters workerParameters2 = workerParameters;
                        zyd zydVarH = zuz.h(vuvVar.c(accountIdA), wyo.c(new zvi() { // from class: vus
                            @Override // defpackage.zvi
                            public final zyd a(Object obj) {
                                vta vtaVar = (vta) obj;
                                vtaVar.d(vuvVar.c);
                                return vtaVar.b(workerParameters2);
                            }
                        }), vuvVar.b);
                        wvxVarF.a(zydVarH);
                        return zydVarH;
                    }
                });
                yqi yqiVar = new yqi() { // from class: vuq
                    @Override // defpackage.yqi
                    public final Object apply(Object obj) {
                        ((zdv) ((zdv) ((zdv) vuv.a.d()).p((vuc) obj)).q("com/google/apps/tiktok/contrib/work/impl/TikTokInternalAccountWorker", "startWork", 127, "TikTokInternalAccountWorker.java")).u("Account Worker did not pass Account requirements and will be skipped.");
                        return new cbr(caz.b);
                    }
                };
                zydVarG = zud.g(zydVarC, vuc.class, wyo.a(yqiVar), this.g);
            } else {
                zydVarG = zxn.g(new vuc());
            }
            wvxVarF.close();
            return zydVarG;
        } catch (Throwable th) {
            try {
                wvxVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final zyd c(AccountId accountId) {
        Map map = this.f;
        String str = this.i;
        zyd zydVarC = map.containsKey(str) ? this.e.c(accountId, (yyk) map.get(str)) : this.e.a(accountId);
        zvi zviVar = new zvi() { // from class: vur
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                return zxn.g(new vuc((vio) obj));
            }
        };
        Executor executor = this.b;
        return zuz.g(zud.h(zydVarC, vio.class, wyo.c(zviVar), executor), wyo.a(this.h), executor);
    }

    @Override // defpackage.vtu
    public final void d(vtj vtjVar) {
        this.c = vtjVar;
    }
}
