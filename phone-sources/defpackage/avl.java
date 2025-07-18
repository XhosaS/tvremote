package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avl extends yiz implements yka {
    /* synthetic */ long a;
    final /* synthetic */ avn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avl(avn avnVar, yih yihVar) {
        super(3, yihVar);
        this.b = avnVar;
    }

    @Override // defpackage.yka
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        long j = ((bmx) obj2).a;
        avl avlVar = new avl(this.b, (yih) obj3);
        avlVar.a = j;
        return avlVar.invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        float fG;
        ybn.f(obj);
        long j = this.a;
        avn avnVar = this.b;
        if (avnVar.e == uv.a) {
            fG = Float.intBitsToFloat((int) (j & 4294967295L));
        } else {
            int i = (int) (j >> 32);
            fG = avnVar.d ? avnVar.g() - Float.intBitsToFloat(i) : Float.intBitsToFloat(i);
        }
        avnVar.j(fG - avnVar.c());
        return ygi.a;
    }
}
