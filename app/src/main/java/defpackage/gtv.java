package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gtv extends agtu implements agvb {
    int a;
    final /* synthetic */ gtw b;
    final /* synthetic */ String c;
    final /* synthetic */ String d = "";
    final /* synthetic */ String e = "";
    final /* synthetic */ fwx f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtv(gtw gtwVar, String str, fwx fwxVar, agsw agswVar) {
        super(2, agswVar);
        this.b = gtwVar;
        this.c = str;
        this.f = fwxVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gtv) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            gtw gtwVar = this.b;
            String str = this.c;
            String str2 = this.d;
            String str3 = this.e;
            fwx fwxVar = this.f;
            this.a = 1;
            if (gtwVar.a.l(str, str2, str3, fwxVar, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gtv(this.b, this.c, this.f, agswVar);
    }
}
