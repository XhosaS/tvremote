package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nxl extends nxh {
    public final nzr b;

    public nxl(nzr nzrVar, kwy kwyVar) {
        super(4, kwyVar);
        this.b = nzrVar;
    }

    @Override // defpackage.nxg
    public final boolean a(nzd nzdVar) {
        jzs jzsVar = (jzs) nzdVar.e.get(this.b);
        return jzsVar != null && ((nzx) jzsVar.b).a;
    }

    @Override // defpackage.nxg
    public final nvg[] b(nzd nzdVar) {
        jzs jzsVar = (jzs) nzdVar.e.get(this.b);
        if (jzsVar == null) {
            return null;
        }
        return (nvg[]) ((nzx) jzsVar.b).d;
    }

    @Override // defpackage.nxh
    public final void c(nzd nzdVar) {
        jzs jzsVar = (jzs) nzdVar.e.remove(this.b);
        if (jzsVar == null) {
            this.a.w(false);
            return;
        }
        ((nzy) ((pku) jzsVar.c).a).b.a(nzdVar.b, this.a);
        ((nzt) ((nzx) jzsVar.b).c).a();
    }

    @Override // defpackage.nxh, defpackage.nxm
    public final /* bridge */ /* synthetic */ void g(pkg pkgVar, boolean z) {
    }
}
