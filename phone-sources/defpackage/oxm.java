package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class oxm extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ oxn b;
    int c;
    uwg d;
    uwl e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oxm(oxn oxnVar, yih yihVar) {
        super(yihVar);
        this.b = oxnVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, null, this);
    }
}
