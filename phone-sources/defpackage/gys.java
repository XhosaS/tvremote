package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gys extends yiv {
    public /* synthetic */ Object a;
    public int b;
    public qza c;
    final /* synthetic */ cvi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gys(cvi cviVar, yih yihVar) {
        super(yihVar);
        this.d = cviVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.z(null, this);
    }
}
