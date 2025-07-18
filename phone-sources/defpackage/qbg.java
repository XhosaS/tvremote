package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qbg extends yiv {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ qbh d;
    int e;
    vjc f;
    qen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbg(qbh qbhVar, yih yihVar) {
        super(yihVar);
        this.d = qbhVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, null, null, this);
    }
}
