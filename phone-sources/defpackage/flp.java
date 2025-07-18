package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class flp implements fln {
    private static final double[] a = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String b;
    private fel c;
    private final String d;
    private final edi e;
    private final fmd f;
    private final boolean[] g = new boolean[4];
    private final flo h = new flo();
    private long i;
    private boolean j;
    private boolean k;
    private long l;
    private long m;
    private long n;
    private long o;
    private boolean p;
    private boolean q;
    private final isy r;

    public flp(isy isyVar, String str) {
        edi ediVar;
        this.r = isyVar;
        this.d = str;
        if (isyVar != null) {
            this.f = new fmd(178);
            ediVar = new edi();
        } else {
            ediVar = null;
            this.f = null;
        }
        this.e = ediVar;
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x010a  */
    @Override // defpackage.fln
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.edi r22) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.flp.a(edi):void");
    }

    @Override // defpackage.fln
    public final void b(fdr fdrVar, fmr fmrVar) {
        fmrVar.c();
        this.b = fmrVar.b();
        this.c = fdrVar.dq(fmrVar.a(), 2);
        isy isyVar = this.r;
        if (isyVar != null) {
            isyVar.s(fdrVar, fmrVar);
        }
    }

    @Override // defpackage.fln
    public final void c(boolean z) {
        eci.e(this.c);
        if (z) {
            boolean z2 = this.p;
            long j = this.i - this.n;
            this.c.e(this.o, z2 ? 1 : 0, (int) j, 0, null);
        }
    }

    @Override // defpackage.fln
    public final void d(long j, int i) {
        this.m = j;
    }

    @Override // defpackage.fln
    public final void e() {
        eee.g(this.g);
        flo floVar = this.h;
        floVar.b = false;
        floVar.c = 0;
        floVar.d = 0;
        fmd fmdVar = this.f;
        if (fmdVar != null) {
            fmdVar.b();
        }
        this.i = 0L;
        this.j = false;
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }
}
