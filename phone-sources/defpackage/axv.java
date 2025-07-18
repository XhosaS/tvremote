package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axv extends yiz implements ykb {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ ayd d;
    final /* synthetic */ float e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axv(ayd aydVar, float f, yih yihVar) {
        super(4, yihVar);
        this.d = aydVar;
        this.e = f;
    }

    @Override // defpackage.ykb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        axv axvVar = new axv(this.d, this.e, (yih) obj4);
        axvVar.f = (pku) obj;
        axvVar.b = (ayv) obj2;
        axvVar.c = obj3;
        return axvVar.invokeSuspend(ygi.a);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, my] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        yio yioVar = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i == 0) {
            Object obj2 = this.f;
            float fB = ((ayv) this.b).b(this.c);
            if (!Float.isNaN(fB)) {
                ylc ylcVar = new ylc();
                ayd aydVar = this.d;
                float fB2 = Float.isNaN(aydVar.b()) ? 0.0f : aydVar.b();
                ylcVar.a = fB2;
                float f = this.e;
                ?? A = aydVar.a.a();
                aaw aawVar = new aaw(obj2, ylcVar, 5, null);
                this.f = null;
                this.b = null;
                this.a = 1;
                if (og.h(fB2, fB, f, A, aawVar, this) == yioVar) {
                    return yioVar;
                }
            }
        }
        return ygi.a;
    }
}
