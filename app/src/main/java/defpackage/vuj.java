package defpackage;

import android.content.Context;
import com.google.apps.tiktok.account.AccountId;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vuj extends vsz {
    public final vtz a;
    public final vvf b;
    private final Context c;
    private final Executor d;
    private final zyg e;

    public vuj(Context context, vtz vtzVar, vvf vvfVar, Executor executor, zyg zygVar) {
        this.c = context;
        this.a = vtzVar;
        this.b = vvfVar;
        this.d = executor;
        this.e = zygVar;
    }

    @Override // defpackage.vsz
    public final zyd a(final AccountId accountId, final UUID uuid) {
        zyd zydVarE = this.a.e(ccu.a.a(uuid));
        yqi yqiVarA = wyo.a(new yqi() { // from class: vud
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                List list = (List) obj;
                if (list.isEmpty()) {
                    throw new NoSuchElementException("Work ID not found");
                }
                yqw.M(accountId.equals(vvv.a(((ccr) zag.f(list)).c)), "Work cancelled by ID was started with a different account ID than it was cancelled with.");
                return null;
            }
        });
        zyg zygVar = this.e;
        return d(accountId).b(zuz.g(zuz.h(zuz.g(zydVarE, yqiVarA, zygVar), wyo.c(new zvi() { // from class: vue
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                return this.a.a.c(uuid);
            }
        }), zygVar), wyo.a(new yqi() { // from class: vuf
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return null;
            }
        }), zygVar));
    }

    @Override // defpackage.vsz
    public final zyd b(final AccountId accountId, vts vtsVar) {
        vwd.c(vtsVar);
        vvf vvfVar = this.b;
        final vts vtsVarE = vvfVar.e(vtsVar);
        final vts vtsVarO = vtsVarE.o(yzq.q("tiktok_account_work", vvv.b(accountId)));
        yqt yqtVar = ((vtc) vtsVarO).h;
        if (yqtVar.g()) {
            vtf vtfVar = new vtf("unique_" + ((vtf) yqtVar.c()).a + vvv.b(accountId), ((vtf) yqtVar.c()).b);
            vtb vtbVar = new vtb(vtsVarO);
            vtbVar.g = yqt.i(vtfVar);
            vtsVarO = vtbVar.b();
        }
        Executor executor = this.d;
        vto vtoVarN = vts.n(vvs.class);
        vtb vtbVar2 = (vtb) vtoVarN;
        vtbVar2.f = yqt.i(new vtd(new vte(3L, TimeUnit.DAYS), yqt.i(new vte(1L, TimeUnit.DAYS))));
        vtbVar2.g = yqt.i(new vtf("tiktok_wipeout_worker", 2));
        cao caoVar = new cao();
        caoVar.a = true;
        vtbVar2.b = caoVar.a();
        zyd zydVarC = vvfVar.c(vtoVarN.b());
        zxn.p(zydVarC, wyo.f(vvs.b), executor);
        return zuz.h(zydVarC, wyo.c(new zvi() { // from class: vug
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                vuj vujVar = this.a;
                return vujVar.d(accountId).a(vujVar.b.f(vtsVarO));
            }
        }), executor);
    }

    @Override // defpackage.vsz
    public final zyd c(final AccountId accountId, UUID uuid) {
        return zuz.g(this.a.e(ccu.a.a(uuid)), wyo.a(new yqi() { // from class: vuh
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                List list = (List) obj;
                if (list.isEmpty()) {
                    throw new NoSuchElementException("Work ID not found");
                }
                AccountId accountId2 = accountId;
                ccr ccrVar = (ccr) zag.f(list);
                yqw.M(accountId2.equals(vvv.a(ccrVar.c)), "Work gotten by ID was started with a different account ID than it was queried with.");
                return ccrVar;
            }
        }), this.e);
    }

    public final vtv d(AccountId accountId) {
        return ((vui) wgv.a(this.c, vui.class, accountId)).k();
    }
}
