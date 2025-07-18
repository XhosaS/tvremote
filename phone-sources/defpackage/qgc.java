package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qgc extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ qgd b;
    int c;
    String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qgc(qgd qgdVar, yih yihVar) {
        super(yihVar);
        this.b = qgdVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
