package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ikw extends yiv {
    Object a;
    long b;
    /* synthetic */ Object c;
    int d;
    wog e;
    final /* synthetic */ ilc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ikw(ikx ikxVar, yih yihVar) {
        super(yihVar);
        this.f = (ilc) ikxVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return ikx.d(this.f, null, null, null, 0L, this);
    }
}
