package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qwy extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ qxc b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qwy(qxc qxcVar, yih yihVar) {
        super(yihVar);
        this.b = qxcVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
