package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dtq extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ dts b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtq(dts dtsVar, yih yihVar) {
        super(yihVar);
        this.b = dtsVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, null, null, this);
    }
}
