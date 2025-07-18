package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qwz extends yiv {
    boolean a;
    boolean b;
    /* synthetic */ Object c;
    final /* synthetic */ qxc d;
    int e;
    vou f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qwz(qxc qxcVar, yih yihVar) {
        super(yihVar);
        this.d = qxcVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
