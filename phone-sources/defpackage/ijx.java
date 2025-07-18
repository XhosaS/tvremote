package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ijx extends yiv {
    /* synthetic */ Object a;
    int b;
    String c;
    wni d;
    ike e;
    final /* synthetic */ ike f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ijx(ijy ijyVar, yih yihVar) {
        super(yihVar);
        this.f = (ike) ijyVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return ijy.d(this.f, null, null, this);
    }
}
