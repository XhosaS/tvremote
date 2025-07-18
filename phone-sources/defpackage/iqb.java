package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class iqb extends yiv {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ iqo d;
    int e;
    imb f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqb(iqo iqoVar, yih yihVar) {
        super(yihVar);
        this.d = iqoVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.X(this);
    }
}
