package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cio extends yiv {
    Object a;
    Object b;
    int c;
    int d;
    /* synthetic */ Object e;
    final /* synthetic */ ciq f;
    int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cio(ciq ciqVar, yih yihVar) {
        super(yihVar);
        this.f = ciqVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.b(this);
    }
}
