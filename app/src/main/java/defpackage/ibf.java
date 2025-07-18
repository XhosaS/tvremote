package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ibf extends agtu implements agvb {
    int a;
    final /* synthetic */ icd b;
    final /* synthetic */ ymc c;
    final /* synthetic */ Account d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibf(icd icdVar, ymc ymcVar, Account account, String str, agsw agswVar) {
        super(2, agswVar);
        this.b = icdVar;
        this.c = ymcVar;
        this.d = account;
        this.e = str;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ibf) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            icd icdVar = this.b;
            ymc ymcVar = this.c;
            String str = this.d.name;
            str.getClass();
            String str2 = this.e;
            this.a = 1;
            if (icdVar.r(ymcVar, str, str2, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new ibf(this.b, this.c, this.d, this.e, agswVar);
    }
}
