package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ipn extends yiv {
    Object a;
    boolean b;
    /* synthetic */ Object c;
    final /* synthetic */ iqo d;
    int e;
    String f;
    String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ipn(iqo iqoVar, yih yihVar) {
        super(yihVar);
        this.d = iqoVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.T(null, null, null, false, this);
    }
}
