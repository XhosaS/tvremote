package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qgz extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ qha b;
    int c;
    qgw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qgz(qha qhaVar, yih yihVar) {
        super(yihVar);
        this.b = qhaVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(null, this);
    }
}
