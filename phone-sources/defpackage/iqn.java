package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class iqn extends yiv {
    Object a;
    Object b;
    Object c;
    /* synthetic */ Object d;
    final /* synthetic */ iqo e;
    int f;
    String g;
    wmn h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqn(iqo iqoVar, yih yihVar) {
        super(yihVar);
        this.e = iqoVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.ac(null, null, this);
    }
}
