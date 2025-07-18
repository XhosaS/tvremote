package defpackage;

import android.accounts.Account;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iay extends agtu implements agvb {
    int a;
    final /* synthetic */ iba b;
    final /* synthetic */ Account c;
    final /* synthetic */ boolean d;
    final /* synthetic */ Intent e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iay(iba ibaVar, Account account, boolean z, Intent intent, agsw agswVar) {
        super(2, agswVar);
        this.b = ibaVar;
        this.c = account;
        this.d = z;
        this.e = intent;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((iay) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
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
            Intent intent = this.e;
            this.a = 1;
            if (ibaVar.a.i(account, z, intent, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new iay(this.b, this.c, this.d, this.e, agswVar);
    }
}
