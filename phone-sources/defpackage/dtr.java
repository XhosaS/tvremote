package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dtr extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ dts b;
    int c;
    ale d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtr(dts dtsVar, yih yihVar) {
        super(yihVar);
        this.b = dtsVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, null, null, null, this);
    }
}
