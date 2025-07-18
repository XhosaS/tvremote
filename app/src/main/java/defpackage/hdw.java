package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hdw extends agtu implements agvb {
    final /* synthetic */ hec a;
    final /* synthetic */ Account b;
    final /* synthetic */ ymg c;
    final /* synthetic */ hdy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hdw(hec hecVar, Account account, ymg ymgVar, hdy hdyVar, agsw agswVar) {
        super(2, agswVar);
        this.a = hecVar;
        this.b = account;
        this.c = ymgVar;
        this.d = hdyVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hdw) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        ymg ymgVar = this.c;
        ymgVar.getClass();
        this.a.b.o(this.b, ymgVar, this.d, "AsstSliceDataHelper");
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new hdw(this.a, this.b, this.c, this.d, agswVar);
    }
}
