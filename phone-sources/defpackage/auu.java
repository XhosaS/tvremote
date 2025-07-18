package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class auu extends yiz implements ykb {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ auv d;
    final /* synthetic */ float e;
    final /* synthetic */ np f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auu(auv auvVar, float f, np npVar, yih yihVar) {
        super(4, yihVar);
        this.d = auvVar;
        this.e = f;
        this.f = npVar;
    }

    @Override // defpackage.ykb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        auu auuVar = new auu(this.d, this.e, this.f, (yih) obj4);
        auuVar.g = (pku) obj;
        auuVar.b = (ayv) obj2;
        auuVar.c = (auw) obj3;
        return auuVar.invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        yio yioVar = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i == 0) {
            Object obj2 = this.g;
            float fB = ((ayv) this.b).b(this.c);
            if (!Float.isNaN(fB)) {
                ylc ylcVar = new ylc();
                auv auvVar = this.d;
                float fA = Float.isNaN(auvVar.a()) ? 0.0f : auvVar.a();
                ylcVar.a = fA;
                float f = this.e;
                np npVar = this.f;
                aaw aawVar = new aaw(obj2, ylcVar, 4, null);
                this.g = null;
                this.b = null;
                this.a = 1;
                if (og.h(fA, fB, f, npVar, aawVar, this) == yioVar) {
                    return yioVar;
                }
            }
        }
        return ygi.a;
    }
}
