package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mrl implements mrn {
    private final oaa a;
    private final ogr b;

    public mrl(oaa oaaVar, ogr ogrVar) {
        this.a = oaaVar;
        this.b = ogrVar;
    }

    @Override // defpackage.mrn
    public final mii a() {
        return nkm.V;
    }

    @Override // defpackage.mrn
    public final /* bridge */ /* synthetic */ mrm b(mil milVar, nzx nzxVar) {
        return new mrk((nkm) milVar, this.a, nzxVar, this.b);
    }
}
