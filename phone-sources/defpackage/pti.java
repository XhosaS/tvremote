package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pti extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ ptj b;
    int c;
    ptf d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pti(ptj ptjVar, yih yihVar) {
        super(yihVar);
        this.b = ptjVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return ptj.e(this.b, null, null, this);
    }
}
