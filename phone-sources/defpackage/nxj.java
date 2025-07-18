package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nxj extends nxh {
    public final jzs b;

    public nxj(jzs jzsVar, kwy kwyVar) {
        super(3, kwyVar);
        this.b = jzsVar;
    }

    @Override // defpackage.nxg
    public final boolean a(nzd nzdVar) {
        return ((nzx) this.b.b).a;
    }

    @Override // defpackage.nxg
    public final nvg[] b(nzd nzdVar) {
        return (nvg[]) ((nzx) this.b.b).d;
    }

    @Override // defpackage.nxh
    public final void c(nzd nzdVar) {
        jzs jzsVar = this.b;
        nzx nzxVar = (nzx) jzsVar.b;
        nzxVar.c(nzdVar.b, this.a);
        nzr nzrVarA = nzxVar.a();
        if (nzrVarA != null) {
            nzdVar.e.put(nzrVarA, jzsVar);
        }
    }

    @Override // defpackage.nxh, defpackage.nxm
    public final /* bridge */ /* synthetic */ void g(pkg pkgVar, boolean z) {
    }
}
