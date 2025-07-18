package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dsr extends yiv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ dss c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsr(dss dssVar, yih yihVar) {
        super(yihVar);
        this.c = dssVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, null, this);
    }
}
