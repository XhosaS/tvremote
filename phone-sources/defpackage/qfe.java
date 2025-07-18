package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qfe extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ qff b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qfe(qff qffVar, yih yihVar) {
        super(yihVar);
        this.b = qffVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, null, 0L, this);
    }
}
