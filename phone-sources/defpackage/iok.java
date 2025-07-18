package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class iok extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ iom b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iok(iom iomVar, yih yihVar) {
        super(yihVar);
        this.b = iomVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
