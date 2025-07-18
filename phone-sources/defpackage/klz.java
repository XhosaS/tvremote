package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class klz extends yiv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ kmb c;
    int d;
    rul e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klz(kmb kmbVar, yih yihVar) {
        super(yihVar);
        this.c = kmbVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
