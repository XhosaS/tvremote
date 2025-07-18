package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kcn extends sbx {
    private final iyh a;
    private final hfw b;

    public kcn(hfw hfwVar, iyh iyhVar) {
        this.b = hfwVar;
        this.a = iyhVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object C() {
        return new kcq();
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        kcl kclVar = (kcl) obj;
        kcq kcqVar = (kcq) obj2;
        q(jef.e, kclVar.e);
        q(jef.g, kclVar.f);
        jyr jyrVar = new jyr(kclVar, 13);
        kcm kcmVar = new kcm(0);
        iye iyeVar = ((iym) kclVar).a;
        boolean z = (iyeVar.i() || iyeVar.g()) ? false : true;
        if (!yks.e(Boolean.valueOf(kcqVar.c), Boolean.valueOf(z))) {
            kcqVar.c = z;
            kcqVar.G(2);
        }
        iyk iykVar = (iyk) this.a.l(iyeVar);
        if (!yks.e(kcqVar.a, iykVar)) {
            kcqVar.a = iykVar;
            kcqVar.G(0);
        }
        if (!yks.e(kcqVar.d, jyrVar)) {
            kcqVar.d = jyrVar;
            kcqVar.G(3);
        }
        kcqVar.b = new scc("R.id.cancel", kcqVar, kcmVar);
        kcqVar.G(1);
    }
}
