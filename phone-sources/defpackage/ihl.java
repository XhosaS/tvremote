package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ihl extends yiv {
    Object a;
    int b;
    int c;
    int d;
    /* synthetic */ Object e;
    final /* synthetic */ ihq f;
    int g;
    ijg h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ihl(ihq ihqVar, yih yihVar) {
        super(yihVar);
        this.f = ihqVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.e(null, this);
    }
}
