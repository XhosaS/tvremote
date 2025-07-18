package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gfg extends yiv {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ gfh c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfg(gfh gfhVar, yih yihVar) {
        super(yihVar);
        this.c = gfhVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.n(this);
    }
}
