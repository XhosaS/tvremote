package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gab extends agtu implements agvb {
    int a;
    final /* synthetic */ gae b;
    final /* synthetic */ Account c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gab(gae gaeVar, Account account, String str, String str2, agsw agswVar) {
        super(2, agswVar);
        this.b = gaeVar;
        this.c = account;
        this.d = str;
        this.e = str2;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gab) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        gae gaeVar = this.b;
        Account account = this.c;
        String str = this.d;
        String str2 = this.e;
        this.a = 1;
        Object objC = gaeVar.c(account, str, str2, this);
        return objC == agtgVar ? agtgVar : objC;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gab(this.b, this.c, this.d, this.e, agswVar);
    }
}
