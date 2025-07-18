package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ptg extends yiv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ ptj c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ptg(ptj ptjVar, yih yihVar) {
        super(yihVar);
        this.c = ptjVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return ptj.d(this.c, null, null, this);
    }
}
