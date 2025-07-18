package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dto extends yiv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ dts c;
    int d;
    String e;
    yyk f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dto(dts dtsVar, yih yihVar) {
        super(yihVar);
        this.c = dtsVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(null, null, this);
    }
}
