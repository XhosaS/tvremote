package defpackage;

/* loaded from: classes3.dex */
public final class ytd extends yiv {
    public /* synthetic */ Object a;
    public int b;
    public Object c;
    final /* synthetic */ ipi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ytd(ipi ipiVar, yih yihVar) {
        super(yihVar);
        this.d = ipiVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
