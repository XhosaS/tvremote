package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gcb extends agtu implements agvb {
    int a;
    final /* synthetic */ gcc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcb(gcc gccVar, agsw agswVar) {
        super(2, agswVar);
        this.b = gccVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gcb) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            gcc gccVar = this.b;
            this.a = 1;
            obj = gccVar.b.a(this);
            if (obj == agtgVar) {
                return agtgVar;
            }
        }
        if (obj == foc.TOGGLE_ON) {
            this.b.e();
        } else {
            this.b.d();
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gcb(this.b, agswVar);
    }
}
