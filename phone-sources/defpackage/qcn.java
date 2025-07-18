package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qcn extends yiz implements yjv {
    int a;
    final /* synthetic */ qcp b;
    final /* synthetic */ qis c;
    final /* synthetic */ pxh d;
    final /* synthetic */ String e;
    final /* synthetic */ crm f;
    final /* synthetic */ qrj g;
    final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qcn(qcp qcpVar, qis qisVar, pxh pxhVar, String str, crm crmVar, qrj qrjVar, boolean z, yih yihVar) {
        super(1, yihVar);
        this.b = qcpVar;
        this.c = qisVar;
        this.d = pxhVar;
        this.e = str;
        this.f = crmVar;
        this.g = qrjVar;
        this.h = z;
    }

    @Override // defpackage.yjv
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new qcn(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (yih) obj).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(yih<?> yihVar) {
        return new qcn(this.b, this.c, this.d, this.e, this.f, this.g, this.h, yihVar);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        yio yioVar = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i == 0) {
            qcp qcpVar = this.b;
            qis qisVar = this.c;
            pxh pxhVar = this.d;
            String str = this.e;
            crm crmVar = this.f;
            qrj qrjVar = this.g;
            boolean z = this.h;
            this.a = 1;
            if (qcpVar.j(qisVar, pxhVar, str, crmVar, qrjVar, z, this) == yioVar) {
                return yioVar;
            }
        }
        return ygi.a;
    }
}
