package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qlb extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ qlc b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qlb(qlc qlcVar, yih yihVar) {
        super(yihVar);
        this.b = qlcVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.n(null, null, this);
    }
}
