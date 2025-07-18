package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class icy extends agtu implements agvb {
    int a;
    final /* synthetic */ icz b;
    final /* synthetic */ boolean c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icy(icz iczVar, boolean z, String str, agsw agswVar) {
        super(2, agswVar);
        this.b = iczVar;
        this.c = z;
        this.d = str;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((icy) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            icz iczVar = this.b;
            boolean z = this.c;
            String str = this.d;
            this.a = 1;
            if (iczVar.a.a(z, str, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new icy(this.b, this.c, this.d, agswVar);
    }
}
