package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iqq extends agtu implements agvb {
    int a;
    final /* synthetic */ iqz b;
    final /* synthetic */ Account c;
    final /* synthetic */ aedy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqq(iqz iqzVar, Account account, aedy aedyVar, agsw agswVar) {
        super(2, agswVar);
        this.b = iqzVar;
        this.c = account;
        this.d = aedyVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((iqq) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            iqz iqzVar = this.b;
            Account account = this.c;
            aedy aedyVar = this.d;
            this.a = 1;
            if (iqzVar.b(account, aedyVar, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new iqq(this.b, this.c, this.d, agswVar);
    }
}
