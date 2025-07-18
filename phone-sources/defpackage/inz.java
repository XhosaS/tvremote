package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class inz extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ ioa b;
    int c;
    String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public inz(ioa ioaVar, yih yihVar) {
        super(yihVar);
        this.b = ioaVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
