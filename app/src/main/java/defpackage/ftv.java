package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ftv extends agtu implements agvb {
    int a;
    final /* synthetic */ ftw b;
    final /* synthetic */ String c;
    final /* synthetic */ fws d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ftv(ftw ftwVar, String str, fws fwsVar, agsw agswVar) {
        super(2, agswVar);
        this.b = ftwVar;
        this.c = str;
        this.d = fwsVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ftv) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            ftw ftwVar = this.b;
            String str = this.c;
            fws fwsVar = this.d;
            this.a = 1;
            if (ftwVar.a.b(str, fwsVar, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new ftv(this.b, this.c, this.d, agswVar);
    }
}
