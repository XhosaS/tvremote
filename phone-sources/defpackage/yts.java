package defpackage;

/* loaded from: classes3.dex */
public final class yts extends yiv {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ ipi c;
    public ioo d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yts(ipi ipiVar, yih yihVar) {
        super(yihVar);
        this.c = ipiVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
