package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gmh extends agtu implements agvb {
    int a;
    final /* synthetic */ gmi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmh(gmi gmiVar, agsw agswVar) {
        super(2, agswVar);
        this.b = gmiVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gmh) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        String str;
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            gmi gmiVar = this.b;
            this.a = 1;
            obj = gmiVar.a.j(this);
            if (obj == agtgVar) {
                return agtgVar;
            }
        }
        Account account = (Account) obj;
        return (account == null || (str = account.name) == null) ? ypv.a : yqt.h(str);
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gmh(this.b, agswVar);
    }
}
