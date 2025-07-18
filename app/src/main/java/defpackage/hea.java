package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hea extends agtu implements agvb {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ hec c;
    final /* synthetic */ Account d;
    final /* synthetic */ heb e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hea(boolean z, hec hecVar, Account account, heb hebVar, agsw agswVar) {
        super(2, agswVar);
        this.b = z;
        this.c = hecVar;
        this.d = account;
        this.e = hebVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hea) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            agte agteVarFs = ((ahbt) this.f).fs();
            hdz hdzVar = new hdz(this.b, this.c, this.d, this.e, null);
            this.a = 1;
            if (ahal.a(agteVarFs, hdzVar, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        hea heaVar = new hea(this.b, this.c, this.d, this.e, agswVar);
        heaVar.f = obj;
        return heaVar;
    }
}
