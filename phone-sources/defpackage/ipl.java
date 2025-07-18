package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ipl extends yiv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ iqo c;
    int d;
    String e;
    wni f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ipl(iqo iqoVar, yih yihVar) {
        super(yihVar);
        this.c = iqoVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.R(null, null, this);
    }
}
