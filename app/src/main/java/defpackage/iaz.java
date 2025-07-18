package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iaz extends agtu implements agvb {
    int a;
    final /* synthetic */ iba b;
    final /* synthetic */ Account c;
    final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iaz(iba ibaVar, Account account, boolean z, agsw agswVar) {
        super(2, agswVar);
        this.b = ibaVar;
        this.c = account;
        this.d = z;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((iaz) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            iba ibaVar = this.b;
            Account account = this.c;
            boolean z = this.d;
            this.a = 1;
            if (ibaVar.a.i(account, z, null, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new iaz(this.b, this.c, this.d, agswVar);
    }
}
