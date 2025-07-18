package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jgv extends agtu implements agvb {
    int a;
    final /* synthetic */ jhh b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgv(jhh jhhVar, boolean z, agsw agswVar) {
        super(2, agswVar);
        this.b = jhhVar;
        this.c = z;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jgv) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            jhh jhhVar = this.b;
            jhhVar.R = this.c;
            this.a = 1;
            if (jhhVar.h(this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new jgv(this.b, this.c, agswVar);
    }
}
