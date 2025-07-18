package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pff extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ pfh b;
    int c;
    vlo d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pff(pfh pfhVar, yih yihVar) {
        super(yihVar);
        this.b = pfhVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(null, this);
    }
}
