package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qje extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ qji b;
    int c;
    qjb d;
    ylf e;
    yyk f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qje(qji qjiVar, yih yihVar) {
        super(yihVar);
        this.b = qjiVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.l(null, null, this);
    }
}
