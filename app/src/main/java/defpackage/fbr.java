package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fbr extends agtu implements agvb {
    int a;
    final /* synthetic */ fbv b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fbr(fbv fbvVar, String str, String str2, agsw agswVar) {
        super(2, agswVar);
        this.b = fbvVar;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fbr) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            fbv fbvVar = this.b;
            String str = this.c;
            String str2 = this.d;
            this.a = 1;
            if (fbvVar.d.o(str, str2, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fbr(this.b, this.c, this.d, agswVar);
    }
}
