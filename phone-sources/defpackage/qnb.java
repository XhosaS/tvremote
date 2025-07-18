package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qnb extends yiv {
    boolean a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ qnf d;
    int e;
    vjj f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qnb(qnf qnfVar, yih yihVar) {
        super(yihVar);
        this.d = qnfVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.e(null, null, null, false, this);
    }
}
