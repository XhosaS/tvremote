package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qkt extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ qku b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkt(qku qkuVar, yih yihVar) {
        super(yihVar);
        this.b = qkuVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.g(null, null, null, this);
    }
}
