package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dlw extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ dly b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlw(dly dlyVar, yih yihVar) {
        super(yihVar);
        this.b = dlyVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
