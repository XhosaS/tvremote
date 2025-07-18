package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bsf extends yiv {
    long a;
    long b;
    /* synthetic */ Object c;
    final /* synthetic */ bsh d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsf(bsh bshVar, yih yihVar) {
        super(yihVar);
        this.d = bshVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(0L, 0L, this);
    }
}
