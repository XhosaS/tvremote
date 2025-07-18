package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qsj extends yiv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ qsk c;
    int d;
    vjq e;
    vjr f;
    qen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qsj(qsk qskVar, yih yihVar) {
        super(yihVar);
        this.c = qskVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, null, null, this);
    }
}
