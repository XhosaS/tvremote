package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qch extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ qci b;
    int c;
    qis d;
    String e;
    pvs f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qch(qci qciVar, yih yihVar) {
        super(yihVar);
        this.b = qciVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
