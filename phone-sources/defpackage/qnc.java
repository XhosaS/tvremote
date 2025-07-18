package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qnc extends yiv {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ qnf d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qnc(qnf qnfVar, yih yihVar) {
        super(yihVar);
        this.d = qnfVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.f(null, null, null, null, null, false, this);
    }
}
