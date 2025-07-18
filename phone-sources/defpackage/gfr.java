package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gfr extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ gft b;
    int c;
    cvi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfr(gft gftVar, yih yihVar) {
        super(yihVar);
        this.b = gftVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(this);
    }
}
