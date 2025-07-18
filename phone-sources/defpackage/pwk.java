package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pwk extends yiv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ pwl c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pwk(pwl pwlVar, yih yihVar) {
        super(yihVar);
        this.c = pwlVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
