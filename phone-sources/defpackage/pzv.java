package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pzv extends yiv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ pzx c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pzv(pzx pzxVar, yih yihVar) {
        super(yihVar);
        this.c = pzxVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.f(null, 0, null, null, null, null, this);
    }
}
