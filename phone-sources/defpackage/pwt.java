package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pwt extends yiv {
    Object a;
    Object b;
    boolean c;
    /* synthetic */ Object d;
    final /* synthetic */ pww e;
    int f;
    pvi g;
    qdo h;
    yyk i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pwt(pww pwwVar, yih yihVar) {
        super(yihVar);
        this.e = pwwVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, null, null, false, this);
    }
}
