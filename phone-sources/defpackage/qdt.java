package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qdt extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ qdu b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qdt(qdu qduVar, yih yihVar) {
        super(yihVar);
        this.b = qduVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
