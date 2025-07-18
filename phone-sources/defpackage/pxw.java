package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pxw extends yiv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ pxx c;
    int d;
    pvs e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pxw(pxx pxxVar, yih yihVar) {
        super(yihVar);
        this.c = pxxVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
