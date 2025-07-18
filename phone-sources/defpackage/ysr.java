package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ysr extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ yss b;
    int c;
    ysk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ysr(yss yssVar, yih yihVar) {
        super(yihVar);
        this.b = yssVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
