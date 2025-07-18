package defpackage;

/* loaded from: classes3.dex */
public final class ytg extends yiv {
    public /* synthetic */ Object a;
    public int b;
    public Object c;
    public ywa d;
    final /* synthetic */ ipi e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ytg(ipi ipiVar, yih yihVar) {
        super(yihVar);
        this.e = ipiVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
