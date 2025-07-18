package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ptw extends yiv {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ pub d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ptw(pub pubVar, yih yihVar) {
        super(yihVar);
        this.d = pubVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
