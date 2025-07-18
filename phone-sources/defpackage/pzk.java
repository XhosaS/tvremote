package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pzk extends yiv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ pzn c;
    int d;
    ulp e;
    ulp f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pzk(pzn pznVar, yih yihVar) {
        super(yihVar);
        this.c = pznVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
