package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qnn extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ qno b;
    int c;
    ulp d;
    ulp e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qnn(qno qnoVar, yih yihVar) {
        super(yihVar);
        this.b = qnoVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(null, this);
    }
}
