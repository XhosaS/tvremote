package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ion extends agtu implements agvb {
    int a;
    final /* synthetic */ ioo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ion(ioo iooVar, agsw agswVar) {
        super(2, agswVar);
        this.b = iooVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ion) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        String str;
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            ioo iooVar = this.b;
            Account accountC = iooVar.f.c();
            if (accountC == null || (str = accountC.name) == null) {
                str = "";
            }
            fze fzeVar = iooVar.e;
            this.a = 1;
            if (fzw.f((fzw) fzeVar, str, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new ion(this.b, agswVar);
    }
}
