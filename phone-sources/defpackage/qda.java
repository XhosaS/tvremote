package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qda extends yiv {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    Object f;
    Object g;
    /* synthetic */ Object h;
    final /* synthetic */ qdd i;
    int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qda(qdd qddVar, yih yihVar) {
        super(yihVar);
        this.i = qddVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.a(null, null, null, this);
    }
}
