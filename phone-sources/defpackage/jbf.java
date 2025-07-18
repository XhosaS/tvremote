package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jbf extends yiv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ jbg c;
    int d;
    wnv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbf(jbg jbgVar, yih yihVar) {
        super(yihVar);
        this.c = jbgVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
