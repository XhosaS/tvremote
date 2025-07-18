package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qpc extends yiv {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ qpf d;
    int e;
    ttd f;
    vtw g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qpc(qpf qpfVar, yih yihVar) {
        super(yihVar);
        this.d = qpfVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, null, null, this);
    }
}
