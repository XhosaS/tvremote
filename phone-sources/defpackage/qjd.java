package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qjd extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ qji b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qjd(qji qjiVar, yih yihVar) {
        super(yihVar);
        this.b = qjiVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.k(null, null, this);
    }
}
