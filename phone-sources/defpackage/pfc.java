package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pfc extends yiv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ pfh c;
    int d;
    String e;
    vlo f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfc(pfh pfhVar, yih yihVar) {
        super(yihVar);
        this.c = pfhVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, null, null, null, this);
    }
}
