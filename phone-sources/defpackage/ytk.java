package defpackage;

/* loaded from: classes3.dex */
public final class ytk extends yiv {
    public /* synthetic */ Object a;
    public int b;
    public Object c;
    public Object d;
    public long e;
    public int f;
    final /* synthetic */ ipi g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ytk(ipi ipiVar, yih yihVar) {
        super(yihVar);
        this.g = ipiVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.g.a(null, this);
    }
}
