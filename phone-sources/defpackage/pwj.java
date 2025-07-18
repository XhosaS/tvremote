package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pwj extends yiv {
    Object a;
    long b;
    /* synthetic */ Object c;
    final /* synthetic */ pwl d;
    int e;
    qen f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pwj(pwl pwlVar, yih yihVar) {
        super(yihVar);
        this.d = pwlVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.f(null, this);
    }
}
