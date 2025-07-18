package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwk implements AutoCloseable, dvi {
    public final dwi a;
    public boolean b;
    private final String c;

    public dwk(String str, dwi dwiVar) {
        this.c = str;
        this.a = dwiVar;
    }

    @Override // defpackage.dvi
    public final void a(dvk dvkVar, dvc dvcVar) {
        if (dvcVar == dvc.ON_DESTROY) {
            this.b = false;
            dvkVar.getLifecycle().d(this);
        }
    }

    public final void b(ghc ghcVar, dve dveVar) {
        if (this.b) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.b = true;
        dveVar.c(this);
        ghcVar.b(this.c, this.a.a());
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
