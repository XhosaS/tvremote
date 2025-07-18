package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qby extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ qbz b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qby(qbz qbzVar, yih yihVar) {
        super(yihVar);
        this.b = qbzVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
