package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rga implements duv {
    public final rgb a;
    private final qwo b;
    private final rdd c = new rfz(this);

    public rga(qwo qwoVar, rgb rgbVar) {
        this.b = qwoVar;
        this.a = rgbVar;
    }

    @Override // defpackage.duv
    public final void f(dvk dvkVar) {
        qwo qwoVar = this.b;
        rdd rddVar = this.c;
        qwoVar.c(rddVar);
        rddVar.c(qwoVar.e());
    }

    @Override // defpackage.duv
    public final void l() {
        this.b.d(this.c);
    }

    @Override // defpackage.duv
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.duv
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.duv
    public final /* synthetic */ void e(dvk dvkVar) {
    }
}
