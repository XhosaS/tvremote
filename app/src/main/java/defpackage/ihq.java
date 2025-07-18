package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ihq extends agtu implements agvb {
    int a;
    final /* synthetic */ iht b;
    final /* synthetic */ Account c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ihq(iht ihtVar, Account account, agsw agswVar) {
        super(2, agswVar);
        this.b = ihtVar;
        this.c = account;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ihq) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        iht ihtVar = this.b;
        Account account = this.c;
        this.a = 1;
        Object objF = ihtVar.f(account, this);
        return objF == agtgVar ? agtgVar : objF;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new ihq(this.b, this.c, agswVar);
    }
}
