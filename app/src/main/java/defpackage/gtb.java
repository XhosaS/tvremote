package defpackage;

import android.accounts.Account;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gtb extends agtu implements agvb {
    int a;
    final /* synthetic */ gtd b;
    final /* synthetic */ Account c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtb(gtd gtdVar, Account account, agsw agswVar) {
        super(2, agswVar);
        this.b = gtdVar;
        this.c = account;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gtb) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws Throwable {
        zyd zydVarH;
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        gtd gtdVar = this.b;
        final String str = gtf.a(this.c).b;
        Context context = gtdVar.c;
        final String strA = aeoy.a(context);
        final rfr rfrVarA = rfr.a(context);
        if (rfrVarA == null) {
            rfr.g();
            yqw.L(false);
            zydVarH = zxy.a;
        } else {
            rld rldVar = (rld) rld.a(rfrVarA.d).get(strA);
            if (rldVar == null) {
                zydVarH = zxn.g(new IllegalStateException(a.e(strA, "Config package", "does not use declarative registration. See go/phenotype-android-integration#phenotype for more information.")));
            } else {
                rni rniVar = rfrVarA.f;
                final rmw rmwVar = new rmw(rfrVarA, strA, str, rldVar.c);
                zydVarH = zuz.h(zuz.g(zud.g(zwx.u(rniVar.d(false)), Throwable.class, new yqi() { // from class: rmn
                    @Override // defpackage.yqi
                    public final Object apply(Object obj2) {
                        return null;
                    }
                }, rfrVarA.e()), new yqi() { // from class: rmo
                    @Override // defpackage.yqi
                    public final Object apply(Object obj2) {
                        return rmwVar.a();
                    }
                }, rfrVarA.e()), new zvi() { // from class: rmp
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        if (!((rmv) obj2).a) {
                            return zxy.a;
                        }
                        final rmw rmwVar2 = rmwVar;
                        String str2 = str;
                        String str3 = strA;
                        rfr rfrVar = rfrVarA;
                        return zuz.h(zwx.u(rfrVar.b().i(str3, str2)), new zvi() { // from class: rmm
                            @Override // defpackage.zvi
                            public final zyd a(Object obj3) {
                                return rmwVar2.d(rmw.b((rgu) obj3));
                            }
                        }, rfrVar.e());
                    }
                }, rfrVarA.e());
            }
        }
        this.a = 1;
        Object objB = ahkr.b(zydVarH, this);
        return objB == agtgVar ? agtgVar : objB;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gtb(this.b, this.c, agswVar);
    }
}
