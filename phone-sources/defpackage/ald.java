package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ald extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ alg b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ald(alg algVar, yih yihVar) {
        super(yihVar);
        this.b = algVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.s(this);
    }
}
