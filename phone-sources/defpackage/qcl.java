package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qcl extends yiv {
    Object a;
    Object b;
    boolean c;
    /* synthetic */ Object d;
    final /* synthetic */ qcp e;
    int f;
    qis g;
    pxh h;
    qrj i;
    qak j;
    qis k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qcl(qcp qcpVar, yih yihVar) {
        super(yihVar);
        this.e = qcpVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.h(null, null, null, null, null, null, null, false, this);
    }
}
