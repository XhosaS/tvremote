package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qll extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ qlm b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qll(qlm qlmVar, yih yihVar) {
        super(yihVar);
        this.b = qlmVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(this);
    }
}
