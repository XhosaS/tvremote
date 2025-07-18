package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qna extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ qnf b;
    int c;
    qgv d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qna(qnf qnfVar, yih yihVar) {
        super(yihVar);
        this.b = qnfVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(null, null, null, null, false, this);
    }
}
