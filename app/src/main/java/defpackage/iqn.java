package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iqn extends agtu implements agvb {
    int a;
    final /* synthetic */ iqz b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ Account e;
    final /* synthetic */ aedy f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqn(iqz iqzVar, String str, String str2, Account account, aedy aedyVar, agsw agswVar) {
        super(2, agswVar);
        this.b = iqzVar;
        this.c = str;
        this.d = str2;
        this.e = account;
        this.f = aedyVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((iqn) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            iqz iqzVar = this.b;
            String str = this.c;
            String str2 = this.d;
            Account account = this.e;
            aedy aedyVar = this.f;
            this.a = 1;
            if (iqzVar.c(str, str2, account, aedyVar, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new iqn(this.b, this.c, this.d, this.e, this.f, agswVar);
    }
}
