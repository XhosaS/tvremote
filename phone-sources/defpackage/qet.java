package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qet extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ qew b;
    int c;
    qen d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qet(qew qewVar, yih yihVar) {
        super(yihVar);
        this.b = qewVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(null, null, this);
    }
}
