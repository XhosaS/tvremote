package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qpd extends yiv {
    /* synthetic */ Object a;
    final /* synthetic */ qpf b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qpd(qpf qpfVar, yih yihVar) {
        super(yihVar);
        this.b = qpfVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(null, this);
    }
}
