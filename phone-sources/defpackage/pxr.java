package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pxr extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ pxs b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pxr(pxs pxsVar, yih yihVar) {
        super(yihVar);
        this.b = pxsVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, null, 0L, this);
    }
}
