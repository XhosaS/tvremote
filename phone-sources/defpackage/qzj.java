package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qzj implements qxs {
    public final vrn a;
    public vqs b;
    public vqs c;
    public vqs d;
    public final rfc e;
    public final vqs f;
    public final qyn g;
    private final vrs h;
    private final int i;
    private final vrp j;
    private final int k;
    private final int l;

    public qzj(vrs vrsVar, qyn qynVar, vrn vrnVar, qxc qxcVar) {
        this.h = vrsVar;
        this.g = qynVar;
        this.a = vrnVar;
        if (rrx.ax(qynVar.b)) {
            this.c = b(new vqe(vpy.k), new vpv(7), 90141, this.k, vrsVar.a(new psn(this, 11)), 2);
            this.d = b(new vqe(vpy.j), new vpv(9), 90142, this.l, vrsVar.a(new psn(this, 13)), 2);
        }
        qxcVar.d(vrnVar, this);
        int i = vqy.a;
        int iA = vqy.a();
        this.i = iA;
        vqs vqsVarB = null;
        rfc rfcVarC = qynVar.h ? qwt.c(null, qynVar.b) : null;
        this.e = rfcVarC;
        vrp vrpVarA = vrsVar.a(new psn(this, 12));
        this.j = vrpVarA;
        this.k = vqy.a();
        this.l = vqy.a();
        if (rfcVarC != null) {
            String str = rfcVarC.d;
            str.getClass();
            vqsVarB = b(new vqe(str), new vpv(8), rfcVarC.e, iA, vrpVarA, 1);
        }
        this.f = vqsVarB;
        vqy.a();
    }

    private static final vqs b(vqe vqeVar, vps vpsVar, int i, int i2, vrp vrpVar, int i3) {
        return new vqs(new vrd(new vra(vpsVar), new vql(vqeVar, vro.ON_SURFACE, 2, 2), null, null, null, null, null, i3, 0, 1788), Integer.valueOf(i2), vro.SURFACE_CONTAINER_LOWEST, vrpVar, (yjk) null, i, 80);
    }

    @Override // defpackage.qxs
    public final void a(vrk vrkVar) {
        vrkVar.getClass();
        this.b = null;
    }
}
