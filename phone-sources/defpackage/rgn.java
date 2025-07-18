package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rgn implements duv {
    final zft a;
    private final qvk b;

    public rgn(qwo qwoVar, rjq rjqVar, rgm rgmVar) {
        zft zftVar = new zft(rgmVar);
        this.a = zftVar;
        String str = qvk.a;
        this.b = new qvk(qwoVar, new zft(zftVar), rjqVar);
    }

    @Override // defpackage.duv
    public final void f(dvk dvkVar) {
        qvk qvkVar = this.b;
        qvkVar.f(dvkVar);
        qvkVar.b();
    }

    @Override // defpackage.duv
    public final void l() {
        this.b.a();
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
