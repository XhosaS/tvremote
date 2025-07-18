package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pwq extends yiv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ pww c;
    int d;
    qis e;
    qen f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pwq(pww pwwVar, yih yihVar) {
        super(yihVar);
        this.c = pwwVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, null, this);
    }
}
