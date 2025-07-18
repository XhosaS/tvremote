package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pxq extends yiv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ pxs c;
    int d;
    pxs e;
    qen f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pxq(pxs pxsVar, yih yihVar) {
        super(yihVar);
        this.c = pxsVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return pxs.c(this.c, null, null, 0L, null, false, this);
    }
}
