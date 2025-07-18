package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qlh extends yiv {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ qli d;
    int e;
    qen f;
    ulp g;
    ulp h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qlh(qli qliVar, yih yihVar) {
        super(yihVar);
        this.d = qliVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, null, null, null, this);
    }
}
