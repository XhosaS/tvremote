package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pxj extends yiv {
    Object a;
    boolean b;
    long c;
    /* synthetic */ Object d;
    final /* synthetic */ pxk e;
    int f;
    pxk g;
    pvi h;
    qen i;
    qdo j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pxj(pxk pxkVar, yih yihVar) {
        super(yihVar);
        this.e = pxkVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return pxk.b(this.e, null, null, null, null, false, false, false, this);
    }
}
