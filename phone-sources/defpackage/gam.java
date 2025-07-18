package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gam extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ gav b;
    int c;
    yyk d;
    cvi e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gam(gav gavVar, yih yihVar) {
        super(yihVar);
        this.b = gavVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
