package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ipq extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ iqo b;
    int c;
    wni d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ipq(iqo iqoVar, yih yihVar) {
        super(yihVar);
        this.b = iqoVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.l(null, this);
    }
}
