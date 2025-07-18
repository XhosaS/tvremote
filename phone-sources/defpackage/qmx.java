package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qmx extends yiv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ qnf c;
    int d;
    vji e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qmx(qnf qnfVar, yih yihVar) {
        super(yihVar);
        this.c = qnfVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, null, null, false, this);
    }
}
