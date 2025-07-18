package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qev extends yiv {
    Object a;
    Object b;
    Object c;
    /* synthetic */ Object d;
    final /* synthetic */ qew e;
    int f;
    ylb g;
    qen h;
    yyh i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qev(qew qewVar, yih yihVar) {
        super(yihVar);
        this.e = qewVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.g(null, null, this);
    }
}
