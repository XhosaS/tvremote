package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gue extends agtu implements agvb {
    int a;
    final /* synthetic */ gva b;
    final /* synthetic */ Account c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gue(gva gvaVar, Account account, agsw agswVar) {
        super(2, agswVar);
        this.b = gvaVar;
        this.c = account;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gue) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws Throwable {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            if (i == 1) {
            }
            int i2 = gva.d;
            return new agpk((String) obj);
        }
        gva gvaVar = this.b;
        gud gudVar = new gud(gvaVar, this.c, null);
        this.a = 1;
        obj = ahal.a(gvaVar.a, gudVar, this);
        if (obj == agtgVar) {
            return agtgVar;
        }
        obj.getClass();
        this.a = 2;
        obj = ahnw.a((lvf) obj, this);
        if (obj == agtgVar) {
            return agtgVar;
        }
        int i22 = gva.d;
        return new agpk((String) obj);
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gue(this.b, this.c, agswVar);
    }
}
