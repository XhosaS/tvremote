package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qdb extends yiv {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    /* synthetic */ Object f;
    final /* synthetic */ qdd g;
    int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qdb(qdd qddVar, yih yihVar) {
        super(yihVar);
        this.g = qddVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.c(null, null, this);
    }
}
