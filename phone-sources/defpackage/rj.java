package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rj extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ rl b;
    int c;
    wn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj(rl rlVar, yih yihVar) {
        super(yihVar);
        this.b = rlVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
