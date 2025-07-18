package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jgc extends agtu implements agvb {
    int a;
    final /* synthetic */ jhh b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgc(jhh jhhVar, boolean z, boolean z2, agsw agswVar) {
        super(2, agswVar);
        this.b = jhhVar;
        this.c = z;
        this.d = z2;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jgc) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            jhh jhhVar = this.b;
            boolean z = this.c;
            boolean z2 = this.d;
            this.a = 1;
            if (jhhVar.g(z, z2, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new jgc(this.b, this.c, this.d, agswVar);
    }
}
