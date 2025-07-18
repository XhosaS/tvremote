package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dcf extends yiv {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ dcg d;
    int e;
    dcc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcf(dcg dcgVar, yih yihVar) {
        super(yihVar);
        this.d = dcgVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
