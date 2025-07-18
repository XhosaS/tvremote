package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ptx extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ pub b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ptx(pub pubVar, yih yihVar) {
        super(yihVar);
        this.b = pubVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, null, null, this);
    }
}
