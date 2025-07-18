package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dsq extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ dss b;
    int c;
    String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsq(dss dssVar, yih yihVar) {
        super(yihVar);
        this.b = dssVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, null, this);
    }
}
