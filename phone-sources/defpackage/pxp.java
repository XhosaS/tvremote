package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pxp extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ pxs b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pxp(pxs pxsVar, yih yihVar) {
        super(yihVar);
        this.b = pxsVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return pxs.a(this.b, null, null, this);
    }
}
