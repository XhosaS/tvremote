package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hed extends agtu implements agvb {
    int a;
    final /* synthetic */ hee b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hed(hee heeVar, String str, agsw agswVar) {
        super(2, agswVar);
        this.b = heeVar;
        this.c = str;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hed) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            hee heeVar = this.b;
            gyx[] gyxVarArr = {gyx.r};
            this.a = 1;
            if (heeVar.b.g(gyxVarArr, this) == agtgVar) {
                return agtgVar;
            }
        }
        hee heeVar2 = this.b;
        Account accountA = heeVar2.a.a(this.c);
        if (accountA != null) {
            heeVar2.d(accountA);
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new hed(this.b, this.c, agswVar);
    }
}
