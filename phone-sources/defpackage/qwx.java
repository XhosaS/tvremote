package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qwx extends yiv {
    boolean a;
    /* synthetic */ Object b;
    final /* synthetic */ qxc c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qwx(qxc qxcVar, yih yihVar) {
        super(yihVar);
        this.c = qxcVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, null, false, this);
    }
}
