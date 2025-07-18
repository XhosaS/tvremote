package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ios extends yiv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ iov c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ios(iov iovVar, yih yihVar) {
        super(yihVar);
        this.c = iovVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(this);
    }
}
