package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dsm extends yiv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ dsn c;
    int d;
    yrr e;
    gk f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsm(dsn dsnVar, yih yihVar) {
        super(yihVar);
        this.c = dsnVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.n(null, null, this);
    }
}
