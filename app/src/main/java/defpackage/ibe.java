package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ibe extends agtu implements agvb {
    int a;
    final /* synthetic */ icd b;
    final /* synthetic */ Account c;
    final /* synthetic */ ymc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibe(icd icdVar, Account account, ymc ymcVar, agsw agswVar) {
        super(2, agswVar);
        this.b = icdVar;
        this.c = account;
        this.d = ymcVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ibe) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            icd icdVar = this.b;
            String str = this.c.name;
            str.getClass();
            yni yniVar = this.d.h;
            if (yniVar == null) {
                yniVar = yni.a;
            }
            ynh ynhVarB = ynh.b(yniVar.e);
            if (ynhVarB == null) {
                ynhVarB = ynh.UNSPECIFIED;
            }
            frl frlVar = icdVar.f;
            ynhVarB.getClass();
            this.a = 1;
            if (frlVar.k(str, ynhVarB, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new ibe(this.b, this.c, this.d, agswVar);
    }
}
