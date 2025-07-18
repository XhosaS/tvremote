package defpackage;

import android.accounts.Account;
import com.google.android.libraries.geller.portable.Geller;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.collect.Sets;
import j$.util.Collection;
import j$.util.function.Function$CC;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tcb implements tbx {
    public static final zdy a = zdy.h("com/google/android/libraries/search/geller/background/GellerBatchRefreshExecutorImpl");
    public final yzq b;
    private final vrf c;
    private final vjo d;
    private final wlm e;
    private final zyg f;

    public tcb(final tbw tbwVar, vjo vjoVar, wlm wlmVar, zyg zygVar, acfm acfmVar) {
        tbwVar.getClass();
        this.c = new vrf(new zvh() { // from class: tbz
            @Override // defpackage.zvh
            public final zyd a() {
                final tbw tbwVar2 = tbwVar;
                return zuz.g(tbwVar2.c.a.b(), wyo.a(new yqi() { // from class: tbv
                    @Override // defpackage.yqi
                    public final Object apply(Object obj) {
                        Geller geller = (Geller) obj;
                        final tbw tbwVar3 = tbwVar2;
                        olr olrVar = new olr(geller, tbwVar3.h, tbwVar3.e, tbwVar3.i, tbwVar3.j, tbwVar3.k);
                        olrVar.d = new yqi() { // from class: tbt
                            @Override // defpackage.yqi
                            public final Object apply(Object obj2) {
                                String str = (String) obj2;
                                if (str == null) {
                                    return null;
                                }
                                return (omj) tbwVar3.d.get(str);
                            }
                        };
                        olrVar.i = new yqi() { // from class: tbu
                            @Override // defpackage.yqi
                            public final Object apply(Object obj2) {
                                String str = (String) obj2;
                                if (str == null) {
                                    return null;
                                }
                                return (oir) tbwVar3.l.get(str);
                            }
                        };
                        olrVar.j = tbwVar3.o;
                        olrVar.b = tbwVar3.f;
                        olrVar.r = tbwVar3.p;
                        olrVar.m = tbwVar3.g;
                        olm olmVarI = oln.i();
                        olmVarI.c(tbwVar3.m);
                        olmVarI.i((int) tbwVar3.n);
                        olmVarI.g(tbw.a);
                        abwf abwfVar = tbw.b;
                        acbg.e(abwfVar);
                        olmVarI.h(abwfVar);
                        olmVarI.d();
                        olmVarI.f();
                        olmVarI.e();
                        olmVarI.b();
                        olrVar.n = olmVarI.a();
                        return olrVar.a();
                    }
                }), tbwVar2.i);
            }
        }, zygVar);
        this.d = vjoVar;
        this.e = wlmVar;
        this.f = zygVar;
        this.b = (yzq) Collection.EL.stream(acfmVar.b).map(new Function() { // from class: tca
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo116andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return acgd.b(((Integer) obj).intValue());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(ywk.b);
    }

    @Override // defpackage.tbx
    public final zyd a(AccountId accountId, final String str, final yzq yzqVar, final achm achmVar) {
        vrf vrfVar = this.c;
        wlm wlmVar = this.e;
        vjo vjoVar = this.d;
        final ypv ypvVar = ypv.a;
        final zyd zydVarA = vjoVar.a(accountId);
        final zyd zydVarA2 = wlmVar.a(accountId);
        final zyd zydVarB = vrfVar.b();
        return zxn.d(zydVarA, zydVarA2, zydVarB).b(wyo.b(new zvh() { // from class: tby
            @Override // defpackage.zvh
            public final zyd a() {
                yzq yzqVarF = Sets.c(yzqVar, this.a.b).f();
                if (yzqVarF.isEmpty()) {
                    return zxn.h(zcl.a);
                }
                zyd zydVar = zydVarB;
                zyd zydVar2 = zydVarA2;
                zyd zydVar3 = zydVarA;
                ((zdv) ((zdv) tcb.a.b()).q("com/google/android/libraries/search/geller/background/GellerBatchRefreshExecutorImpl", "privateSyncInternal", 254, "GellerBatchRefreshExecutorImpl.java")).x("Attempting to cache the data for enabled corpora %s.", yzqVarF);
                Account account = (Account) zxn.o(zydVar3);
                String str2 = ((wll) zxn.o(zydVar2)).a;
                ols olsVar = (ols) zxn.o(zydVar);
                try {
                    ysm ysmVar = olsVar.a;
                    yqt yqtVarH = yqt.h(account);
                    yug yugVar = ((yti) ysmVar).a;
                    olt oltVar = (olt) yugVar.d(yqtVarH, yugVar.r);
                    yqt yqtVar = ypvVar;
                    return oltVar.b(str2, str, yzqVarF, achmVar, yqtVar);
                } catch (ExecutionException | zzd e) {
                    zdl it = yzqVarF.iterator();
                    while (it.hasNext()) {
                        olsVar.b.d(((acgd) it.next()).name(), "SYNC_SCHEDULER_LOAD_FAILURE");
                    }
                    return zxn.g(new oll("Failed to load GellerSyncScheduler", e));
                }
            }
        }), this.f);
    }
}
