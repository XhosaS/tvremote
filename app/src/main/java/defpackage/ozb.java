package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ozb extends agtq {
    /* synthetic */ Object a;
    final /* synthetic */ ozi b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ozb(ozi oziVar, agsw agswVar) {
        super(agswVar);
        this.b = oziVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objS = ozi.s(this.b, null, this);
        return objS == agtg.a ? objS : new agpk(objS);
    }
}
