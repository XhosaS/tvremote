package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gvl extends agtu implements agvb {
    int a;
    final /* synthetic */ gvn b;
    final /* synthetic */ Account c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gvl(gvn gvnVar, Account account, agsw agswVar) {
        super(2, agswVar);
        this.b = gvnVar;
        this.c = account;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gvl) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws Throwable {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            agte agteVarFs = ((ahbt) this.d).fs();
            gvk gvkVar = new gvk(this.b, this.c, null);
            this.a = 1;
            obj = ahal.a(agteVarFs, gvkVar, this);
            if (obj != agtgVar) {
            }
        }
        if (i != 1) {
            return obj;
        }
        obj.getClass();
        this.a = 2;
        Object objA = ahnw.a((lvf) obj, this);
        return objA == agtgVar ? agtgVar : objA;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        gvl gvlVar = new gvl(this.b, this.c, agswVar);
        gvlVar.d = obj;
        return gvlVar;
    }
}
