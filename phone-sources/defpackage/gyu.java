package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyu extends yiv {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ qza c;
    public cvi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gyu(qza qzaVar, yih yihVar) {
        super(yihVar);
        this.c = qzaVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.d(null, this);
    }
}
