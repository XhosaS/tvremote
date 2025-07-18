package defpackage;

import android.accounts.Account;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ibz extends agtu implements agvb {
    int a;
    final /* synthetic */ icd b;
    final /* synthetic */ Account c;
    final /* synthetic */ ymg d;
    final /* synthetic */ String e;
    final /* synthetic */ zxe f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibz(icd icdVar, Account account, ymg ymgVar, String str, zxe zxeVar, agsw agswVar) {
        super(2, agswVar);
        this.b = icdVar;
        this.c = account;
        this.d = ymgVar;
        this.e = str;
        this.f = zxeVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ibz) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws Throwable {
        Object objJ;
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            objJ = ((agpk) obj).a;
        } else {
            icd icdVar = this.b;
            Account account = this.c;
            ymg ymgVar = this.d;
            String str = this.e;
            this.a = 1;
            objJ = icdVar.j(account, ymgVar, str, this);
            if (objJ == agtgVar) {
                return agtgVar;
            }
        }
        zxe zxeVar = this.f;
        Throwable thA = agpk.a(objJ);
        if (thA == null) {
            zxeVar.b(Optional.ofNullable((ymi) objJ));
        } else {
            zxeVar.a(thA);
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new ibz(this.b, this.c, this.d, this.e, this.f, agswVar);
    }
}
