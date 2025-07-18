package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ibi extends yiv {
    public Object a;
    public Object b;
    public /* synthetic */ Object c;
    public int d;
    public yyk e;
    final /* synthetic */ iom f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibi(iom iomVar, yih yihVar) {
        super(yihVar);
        this.f = iomVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f.d(null, null, this);
    }
}
