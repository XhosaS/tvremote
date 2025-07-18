package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hdt extends agtu implements agvb {
    int a;
    final /* synthetic */ hec b;
    final /* synthetic */ Account c;
    final /* synthetic */ yme d;
    final /* synthetic */ hdu e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hdt(hec hecVar, Account account, yme ymeVar, hdu hduVar, agsw agswVar) {
        super(2, agswVar);
        this.b = hecVar;
        this.c = account;
        this.d = ymeVar;
        this.e = hduVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hdt) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            agte agteVarFs = ((ahbt) this.f).fs();
            hds hdsVar = new hds(this.b, this.c, this.d, this.e, null);
            this.a = 1;
            if (ahal.a(agteVarFs, hdsVar, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        hdt hdtVar = new hdt(this.b, this.c, this.d, this.e, agswVar);
        hdtVar.f = obj;
        return hdtVar;
    }
}
