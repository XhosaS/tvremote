package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qky extends yiv {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ qlc d;
    int e;
    qel f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qky(qlc qlcVar, yih yihVar) {
        super(yihVar);
        this.d = qlcVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.k(null, null, null, null, null, this);
    }
}
