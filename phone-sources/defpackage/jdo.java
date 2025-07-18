package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jdo extends yiv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ jdr c;
    int d;
    String e;
    wlx f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdo(jdr jdrVar, yih yihVar) {
        super(yihVar);
        this.c = jdrVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
