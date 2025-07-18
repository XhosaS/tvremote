package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gfq extends yiv {
    int a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ gft d;
    int e;
    String f;
    String[] g;
    ggd h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfq(gft gftVar, yih yihVar) {
        super(yihVar);
        this.d = gftVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.d(null, 0, this);
    }
}
