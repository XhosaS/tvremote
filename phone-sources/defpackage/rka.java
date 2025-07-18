package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class rka implements rkf {
    private final /* synthetic */ int a;

    public /* synthetic */ rka(int i) {
        this.a = i;
    }

    @Override // defpackage.rkf
    public final uhp a(pro proVar, prk prkVar, int i) {
        if (this.a != 0) {
            trf trfVarD = trf.d(proVar.d());
            int i2 = 0;
            prm prmVar = new prm(proVar, prkVar, i, i2);
            ugk ugkVar = ugk.a;
            return rkc.g(trfVarD.f(prmVar, ugkVar).b(Exception.class, new pri(3), ugkVar).e(new prn(i2), ugkVar));
        }
        trf trfVarD2 = trf.d(proVar.d());
        prm prmVar2 = new prm(proVar, prkVar, i, 2);
        ugk ugkVar2 = ugk.a;
        trf trfVarF = trfVarD2.f(prmVar2, ugkVar2);
        int i3 = 5;
        return trfVarF.b(Exception.class, new pri(i3), ugkVar2).e(new prn(i3), ugkVar2);
    }
}
