package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ptz extends yiv {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ pub c;
    int d;
    vmj e;
    vhi f;
    qen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ptz(pub pubVar, yih yihVar) {
        super(yihVar);
        this.c = pubVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.f(null, null, null, null, this);
    }
}
