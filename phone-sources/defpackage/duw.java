package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class duw implements dvi {
    private final duv a;
    private final dvi b;

    public duw(duv duvVar, dvi dviVar) {
        this.a = duvVar;
        this.b = dviVar;
    }

    @Override // defpackage.dvi
    public final void a(dvk dvkVar, dvc dvcVar) {
        switch (dvcVar.ordinal()) {
            case 0:
                break;
            case 1:
                this.a.f(dvkVar);
                break;
            case 2:
                this.a.k();
                break;
            case 3:
                this.a.j();
                break;
            case 4:
                this.a.l();
                break;
            case 5:
                this.a.e(dvkVar);
                break;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                throw new yfu();
        }
        dvi dviVar = this.b;
        if (dviVar != null) {
            dviVar.a(dvkVar, dvcVar);
        }
    }
}
