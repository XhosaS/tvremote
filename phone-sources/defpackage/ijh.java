package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ijh extends yiv {
    Object a;
    long b;
    /* synthetic */ Object c;
    final /* synthetic */ ijj d;
    int e;
    String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ijh(ijj ijjVar, yih yihVar) {
        super(yihVar);
        this.d = ijjVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.g(null, null, 0L, this);
    }
}
