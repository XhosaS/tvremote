package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class irj extends yiv {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ mta c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public irj(mta mtaVar, yih yihVar) {
        super(yihVar);
        this.c = mtaVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.n(null, 0, this);
    }
}
