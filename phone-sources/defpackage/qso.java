package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qso extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ qsu b;
    int c;
    qgv d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qso(qsu qsuVar, yih yihVar) {
        super(yihVar);
        this.b = qsuVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, null, this);
    }
}
