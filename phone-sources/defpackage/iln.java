package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class iln extends yiv {
    Object a;
    boolean b;
    long c;
    /* synthetic */ Object d;
    int e;
    final /* synthetic */ ils f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iln(ilo iloVar, yih yihVar) {
        super(yihVar);
        this.f = (ils) iloVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return ilo.d(this.f, null, null, false, 0L, this);
    }
}
