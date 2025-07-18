package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class oxh extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ oxj b;
    int c;
    oyd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oxh(oxj oxjVar, yih yihVar) {
        super(yihVar);
        this.b = oxjVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, this);
    }
}
