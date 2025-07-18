package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmb implements fln {
    private String f;
    private fel g;
    private boolean j;
    private int l;
    private int m;
    private int o;
    private int p;
    private int t;
    private boolean v;
    private final String a = "video/mp2t";
    private int e = 0;
    private final edi b = new edi(new byte[15], 2);
    private final edh c = new edh();
    private final edi d = new edi();
    private final fmc q = new fmc();
    private int r = -2147483647;
    private int s = -1;
    private long u = -1;
    private boolean k = true;
    private boolean n = true;
    private double h = -9.223372036854776E18d;
    private double i = -9.223372036854776E18d;

    private static final void f(edi ediVar, edi ediVar2, boolean z) {
        int i = ediVar.b;
        int iMin = Math.min(ediVar.a(), ediVar2.a());
        ediVar.F(ediVar2.a, ediVar2.b, iMin);
        ediVar2.L(iMin);
        if (z) {
            ediVar.K(i);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0364 A[SYNTHETIC] */
    @Override // defpackage.fln
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.edi r26) throws defpackage.eaf {
        /*
            Method dump skipped, instructions count: 1276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fmb.a(edi):void");
    }

    @Override // defpackage.fln
    public final void b(fdr fdrVar, fmr fmrVar) {
        fmrVar.c();
        this.f = fmrVar.b();
        this.g = fdrVar.dq(fmrVar.a(), 1);
    }

    @Override // defpackage.fln
    public final void d(long j, int i) {
        this.l = i;
        if (!this.k && (this.p != 0 || !this.n)) {
            this.j = true;
        }
        if (j != -9223372036854775807L) {
            double d = j;
            if (this.j) {
                this.i = d;
            } else {
                this.h = d;
            }
        }
    }

    @Override // defpackage.fln
    public final void e() {
        this.e = 0;
        this.m = 0;
        this.b.G(2);
        this.o = 0;
        this.p = 0;
        this.r = -2147483647;
        this.s = -1;
        this.t = 0;
        this.u = -1L;
        this.v = false;
        this.j = false;
        this.n = true;
        this.k = true;
        this.h = -9.223372036854776E18d;
        this.i = -9.223372036854776E18d;
    }

    @Override // defpackage.fln
    public final void c(boolean z) {
    }
}
