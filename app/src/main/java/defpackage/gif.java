package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gif extends agtu implements agvb {
    int a;
    final /* synthetic */ gkh b;
    final /* synthetic */ zpg c;
    final /* synthetic */ zlv d;
    final /* synthetic */ String e;
    final /* synthetic */ abnb f;
    final /* synthetic */ String g;
    final /* synthetic */ agvb h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gif(gkh gkhVar, zpg zpgVar, zlv zlvVar, String str, abnb abnbVar, String str2, agvb agvbVar, agsw agswVar) {
        super(2, agswVar);
        this.b = gkhVar;
        this.c = zpgVar;
        this.d = zlvVar;
        this.e = str;
        this.f = abnbVar;
        this.g = str2;
        this.h = agvbVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gif) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            gkh gkhVar = this.b;
            zpg zpgVar = this.c;
            zlv zlvVar = this.d;
            String str = this.e;
            abnb abnbVar = this.f;
            String str2 = this.g;
            agvb agvbVar = this.h;
            this.a = 1;
            if (gkhVar.ak(zpgVar, zlvVar, str, abnbVar, str2, agvbVar, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gif(this.b, this.c, this.d, this.e, this.f, this.g, this.h, agswVar);
    }
}
