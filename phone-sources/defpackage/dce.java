package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dce extends yiv {
    boolean a;
    /* synthetic */ Object b;
    final /* synthetic */ dcg c;
    int d;
    dcc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dce(dcg dcgVar, yih yihVar) {
        super(yihVar);
        this.c = dcgVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
