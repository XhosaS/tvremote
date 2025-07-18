package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qgb extends yiv {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ qgd d;
    int e;
    String f;
    String g;
    qen h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qgb(qgd qgdVar, yih yihVar) {
        super(yihVar);
        this.d = qgdVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
