package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fls implements fln {
    private static final float[] a = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private flr f;
    private long g;
    private String h;
    private fel i;
    private boolean j;
    private final isy l;
    private final boolean[] c = new boolean[4];
    private final flq d = new flq();
    private long k = -9223372036854775807L;
    private final fmd e = new fmd(178);
    private final edi b = new edi();

    public fls(isy isyVar) {
        this.l = isyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013d  */
    @Override // defpackage.fln
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.edi r19) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fls.a(edi):void");
    }

    @Override // defpackage.fln
    public final void b(fdr fdrVar, fmr fmrVar) {
        fmrVar.c();
        this.h = fmrVar.b();
        this.i = fdrVar.dq(fmrVar.a(), 2);
        this.f = new flr(this.i);
        this.l.s(fdrVar, fmrVar);
    }

    @Override // defpackage.fln
    public final void c(boolean z) {
        eci.e(this.f);
        if (z) {
            this.f.b(this.g, 0, this.j);
            this.f.c();
        }
    }

    @Override // defpackage.fln
    public final void d(long j, int i) {
        this.k = j;
    }

    @Override // defpackage.fln
    public final void e() {
        eee.g(this.c);
        this.d.b();
        flr flrVar = this.f;
        if (flrVar != null) {
            flrVar.c();
        }
        this.e.b();
        this.g = 0L;
        this.k = -9223372036854775807L;
    }
}
