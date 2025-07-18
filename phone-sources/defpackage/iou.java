package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class iou extends yiv {
    Object a;
    long b;
    /* synthetic */ Object c;
    final /* synthetic */ iov d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iou(iov iovVar, yih yihVar) {
        super(yihVar);
        this.d = iovVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.d(null, this);
    }
}
