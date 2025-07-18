package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdf {
    public final fcz a;
    protected final fde b;
    protected fdb c;
    private final int d;

    public fdf(fdc fdcVar, fde fdeVar, long j, long j2, long j3, long j4, long j5, int i) {
        this.b = fdeVar;
        this.d = i;
        this.a = new fcz(fdcVar, j, j2, j3, j4, j5);
    }

    protected static final boolean d(fdq fdqVar, long j) {
        long j2 = j - ((fdi) fdqVar).b;
        if (j2 < 0 || j2 > 262144) {
            return false;
        }
        fdqVar.l((int) j2);
        return true;
    }

    public static int e(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    protected static final int g(fdq fdqVar, long j, rsj rsjVar) {
        if (j == ((fdi) fdqVar).b) {
            return 0;
        }
        rsjVar.a = j;
        return 1;
    }

    public final void a(long j) {
        fdb fdbVar = this.c;
        if (fdbVar == null || fdbVar.a != j) {
            fcz fczVar = this.a;
            this.c = new fdb(j, fczVar.a.a(j), fczVar.b, fczVar.c, fczVar.d, fczVar.e);
        }
    }

    public final boolean b() {
        return this.c != null;
    }

    protected final void c() {
        this.c = null;
        this.b.b();
    }

    public final int f(fdq fdqVar, rsj rsjVar) {
        while (true) {
            fdb fdbVar = this.c;
            eci.e(fdbVar);
            long j = fdbVar.e;
            long j2 = fdbVar.f - j;
            int i = this.d;
            long j3 = fdbVar.g;
            if (j2 <= i) {
                c();
                return g(fdqVar, j, rsjVar);
            }
            if (!d(fdqVar, j3)) {
                return g(fdqVar, j3, rsjVar);
            }
            fdqVar.k();
            fdd fddVarA = this.b.a(fdqVar, fdbVar.b);
            int i2 = fddVarA.b;
            if (i2 == -3) {
                c();
                return g(fdqVar, j3, rsjVar);
            }
            if (i2 == -2) {
                long j4 = fddVarA.c;
                long j5 = fddVarA.d;
                fdbVar.c = j4;
                fdbVar.e = j5;
                fdbVar.b();
            } else {
                if (i2 != -1) {
                    long j6 = fddVarA.d;
                    d(fdqVar, j6);
                    c();
                    return g(fdqVar, j6, rsjVar);
                }
                long j7 = fddVarA.c;
                long j8 = fddVarA.d;
                fdbVar.d = j7;
                fdbVar.f = j8;
                fdbVar.b();
            }
        }
    }
}
