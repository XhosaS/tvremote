package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uag extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ uah b;
    int c;
    yyk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uag(uah uahVar, yih yihVar) {
        super(yihVar);
        this.b = uahVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
