package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yvr extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ yvs b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yvr(yvs yvsVar, yih yihVar) {
        super(yihVar);
        this.b = yvsVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.emit(null, this);
    }
}
