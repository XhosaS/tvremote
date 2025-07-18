package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qsg extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ qsh b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qsg(qsh qshVar, yih yihVar) {
        super(yihVar);
        this.b = qshVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, null, null, this);
    }
}
