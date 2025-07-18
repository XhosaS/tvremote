package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qes extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ qew b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qes(qew qewVar, yih yihVar) {
        super(yihVar);
        this.b = qewVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(null, this);
    }
}
