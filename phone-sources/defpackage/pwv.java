package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pwv extends yiv {
    Object a;
    boolean b;
    long c;
    /* synthetic */ Object d;
    final /* synthetic */ pww e;
    int f;
    qis g;
    pvi h;
    qen i;
    qdo j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pwv(pww pwwVar, yih yihVar) {
        super(yihVar);
        this.e = pwwVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.f(null, null, null, null, null, false, this);
    }
}
