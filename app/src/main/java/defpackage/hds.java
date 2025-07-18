package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hds extends agtu implements agvb {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ hec f;
    final /* synthetic */ Account g;
    final /* synthetic */ yme h;
    final /* synthetic */ hdu i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hds(hec hecVar, Account account, yme ymeVar, hdu hduVar, agsw agswVar) {
        super(2, agswVar);
        this.f = hecVar;
        this.g = account;
        this.h = ymeVar;
        this.i = hduVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hds) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    @Override // defpackage.agto
    public final Object b(Object obj) {
        Object obj2;
        yme ymeVar;
        String str;
        iax iaxVar;
        agtg agtgVar = agtg.a;
        if (this.e != 0) {
            ymeVar = this.d;
            str = this.c;
            obj2 = this.b;
            ?? r3 = this.a;
            agpl.b(obj);
            iaxVar = r3;
        } else {
            agpl.b(obj);
            hec hecVar = this.f;
            obj2 = this.g;
            yme ymeVar2 = this.h;
            iax iaxVar2 = hecVar.b;
            this.a = iaxVar2;
            this.b = obj2;
            this.c = "AsstSliceDataHelper";
            this.d = ymeVar2;
            this.e = 1;
            obj = hecVar.c.e(this);
            if (obj == agtgVar) {
                return agtgVar;
            }
            ymeVar = ymeVar2;
            str = "AsstSliceDataHelper";
            iaxVar = iaxVar2;
        }
        Account account = (Account) obj2;
        String str2 = str;
        yme ymeVar3 = ymeVar;
        iaxVar.p(account, str2, ymeVar3, (String) obj, this.i);
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new hds(this.f, this.g, this.h, this.i, agswVar);
    }
}
