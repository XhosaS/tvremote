package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fmv implements fmu {
    private final fdr a;
    private final fel b;
    private final fmx c;
    private final dze d;
    private final int e;
    private long f;
    private int g;
    private long h;

    public fmv(fdr fdrVar, fel felVar, fmx fmxVar, String str, int i) throws eaf {
        this.a = fdrVar;
        this.b = felVar;
        this.c = fmxVar;
        int i2 = fmxVar.b * fmxVar.e;
        int i3 = fmxVar.d;
        int i4 = i2 / 8;
        if (i3 != i4) {
            throw new eaf(a.ce(i3, i4, "Expected block size: ", "; got: "), null, true, 1);
        }
        int i5 = fmxVar.c * i4;
        int i6 = i5 * 8;
        int iMax = Math.max(i4, i5 / 10);
        this.e = iMax;
        dzd dzdVar = new dzd();
        dzdVar.a("audio/wav");
        dzdVar.d(str);
        dzdVar.h = i6;
        dzdVar.i = i6;
        dzdVar.n = iMax;
        dzdVar.E = fmxVar.b;
        dzdVar.F = fmxVar.c;
        dzdVar.G = i;
        this.d = new dze(dzdVar);
    }

    @Override // defpackage.fmu
    public final void a(int i, long j) {
        this.a.r(new fmz(this.c, 1, i, j));
        fel felVar = this.b;
        felVar.b(this.d);
        felVar.f();
    }

    @Override // defpackage.fmu
    public final void b(long j) {
        this.f = j;
        this.g = 0;
        this.h = 0L;
    }

    @Override // defpackage.fmu
    public final boolean c(fdq fdqVar, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
            int iA = this.b.a(fdqVar, (int) Math.min(i2 - i, j2), true);
            if (iA == -1) {
                j2 = 0;
            } else {
                this.g += iA;
                j2 -= iA;
            }
        }
        fmx fmxVar = this.c;
        int i3 = this.g;
        int i4 = fmxVar.d;
        int i5 = i3 / i4;
        if (i5 > 0) {
            long jB = this.f + edt.B(this.h, 1000000L, fmxVar.c);
            int i6 = i5 * i4;
            int i7 = this.g - i6;
            this.b.e(jB, 1, i6, i7, null);
            this.h += i5;
            this.g = i7;
        }
        return j2 <= 0;
    }
}
