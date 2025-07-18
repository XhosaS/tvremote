package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qmy extends yiv {
    Object a;
    Object b;
    Object c;
    Object d;
    boolean e;
    /* synthetic */ Object f;
    final /* synthetic */ qnf g;
    int h;
    String i;
    vjj j;
    qen k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qmy(qnf qnfVar, yih yihVar) {
        super(yihVar);
        this.g = qnfVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(null, null, null, false, this);
    }
}
