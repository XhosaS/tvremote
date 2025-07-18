package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qki extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ qkj b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qki(qkj qkjVar, yih yihVar) {
        super(yihVar);
        this.b = qkjVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(null, this);
    }
}
