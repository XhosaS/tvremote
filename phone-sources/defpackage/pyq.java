package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pyq extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ pyu b;
    int c;
    vjo d;
    qen e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pyq(pyu pyuVar, yih yihVar) {
        super(yihVar);
        this.b = pyuVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(null, null, false, null, this);
    }
}
