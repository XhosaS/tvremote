package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qcm extends yiv {
    Object a;
    boolean b;
    /* synthetic */ Object c;
    final /* synthetic */ qcp d;
    int e;
    pxh f;
    String g;
    crm h;
    qrj i;
    yyk j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qcm(qcp qcpVar, yih yihVar) {
        super(yihVar);
        this.d = qcpVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.i(null, null, null, null, null, false, this);
    }
}
