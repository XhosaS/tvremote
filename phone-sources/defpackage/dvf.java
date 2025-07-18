package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvf implements yow, dvi {
    public final dve a;
    private final yil b;

    public dvf() {
        throw null;
    }

    @Override // defpackage.dvi
    public final void a(dvk dvkVar, dvc dvcVar) {
        dve dveVar = this.a;
        if (dveVar.a().compareTo(dvd.a) <= 0) {
            dveVar.d(this);
            yoz.x(this.b, null);
        }
    }

    @Override // defpackage.yow
    public final yil c() {
        return this.b;
    }

    public dvf(dve dveVar, yil yilVar) {
        yilVar.getClass();
        this.a = dveVar;
        this.b = yilVar;
        if (dveVar.a() == dvd.a) {
            yoz.x(yilVar, null);
        }
    }
}
