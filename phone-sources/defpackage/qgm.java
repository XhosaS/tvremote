package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qgm extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ qgn b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qgm(qgn qgnVar, yih yihVar) {
        super(yihVar);
        this.b = qgnVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, null, 0L, this);
    }
}
