package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ibw extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ iby b;
    int c;
    ica d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibw(iby ibyVar, yih yihVar) {
        super(yihVar);
        this.b = ibyVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
