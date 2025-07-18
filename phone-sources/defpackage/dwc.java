package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dwc implements dvi {
    final /* synthetic */ dvc a;
    final /* synthetic */ ylf b;
    final /* synthetic */ yow c;
    final /* synthetic */ dvc d;
    final /* synthetic */ yoe e;
    final /* synthetic */ yjz f;
    final /* synthetic */ yyk g;

    public dwc(dvc dvcVar, ylf ylfVar, yow yowVar, dvc dvcVar2, yoe yoeVar, yyk yykVar, yjz yjzVar) {
        this.a = dvcVar;
        this.b = ylfVar;
        this.c = yowVar;
        this.d = dvcVar2;
        this.e = yoeVar;
        this.g = yykVar;
        this.f = yjzVar;
    }

    @Override // defpackage.dvi
    public final void a(dvk dvkVar, dvc dvcVar) {
        if (dvcVar == this.a) {
            this.b.a = ykr.q(this.c, null, 0, new qhy(this.g, this.f, (yih) null, 1), 3);
            return;
        }
        if (dvcVar == this.d) {
            ylf ylfVar = this.b;
            yqe yqeVar = (yqe) ylfVar.a;
            if (yqeVar != null) {
                yqeVar.t(null);
            }
            ylfVar.a = null;
        }
        if (dvcVar == dvc.ON_DESTROY) {
            this.e.resumeWith(ygi.a);
        }
    }
}
