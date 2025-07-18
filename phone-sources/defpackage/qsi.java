package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qsi extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ qsk b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qsi(qsk qskVar, yih yihVar) {
        super(yihVar);
        this.b = qskVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, null, null, this);
    }
}
