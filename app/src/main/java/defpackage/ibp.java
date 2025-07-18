package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ibp extends agtu implements agvb {
    int a;
    final /* synthetic */ icd b;
    final /* synthetic */ Account c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibp(icd icdVar, Account account, String str, agsw agswVar) {
        super(2, agswVar);
        this.b = icdVar;
        this.c = account;
        this.d = str;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ibp) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws Throwable {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        icd icdVar = this.b;
        Account account = this.c;
        String str = this.d;
        this.a = 1;
        Object objT = icdVar.t(account, str, this);
        return objT == agtgVar ? agtgVar : objT;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new ibp(this.b, this.c, this.d, agswVar);
    }
}
