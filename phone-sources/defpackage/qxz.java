package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qxz extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ qya b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxz(qya qyaVar, yih yihVar) {
        super(yihVar);
        this.b = qyaVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
