package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cvg implements dvi {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ cvg(cvi cviVar, cvk cvkVar, int i) {
        this.c = i;
        this.a = cviVar;
        this.b = cvkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [bdy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [cvk, java.lang.Object] */
    @Override // defpackage.dvi
    public final void a(dvk dvkVar, dvc dvcVar) throws NoSuchMethodException, SecurityException {
        int i = this.c;
        if (i == 0) {
            if (dvcVar == dvc.ON_DESTROY) {
                ((cvi) this.a).f(this.b);
                return;
            }
            return;
        }
        if (i == 1) {
            fl.addObserverForBackInvoker$lambda$14((fx) this.b, (fl) this.a, dvkVar, dvcVar);
        } else if (i != 2) {
            if (dvcVar == this.b) {
                ((yjk) this.a.a()).a();
            }
        } else if (dvcVar == dvc.ON_START) {
            ((dve) this.a).d(this);
            ((ghc) this.b).c(dva.class);
        }
    }

    public cvg(dve dveVar, ghc ghcVar, int i) {
        this.c = i;
        this.a = dveVar;
        this.b = ghcVar;
    }

    public /* synthetic */ cvg(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
