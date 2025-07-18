package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qbt extends yiv {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ qbv d;
    int e;
    qdo f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbt(qbv qbvVar, yih yihVar) {
        super(yihVar);
        this.d = qbvVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, null, null, this);
    }
}
