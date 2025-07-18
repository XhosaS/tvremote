package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class oxi extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ oxj b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oxi(oxj oxjVar, yih yihVar) {
        super(yihVar);
        this.b = oxjVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(this);
    }
}
