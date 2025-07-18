package defpackage;

import android.accounts.Account;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class irj extends agtu implements agvb {
    int a;
    final /* synthetic */ iax b;
    final /* synthetic */ Account c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public irj(iax iaxVar, Account account, agsw agswVar) {
        super(2, agswVar);
        this.b = iaxVar;
        this.c = account;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((irj) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            iax iaxVar = this.b;
            Account account = this.c;
            Intent intentA = irk.a.a();
            this.a = 1;
            if (iaxVar.i(account, true, intentA, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new irj(this.b, this.c, agswVar);
    }
}
