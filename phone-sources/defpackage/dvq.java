package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dvq extends dvr implements dvi {
    final dvk a;
    final /* synthetic */ dvs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvq(dvs dvsVar, dvk dvkVar, dvw dvwVar) {
        super(dvsVar, dvwVar);
        this.b = dvsVar;
        this.a = dvkVar;
    }

    @Override // defpackage.dvi
    public final void a(dvk dvkVar, dvc dvcVar) {
        dvk dvkVar2 = this.a;
        dvd dvdVarA = dvkVar2.getLifecycle().a();
        if (dvdVarA == dvd.a) {
            this.b.i(this.c);
            return;
        }
        dvd dvdVar = null;
        while (dvdVar != dvdVarA) {
            d(cG());
            dvdVar = dvdVarA;
            dvdVarA = dvkVar2.getLifecycle().a();
        }
    }

    @Override // defpackage.dvr
    public final void b() {
        this.a.getLifecycle().d(this);
    }

    @Override // defpackage.dvr
    public final boolean c(dvk dvkVar) {
        return this.a == dvkVar;
    }

    @Override // defpackage.dvr
    public final boolean cG() {
        return this.a.getLifecycle().a().a(dvd.d);
    }
}
