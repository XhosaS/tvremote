package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ibx extends yiv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ iby c;
    int d;
    icd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibx(iby ibyVar, yih yihVar) {
        super(yihVar);
        this.c = ibyVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
