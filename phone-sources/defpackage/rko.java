package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rko extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ rkp b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rko(rkp rkpVar, yih yihVar) {
        super(yihVar);
        this.b = rkpVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(this);
    }
}
