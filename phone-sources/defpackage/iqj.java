package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class iqj extends yiv {
    Object a;
    Object b;
    Object c;
    /* synthetic */ Object d;
    final /* synthetic */ iqo e;
    int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqj(iqo iqoVar, yih yihVar) {
        super(yihVar);
        this.e = iqoVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.ab(null, this);
    }
}
