package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class iji extends yiv {
    Object a;
    Object b;
    /* synthetic */ Object c;
    int d;
    final /* synthetic */ ijn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iji(ijj ijjVar, yih yihVar) {
        super(yihVar);
        this.e = (ijn) ijjVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return ijj.n(this.e, null, null, null, 0L, 0L, null, this);
    }
}
