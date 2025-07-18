package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class ddv implements dce, dcd {
    public final dcf a;
    public final dcd b;
    public volatile Object c;
    public volatile dcb d;
    private volatile int e;
    private volatile dca f;
    private volatile dhd g;

    public ddv(dcf dcfVar, dcd dcdVar) {
        this.a = dcfVar;
        this.b = dcdVar;
    }

    @Override // defpackage.dce
    public final void a() {
        dhd dhdVar = this.g;
        if (dhdVar != null) {
            dhdVar.c.cz();
        }
    }

    @Override // defpackage.dcd
    public final void b() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0117 A[Catch: IOException -> 0x011f, TRY_ENTER, TryCatch #2 {IOException -> 0x011f, blocks: (B:17:0x00ad, B:36:0x0117, B:37:0x011e), top: B:66:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0149  */
    @Override // defpackage.dce
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddv.c():boolean");
    }

    @Override // defpackage.dcd
    public final void d(daj dajVar, Exception exc, daw dawVar, int i) {
        this.b.d(dajVar, exc, dawVar, this.g.c.g());
    }

    @Override // defpackage.dcd
    public final void e(daj dajVar, Object obj, daw dawVar, int i, daj dajVar2) {
        this.b.e(dajVar, obj, dawVar, this.g.c.g(), dajVar);
    }

    final boolean f(dhd dhdVar) {
        dhd dhdVar2 = this.g;
        return dhdVar2 != null && dhdVar2 == dhdVar;
    }
}
