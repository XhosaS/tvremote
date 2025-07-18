package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bsc extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ bse b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsc(bse bseVar, yih yihVar) {
        super(yihVar);
        this.b = bseVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(0L, 0L, this);
    }
}
