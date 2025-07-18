package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class oxf extends yiv {
    long a;
    /* synthetic */ Object b;
    final /* synthetic */ oxj c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oxf(oxj oxjVar, yih yihVar) {
        super(yihVar);
        this.c = oxjVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(0L, null, this);
    }
}
