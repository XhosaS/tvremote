package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mri implements mrn {
    private final oaa a;
    private final ogr b;

    public mri(oaa oaaVar, ogr ogrVar) {
        this.a = oaaVar;
        this.b = ogrVar;
    }

    @Override // defpackage.mrn
    public final mii a() {
        return nki.U;
    }

    @Override // defpackage.mrn
    public final /* bridge */ /* synthetic */ mrm b(mil milVar, nzx nzxVar) {
        return new mrh((nki) milVar, this.a, nzxVar, this.b);
    }
}
