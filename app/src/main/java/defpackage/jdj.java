package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jdj extends agtu implements agvb {
    int a;
    final /* synthetic */ jdn b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdj(jdn jdnVar, boolean z, agsw agswVar) {
        super(2, agswVar);
        this.b = jdnVar;
        this.c = z;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jdj) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            jdn jdnVar = this.b;
            boolean z = this.c;
            this.a = 1;
            int i2 = jdn.e;
            if (jdnVar.c(z, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new jdj(this.b, this.c, agswVar);
    }
}
