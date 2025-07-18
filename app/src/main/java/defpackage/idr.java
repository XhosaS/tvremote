package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
final class idr extends agtu implements agvb {
    int a;
    final /* synthetic */ idt b;
    final /* synthetic */ agwh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public idr(idt idtVar, agwh agwhVar, agsw agswVar) {
        super(2, agswVar);
        this.b = idtVar;
        this.c = agwhVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((idr) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            idt idtVar = this.b;
            String str = ((Account) this.c.a).name;
            str.getClass();
            this.a = 1;
            if (idtVar.b.g(str, this) == agtgVar) {
                return agtgVar;
            }
        }
        this.b.M();
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new idr(this.b, this.c, agswVar);
    }
}
