package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cip extends yiv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ ciq c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cip(ciq ciqVar, yih yihVar) {
        super(yihVar);
        this.c = ciqVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
